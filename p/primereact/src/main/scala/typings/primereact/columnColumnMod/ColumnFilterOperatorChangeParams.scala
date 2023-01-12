package typings.primereact.columnColumnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFilterOperatorChangeParams extends StObject {
  
  var field: String
  
  var operator: ColumnFilterOperatorType
}
object ColumnFilterOperatorChangeParams {
  
  inline def apply(field: String, operator: ColumnFilterOperatorType): ColumnFilterOperatorChangeParams = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterOperatorChangeParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnFilterOperatorChangeParams] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: ColumnFilterOperatorType): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
