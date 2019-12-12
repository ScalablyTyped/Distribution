package typings.reactDashSelect

import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventOnMouseDown extends js.Object {
  def onMouseDown(event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
}

object Anon_EventOnMouseDown {
  @scala.inline
  def apply(onMouseDown: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Anon_EventOnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown))
  
    __obj.asInstanceOf[Anon_EventOnMouseDown]
  }
}

