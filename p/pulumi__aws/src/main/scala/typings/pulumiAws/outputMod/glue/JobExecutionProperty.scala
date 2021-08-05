package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobExecutionProperty extends StObject {
  
  /**
    * The maximum number of concurrent runs allowed for a job. The default is 1.
    */
  var maxConcurrentRuns: js.UndefOr[Double] = js.undefined
}
object JobExecutionProperty {
  
  inline def apply(): JobExecutionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionProperty]
  }
  
  extension [Self <: JobExecutionProperty](x: Self) {
    
    inline def setMaxConcurrentRuns(value: Double): Self = StObject.set(x, "maxConcurrentRuns", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentRunsUndefined: Self = StObject.set(x, "maxConcurrentRuns", js.undefined)
  }
}
