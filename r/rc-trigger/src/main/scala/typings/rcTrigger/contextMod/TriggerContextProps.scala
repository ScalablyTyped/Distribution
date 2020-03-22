package typings.rcTrigger.contextMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerContextProps extends js.Object {
  var onPopupMouseDown: MouseEventHandler[HTMLElement]
}

object TriggerContextProps {
  @scala.inline
  def apply(onPopupMouseDown: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): TriggerContextProps = {
    val __obj = js.Dynamic.literal(onPopupMouseDown = js.Any.fromFunction1(onPopupMouseDown))
  
    __obj.asInstanceOf[TriggerContextProps]
  }
}

