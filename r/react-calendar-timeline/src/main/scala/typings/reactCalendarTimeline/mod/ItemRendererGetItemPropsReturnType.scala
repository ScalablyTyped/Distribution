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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemRendererGetItemPropsReturnType extends StObject {
  
  var className: String
  
  var key: Id
  
  var onContextMenu: ReactEventHandler[Element]
  
  var onDoubleClick: MouseEventHandler[Element]
  
  var onMouseDown: MouseEventHandler[Element]
  
  var onMouseUp: MouseEventHandler[Element]
  
  var onTouchEnd: TouchEventHandler[Element]
  
  var onTouchStart: TouchEventHandler[Element]
  
  var ref: Ref[js.Any]
  
  var style: CSSProperties
}
object ItemRendererGetItemPropsReturnType {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onContextMenu = js.Any.fromFunction1(onContextMenu), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), style = style.asInstanceOf[js.Any], ref = null)
    __obj.asInstanceOf[ItemRendererGetItemPropsReturnType]
  }
  
  extension [Self <: ItemRendererGetItemPropsReturnType](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Id): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnContextMenu(value: SyntheticEvent[Element, Event] => scala.Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    inline def setOnDoubleClick(value: MouseEvent[Element, NativeMouseEvent] => scala.Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
    
    inline def setOnMouseDown(value: MouseEvent[Element, NativeMouseEvent] => scala.Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseUp(value: MouseEvent[Element, NativeMouseEvent] => scala.Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    inline def setOnTouchEnd(value: TouchEvent[Element] => scala.Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchStart(value: TouchEvent[Element] => scala.Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ js.Any | Null => scala.Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
