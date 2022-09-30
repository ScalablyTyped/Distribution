package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseGetJobsV11200
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var jobs: js.UndefOr[js.Array[Job]] = js.undefined
}
object ResponseGetJobsV11200 {
  
  inline def apply(): ResponseGetJobsV11200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseGetJobsV11200]
  }
  
  extension [Self <: ResponseGetJobsV11200](x: Self) {
    
    inline def setJobs(value: js.Array[Job]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: Job*): Self = StObject.set(x, "jobs", js.Array(value*))
  }
}
