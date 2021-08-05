package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFilterValue
  extends StObject
     with _FilterValueData {
  
  var comparator: FilterComparator
  
  var number: Double | String
}
object NumberFilterValue {
  
  inline def apply(comparator: FilterComparator, number: Double | String): NumberFilterValue = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFilterValue]
  }
  
  extension [Self <: NumberFilterValue](x: Self) {
    
    inline def setComparator(value: FilterComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double | String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
