package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.mod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataField extends StObject {
  
  var dataField: Any
  
  var order: SortOrder
}
object DataField {
  
  inline def apply(dataField: Any, order: SortOrder): DataField = {
    val __obj = js.Dynamic.literal(dataField = dataField.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataField]
  }
  
  extension [Self <: DataField](x: Self) {
    
    inline def setDataField(value: Any): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
