package typings.atPulumiAws.snsPlatformApplicationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformApplicationArgs extends js.Object {
  /**
    * SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
    */
  val eventDeliveryFailureTopicArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * SNS Topic triggered when a new platform endpoint is added to your platform application.
    */
  val eventEndpointCreatedTopicArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
    */
  val eventEndpointDeletedTopicArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * SNS Topic triggered when an existing platform endpoint is changed from your platform application.
    */
  val eventEndpointUpdatedTopicArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The IAM role permitted to receive failure feedback for this application.
    */
  val failureFeedbackRoleArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The friendly name for the SNS platform application
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The platform that the app is registered with. See [Platform][1] for supported platforms.
    */
  val platform: Input[String]
  val platformCredential: Input[String]
  val platformPrincipal: js.UndefOr[Input[String]] = js.undefined
  /**
    * The IAM role permitted to receive success feedback for this application.
    */
  val successFeedbackRoleArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The percentage of success to sample (0-100)
    */
  val successFeedbackSampleRate: js.UndefOr[Input[String]] = js.undefined
}

object PlatformApplicationArgs {
  @scala.inline
  def apply(
    platform: Input[String],
    platformCredential: Input[String],
    eventDeliveryFailureTopicArn: Input[String] = null,
    eventEndpointCreatedTopicArn: Input[String] = null,
    eventEndpointDeletedTopicArn: Input[String] = null,
    eventEndpointUpdatedTopicArn: Input[String] = null,
    failureFeedbackRoleArn: Input[String] = null,
    name: Input[String] = null,
    platformPrincipal: Input[String] = null,
    successFeedbackRoleArn: Input[String] = null,
    successFeedbackSampleRate: Input[String] = null
  ): PlatformApplicationArgs = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any], platformCredential = platformCredential.asInstanceOf[js.Any])
    if (eventDeliveryFailureTopicArn != null) __obj.updateDynamic("eventDeliveryFailureTopicArn")(eventDeliveryFailureTopicArn.asInstanceOf[js.Any])
    if (eventEndpointCreatedTopicArn != null) __obj.updateDynamic("eventEndpointCreatedTopicArn")(eventEndpointCreatedTopicArn.asInstanceOf[js.Any])
    if (eventEndpointDeletedTopicArn != null) __obj.updateDynamic("eventEndpointDeletedTopicArn")(eventEndpointDeletedTopicArn.asInstanceOf[js.Any])
    if (eventEndpointUpdatedTopicArn != null) __obj.updateDynamic("eventEndpointUpdatedTopicArn")(eventEndpointUpdatedTopicArn.asInstanceOf[js.Any])
    if (failureFeedbackRoleArn != null) __obj.updateDynamic("failureFeedbackRoleArn")(failureFeedbackRoleArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platformPrincipal != null) __obj.updateDynamic("platformPrincipal")(platformPrincipal.asInstanceOf[js.Any])
    if (successFeedbackRoleArn != null) __obj.updateDynamic("successFeedbackRoleArn")(successFeedbackRoleArn.asInstanceOf[js.Any])
    if (successFeedbackSampleRate != null) __obj.updateDynamic("successFeedbackSampleRate")(successFeedbackSampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformApplicationArgs]
  }
}

