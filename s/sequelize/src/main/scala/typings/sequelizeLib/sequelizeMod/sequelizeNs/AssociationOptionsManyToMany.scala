package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options provided for many-to-many relationships
  *
  * @see AssociationOptionsHasMany
  * @see AssociationOptionsBelongsToMany
  */
trait AssociationOptionsManyToMany extends AssociationOptions {
  /**
    * A key/value set that will be used for association create and find defaults on the target.
    * (sqlite not supported for N:M)
    */
  var scope: js.UndefOr[AssociationScope] = js.undefined
}

object AssociationOptionsManyToMany {
  @scala.inline
  def apply(
    as: java.lang.String | sequelizeLib.Anon_Plural = null,
    constraints: js.UndefOr[scala.Boolean] = js.undefined,
    foreignKey: java.lang.String | AssociationForeignKeyOptions = null,
    foreignKeyConstraint: js.UndefOr[scala.Boolean] = js.undefined,
    hooks: js.UndefOr[scala.Boolean] = js.undefined,
    onDelete: java.lang.String = null,
    onUpdate: java.lang.String = null,
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

