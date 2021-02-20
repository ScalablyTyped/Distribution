package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseListJobs200
  extends /* key */ StringDictionary[js.Any] {
  
  var jobs: js.UndefOr[js.Array[Job]] = js.native
}
object ResponseListJobs200 {
  
  @scala.inline
  def apply(): ResponseListJobs200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseListJobs200]
  }
  
  @scala.inline
  implicit class ResponseListJobs200MutableBuilder[Self <: ResponseListJobs200] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: js.Array[Job]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: Job*): Self = StObject.set(x, "jobs", js.Array(value :_*))
  }
}
