package typings.primereact.datatableDatatableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom column resizer click event.
  * @see {@link DataTableProps.onColumnResizerClick}, {@link DataTableProps.onColumnResizerDoubleClick}
  * @event
  */
trait DataTableColumnResizerClickEvent extends StObject {
  
  /**
    * Properties of the column.
    */
  var column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
  
  /**
    * DOM element of the column.
    */
  var element: HTMLElement
  
  /**
    * Browser event.
    */
  var originalEvent: MouseEvent[HTMLElement, NativeMouseEvent]
}
object DataTableColumnResizerClickEvent {
  
  inline def apply(
    column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any,
    element: HTMLElement,
    originalEvent: MouseEvent[HTMLElement, NativeMouseEvent]
  ): DataTableColumnResizerClickEvent = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableColumnResizerClickEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableColumnResizerClickEvent] (val x: Self) extends AnyVal {
    
    inline def setColumn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
    ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: MouseEvent[HTMLElement, NativeMouseEvent]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
