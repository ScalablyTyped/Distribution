package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the addAssociations mixin of the hasMany association.
  * @see HasManyAddAssociationsMixin
  */
trait HasManyAddAssociationsMixinOptions extends js.Object {
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}

object HasManyAddAssociationsMixinOptions {
  @scala.inline
  def apply(validate: js.UndefOr[Boolean] = js.undefined): HasManyAddAssociationsMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasManyAddAssociationsMixinOptions]
  }
}

