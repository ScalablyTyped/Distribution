package typings.sequelize.mod

import typings.sequelize.anon.Plural
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
    as: String | Plural = null,
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
    if (!js.isUndefined(constraints)) __obj.updateDynamic("constraints")(constraints.get.asInstanceOf[js.Any])
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    if (!js.isUndefined(foreignKeyConstraint)) __obj.updateDynamic("foreignKeyConstraint")(foreignKeyConstraint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks.get.asInstanceOf[js.Any])
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationOptionsManyToMany]
  }
}

