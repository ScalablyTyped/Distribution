package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputScrollEventData extends js.Object {
  var contentOffset: reactDashNativeLib.Anon_X
}

object TextInputScrollEventData {
  @scala.inline
  def apply(contentOffset: reactDashNativeLib.Anon_X): TextInputScrollEventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentOffset")(contentOffset)
    __obj.asInstanceOf[TextInputScrollEventData]
  }
}

