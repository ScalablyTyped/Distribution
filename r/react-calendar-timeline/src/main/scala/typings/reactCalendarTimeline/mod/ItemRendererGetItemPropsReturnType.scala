package typings.reactCalendarTimeline.mod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactEventHandler
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemRendererGetItemPropsReturnType extends js.Object {
  var className: String
  var key: Id
  var onContextMenu: ReactEventHandler[Element]
  var onDoubleClick: MouseEventHandler[Element]
  var onMouseDown: MouseEventHandler[Element]
  var onMouseUp: MouseEventHandler[Element]
  var onTouchEnd: TouchEventHandler[Element]
  var onTouchStart: TouchEventHandler[Element]
  var ref: Ref[_]
  var style: CSSProperties
}

object ItemRendererGetItemPropsReturnType {
  @scala.inline
  def apply(
    className: String,
    key: Id,
    onContextMenu: SyntheticEvent[Element, Event] => scala.Unit,
    onDoubleClick: MouseEvent[Element, NativeMouseEvent] => scala.Unit,
    onMouseDown: MouseEvent[Element, NativeMouseEvent] => scala.Unit,
    onMouseUp: MouseEvent[Element, NativeMouseEvent] => scala.Unit,
    onTouchEnd: TouchEvent[Element] => scala.Unit,
    onTouchStart: TouchEvent[Element] => scala.Unit,
    style: CSSProperties,
    ref: Ref[_] = null
  ): ItemRendererGetItemPropsReturnType = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onContextMenu = js.Any.fromFunction1(onContextMenu), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), style = style.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemRendererGetItemPropsReturnType]
  }
}

