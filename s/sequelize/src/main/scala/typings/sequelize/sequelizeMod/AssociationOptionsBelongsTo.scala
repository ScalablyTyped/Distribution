package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_Plural
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options provided when associating models with belongsTo relationship
  *
  * @see Association class belongsTo method
  */
trait AssociationOptionsBelongsTo extends AssociationOptions {
  /**
    * A string or a data type to represent the identifier in the table
    */
  var keyType: js.UndefOr[DataTypeAbstract] = js.undefined
  /**
    * The name of the field to use as the key for the association in the target table. Defaults to the primary
    * key of the target table
    */
  var targetKey: js.UndefOr[String] = js.undefined
}

object AssociationOptionsBelongsTo {
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
    scope: AssociationScope = null,
    targetKey: String = null
  ): AssociationOptionsBelongsTo = {
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
    if (targetKey != null) __obj.updateDynamic("targetKey")(targetKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationOptionsBelongsTo]
  }
}

