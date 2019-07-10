package typings
package atPulumiAwsLib.snsTopicPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicPolicyArgs extends js.Object {
  /**
    * The ARN of the SNS topic
    */
  val arn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  val policy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object TopicPolicyArgs {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): TopicPolicyArgs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TopicPolicyArgs]
  }
}

