package typings.primereact.columnColumnMod

import typings.primereact.primereactStrings.and
import typings.primereact.primereactStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom filter event.
  * @see {@link ColumnProps.onFilterOperatorChange}
  * @event
  */
trait ColumnFilterOperatorChangeEvent extends StObject {
  
  /**
    * Field name of the column.
    */
  var field: String
  
  /**
    * Logical operator for the filter.
    */
  var operator: and | or
}
object ColumnFilterOperatorChangeEvent {
  
  inline def apply(field: String, operator: and | or): ColumnFilterOperatorChangeEvent = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterOperatorChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnFilterOperatorChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: and | or): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
