package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.mod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order extends StObject {
  
  var dataField: js.Any
  
  var order: SortOrder
}
object Order {
  
  @scala.inline
  def apply(dataField: js.Any, order: SortOrder): Order = {
    val __obj = js.Dynamic.literal(dataField = dataField.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  @scala.inline
  implicit class OrderMutableBuilder[Self <: Order] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataField(value: js.Any): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
