package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputFocusEventData extends js.Object {
  var eventCount: scala.Double
  var target: scala.Double
  var text: java.lang.String
}

object TextInputFocusEventData {
  @scala.inline
  def apply(eventCount: scala.Double, target: scala.Double, text: java.lang.String): TextInputFocusEventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventCount")(eventCount)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextInputFocusEventData]
  }
}

