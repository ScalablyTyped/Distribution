package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the addAssociation mixin of the hasMany association.
  * @see HasManyAddAssociationMixin
  */
trait HasManyAddAssociationMixinOptions extends js.Object {
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}

object HasManyAddAssociationMixinOptions {
  @scala.inline
  def apply(validate: js.UndefOr[Boolean] = js.undefined): HasManyAddAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasManyAddAssociationMixinOptions]
  }
}

