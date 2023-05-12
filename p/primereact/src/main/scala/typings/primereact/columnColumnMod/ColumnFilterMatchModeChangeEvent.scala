package typings.primereact.columnColumnMod

import typings.primereact.primereactStrings.contains
import typings.primereact.primereactStrings.custom
import typings.primereact.primereactStrings.endsWith
import typings.primereact.primereactStrings.equals
import typings.primereact.primereactStrings.gt
import typings.primereact.primereactStrings.gte
import typings.primereact.primereactStrings.in
import typings.primereact.primereactStrings.lt
import typings.primereact.primereactStrings.lte
import typings.primereact.primereactStrings.notEquals
import typings.primereact.primereactStrings.startsWith
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom filter event.
  * @see {@link ColumnProps.onFilterMatchModeChange}
  * @event
  */
trait ColumnFilterMatchModeChangeEvent extends StObject {
  
  /**
    * Field name of the column.
    */
  var field: String
  
  /**
    * Type of filter match.
    */
  var matchMode: startsWith | contains | endsWith | equals | notEquals | in | lt | lte | gt | gte | custom
}
object ColumnFilterMatchModeChangeEvent {
  
  inline def apply(
    field: String,
    matchMode: startsWith | contains | endsWith | equals | notEquals | in | lt | lte | gt | gte | custom
  ): ColumnFilterMatchModeChangeEvent = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], matchMode = matchMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterMatchModeChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnFilterMatchModeChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setMatchMode(value: startsWith | contains | endsWith | equals | notEquals | in | lt | lte | gt | gte | custom): Self = StObject.set(x, "matchMode", value.asInstanceOf[js.Any])
  }
}
