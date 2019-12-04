package typings.reactDashCalendarDashTimeline

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.NativeMouseEvent
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

trait Anon_ClassNameKey extends js.Object {
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

object Anon_ClassNameKey {
  @scala.inline
  def apply(
    className: String,
    key: Double,
    onContextMenu: SyntheticEvent[Element, Event] => Unit,
    onDoubleClick: MouseEvent[Element, NativeMouseEvent] => Unit,
    onMouseDown: MouseEvent[Element, NativeMouseEvent] => Unit,
    onMouseUp: MouseEvent[Element, NativeMouseEvent] => Unit,
    onTouchEnd: TouchEvent[Element] => Unit,
    onTouchStart: TouchEvent[Element] => Unit,
    style: CSSProperties,
    ref: Ref[_] = null
  ): Anon_ClassNameKey = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onContextMenu = js.Any.fromFunction1(onContextMenu), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), style = style.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassNameKey]
  }
}

