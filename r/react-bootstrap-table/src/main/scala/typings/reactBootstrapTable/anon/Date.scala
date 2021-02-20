package typings.reactBootstrapTable.anon

import typings.reactBootstrapTable.mod.FilterComparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Date extends StObject {
  
  /**
    * Comparator value.
    */
  var comparator: FilterComparator = js.native
  
  /**
    * Date value. String values will be automatically converted to dates.
    */
  var date: typings.std.Date | String = js.native
}
object Date {
  
  @scala.inline
  def apply(comparator: FilterComparator, date: typings.std.Date | String): Date = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: FilterComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: typings.std.Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
