package typings
package reactDashDaterangeDashPickerLib.reactDashDaterangeDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSelectCallbackParam extends js.Object {
  var end: momentLib.momentMod.momentNs.Moment
  var start: momentLib.momentMod.momentNs.Moment
}

object OnSelectCallbackParam {
  @scala.inline
  def apply(end: momentLib.momentMod.momentNs.Moment, start: momentLib.momentMod.momentNs.Moment): OnSelectCallbackParam = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[OnSelectCallbackParam]
  }
}

