package typings.pulumiAws.outputMod.lambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionDeadLetterConfig extends js.Object {
  var targetArn: String = js.native
}

object GetFunctionDeadLetterConfig {
  @scala.inline
  def apply(targetArn: String): GetFunctionDeadLetterConfig = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetFunctionDeadLetterConfig]
  }
}

