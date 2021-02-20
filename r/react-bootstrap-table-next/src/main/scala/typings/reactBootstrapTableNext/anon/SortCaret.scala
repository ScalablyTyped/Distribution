package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.mod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortCaret extends StObject {
  
  var dataField: js.UndefOr[js.Any] = js.native
  
  var order: SortOrder = js.native
  
  var sortCaret: js.UndefOr[js.Any] = js.native
  
  var sortFunc: js.UndefOr[js.Any] = js.native
}
object SortCaret {
  
  @scala.inline
  def apply(order: SortOrder): SortCaret = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCaret]
  }
  
  @scala.inline
  implicit class SortCaretMutableBuilder[Self <: SortCaret] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataField(value: js.Any): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    @scala.inline
    def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCaret(value: js.Any): Self = StObject.set(x, "sortCaret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCaretUndefined: Self = StObject.set(x, "sortCaret", js.undefined)
    
    @scala.inline
    def setSortFunc(value: js.Any): Self = StObject.set(x, "sortFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFuncUndefined: Self = StObject.set(x, "sortFunc", js.undefined)
  }
}
