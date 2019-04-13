package typings
package reactDashDaterangeDashPickerLib.reactDashDaterangeDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSelectCallbackParam extends js.Object {
  var end: momentLib.momentMod.Moment
  var start: momentLib.momentMod.Moment
}

object OnSelectCallbackParam {
  @scala.inline
  def apply(end: momentLib.momentMod.Moment, start: momentLib.momentMod.Moment): OnSelectCallbackParam = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[OnSelectCallbackParam]
  }
}

