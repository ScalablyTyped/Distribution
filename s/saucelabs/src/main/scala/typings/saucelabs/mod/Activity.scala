package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activity
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var ccy_exec_peak: js.Array[Double]
  
  var datestamp: js.Array[String]
  
  var jobs: js.Array[Double]
  
  var minutes: js.Array[Double]
}
object Activity {
  
  inline def apply(
    ccy_exec_peak: js.Array[Double],
    datestamp: js.Array[String],
    jobs: js.Array[Double],
    minutes: js.Array[Double]
  ): Activity = {
    val __obj = js.Dynamic.literal(ccy_exec_peak = ccy_exec_peak.asInstanceOf[js.Any], datestamp = datestamp.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  
  extension [Self <: Activity](x: Self) {
    
    inline def setCcy_exec_peak(value: js.Array[Double]): Self = StObject.set(x, "ccy_exec_peak", value.asInstanceOf[js.Any])
    
    inline def setCcy_exec_peakVarargs(value: Double*): Self = StObject.set(x, "ccy_exec_peak", js.Array(value*))
    
    inline def setDatestamp(value: js.Array[String]): Self = StObject.set(x, "datestamp", value.asInstanceOf[js.Any])
    
    inline def setDatestampVarargs(value: String*): Self = StObject.set(x, "datestamp", js.Array(value*))
    
    inline def setJobs(value: js.Array[Double]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsVarargs(value: Double*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setMinutes(value: js.Array[Double]): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesVarargs(value: Double*): Self = StObject.set(x, "minutes", js.Array(value*))
  }
}
