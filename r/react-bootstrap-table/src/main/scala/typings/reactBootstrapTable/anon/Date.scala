package typings.reactBootstrapTable.anon

import typings.reactBootstrapTable.mod.FilterComparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  /**
    * Comparator value.
    */
  var comparator: FilterComparator
  
  /**
    * Date value. String values will be automatically converted to dates.
    */
  var date: typings.std.Date | String
}
object Date {
  
  inline def apply(comparator: FilterComparator, date: typings.std.Date | String): Date = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setComparator(value: FilterComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setDate(value: typings.std.Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
