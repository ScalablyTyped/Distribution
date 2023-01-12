package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.mod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortCaret extends StObject {
  
  var dataField: js.UndefOr[Any] = js.undefined
  
  var order: SortOrder
  
  var sortCaret: js.UndefOr[Any] = js.undefined
  
  var sortFunc: js.UndefOr[Any] = js.undefined
}
object SortCaret {
  
  inline def apply(order: SortOrder): SortCaret = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCaret]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortCaret] (val x: Self) extends AnyVal {
    
    inline def setDataField(value: Any): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setSortCaret(value: Any): Self = StObject.set(x, "sortCaret", value.asInstanceOf[js.Any])
    
    inline def setSortCaretUndefined: Self = StObject.set(x, "sortCaret", js.undefined)
    
    inline def setSortFunc(value: Any): Self = StObject.set(x, "sortFunc", value.asInstanceOf[js.Any])
    
    inline def setSortFuncUndefined: Self = StObject.set(x, "sortFunc", js.undefined)
  }
}
