package typings.reactRange.typesMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefObject
import typings.react.mod.TouchEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITrackProps extends js.Object {
  var ref: RefObject[_]
  var style: CSSProperties
  def onMouseDown(e: MouseEvent[Element, NativeMouseEvent]): Unit
  def onTouchStart(e: TouchEvent[Element]): Unit
}

object ITrackProps {
  @scala.inline
  def apply(
    onMouseDown: MouseEvent[Element, NativeMouseEvent] => Unit,
    onTouchStart: TouchEvent[Element] => Unit,
    ref: RefObject[_],
    style: CSSProperties
  ): ITrackProps = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart), ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITrackProps]
  }
}

