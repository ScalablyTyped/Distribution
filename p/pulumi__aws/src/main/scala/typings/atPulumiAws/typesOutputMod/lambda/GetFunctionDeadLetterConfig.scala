package typings.atPulumiAws.typesOutputMod.lambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFunctionDeadLetterConfig extends js.Object {
  var targetArn: String
}

object GetFunctionDeadLetterConfig {
  @scala.inline
  def apply(targetArn: String): GetFunctionDeadLetterConfig = {
    val __obj = js.Dynamic.literal(targetArn = targetArn)
  
    __obj.asInstanceOf[GetFunctionDeadLetterConfig]
  }
}

