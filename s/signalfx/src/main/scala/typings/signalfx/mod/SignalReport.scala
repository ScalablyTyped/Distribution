package typings.signalfx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalReport extends js.Object {
  
  var counters: js.UndefOr[js.Array[SignalMetric]] = js.native
  
  var cumulative_counters: js.UndefOr[js.Array[SignalMetric]] = js.native
  
  var gauges: js.UndefOr[js.Array[SignalMetric]] = js.native
}
object SignalReport {
  
  @scala.inline
  def apply(): SignalReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignalReport]
  }
  
  @scala.inline
  implicit class SignalReportOps[Self <: SignalReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCountersVarargs(value: SignalMetric*): Self = this.set("counters", js.Array(value :_*))
    
    @scala.inline
    def setCounters(value: js.Array[SignalMetric]): Self = this.set("counters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounters: Self = this.set("counters", js.undefined)
    
    @scala.inline
    def setCumulative_countersVarargs(value: SignalMetric*): Self = this.set("cumulative_counters", js.Array(value :_*))
    
    @scala.inline
    def setCumulative_counters(value: js.Array[SignalMetric]): Self = this.set("cumulative_counters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCumulative_counters: Self = this.set("cumulative_counters", js.undefined)
    
    @scala.inline
    def setGaugesVarargs(value: SignalMetric*): Self = this.set("gauges", js.Array(value :_*))
    
    @scala.inline
    def setGauges(value: js.Array[SignalMetric]): Self = this.set("gauges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGauges: Self = this.set("gauges", js.undefined)
  }
}
