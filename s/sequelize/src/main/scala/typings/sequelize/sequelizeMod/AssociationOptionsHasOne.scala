package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_Plural
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options provided when associating models with hasOne relationship
  *
  * @see Association class hasOne method
  */
trait AssociationOptionsHasOne extends AssociationOptions {
  /**
    * A string or a data type to represent the identifier in the table
    */
  var keyType: js.UndefOr[DataTypeAbstract] = js.undefined
}

object AssociationOptionsHasOne {
  @scala.inline
  def apply(
    as: String | Anon_Plural = null,
    constraints: js.UndefOr[Boolean] = js.undefined,
    foreignKey: String | AssociationForeignKeyOptions = null,
    foreignKeyConstraint: js.UndefOr[Boolean] = js.undefined,
    hooks: js.UndefOr[Boolean] = js.undefined,
    keyType: DataTypeAbstract = null,
    onDelete: String = null,
    onUpdate: String = null,
    scope: AssociationScope = null
  ): AssociationOptionsHasOne = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(constraints)) __obj.updateDynamic("constraints")(constraints)
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    if (!js.isUndefined(foreignKeyConstraint)) __obj.updateDynamic("foreignKeyConstraint")(foreignKeyConstraint)
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks)
    if (keyType != null) __obj.updateDynamic("keyType")(keyType)
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[AssociationOptionsHasOne]
  }
}

