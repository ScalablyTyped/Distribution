package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_Plural
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options provided for many-to-many relationships
  *
  * @see AssociationOptionsHasMany
  * @see AssociationOptionsBelongsToMany
  */
trait AssociationOptionsManyToMany extends AssociationOptions

object AssociationOptionsManyToMany {
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
  ): AssociationOptionsManyToMany = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(constraints)) __obj.updateDynamic("constraints")(constraints)
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    if (!js.isUndefined(foreignKeyConstraint)) __obj.updateDynamic("foreignKeyConstraint")(foreignKeyConstraint)
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks)
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[AssociationOptionsManyToMany]
  }
}

