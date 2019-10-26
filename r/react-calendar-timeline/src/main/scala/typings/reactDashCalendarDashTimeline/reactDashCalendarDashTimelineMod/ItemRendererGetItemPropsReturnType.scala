package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactEventHandler
import typings.react.reactMod.Ref
import typings.react.reactMod.SyntheticEvent
import typings.react.reactMod.TouchEvent
import typings.react.reactMod.TouchEventHandler
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemRendererGetItemPropsReturnType extends js.Object {
  var className: String
  var key: Double
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
    key: Double,
    onContextMenu: SyntheticEvent[Element, Event] => scala.Unit,
    onDoubleClick: MouseEvent[Element, NativeMouseEvent] => scala.Unit,
    onMouseDown: MouseEvent[Element, NativeMouseEvent] => scala.Unit,
    onMouseUp: MouseEvent[Element, NativeMouseEvent] => scala.Unit,
    onTouchEnd: TouchEvent[Element] => scala.Unit,
    onTouchStart: TouchEvent[Element] => scala.Unit,
    style: CSSProperties,
    ref: Ref[_] = null
  ): ItemRendererGetItemPropsReturnType = {
    val __obj = js.Dynamic.literal(className = className, key = key, onContextMenu = js.Any.fromFunction1(onContextMenu), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), style = style)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemRendererGetItemPropsReturnType]
  }
}

