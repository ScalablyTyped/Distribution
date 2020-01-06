package typings.atPulumiAws.typesInputMod.lambda

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionTracingConfig extends js.Object {
  /**
    * Can be either `PassThrough` or `Active`. If PassThrough, Lambda will only trace
    * the request from an upstream service if it contains a tracing header with
    * "sampled=1". If Active, Lambda will respect any tracing header it receives
    * from an upstream service. If no tracing header is received, Lambda will call
    * X-Ray for a tracing decision.
    */
  var mode: Input[String] = js.native
}

object FunctionTracingConfig {
  @scala.inline
  def apply(mode: Input[String]): FunctionTracingConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FunctionTracingConfig]
  }
}

