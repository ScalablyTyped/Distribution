package typings.reactBootstrapTable.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFilterValue
  extends StObject
     with _FilterValueData {
  
  var comparator: FilterComparator
  
  var date: Date | String
}
object DateFilterValue {
  
  @scala.inline
  def apply(comparator: FilterComparator, date: Date | String): DateFilterValue = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFilterValue]
  }
  
  @scala.inline
  implicit class DateFilterValueMutableBuilder[Self <: DateFilterValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: FilterComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
