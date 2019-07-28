package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the setAssociations mixin of the belongsToMany association.
  * @see BelongsToManySetAssociationsMixin
  */
trait BelongsToManySetAssociationsMixinOptions extends js.Object {
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}

object BelongsToManySetAssociationsMixinOptions {
  @scala.inline
  def apply(validate: js.UndefOr[Boolean] = js.undefined): BelongsToManySetAssociationsMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[BelongsToManySetAssociationsMixinOptions]
  }
}

