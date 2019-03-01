package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  def onMouseDown(event: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]): scala.Unit
}

object Anon_Event {
  @scala.inline
  def apply(
    onMouseDown: js.Function1[
      reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ): Anon_Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMouseDown")(onMouseDown)
    __obj.asInstanceOf[Anon_Event]
  }
}

