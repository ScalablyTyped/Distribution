package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobExecutionProperty extends StObject {
  
  /**
    * The maximum number of concurrent runs allowed for a job. The default is 1.
    */
  var maxConcurrentRuns: js.UndefOr[Double] = js.native
}
object JobExecutionProperty {
  
  @scala.inline
  def apply(): JobExecutionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionProperty]
  }
  
  @scala.inline
  implicit class JobExecutionPropertyMutableBuilder[Self <: JobExecutionProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxConcurrentRuns(value: Double): Self = StObject.set(x, "maxConcurrentRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentRunsUndefined: Self = StObject.set(x, "maxConcurrentRuns", js.undefined)
  }
}
