package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the addAssociation mixin of the belongsToMany association.
  * @see BelongsToManyAddAssociationMixin
  */
trait BelongsToManyAddAssociationMixinOptions extends js.Object {
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[scala.Boolean] = js.undefined
}

object BelongsToManyAddAssociationMixinOptions {
  @scala.inline
  def apply(validate: js.UndefOr[scala.Boolean] = js.undefined): BelongsToManyAddAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[BelongsToManyAddAssociationMixinOptions]
  }
}

