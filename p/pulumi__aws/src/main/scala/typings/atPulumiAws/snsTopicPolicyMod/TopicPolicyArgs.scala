package typings.atPulumiAws.snsTopicPolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicPolicyArgs extends js.Object {
  /**
    * The ARN of the SNS topic
    */
  val arn: Input[String]
  val policy: Input[String]
}

object TopicPolicyArgs {
  @scala.inline
  def apply(arn: Input[String], policy: Input[String]): TopicPolicyArgs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TopicPolicyArgs]
  }
}

