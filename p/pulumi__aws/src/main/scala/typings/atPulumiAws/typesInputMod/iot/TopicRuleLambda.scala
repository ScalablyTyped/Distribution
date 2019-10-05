package typings.atPulumiAws.typesInputMod.iot

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleLambda extends js.Object {
  /**
    * The ARN of the Lambda function.
    */
  var functionArn: Input[String]
}

object TopicRuleLambda {
  @scala.inline
  def apply(functionArn: Input[String]): TopicRuleLambda = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TopicRuleLambda]
  }
}

