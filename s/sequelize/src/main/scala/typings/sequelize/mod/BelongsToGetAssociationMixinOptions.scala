package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Associations
// ~~~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/tree/v3.4.1/lib/associations
//
/**
  * The options for the getAssociation mixin of the belongsTo association.
  * @see BelongsToGetAssociationMixin
  */
trait BelongsToGetAssociationMixinOptions extends js.Object {
  /**
    * Apply a scope on the related model, or remove its default scope by passing false.
    */
  var scope: js.UndefOr[String | Boolean] = js.undefined
}

object BelongsToGetAssociationMixinOptions {
  @scala.inline
  def apply(scope: String | Boolean = null): BelongsToGetAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[BelongsToGetAssociationMixinOptions]
  }
}

