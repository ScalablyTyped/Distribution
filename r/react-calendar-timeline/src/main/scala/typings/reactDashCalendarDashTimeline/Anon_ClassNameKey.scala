package typings.reactDashCalendarDashTimeline

import typings.react.Element
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactEventHandler
import typings.react.reactMod.Ref
import typings.react.reactMod.TouchEventHandler
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
    onContextMenu: ReactEventHandler[Element],
    onDoubleClick: MouseEventHandler[Element],
    onMouseDown: MouseEventHandler[Element],
    onMouseUp: MouseEventHandler[Element],
    onTouchEnd: TouchEventHandler[Element],
    onTouchStart: TouchEventHandler[Element],
    ref: Ref[_],
    style: CSSProperties
  ): Anon_ClassNameKey = {
    val __obj = js.Dynamic.literal(className = className, key = key, onContextMenu = onContextMenu, onDoubleClick = onDoubleClick, onMouseDown = onMouseDown, onMouseUp = onMouseUp, onTouchEnd = onTouchEnd, onTouchStart = onTouchStart, ref = ref.asInstanceOf[js.Any], style = style)
  
    __obj.asInstanceOf[Anon_ClassNameKey]
  }
}

