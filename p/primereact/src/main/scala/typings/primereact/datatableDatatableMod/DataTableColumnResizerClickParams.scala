package typings.primereact.datatableDatatableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableColumnResizerClickParams extends StObject {
  
  var column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
  
  var element: HTMLElement
  
  var originalEvent: MouseEvent[HTMLElement, NativeMouseEvent]
}
object DataTableColumnResizerClickParams {
  
  inline def apply(
    column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any,
    element: HTMLElement,
    originalEvent: MouseEvent[HTMLElement, NativeMouseEvent]
  ): DataTableColumnResizerClickParams = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableColumnResizerClickParams]
  }
  
  extension [Self <: DataTableColumnResizerClickParams](x: Self) {
    
    inline def setColumn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
    ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: MouseEvent[HTMLElement, NativeMouseEvent]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
