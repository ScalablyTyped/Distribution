package typings.signalfx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalReport extends StObject {
  
  var counters: js.UndefOr[js.Array[SignalMetric]] = js.undefined
  
  var cumulative_counters: js.UndefOr[js.Array[SignalMetric]] = js.undefined
  
  var gauges: js.UndefOr[js.Array[SignalMetric]] = js.undefined
}
object SignalReport {
  
  inline def apply(): SignalReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignalReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignalReport] (val x: Self) extends AnyVal {
    
    inline def setCounters(value: js.Array[SignalMetric]): Self = StObject.set(x, "counters", value.asInstanceOf[js.Any])
    
    inline def setCountersUndefined: Self = StObject.set(x, "counters", js.undefined)
    
    inline def setCountersVarargs(value: SignalMetric*): Self = StObject.set(x, "counters", js.Array(value*))
    
    inline def setCumulative_counters(value: js.Array[SignalMetric]): Self = StObject.set(x, "cumulative_counters", value.asInstanceOf[js.Any])
    
    inline def setCumulative_countersUndefined: Self = StObject.set(x, "cumulative_counters", js.undefined)
    
    inline def setCumulative_countersVarargs(value: SignalMetric*): Self = StObject.set(x, "cumulative_counters", js.Array(value*))
    
    inline def setGauges(value: js.Array[SignalMetric]): Self = StObject.set(x, "gauges", value.asInstanceOf[js.Any])
    
    inline def setGaugesUndefined: Self = StObject.set(x, "gauges", js.undefined)
    
    inline def setGaugesVarargs(value: SignalMetric*): Self = StObject.set(x, "gauges", js.Array(value*))
  }
}
