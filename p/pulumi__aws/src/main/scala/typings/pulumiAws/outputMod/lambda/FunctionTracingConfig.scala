package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionTracingConfig extends StObject {
  
  /**
    * Can be either `PassThrough` or `Active`. If PassThrough, Lambda will only trace
    * the request from an upstream service if it contains a tracing header with
    * "sampled=1". If Active, Lambda will respect any tracing header it receives
    * from an upstream service. If no tracing header is received, Lambda will call
    * X-Ray for a tracing decision.
    */
  var mode: String
}
object FunctionTracingConfig {
  
  inline def apply(mode: String): FunctionTracingConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionTracingConfig]
  }
  
  extension [Self <: FunctionTracingConfig](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
