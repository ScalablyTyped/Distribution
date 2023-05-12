package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom datatable operator filter metadata.
  */
trait DataTableOperatorFilterMetaData extends StObject {
  
  /**
    * Operator to use for filtering.
    */
  var constraints: js.Array[DataTableFilterMetaData]
  
  /**
    * Operator to use for filtering.
    */
  var operator: String
}
object DataTableOperatorFilterMetaData {
  
  inline def apply(constraints: js.Array[DataTableFilterMetaData], operator: String): DataTableOperatorFilterMetaData = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableOperatorFilterMetaData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableOperatorFilterMetaData] (val x: Self) extends AnyVal {
    
    inline def setConstraints(value: js.Array[DataTableFilterMetaData]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsVarargs(value: DataTableFilterMetaData*): Self = StObject.set(x, "constraints", js.Array(value*))
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
