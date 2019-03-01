package typings
package semanticDashUiDashRatingLib.SemanticUINs.RatingNs.ErrorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'You called a rating action that was not defined'
    */
  var action: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(action: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.asInstanceOf[_Impl]
  }
}

