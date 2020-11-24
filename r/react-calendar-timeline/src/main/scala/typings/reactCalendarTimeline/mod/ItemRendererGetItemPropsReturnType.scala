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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemRendererGetItemPropsReturnType extends js.Object {
  
  var className: String = js.native
  
  var key: Id = js.native
  
  var onContextMenu: ReactEventHandler[Element] = js.native
  
  var onDoubleClick: MouseEventHandler[Element] = js.native
  
  var onMouseDown: MouseEventHandler[Element] = js.native
  
  var onMouseUp: MouseEventHandler[Element] = js.native
  
  var onTouchEnd: TouchEventHandler[Element] = js.native
  
  var onTouchStart: TouchEventHandler[Element] = js.native
  
  var ref: Ref[_] = js.native
  
  var style: CSSProperties = js.native
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
    style: CSSProperties
  ): ItemRendererGetItemPropsReturnType = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onContextMenu = js.Any.fromFunction1(onContextMenu), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemRendererGetItemPropsReturnType]
  }
  
  @scala.inline
  implicit class ItemRendererGetItemPropsReturnTypeOps[Self <: ItemRendererGetItemPropsReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Id): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnContextMenu(value: SyntheticEvent[Element, Event] => scala.Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDoubleClick(value: MouseEvent[Element, NativeMouseEvent] => scala.Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDown(value: MouseEvent[Element, NativeMouseEvent] => scala.Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUp(value: MouseEvent[Element, NativeMouseEvent] => scala.Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[Element] => scala.Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStart(value: TouchEvent[Element] => scala.Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => scala.Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
}
