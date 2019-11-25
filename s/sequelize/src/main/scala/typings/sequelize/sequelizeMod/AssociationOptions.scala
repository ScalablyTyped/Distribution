package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_Plural
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options provided when associating models
  *
  * @see Association class
  */
trait AssociationOptions extends js.Object {
  /**
    * The alias of this model, in singular form. See also the `name` option passed to `sequelize.define`. If
    * you create multiple associations between the same tables, you should provide an alias to be able to
    * distinguish between them. If you provide an alias when creating the assocition, you should provide the
    * same alias when eager loading and when getting assocated models. Defaults to the singularized name of
    * target
    */
  var as: js.UndefOr[String | Anon_Plural] = js.undefined
  /**
    * Should on update and on delete constraints be enabled on the foreign key.
    */
  var constraints: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the foreign key in the target table or an object representing the type definition for the
    * foreign column (see `Sequelize.define` for syntax). When using an object, you can add a `name` property
    * to set the name of the column. Defaults to the name of source + primary key of source
    */
  var foreignKey: js.UndefOr[String | AssociationForeignKeyOptions] = js.undefined
  var foreignKeyConstraint: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to run before-/afterDestroy hooks when an associated model is deleted because of a cascade.
    * For example if `User.hasOne(Profile, {onDelete: 'cascade', hooks:true})`, the before-/afterDestroy hooks
    * for profile will be called when a user is deleted. Otherwise the profile will be deleted without invoking
    * any hooks.
    *
    * Defaults to false
    */
  var hooks: js.UndefOr[Boolean] = js.undefined
  /**
    * What happens when delete occurs.
    *
    * Cascade if this is a n:m, and set null if it is a 1:m
    *
    * Defaults to 'SET NULL' or 'CASCADE'
    */
  var onDelete: js.UndefOr[String] = js.undefined
  /**
    * What happens when update occurs
    *
    * Defaults to 'CASCADE'
    */
  var onUpdate: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[AssociationScope] = js.undefined
}

object AssociationOptions {
  @scala.inline
  def apply(
    as: String | Anon_Plural = null,
    constraints: js.UndefOr[Boolean] = js.undefined,
    foreignKey: String | AssociationForeignKeyOptions = null,
    foreignKeyConstraint: js.UndefOr[Boolean] = js.undefined,
    hooks: js.UndefOr[Boolean] = js.undefined,
    onDelete: String = null,
    onUpdate: String = null,
    scope: AssociationScope = null
  ): AssociationOptions = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(constraints)) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    if (!js.isUndefined(foreignKeyConstraint)) __obj.updateDynamic("foreignKeyConstraint")(foreignKeyConstraint.asInstanceOf[js.Any])
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationOptions]
  }
}

