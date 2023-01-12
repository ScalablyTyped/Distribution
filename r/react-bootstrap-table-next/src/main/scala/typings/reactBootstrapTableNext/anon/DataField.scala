package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataField extends StObject {
  
  var dataField: Any
  
  var newValue: Any
  
  var rowId: String
}
object DataField {
  
  inline def apply(dataField: Any, newValue: Any, rowId: String): DataField = {
    val __obj = js.Dynamic.literal(dataField = dataField.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataField] (val x: Self) extends AnyVal {
    
    inline def setDataField(value: Any): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setRowId(value: String): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
  }
}
