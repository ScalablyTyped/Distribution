package typings.reactBootstrapTableNext.mod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  onClick :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onDoubleClick :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onMouseEnter :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onMouseLeave :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onContextMenu :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>}> */
trait RowEventHandlerProps[T] extends StObject {
  
  var onClick: js.UndefOr[RowEventHandler[T]] = js.undefined
  
  var onContextMenu: js.UndefOr[RowEventHandler[T]] = js.undefined
  
  var onDoubleClick: js.UndefOr[RowEventHandler[T]] = js.undefined
  
  var onMouseEnter: js.UndefOr[RowEventHandler[T]] = js.undefined
  
  var onMouseLeave: js.UndefOr[RowEventHandler[T]] = js.undefined
}
object RowEventHandlerProps {
  
  inline def apply[T](): RowEventHandlerProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowEventHandlerProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowEventHandlerProps[?], T] (val x: Self & RowEventHandlerProps[T]) extends AnyVal {
    
    inline def setOnClick(value: (/* e */ SyntheticEvent[Element, Event], T, /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnContextMenu(value: (/* e */ SyntheticEvent[Element, Event], T, /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction3(value))
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnDoubleClick(value: (/* e */ SyntheticEvent[Element, Event], T, /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction3(value))
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnMouseEnter(value: (/* e */ SyntheticEvent[Element, Event], T, /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction3(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: (/* e */ SyntheticEvent[Element, Event], T, /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction3(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
  }
}
