package typings.sequelize.mod

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
  var validate: js.UndefOr[Boolean] = js.undefined
}

object BelongsToManyAddAssociationMixinOptions {
  @scala.inline
  def apply(validate: js.UndefOr[Boolean] = js.undefined): BelongsToManyAddAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BelongsToManyAddAssociationMixinOptions]
  }
}

