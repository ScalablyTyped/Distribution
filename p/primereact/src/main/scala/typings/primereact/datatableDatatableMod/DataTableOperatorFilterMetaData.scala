package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableOperatorFilterMetaData extends StObject {
  
  var constraints: js.Array[DataTableFilterMetaData]
  
  var operator: String
}
object DataTableOperatorFilterMetaData {
  
  inline def apply(constraints: js.Array[DataTableFilterMetaData], operator: String): DataTableOperatorFilterMetaData = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableOperatorFilterMetaData]
  }
  
  extension [Self <: DataTableOperatorFilterMetaData](x: Self) {
    
    inline def setConstraints(value: js.Array[DataTableFilterMetaData]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsVarargs(value: DataTableFilterMetaData*): Self = StObject.set(x, "constraints", js.Array(value*))
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
