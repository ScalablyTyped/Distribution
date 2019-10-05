package typings.atPulumiAws.typesOutputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleLambda extends js.Object {
  /**
    * The ARN of the Lambda function.
    */
  var functionArn: String
}

object TopicRuleLambda {
  @scala.inline
  def apply(functionArn: String): TopicRuleLambda = {
    val __obj = js.Dynamic.literal(functionArn = functionArn)
  
    __obj.asInstanceOf[TopicRuleLambda]
  }
}

