package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFunctionTracingConfig extends StObject {
  
  var mode: String
}
object GetFunctionTracingConfig {
  
  inline def apply(mode: String): GetFunctionTracingConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionTracingConfig]
  }
  
  extension [Self <: GetFunctionTracingConfig](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
