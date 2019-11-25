package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sequelizeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.Buffer
  import typings.sequelize.Anon_
  import typings.sequelize.Anon_Adjacent
  import typings.sequelize.Anon_As
  import typings.sequelize.Anon_Through
  import typings.sequelize.sequelizeStrings.DEFERRED
  import typings.sequelize.sequelizeStrings.EXCLUSIVE
  import typings.sequelize.sequelizeStrings.IMMEDIATE
  import typings.sequelize.sequelizeStrings.SERIALIZABLE
  import typings.sequelize.sequelizeStrings.SHARE
  import typings.sequelize.sequelizeStrings.UPDATE
  import typings.sequelize.sequelizeStrings.`KEY SHARE`
  import typings.sequelize.sequelizeStrings.`NO KEY UPDATE`
  import typings.sequelize.sequelizeStrings.`READ COMMITTED`
  import typings.sequelize.sequelizeStrings.`READ UNCOMMITTED`
  import typings.sequelize.sequelizeStrings.`REPEATABLE READ`
  import typings.std.Partial

  type AnyFindOptions = FindOptions[js.Any]
  /**
    * Options for Association Scope
    *
    * @see AssociationOptionsManyToMany
    */
  type AssociationScope = /**
    * The name of the column that will be used for the associated scope and it's value
    */
  StringDictionary[js.Any]
  /**
    * The createAssociation mixin applied to models with belongsTo.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsTo(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    // setRole...
    *    createRole: Sequelize.BelongsToCreateAssociationMixin<RoleAttributes>;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to/
    * @see Instance
    */
  type BelongsToCreateAssociationMixin[TAttributes, TInstance] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[
      BelongsToCreateAssociationMixinOptions | CreateOptions | BelongsToSetAssociationMixinOptions
    ], 
    typings.bluebird.bluebirdMod.^[TInstance]
  ]
  /**
    * The getAssociation mixin applied to models with belongsTo.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsTo(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttrib>, UserAttrib {
    *    getRole: Sequelize.BelongsToGetAssociationMixin<RoleInstance>;
    *    // setRole...
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to/
    * @see Instance
    */
  type BelongsToGetAssociationMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[BelongsToGetAssociationMixinOptions], 
    typings.bluebird.bluebirdMod.^[TInstance | Null]
  ]
  /**
    * The addAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    addRole: Sequelize.BelongsToManyAddAssociationMixin<RoleInstance, RoleId, UserRoleAttributes>;
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyAddAssociationMixin[TInstance, TInstancePrimaryKey, TJoinTableAttributes] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      BelongsToManyAddAssociationMixinOptions | AnyFindOptions | BulkCreateOptions | InstanceUpdateOptions | InstanceDestroyOptions | Anon_Through[TJoinTableAttributes]
    ], 
    typings.bluebird.bluebirdMod.^[Unit]
  ]
  /**
    * The addAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    addRoles: Sequelize.BelongsToManyAddAssociationsMixin<RoleInstance, RoleId, UserRoleAttributes>;
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyAddAssociationsMixin[TInstance, TInstancePrimaryKey, TJoinTableAttributes] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      BelongsToManyAddAssociationsMixinOptions | AnyFindOptions | BulkCreateOptions | InstanceUpdateOptions | InstanceDestroyOptions | Anon_Through[TJoinTableAttributes]
    ], 
    typings.bluebird.bluebirdMod.^[Unit]
  ]
  /**
    * The countAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    countRoles: Sequelize.BelongsToManyCountAssociationsMixin;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyCountAssociationsMixin = js.Function1[
    /* options */ js.UndefOr[BelongsToManyCountAssociationsMixinOptions], 
    typings.bluebird.bluebirdMod.^[Double]
  ]
  /**
    * The createAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    createRole: Sequelize.BelongsToManyCreateAssociationMixin<RoleAttributes, UserRoleAttributes>;
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyCreateAssociationMixin[TAttributes, TInstance, TJoinTableAttributes] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[
      BelongsToManyCreateAssociationMixinOptions | CreateOptions | Anon_Through[TJoinTableAttributes]
    ], 
    typings.bluebird.bluebirdMod.^[TInstance]
  ]
  /**
    * The getAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    getRoles: Sequelize.BelongsToManyGetAssociationsMixin<RoleInstance>;
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyGetAssociationsMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[BelongsToManyGetAssociationsMixinOptions], 
    typings.bluebird.bluebirdMod.^[js.Array[TInstance]]
  ]
  /**
    * The hasAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    hasRole: Sequelize.BelongsToManyHasAssociationMixin<RoleInstance, RoleId>;
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyHasAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* target */ TInstance | TInstancePrimaryKey, 
    /* options */ js.UndefOr[
      BelongsToManyHasAssociationMixinOptions | BelongsToManyGetAssociationsMixinOptions
    ], 
    typings.bluebird.bluebirdMod.^[Boolean]
  ]
  /**
    * The removeAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles
    *    // hasRole...
    *    hasRoles: Sequelize.BelongsToManyHasAssociationsMixin<RoleInstance, RoleId>;
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyHasAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* targets */ js.Array[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      BelongsToManyHasAssociationsMixinOptions | BelongsToManyGetAssociationsMixinOptions
    ], 
    typings.bluebird.bluebirdMod.^[Boolean]
  ]
  /**
    * The removeAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    removeRole: Sequelize.BelongsToManyRemoveAssociationMixin<RoleInstance, RoleId>;
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyRemoveAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociated */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[BelongsToManyRemoveAssociationMixinOptions | InstanceDestroyOptions], 
    typings.bluebird.bluebirdMod.^[Unit]
  ]
  /**
    * The removeAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    removeRoles: Sequelize.BelongsToManyRemoveAssociationsMixin<RoleInstance, RoleId>;
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyRemoveAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociateds */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[BelongsToManyRemoveAssociationsMixinOptions | InstanceDestroyOptions], 
    typings.bluebird.bluebirdMod.^[Unit]
  ]
  /**
    * The setAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    setRoles: Sequelize.BelongsToManySetAssociationsMixin<RoleInstance, RoleId, UserRoleAttributes>;
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManySetAssociationsMixin[TInstance, TInstancePrimaryKey, TJoinTableAttributes] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      BelongsToManySetAssociationsMixinOptions | AnyFindOptions | BulkCreateOptions | InstanceUpdateOptions | InstanceDestroyOptions | Anon_Through[TJoinTableAttributes]
    ], 
    typings.bluebird.bluebirdMod.^[Unit]
  ]
  /**
    * The setAssociation mixin applied to models with belongsTo.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsTo(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    setRole: Sequelize.BelongsToSetAssociationMixin<RoleInstance, RoleId>;
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to/
    * @see Instance
    */
  type BelongsToSetAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[BelongsToSetAssociationMixinOptions | InstanceSaveOptions], 
    typings.bluebird.bluebirdMod.^[Unit]
  ]
  type DataTypeBoolean = DataTypeAbstract
  type DataTypeDateOnly = DataTypeAbstract
  type DataTypeHStore = DataTypeAbstract
  type DataTypeJSONB = DataTypeAbstract
  type DataTypeJSONType = DataTypeAbstract
  type DataTypeNow = DataTypeAbstract
  type DataTypeTime = DataTypeAbstract
  /**
    * Interface for Attributes provided for a column
    *
    * @see Sequelize.define
    */
  type DefineAttributes = /**
    * The description of a database column
    */
  StringDictionary[String | DataTypeAbstract | DefineAttributeColumnOptions]
  /**
    * Interface for getterMethods in DefineOptions
    *
    * @see DefineOptions
    */
  type DefineGetterMethodsOptions = StringDictionary[js.Function0[js.Any]]
  /**
    * Interface for Attributes provided for a column
    *
    * @see Sequelize.define
    */
  type DefineModelAttributes[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string | sequelize.sequelize.DataTypeAbstract | sequelize.sequelize.DefineAttributeColumnOptions}
    */ typings.sequelize.sequelizeStrings.DefineModelAttributes with js.Any
  /**
    * Interface for Define Scope Options
    *
    * @see DefineOptions
    */
  type DefineScopeOptions = /**
    * Name of the scope and it's query
    */
  StringDictionary[AnyFindOptions | js.Function]
  /**
    * Interface for setterMethods in DefineOptions
    *
    * @see DefineOptions
    */
  type DefineSetterMethodsOptions = StringDictionary[js.Function1[/* val */ js.Any, Unit]]
  /**
    * Shortcut for types used in FindOptions.attributes
    */
  type FindOptionsAttributesArray = js.Array[String | literal | (js.Tuple2[String | cast | fn | literal, String]) | fn | cast]
  /**
    * Shortcut for order type in FindOptions.attributes
    */
  type FindOptionsOrderArray = js.Array[String | Double | (Model[js.Any, js.Any, js.Any]) | Anon_As | fn]
  /**
    * GetTableName Options
    */
  type GetTableNameOptions = LoggingOptions
  /**
    * The addAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    addRole: Sequelize.HasManyAddAssociationMixin<RoleInstance, RoleId>;
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyAddAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[HasManyAddAssociationMixinOptions | InstanceUpdateOptions], 
    typings.bluebird.bluebirdMod.^[Unit]
  ]
  /**
    * The addAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    addRoles: Sequelize.HasManyAddAssociationsMixin<RoleInstance, RoleId>;
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyAddAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[HasManyAddAssociationsMixinOptions | InstanceUpdateOptions], 
    typings.bluebird.bluebirdMod.^[Unit]
  ]
  /**
    * The countAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    countRoles: Sequelize.HasManyCountAssociationsMixin;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyCountAssociationsMixin = js.Function1[
    /* options */ js.UndefOr[HasManyCountAssociationsMixinOptions], 
    typings.bluebird.bluebirdMod.^[Double]
  ]
  /**
    * The createAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    createRole: Sequelize.HasManyCreateAssociationMixin<RoleAttributes>;
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyCreateAssociationMixin[TAttributes, TInstance] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[HasManyCreateAssociationMixinOptions | CreateOptions], 
    typings.bluebird.bluebirdMod.^[TInstance]
  ]
  /**
    * The getAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    getRoles: Sequelize.HasManyGetAssociationsMixin<RoleInstance>;
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyGetAssociationsMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[HasManyGetAssociationsMixinOptions], 
    typings.bluebird.bluebirdMod.^[js.Array[TInstance]]
  ]
  /**
    * The hasAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    hasRole: Sequelize.HasManyHasAssociationMixin<RoleInstance, RoleId>;
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyHasAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* target */ TInstance | TInstancePrimaryKey, 
    /* options */ js.UndefOr[HasManyHasAssociationMixinOptions | HasManyGetAssociationsMixinOptions], 
    typings.bluebird.bluebirdMod.^[Boolean]
  ]
  /**
    * The removeAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles
    *    // hasRole...
    *    hasRoles: Sequelize.HasManyHasAssociationsMixin<RoleInstance, RoleId>;
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyHasAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* targets */ js.Array[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[HasManyHasAssociationsMixinOptions | HasManyGetAssociationsMixinOptions], 
    typings.bluebird.bluebirdMod.^[Boolean]
  ]
  /**
    * The removeAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    removeRole: Sequelize.HasManyRemoveAssociationMixin<RoleInstance, RoleId>;
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyRemoveAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociated */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[HasManyRemoveAssociationMixinOptions | InstanceUpdateOptions], 
    typings.bluebird.bluebirdMod.^[Unit]
  ]
  /**
    * The removeAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    removeRoles: Sequelize.HasManyRemoveAssociationsMixin<RoleInstance, RoleId>;
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyRemoveAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociateds */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[HasManyRemoveAssociationsMixinOptions | InstanceUpdateOptions], 
    typings.bluebird.bluebirdMod.^[Unit]
  ]
  /**
    * The setAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    setRoles: Sequelize.HasManySetAssociationsMixin<RoleInstance, RoleId>;
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManySetAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[HasManySetAssociationsMixinOptions | AnyFindOptions | InstanceUpdateOptions], 
    typings.bluebird.bluebirdMod.^[Unit]
  ]
  /**
    * The createAssociation mixin applied to models with hasOne.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasOne(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    // setRole...
    *    createRole: Sequelize.HasOneCreateAssociationMixin<RoleAttributes>;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-one/
    * @see Instance
    */
  type HasOneCreateAssociationMixin[TAttributes] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[
      HasOneCreateAssociationMixinOptions | HasOneSetAssociationMixinOptions | CreateOptions
    ], 
    typings.bluebird.bluebirdMod.^[Unit]
  ]
  /**
    * The getAssociation mixin applied to models with hasOne.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasOne(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttrib>, UserAttrib {
    *    getRole: Sequelize.HasOneGetAssociationMixin<RoleInstance>;
    *    // setRole...
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-one/
    * @see Instance
    */
  type HasOneGetAssociationMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[HasOneGetAssociationMixinOptions], 
    typings.bluebird.bluebirdMod.^[TInstance | Null]
  ]
  /**
    * The setAssociation mixin applied to models with hasOne.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasOne(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    setRole: Sequelize.HasOneSetAssociationMixin<RoleInstance, RoleId>;
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-one/
    * @see Instance
    */
  type HasOneSetAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      HasOneSetAssociationMixinOptions | HasOneGetAssociationMixinOptions | InstanceSaveOptions
    ], 
    typings.bluebird.bluebirdMod.^[Unit]
  ]
  /**
    * Models contains Model instances associated to their name
    */
  type Models = StringDictionary[Model[js.Any, js.Any, js.Any]]
  type ModelsHashInterface = StringDictionary[Model[js.Any, js.Any, js.Any]]
  type OperatorsAliases = Partial[Anon_Adjacent]
  /**
    * A hash of attributes to describe your search. See above for examples.
    *
    * We did put Object in the end, because there where query might be a JSON Blob. It cripples a bit the
    * typesafety, but there is no way to pass the tests if we just remove it.
    */
  type Primitives = String | Double | Boolean | Buffer
  type TransactionIsolationLevel = TransactionIsolationLevelReadUncommitted | TransactionIsolationLevelReadCommitted | TransactionIsolationLevelRepeatableRead | TransactionIsolationLevelSerializable
  type TransactionIsolationLevelReadCommitted = `READ COMMITTED`
  type TransactionIsolationLevelReadUncommitted = `READ UNCOMMITTED`
  type TransactionIsolationLevelRepeatableRead = `REPEATABLE READ`
  type TransactionIsolationLevelSerializable = SERIALIZABLE
  type TransactionLockLevel = TransactionLockLevelUpdate | TransactionLockLevelShare | TransactionLockLevelKeyShare | TransactionLockLevelNoKeyUpdate
  type TransactionLockLevelKeyShare = `KEY SHARE`
  type TransactionLockLevelNoKeyUpdate = `NO KEY UPDATE`
  type TransactionLockLevelShare = SHARE
  type TransactionLockLevelUpdate = UPDATE
  type TransactionType = TransactionTypeDeferred | TransactionTypeImmediate | TransactionTypeExclusive
  type TransactionTypeDeferred = DEFERRED
  type TransactionTypeExclusive = EXCLUSIVE
  type TransactionTypeImmediate = IMMEDIATE
  /**
    * Logic of where statement
    */
  type WhereLogic = Partial[Anon_]
  type WhereOptions[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? sequelize.sequelize.Primitives | std.Array<sequelize.sequelize.Primitives> | sequelize.sequelize.WhereLogic | T[P] extends sequelize.sequelize.Primitives? null : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias sequelize.sequelize.WhereOptions<T[P]> * / object | sequelize.sequelize.col | sequelize.sequelize.and | sequelize.sequelize.or | sequelize.sequelize.WhereGeometryOptions | sequelize.sequelize.WhereNested | sequelize.sequelize.where | null}
    */ typings.sequelize.sequelizeStrings.WhereOptions with T
}
