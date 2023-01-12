package typings.primereact.columnColumnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFilterConstraintAddParams extends StObject {
  
  var constraint: ColumnFilterMetaData
  
  var field: String
}
object ColumnFilterConstraintAddParams {
  
  inline def apply(constraint: ColumnFilterMetaData, field: String): ColumnFilterConstraintAddParams = {
    val __obj = js.Dynamic.literal(constraint = constraint.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterConstraintAddParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnFilterConstraintAddParams] (val x: Self) extends AnyVal {
    
    inline def setConstraint(value: ColumnFilterMetaData): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
