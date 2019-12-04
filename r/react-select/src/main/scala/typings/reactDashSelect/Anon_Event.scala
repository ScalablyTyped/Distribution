package typings.reactDashSelect

import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  def onMouseDown(event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
}

object Anon_Event {
  @scala.inline
  def apply(onMouseDown: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Anon_Event = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown))
  
    __obj.asInstanceOf[Anon_Event]
  }
}

