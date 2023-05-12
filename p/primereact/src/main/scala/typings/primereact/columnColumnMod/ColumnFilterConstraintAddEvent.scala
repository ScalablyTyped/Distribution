package typings.primereact.columnColumnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom filter event.
  * @see {@link ColumnProps.onFilterConstraintAdd}
  * @event
  */
trait ColumnFilterConstraintAddEvent extends StObject {
  
  /**
    * Array of ColumnFilterMetaData objects representing the constraints.
    */
  var constraint: ColumnFilterMetaData
  
  /**
    * Field name of the column.
    */
  var field: String
}
object ColumnFilterConstraintAddEvent {
  
  inline def apply(constraint: ColumnFilterMetaData, field: String): ColumnFilterConstraintAddEvent = {
    val __obj = js.Dynamic.literal(constraint = constraint.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterConstraintAddEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnFilterConstraintAddEvent] (val x: Self) extends AnyVal {
    
    inline def setConstraint(value: ColumnFilterMetaData): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
