package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputFocusEventData extends TargetedEvent {
  var eventCount: scala.Double
  var text: java.lang.String
}

object TextInputFocusEventData {
  @scala.inline
  def apply(eventCount: scala.Double, target: scala.Double, text: java.lang.String): TextInputFocusEventData = {
    val __obj = js.Dynamic.literal(eventCount = eventCount, target = target, text = text)
  
    __obj.asInstanceOf[TextInputFocusEventData]
  }
}

