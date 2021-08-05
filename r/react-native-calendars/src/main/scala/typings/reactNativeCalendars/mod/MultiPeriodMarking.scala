package typings.reactNativeCalendars.mod

import typings.reactNativeCalendars.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiPeriodMarking
  extends StObject
     with Marking {
  
  var periods: js.Array[Color]
}
object MultiPeriodMarking {
  
  inline def apply(periods: js.Array[Color]): MultiPeriodMarking = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPeriodMarking]
  }
  
  extension [Self <: MultiPeriodMarking](x: Self) {
    
    inline def setPeriods(value: js.Array[Color]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    inline def setPeriodsVarargs(value: Color*): Self = StObject.set(x, "periods", js.Array(value :_*))
  }
}
