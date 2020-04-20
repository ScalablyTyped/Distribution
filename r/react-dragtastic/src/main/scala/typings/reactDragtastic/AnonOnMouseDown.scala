package typings.reactDragtastic

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnMouseDown extends js.Object {
  var onMouseDown: MouseEventHandler[Element]
  var onTouchStart: TouchEventHandler[Element]
}

object AnonOnMouseDown {
  @scala.inline
  def apply(
    onMouseDown: MouseEvent[Element, NativeMouseEvent] => Unit,
    onTouchStart: TouchEvent[Element] => Unit
  ): AnonOnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart))
    __obj.asInstanceOf[AnonOnMouseDown]
  }
}

