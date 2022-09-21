package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFilterValue
  extends StObject
     with _FilterValueData {
  
  var comparator: FilterComparator
  
  var date: js.Date | String
}
object DateFilterValue {
  
  inline def apply(comparator: FilterComparator, date: js.Date | String): DateFilterValue = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFilterValue]
  }
  
  extension [Self <: DateFilterValue](x: Self) {
    
    inline def setComparator(value: FilterComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
