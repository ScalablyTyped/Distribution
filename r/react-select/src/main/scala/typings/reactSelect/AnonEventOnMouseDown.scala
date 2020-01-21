package typings.reactSelect

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventOnMouseDown extends js.Object {
  def onMouseDown(event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
}

object AnonEventOnMouseDown {
  @scala.inline
  def apply(onMouseDown: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): AnonEventOnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown))
  
    __obj.asInstanceOf[AnonEventOnMouseDown]
  }
}

