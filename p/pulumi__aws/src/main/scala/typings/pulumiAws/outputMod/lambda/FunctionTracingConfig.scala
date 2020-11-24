package typings.pulumiAws.outputMod.lambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionTracingConfig extends js.Object {
  
  /**
    * Can be either `PassThrough` or `Active`. If PassThrough, Lambda will only trace
    * the request from an upstream service if it contains a tracing header with
    * "sampled=1". If Active, Lambda will respect any tracing header it receives
    * from an upstream service. If no tracing header is received, Lambda will call
    * X-Ray for a tracing decision.
    */
  var mode: String = js.native
}
object FunctionTracingConfig {
  
  @scala.inline
  def apply(mode: String): FunctionTracingConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionTracingConfig]
  }
  
  @scala.inline
  implicit class FunctionTracingConfigOps[Self <: FunctionTracingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
  }
}
