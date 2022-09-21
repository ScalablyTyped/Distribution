package typings.reactNativeCalendars.mod

import typings.reactNativeCalendars.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiPeriodMarking
  extends StObject
     with Marking {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var periods: js.Array[Color]
  
  var selected: js.UndefOr[Boolean] = js.undefined
}
object MultiPeriodMarking {
  
  inline def apply(periods: js.Array[Color]): MultiPeriodMarking = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPeriodMarking]
  }
  
  extension [Self <: MultiPeriodMarking](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setPeriods(value: js.Array[Color]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    inline def setPeriodsVarargs(value: Color*): Self = StObject.set(x, "periods", js.Array(value*))
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
