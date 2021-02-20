package typings.reactNativeCalendars.mod

import typings.reactNativeCalendars.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiPeriodMarking extends Marking {
  
  var periods: js.Array[Color] = js.native
}
object MultiPeriodMarking {
  
  @scala.inline
  def apply(periods: js.Array[Color]): MultiPeriodMarking = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPeriodMarking]
  }
  
  @scala.inline
  implicit class MultiPeriodMarkingMutableBuilder[Self <: MultiPeriodMarking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeriods(value: js.Array[Color]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodsVarargs(value: Color*): Self = StObject.set(x, "periods", js.Array(value :_*))
  }
}
