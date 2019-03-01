package typings
package reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureEvent extends js.Object {
  var nativeEvent: reactDashNativeDashTabDashViewLib.Anon_ChangedTouches
}

object GestureEvent {
  @scala.inline
  def apply(nativeEvent: reactDashNativeDashTabDashViewLib.Anon_ChangedTouches): GestureEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nativeEvent")(nativeEvent)
    __obj.asInstanceOf[GestureEvent]
  }
}

