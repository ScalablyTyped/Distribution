package typings.primereact.columnColumnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom filter event.
  * @see {@link ColumnProps.onFilterApplyClick}
  * @event
  */
trait ColumnFilterApplyClickEvent extends StObject {
  
  /**
    * Array of ColumnFilterMetaData objects representing the constraints.
    */
  var constraints: js.Array[ColumnFilterMetaData]
  
  /**
    * Field name of the column.
    */
  var field: String
}
object ColumnFilterApplyClickEvent {
  
  inline def apply(constraints: js.Array[ColumnFilterMetaData], field: String): ColumnFilterApplyClickEvent = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterApplyClickEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnFilterApplyClickEvent] (val x: Self) extends AnyVal {
    
    inline def setConstraints(value: js.Array[ColumnFilterMetaData]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsVarargs(value: ColumnFilterMetaData*): Self = StObject.set(x, "constraints", js.Array(value*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
