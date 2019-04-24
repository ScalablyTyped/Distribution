package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputSelectionChangeEventData extends TargetedEvent {
  var selection: reactDashNativeLib.Anon_End
}

object TextInputSelectionChangeEventData {
  @scala.inline
  def apply(selection: reactDashNativeLib.Anon_End, target: scala.Double): TextInputSelectionChangeEventData = {
    val __obj = js.Dynamic.literal(selection = selection, target = target)
  
    __obj.asInstanceOf[TextInputSelectionChangeEventData]
  }
}

