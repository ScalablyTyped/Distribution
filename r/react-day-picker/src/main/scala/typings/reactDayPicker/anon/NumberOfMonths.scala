package typings.reactDayPicker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberOfMonths extends StObject {
  
  var numberOfMonths: Double
  
  var reverseMonths: js.UndefOr[Boolean] = js.undefined
}
object NumberOfMonths {
  
  inline def apply(numberOfMonths: Double): NumberOfMonths = {
    val __obj = js.Dynamic.literal(numberOfMonths = numberOfMonths.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberOfMonths]
  }
  
  extension [Self <: NumberOfMonths](x: Self) {
    
    inline def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
    
    inline def setReverseMonths(value: Boolean): Self = StObject.set(x, "reverseMonths", value.asInstanceOf[js.Any])
    
    inline def setReverseMonthsUndefined: Self = StObject.set(x, "reverseMonths", js.undefined)
  }
}
