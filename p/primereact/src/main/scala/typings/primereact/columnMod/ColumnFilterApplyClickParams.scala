package typings.primereact.columnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFilterApplyClickParams extends StObject {
  
  var constraints: js.Array[ColumnFilterMetaData]
  
  var field: String
}
object ColumnFilterApplyClickParams {
  
  inline def apply(constraints: js.Array[ColumnFilterMetaData], field: String): ColumnFilterApplyClickParams = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterApplyClickParams]
  }
  
  extension [Self <: ColumnFilterApplyClickParams](x: Self) {
    
    inline def setConstraints(value: js.Array[ColumnFilterMetaData]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsVarargs(value: ColumnFilterMetaData*): Self = StObject.set(x, "constraints", js.Array(value*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
