package typings
package sequelizeLib.sequelizeMod.sequelizeNs

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
  var as: js.UndefOr[java.lang.String | sequelizeLib.Anon_Plural] = js.undefined
  /**
    * Should on update and on delete constraints be enabled on the foreign key.
    */
  var constraints: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the foreign key in the target table or an object representing the type definition for the
    * foreign column (see `Sequelize.define` for syntax). When using an object, you can add a `name` property
    * to set the name of the column. Defaults to the name of source + primary key of source
    */
  var foreignKey: js.UndefOr[java.lang.String | AssociationForeignKeyOptions] = js.undefined
  var foreignKeyConstraint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to true to run before-/afterDestroy hooks when an associated model is deleted because of a cascade.
    * For example if `User.hasOne(Profile, {onDelete: 'cascade', hooks:true})`, the before-/afterDestroy hooks
    * for profile will be called when a user is deleted. Otherwise the profile will be deleted without invoking
    * any hooks.
    *
    * Defaults to false
    */
  var hooks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * What happens when delete occurs.
    *
    * Cascade if this is a n:m, and set null if it is a 1:m
    *
    * Defaults to 'SET NULL' or 'CASCADE'
    */
  var onDelete: js.UndefOr[java.lang.String] = js.undefined
  /**
    * What happens when update occurs
    *
    * Defaults to 'CASCADE'
    */
  var onUpdate: js.UndefOr[java.lang.String] = js.undefined
}

object AssociationOptions {
  @scala.inline
  def apply(
    as: java.lang.String | sequelizeLib.Anon_Plural = null,
    constraints: js.UndefOr[scala.Boolean] = js.undefined,
    foreignKey: java.lang.String | AssociationForeignKeyOptions = null,
    foreignKeyConstraint: js.UndefOr[scala.Boolean] = js.undefined,
    hooks: js.UndefOr[scala.Boolean] = js.undefined,
    onDelete: java.lang.String = null,
    onUpdate: java.lang.String = null
  ): AssociationOptions = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(constraints)) __obj.updateDynamic("constraints")(constraints)
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    if (!js.isUndefined(foreignKeyConstraint)) __obj.updateDynamic("foreignKeyConstraint")(foreignKeyConstraint)
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks)
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    __obj.asInstanceOf[AssociationOptions]
  }
}

