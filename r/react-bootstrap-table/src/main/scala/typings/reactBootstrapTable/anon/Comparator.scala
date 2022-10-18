package typings.reactBootstrapTable.anon

import typings.reactBootstrapTable.mod.FilterComparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comparator extends StObject {
  
  /**
    * Comparator value.
    */
  var comparator: FilterComparator
  
  /**
    * Date value. String values will be automatically converted to dates.
    */
  var date: js.Date | String
}
object Comparator {
  
  inline def apply(comparator: FilterComparator, date: js.Date | String): Comparator = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comparator]
  }
  
  extension [Self <: Comparator](x: Self) {
    
    inline def setComparator(value: FilterComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
