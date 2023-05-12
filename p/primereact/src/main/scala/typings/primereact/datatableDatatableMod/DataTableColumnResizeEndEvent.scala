package typings.primereact.datatableDatatableMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom resize end event.
  * @see {@link DataTableProps.onColumnResizeEnd}
  * @event
  */
trait DataTableColumnResizeEndEvent extends StObject {
  
  /**
    * Properties of the resized column.
    */
  var column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
  
  /**
    * Change in column width.
    */
  var delta: Double
  
  /**
    * DOM element of the resized column.
    */
  var element: HTMLElement
}
object DataTableColumnResizeEndEvent {
  
  inline def apply(
    column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any,
    delta: Double,
    element: HTMLElement
  ): DataTableColumnResizeEndEvent = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableColumnResizeEndEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableColumnResizeEndEvent] (val x: Self) extends AnyVal {
    
    inline def setColumn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
    ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
