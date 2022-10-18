package typings.reactBootstrapTable.anon

import typings.reactBootstrapTable.mod.FilterComparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Number extends StObject {
  
  /**
    * Comparator value.
    */
  var comparator: FilterComparator
  
  /**
    * Number value.
    */
  var number: Double
}
object Number {
  
  inline def apply(comparator: FilterComparator, number: Double): Number = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
  
  extension [Self <: Number](x: Self) {
    
    inline def setComparator(value: FilterComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
