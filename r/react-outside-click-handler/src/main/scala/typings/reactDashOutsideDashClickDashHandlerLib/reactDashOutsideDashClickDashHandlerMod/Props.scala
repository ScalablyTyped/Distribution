package typings
package reactDashOutsideDashClickDashHandlerLib.reactDashOutsideDashClickDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-outside-click-handler.react-outside-click-handler.DefaultProps ]:? react-outside-click-handler.react-outside-click-handler.DefaultProps[P]} */ trait Props extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  def onOutsideClick(e: reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]): scala.Unit
}

object Props {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    onOutsideClick: reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], onOutsideClick = js.Any.fromFunction1(onOutsideClick))
  
    __obj.asInstanceOf[Props]
  }
}

