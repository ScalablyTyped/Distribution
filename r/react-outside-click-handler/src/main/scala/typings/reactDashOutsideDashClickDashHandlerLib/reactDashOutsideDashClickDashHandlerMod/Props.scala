package typings
package reactDashOutsideDashClickDashHandlerLib.reactDashOutsideDashClickDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-outside-click-handler.react-outside-click-handler.DefaultProps ]:? react-outside-click-handler.react-outside-click-handler.DefaultProps[P]} */ trait Props extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  def onOutsideClick(e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]): scala.Unit
}

object Props {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    onOutsideClick: js.Function1[
      reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ): Props = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("onOutsideClick")(onOutsideClick)
    __obj.asInstanceOf[Props]
  }
}

