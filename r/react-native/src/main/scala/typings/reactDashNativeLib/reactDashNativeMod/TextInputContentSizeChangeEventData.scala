package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputContentSizeChangeEventData extends js.Object {
  var contentSize: reactDashNativeLib.Anon_Height
}

object TextInputContentSizeChangeEventData {
  @scala.inline
  def apply(contentSize: reactDashNativeLib.Anon_Height): TextInputContentSizeChangeEventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentSize")(contentSize)
    __obj.asInstanceOf[TextInputContentSizeChangeEventData]
  }
}

