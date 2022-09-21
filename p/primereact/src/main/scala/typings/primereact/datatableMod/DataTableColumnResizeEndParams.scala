package typings.primereact.datatableMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableColumnResizeEndParams extends StObject {
  
  var column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
  
  var delta: Double
  
  var element: HTMLElement
}
object DataTableColumnResizeEndParams {
  
  inline def apply(
    column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any,
    delta: Double,
    element: HTMLElement
  ): DataTableColumnResizeEndParams = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableColumnResizeEndParams]
  }
  
  extension [Self <: DataTableColumnResizeEndParams](x: Self) {
    
    inline def setColumn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
    ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
