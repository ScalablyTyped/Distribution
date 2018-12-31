package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creating assocations in sequelize is done by calling one of the belongsTo / hasOne / hasMany functions on a
  * model (the source), and providing another model as the first argument to the function (the target).
  *
  * * hasOne - adds a foreign key to target
  * * belongsTo - add a foreign key to source
  * * hasMany - adds a foreign key to target, unless you also specify that target hasMany source, in which case
  * a
  * junction table is created with sourceId and targetId
  *
  * Creating an association will add a foreign key constraint to the attributes. All associations use `CASCADE`
  * on update and `SET NULL` on delete, except for n:m, which also uses `CASCADE` on delete.
  *
  * When creating associations, you can provide an alias, via the `as` option. This is useful if the same model
  * is associated twice, or you want your association to be called something other than the name of the target
  * model.
  *
  * As an example, consider the case where users have many pictures, one of which is their profile picture. All
  * pictures have a `userId`, but in addition the user model also has a `profilePictureId`, to be able to easily
  * load the user's profile picture.
  *
  * ```js
  * User.hasMany(Picture)
  * User.belongsTo(Picture, { as: 'ProfilePicture', constraints: false })
  *
  * user.getPictures() // gets you all pictures
  * user.getProfilePicture() // gets you only the profile picture
  *
  * User.findAll({
  *   where: ...,
  *   include: [
  *     { model: Picture }, // load all pictures
  *     { model: Picture, as: 'ProfilePicture' }, // load the profile picture. Notice that the spelling must be
  * the exact same as the one in the association
  *   ]
  * })
  * ```
  * To get full control over the foreign key column added by sequelize, you can use the `foreignKey` option. It
  * can either be a string, that specifies the name, or and object type definition,
  * equivalent to those passed to `sequelize.define`.
  *
  * ```js
  * User.hasMany(Picture, { foreignKey: 'uid' })
  * ```
  *
  * The foreign key column in Picture will now be called `uid` instead of the default `userId`.
  *
  * ```js
  * User.hasMany(Picture, {
  *   foreignKey: {
  *     name: 'uid',
  *     allowNull: false
  *   }
  * })
  * ```
  *
  * This specifies that the `uid` column can not be null. In most cases this will already be covered by the
  * foreign key costraints, which sequelize creates automatically, but can be useful in case where the foreign
  * keys are disabled, e.g. due to circular references (see `constraints: false` below).
  *
  * When fetching associated models, you can limit your query to only load some models. These queries are
  * written
  * in the same way as queries to `find`/`findAll`. To only get pictures in JPG, you can do:
  *
  * ```js
  * user.getPictures({
  *   where: {
  *     format: 'jpg'
  *   }
  * })
  * ```
  *
  * There are several ways to update and add new assoications. Continuing with our example of users and
  * pictures:
  * ```js
  * user.addPicture(p) // Add a single picture
  * user.setPictures([p1, p2]) // Associate user with ONLY these two picture, all other associations will be
  * deleted user.addPictures([p1, p2]) // Associate user with these two pictures, but don't touch any current
  * associations
  * ```
  *
  * You don't have to pass in a complete object to the association functions, if your associated model has a
  * single primary key:
  *
  * ```js
  * user.addPicture(req.query.pid) // Here pid is just an integer, representing the primary key of the picture
  * ```
  *
  * In the example above we have specified that a user belongs to his profile picture. Conceptually, this might
  * not make sense, but since we want to add the foreign key to the user model this is the way to do it.
  *
  * Note how we also specified `constraints: false` for profile picture. This is because we add a foreign key
  * from user to picture (profilePictureId), and from picture to user (userId). If we were to add foreign keys
  * to both, it would create a cyclic dependency, and sequelize would not know which table to create first,
  * since user depends on picture, and picture depends on user. These kinds of problems are detected by
  * sequelize before the models are synced to the database, and you will get an error along the lines of `Error:
  * Cyclic dependency found. 'users' is dependent of itself`. If you encounter this, you should either disable
  * some constraints, or rethink your associations completely.
  *
  * @see Sequelize.Model
  */
@js.native
trait Associations extends js.Object {
  /**
    * Creates an association between this (the source) and the provided target. The foreign key is added on the
    * source.
    *
    * Example: `Profile.belongsTo(User)`. This will add userId to the profile table.
    *
    * @param target The model that will be associated with hasOne relationship
    * @param options Options for the association
    * @return return type of association
    */
  def belongsTo(target: Model[_, _]): IncludeAssociation = js.native
  def belongsTo(target: Model[_, _], options: AssociationOptionsBelongsTo): IncludeAssociation = js.native
  /**
    * Create an N:M association with a join table
    *
    * ```js
    * User.belongsToMany(Project)
    * Project.belongsToMany(User)
    * ```
    * By default, the name of the join table will be source+target, so in this case projectsusers. This can be
    * overridden by providing either a string or a Model as `through` in the options.
    *
    * If you use a through model with custom attributes, these attributes can be set when adding / setting new
    * associations in two ways. Consider users and projects from before with a join table that stores whether
    * the project has been started yet:
    * ```js
    * var UserProjects = sequelize.define('userprojects', {
    *   started: Sequelize.BOOLEAN
    * })
    * User.belongsToMany(Project, { through: UserProjects })
    * Project.belongsToMany(User, { through: UserProjects })
    * ```
    * ```js
    * jan.addProject(homework, { started: false }) // The homework project is not started yet
    * jan.setProjects([makedinner, doshopping], { started: true}) // Both shopping and dinner has been started
    * ```
    *
    * If you want to set several target instances, but with different attributes you have to set the
    * attributes on the instance, using a property with the name of the through model:
    *
    * ```js
    * p1.userprojects {
    *   started: true
    * }
    * user.setProjects([p1, p2], {started: false}) // The default value is false, but p1 overrides that.
    * ```
    *
    * Similarily, when fetching through a join table with custom attributes, these attributes will be
    * available as an object with the name of the through model.
    * ```js
    * user.getProjects().then(function (projects) {
    *   var p1 = projects[0]
    *   p1.userprojects.started // Is this project started yet?
    * })
    * ```
    *
    * @param target The model that will be associated with hasOne relationship
    * @param options Options for the association
    * @return return type of association
    *
    */
  def belongsToMany(target: Model[_, _], options: AssociationOptionsBelongsToMany): IncludeAssociation = js.native
  /**
    * Create an association that is either 1:m or n:m.
    *
    * ```js
    * // Create a 1:m association between user and project
    * User.hasMany(Project)
    * ```
    * ```js
    * // Create a n:m association between user and project
    * User.hasMany(Project)
    * Project.hasMany(User)
    * ```
    * By default, the name of the join table will be source+target, so in this case projectsusers. This can be
    * overridden by providing either a string or a Model as `through` in the options. If you use a through
    * model with custom attributes, these attributes can be set when adding / setting new associations in two
    * ways. Consider users and projects from before with a join table that stores whether the project has been
    * started yet:
    * ```js
    * var UserProjects = sequelize.define('userprojects', {
    *   started: Sequelize.BOOLEAN
    * })
    * User.hasMany(Project, { through: UserProjects })
    * Project.hasMany(User, { through: UserProjects })
    * ```
    * ```js
    * jan.addProject(homework, { started: false }) // The homework project is not started yet
    * jan.setProjects([makedinner, doshopping], { started: true}) // Both shopping and dinner have been
    * started
    * ```
    *
    * If you want to set several target instances, but with different attributes you have to set the
    * attributes on the instance, using a property with the name of the through model:
    *
    * ```js
    * p1.userprojects {
    *   started: true
    * }
    * user.setProjects([p1, p2], {started: false}) // The default value is false, but p1 overrides that.
    * ```
    *
    * Similarily, when fetching through a join table with custom attributes, these attributes will be
    * available as an object with the name of the through model.
    * ```js
    * user.getProjects().then(function (projects) {
    *   var p1 = projects[0]
    *   p1.userprojects.started // Is this project started yet?
    * })
    * ```
    *
    * @param target The model that will be associated with hasOne relationship
    * @param options Options for the association
    * @return return type of association
    */
  def hasMany(target: Model[_, _]): IncludeAssociation = js.native
  def hasMany(target: Model[_, _], options: AssociationOptionsHasMany): IncludeAssociation = js.native
  /**
    * Creates an association between this (the source) and the provided target. The foreign key is added
    * on the target.
    *
    * Example: `User.hasOne(Profile)`. This will add userId to the profile table.
    *
    * @param target The model that will be associated with hasOne relationship
    * @param options Options for the association
    * @return return type of association
    */
  def hasOne(target: Model[_, _]): IncludeAssociation = js.native
  def hasOne(target: Model[_, _], options: AssociationOptionsHasOne): IncludeAssociation = js.native
}

