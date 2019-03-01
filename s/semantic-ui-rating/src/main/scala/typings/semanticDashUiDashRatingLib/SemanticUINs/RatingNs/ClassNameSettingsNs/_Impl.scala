package typings
package semanticDashUiDashRatingLib.SemanticUINs.RatingNs.ClassNameSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: java.lang.String
  /**
    * @default 'hover'
    */
  var hover: java.lang.String
  /**
    * @default 'loading'
    */
  var loading: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(active: java.lang.String, hover: java.lang.String, loading: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("hover")(hover)
    __obj.updateDynamic("loading")(loading)
    __obj.asInstanceOf[_Impl]
  }
}

