package typings.pulumiAws.outputMod.lambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionTracingConfig extends js.Object {
  var mode: String = js.native
}

object GetFunctionTracingConfig {
  @scala.inline
  def apply(mode: String): GetFunctionTracingConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionTracingConfig]
  }
}

