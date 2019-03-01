package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the getAssociation mixin of the hasOne association.
  * @see HasOneGetAssociationMixin
  */
trait HasOneGetAssociationMixinOptions extends js.Object {
  /**
    * Apply a scope on the related model, or remove its default scope by passing false.
    */
  var scope: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
}

object HasOneGetAssociationMixinOptions {
  @scala.inline
  def apply(scope: java.lang.String | scala.Boolean = null): HasOneGetAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasOneGetAssociationMixinOptions]
  }
}

