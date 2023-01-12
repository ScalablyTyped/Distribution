package typings.primereact.treetableTreetableMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTableColumnResizeEndParams extends StObject {
  
  var column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnProps */ Any
  
  var delta: Double
  
  var element: HTMLElement
}
object TreeTableColumnResizeEndParams {
  
  inline def apply(
    column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnProps */ Any,
    delta: Double,
    element: HTMLElement
  ): TreeTableColumnResizeEndParams = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeTableColumnResizeEndParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeTableColumnResizeEndParams] (val x: Self) extends AnyVal {
    
    inline def setColumn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnProps */ Any
    ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
