package typings.reactDashOutsideDashClickDashHandler.reactDashOutsideDashClickDashHandlerMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-outside-click-handler.react-outside-click-handler.DefaultProps ]:? react-outside-click-handler.react-outside-click-handler.DefaultProps[P]} */ trait Props extends js.Object {
  var children: ReactNode
  def onOutsideClick(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
}

object Props {
  @scala.inline
  def apply(children: ReactNode, onOutsideClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], onOutsideClick = js.Any.fromFunction1(onOutsideClick))
  
    __obj.asInstanceOf[Props]
  }
}

