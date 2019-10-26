package typings.reactDashDragtastic

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.TouchEvent
import typings.react.reactMod.TouchEventHandler
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnMouseDown extends js.Object {
  var onMouseDown: MouseEventHandler[Element]
  var onTouchStart: TouchEventHandler[Element]
}

object Anon_OnMouseDown {
  @scala.inline
  def apply(
    onMouseDown: MouseEvent[Element, NativeMouseEvent] => Unit,
    onTouchStart: TouchEvent[Element] => Unit
  ): Anon_OnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart))
  
    __obj.asInstanceOf[Anon_OnMouseDown]
  }
}

