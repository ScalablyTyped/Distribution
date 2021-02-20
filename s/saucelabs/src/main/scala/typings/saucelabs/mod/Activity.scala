package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class ActivityMutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCcy_exec_peak(value: js.Array[Double]): Self = StObject.set(x, "ccy_exec_peak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcy_exec_peakVarargs(value: Double*): Self = StObject.set(x, "ccy_exec_peak", js.Array(value :_*))
    
    @scala.inline
    def setDatestamp(value: js.Array[String]): Self = StObject.set(x, "datestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatestampVarargs(value: String*): Self = StObject.set(x, "datestamp", js.Array(value :_*))
    
    @scala.inline
    def setJobs(value: js.Array[Double]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsVarargs(value: Double*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    @scala.inline
    def setMinutes(value: js.Array[Double]): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutesVarargs(value: Double*): Self = StObject.set(x, "minutes", js.Array(value :_*))
  }
}
