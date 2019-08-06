package typings.atPulumiAws.snsTopicPolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicPolicyState extends js.Object {
  /**
    * The ARN of the SNS topic
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The fully-formed AWS policy as JSON.
    */
  val policy: js.UndefOr[Input[String]] = js.undefined
}

object TopicPolicyState {
  @scala.inline
  def apply(arn: Input[String] = null, policy: Input[String] = null): TopicPolicyState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicPolicyState]
  }
}

