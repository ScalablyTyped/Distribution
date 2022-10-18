package typings.snyk

import typings.snyk.anon.CloudConfigResultsArray
import typings.snyk.anon.IsPrivate
import typings.snyk.distLibErrorsMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionUsageTrackingMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/usage-tracking", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/usage-tracking", "TestLimitReachedError")
  @js.native
  open class TestLimitReachedError () extends CustomError
  
  inline def trackUsage(formattedResults: js.Array[TrackableResult]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("trackUsage")(formattedResults.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait TrackableResult extends StObject {
    
    var meta: IsPrivate
    
    var result: CloudConfigResultsArray
  }
  object TrackableResult {
    
    inline def apply(meta: IsPrivate, result: CloudConfigResultsArray): TrackableResult = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackableResult]
    }
    
    extension [Self <: TrackableResult](x: Self) {
      
      inline def setMeta(value: IsPrivate): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setResult(value: CloudConfigResultsArray): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
