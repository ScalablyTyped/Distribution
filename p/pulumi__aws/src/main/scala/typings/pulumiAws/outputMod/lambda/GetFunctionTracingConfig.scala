package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFunctionTracingConfig extends StObject {
  
  var mode: String = js.native
}
object GetFunctionTracingConfig {
  
  @scala.inline
  def apply(mode: String): GetFunctionTracingConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionTracingConfig]
  }
  
  @scala.inline
  implicit class GetFunctionTracingConfigMutableBuilder[Self <: GetFunctionTracingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
