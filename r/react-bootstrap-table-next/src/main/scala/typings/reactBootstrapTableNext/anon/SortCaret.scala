package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.mod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortCaret extends StObject {
  
  var dataField: js.UndefOr[js.Any] = js.undefined
  
  var order: SortOrder
  
  var sortCaret: js.UndefOr[js.Any] = js.undefined
  
  var sortFunc: js.UndefOr[js.Any] = js.undefined
}
object SortCaret {
  
  inline def apply(order: SortOrder): SortCaret = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCaret]
  }
  
  extension [Self <: SortCaret](x: Self) {
    
    inline def setDataField(value: js.Any): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setSortCaret(value: js.Any): Self = StObject.set(x, "sortCaret", value.asInstanceOf[js.Any])
    
    inline def setSortCaretUndefined: Self = StObject.set(x, "sortCaret", js.undefined)
    
    inline def setSortFunc(value: js.Any): Self = StObject.set(x, "sortFunc", value.asInstanceOf[js.Any])
    
    inline def setSortFuncUndefined: Self = StObject.set(x, "sortFunc", js.undefined)
  }
}
