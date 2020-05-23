package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the setAssociations mixin of the hasMany association.
  * @see HasManySetAssociationsMixin
  */
trait HasManySetAssociationsMixinOptions extends js.Object {
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}

object HasManySetAssociationsMixinOptions {
  @scala.inline
  def apply(validate: js.UndefOr[Boolean] = js.undefined): HasManySetAssociationsMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasManySetAssociationsMixinOptions]
  }
}

