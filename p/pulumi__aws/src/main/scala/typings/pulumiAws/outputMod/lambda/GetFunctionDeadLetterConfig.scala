package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFunctionDeadLetterConfig extends StObject {
  
  var targetArn: String
}
object GetFunctionDeadLetterConfig {
  
  inline def apply(targetArn: String): GetFunctionDeadLetterConfig = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionDeadLetterConfig]
  }
  
  extension [Self <: GetFunctionDeadLetterConfig](x: Self) {
    
    inline def setTargetArn(value: String): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
  }
}
