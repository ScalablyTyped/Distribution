package typings.primereact.columnColumnMod

import typings.primereact.primereactStrings.and
import typings.primereact.primereactStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFilterMetaDataWithConstraint extends StObject {
  
  /**
    * Array of ColumnFilterMetaData objects representing the constraints.
    */
  var constraints: js.Array[ColumnFilterMetaData]
  
  /**
    * Logical operator for the constraints.
    */
  var operator: and | or
}
object ColumnFilterMetaDataWithConstraint {
  
  inline def apply(constraints: js.Array[ColumnFilterMetaData], operator: and | or): ColumnFilterMetaDataWithConstraint = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterMetaDataWithConstraint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnFilterMetaDataWithConstraint] (val x: Self) extends AnyVal {
    
    inline def setConstraints(value: js.Array[ColumnFilterMetaData]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsVarargs(value: ColumnFilterMetaData*): Self = StObject.set(x, "constraints", js.Array(value*))
    
    inline def setOperator(value: and | or): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
