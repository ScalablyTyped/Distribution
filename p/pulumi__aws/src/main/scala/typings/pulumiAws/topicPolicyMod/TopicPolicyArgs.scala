package typings.pulumiAws.topicPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicPolicyArgs extends js.Object {
  /**
    * The ARN of the SNS topic
    */
  val arn: Input[String] = js.native
  /**
    * The fully-formed AWS policy as JSON.
    */
  val policy: Input[String] = js.native
}

object TopicPolicyArgs {
  @scala.inline
  def apply(arn: Input[String], policy: Input[String]): TopicPolicyArgs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TopicPolicyArgs]
  }
}

