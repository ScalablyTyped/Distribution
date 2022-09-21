package typings.primereact.columnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFilterMetaDataWithConstraint
  extends StObject
     with ColumnFilterModelType {
  
  var constraints: js.Array[ColumnFilterMetaData]
  
  var operator: ColumnFilterOperatorType
}
object ColumnFilterMetaDataWithConstraint {
  
  inline def apply(constraints: js.Array[ColumnFilterMetaData], operator: ColumnFilterOperatorType): ColumnFilterMetaDataWithConstraint = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterMetaDataWithConstraint]
  }
  
  extension [Self <: ColumnFilterMetaDataWithConstraint](x: Self) {
    
    inline def setConstraints(value: js.Array[ColumnFilterMetaData]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsVarargs(value: ColumnFilterMetaData*): Self = StObject.set(x, "constraints", js.Array(value*))
    
    inline def setOperator(value: ColumnFilterOperatorType): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
