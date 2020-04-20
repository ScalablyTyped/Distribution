package typings.reactNative.mod

import typings.reactNative.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputSelectionChangeEventData extends TargetedEvent {
  var selection: AnonEnd
}

object TextInputSelectionChangeEventData {
  @scala.inline
  def apply(selection: AnonEnd, target: Double): TextInputSelectionChangeEventData = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputSelectionChangeEventData]
  }
}

