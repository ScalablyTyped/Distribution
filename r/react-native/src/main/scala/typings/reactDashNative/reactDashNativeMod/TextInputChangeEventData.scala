package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputChangeEventData extends TargetedEvent {
  var eventCount: Double
  var text: String
}

object TextInputChangeEventData {
  @scala.inline
  def apply(eventCount: Double, target: Double, text: String): TextInputChangeEventData = {
    val __obj = js.Dynamic.literal(eventCount = eventCount, target = target, text = text)
  
    __obj.asInstanceOf[TextInputChangeEventData]
  }
}

