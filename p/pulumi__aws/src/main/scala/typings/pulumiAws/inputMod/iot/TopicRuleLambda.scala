package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleLambda extends js.Object {
  /**
    * The ARN of the Lambda function.
    */
  var functionArn: Input[String] = js.native
}

object TopicRuleLambda {
  @scala.inline
  def apply(functionArn: Input[String]): TopicRuleLambda = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleLambda]
  }
}

