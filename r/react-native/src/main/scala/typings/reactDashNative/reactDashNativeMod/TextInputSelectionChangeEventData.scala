package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputSelectionChangeEventData extends TargetedEvent {
  var selection: Anon_End
}

object TextInputSelectionChangeEventData {
  @scala.inline
  def apply(selection: Anon_End, target: Double): TextInputSelectionChangeEventData = {
    val __obj = js.Dynamic.literal(selection = selection, target = target)
  
    __obj.asInstanceOf[TextInputSelectionChangeEventData]
  }
}

