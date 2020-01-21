package typings.sequelize.mod

import typings.sequelize.AnonPlural
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options provided when associating models with hasMany relationship
  *
  * @see Association class hasMany method
  */
trait AssociationOptionsHasMany extends AssociationOptionsManyToMany {
  /**
    * A string or a data type to represent the identifier in the table
    */
  var keyType: js.UndefOr[DataTypeAbstract] = js.undefined
  /**
    * A string to represent the name of the field to use as the key for an 1 to many association in the source table.
    *
    * @see http://docs.sequelizejs.com/class/lib/model.js~Model.html#static-method-hasMany
    * @see https://github.com/sequelize/sequelize/blob/b4fd46426db9cdbb97074bea121203d565e4195d/lib/associations/has-many.js#L81
    */
  var sourceKey: js.UndefOr[String] = js.undefined
}

object AssociationOptionsHasMany {
  @scala.inline
  def apply(
    as: String | AnonPlural = null,
    constraints: js.UndefOr[Boolean] = js.undefined,
    foreignKey: String | AssociationForeignKeyOptions = null,
    foreignKeyConstraint: js.UndefOr[Boolean] = js.undefined,
    hooks: js.UndefOr[Boolean] = js.undefined,
    keyType: DataTypeAbstract = null,
    onDelete: String = null,
    onUpdate: String = null,
    scope: AssociationScope = null,
    sourceKey: String = null
  ): AssociationOptionsHasMany = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(constraints)) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    if (!js.isUndefined(foreignKeyConstraint)) __obj.updateDynamic("foreignKeyConstraint")(foreignKeyConstraint.asInstanceOf[js.Any])
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sourceKey != null) __obj.updateDynamic("sourceKey")(sourceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationOptionsHasMany]
  }
}

