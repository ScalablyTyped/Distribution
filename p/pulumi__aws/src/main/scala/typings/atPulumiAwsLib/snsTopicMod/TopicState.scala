package typings
package atPulumiAwsLib.snsTopicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicState extends js.Object {
  /**
    * IAM role for failure feedback
    */
  val applicationFailureFeedbackRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM role permitted to receive success feedback for this topic
    */
  val applicationSuccessFeedbackRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Percentage of success to sample
    */
  val applicationSuccessFeedbackSampleRate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The ARN of the SNS topic, as a more obvious property (clone of id)
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
  /**
    * The SNS delivery policy. More on [AWS documentation](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html)
    */
  val deliveryPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The display name for the SNS topic
    */
  val displayName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * IAM role for failure feedback
    */
  val httpFailureFeedbackRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM role permitted to receive success feedback for this topic
    */
  val httpSuccessFeedbackRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Percentage of success to sample
    */
  val httpSuccessFeedbackSampleRate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK. For more information, see [Key Terms](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms)
    */
  val kmsMasterKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * IAM role for failure feedback
    */
  val lambdaFailureFeedbackRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM role permitted to receive success feedback for this topic
    */
  val lambdaSuccessFeedbackRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Percentage of success to sample
    */
  val lambdaSuccessFeedbackSampleRate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The friendly name for the SNS topic. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val policy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * IAM role for failure feedback
    */
  val sqsFailureFeedbackRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM role permitted to receive success feedback for this topic
    */
  val sqsSuccessFeedbackRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Percentage of success to sample
    */
  val sqsSuccessFeedbackSampleRate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object TopicState {
  @scala.inline
  def apply(
    applicationFailureFeedbackRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    applicationSuccessFeedbackRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    applicationSuccessFeedbackSampleRate: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    arn: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN] = null,
    deliveryPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    displayName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    httpFailureFeedbackRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    httpSuccessFeedbackRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    httpSuccessFeedbackSampleRate: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    kmsMasterKeyId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    lambdaFailureFeedbackRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    lambdaSuccessFeedbackRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    lambdaSuccessFeedbackSampleRate: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sqsFailureFeedbackRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sqsSuccessFeedbackRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sqsSuccessFeedbackSampleRate: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): TopicState = {
    val __obj = js.Dynamic.literal()
    if (applicationFailureFeedbackRoleArn != null) __obj.updateDynamic("applicationFailureFeedbackRoleArn")(applicationFailureFeedbackRoleArn.asInstanceOf[js.Any])
    if (applicationSuccessFeedbackRoleArn != null) __obj.updateDynamic("applicationSuccessFeedbackRoleArn")(applicationSuccessFeedbackRoleArn.asInstanceOf[js.Any])
    if (applicationSuccessFeedbackSampleRate != null) __obj.updateDynamic("applicationSuccessFeedbackSampleRate")(applicationSuccessFeedbackSampleRate.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (deliveryPolicy != null) __obj.updateDynamic("deliveryPolicy")(deliveryPolicy.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (httpFailureFeedbackRoleArn != null) __obj.updateDynamic("httpFailureFeedbackRoleArn")(httpFailureFeedbackRoleArn.asInstanceOf[js.Any])
    if (httpSuccessFeedbackRoleArn != null) __obj.updateDynamic("httpSuccessFeedbackRoleArn")(httpSuccessFeedbackRoleArn.asInstanceOf[js.Any])
    if (httpSuccessFeedbackSampleRate != null) __obj.updateDynamic("httpSuccessFeedbackSampleRate")(httpSuccessFeedbackSampleRate.asInstanceOf[js.Any])
    if (kmsMasterKeyId != null) __obj.updateDynamic("kmsMasterKeyId")(kmsMasterKeyId.asInstanceOf[js.Any])
    if (lambdaFailureFeedbackRoleArn != null) __obj.updateDynamic("lambdaFailureFeedbackRoleArn")(lambdaFailureFeedbackRoleArn.asInstanceOf[js.Any])
    if (lambdaSuccessFeedbackRoleArn != null) __obj.updateDynamic("lambdaSuccessFeedbackRoleArn")(lambdaSuccessFeedbackRoleArn.asInstanceOf[js.Any])
    if (lambdaSuccessFeedbackSampleRate != null) __obj.updateDynamic("lambdaSuccessFeedbackSampleRate")(lambdaSuccessFeedbackSampleRate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (sqsFailureFeedbackRoleArn != null) __obj.updateDynamic("sqsFailureFeedbackRoleArn")(sqsFailureFeedbackRoleArn.asInstanceOf[js.Any])
    if (sqsSuccessFeedbackRoleArn != null) __obj.updateDynamic("sqsSuccessFeedbackRoleArn")(sqsSuccessFeedbackRoleArn.asInstanceOf[js.Any])
    if (sqsSuccessFeedbackSampleRate != null) __obj.updateDynamic("sqsSuccessFeedbackSampleRate")(sqsSuccessFeedbackSampleRate.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicState]
  }
}

