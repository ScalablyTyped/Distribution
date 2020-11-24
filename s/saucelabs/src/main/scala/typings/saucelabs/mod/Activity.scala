package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Activity
  extends /* key */ StringDictionary[js.Any] {
  
  var ccy_exec_peak: js.Array[Double] = js.native
  
  var datestamp: js.Array[String] = js.native
  
  var jobs: js.Array[Double] = js.native
  
  var minutes: js.Array[Double] = js.native
}
object Activity {
  
  @scala.inline
  def apply(
    ccy_exec_peak: js.Array[Double],
    datestamp: js.Array[String],
    jobs: js.Array[Double],
    minutes: js.Array[Double]
  ): Activity = {
    val __obj = js.Dynamic.literal(ccy_exec_peak = ccy_exec_peak.asInstanceOf[js.Any], datestamp = datestamp.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
    
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
    def setCcy_exec_peakVarargs(value: Double*): Self = this.set("ccy_exec_peak", js.Array(value :_*))
    
    @scala.inline
    def setCcy_exec_peak(value: js.Array[Double]): Self = this.set("ccy_exec_peak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatestampVarargs(value: String*): Self = this.set("datestamp", js.Array(value :_*))
    
    @scala.inline
    def setDatestamp(value: js.Array[String]): Self = this.set("datestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsVarargs(value: Double*): Self = this.set("jobs", js.Array(value :_*))
    
    @scala.inline
    def setJobs(value: js.Array[Double]): Self = this.set("jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutesVarargs(value: Double*): Self = this.set("minutes", js.Array(value :_*))
    
    @scala.inline
    def setMinutes(value: js.Array[Double]): Self = this.set("minutes", value.asInstanceOf[js.Any])
  }
}
