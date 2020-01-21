package typings.reactNative.mod

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
    val __obj = js.Dynamic.literal(eventCount = eventCount.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextInputChangeEventData]
  }
}

