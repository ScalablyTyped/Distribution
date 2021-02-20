package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataField extends StObject {
  
  var dataField: js.Any = js.native
  
  var newValue: js.Any = js.native
  
  var rowId: String = js.native
}
object DataField {
  
  @scala.inline
  def apply(dataField: js.Any, newValue: js.Any, rowId: String): DataField = {
    val __obj = js.Dynamic.literal(dataField = dataField.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataField]
  }
  
  @scala.inline
  implicit class DataFieldMutableBuilder[Self <: DataField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataField(value: js.Any): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowId(value: String): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
  }
}
