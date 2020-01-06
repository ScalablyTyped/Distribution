package typings.atPulumiAws.snsPlatformApplicationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformApplicationState extends js.Object {
  /**
    * The ARN of the SNS platform application
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
    */
  val eventDeliveryFailureTopicArn: js.UndefOr[Input[String]] = js.native
  /**
    * SNS Topic triggered when a new platform endpoint is added to your platform application.
    */
  val eventEndpointCreatedTopicArn: js.UndefOr[Input[String]] = js.native
  /**
    * SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
    */
  val eventEndpointDeletedTopicArn: js.UndefOr[Input[String]] = js.native
  /**
    * SNS Topic triggered when an existing platform endpoint is changed from your platform application.
    */
  val eventEndpointUpdatedTopicArn: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM role permitted to receive failure feedback for this application.
    */
  val failureFeedbackRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The friendly name for the SNS platform application
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The platform that the app is registered with. See [Platform][1] for supported platforms.
    */
  val platform: js.UndefOr[Input[String]] = js.native
  /**
    * Application Platform credential. See [Credential][1] for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
    */
  val platformCredential: js.UndefOr[Input[String]] = js.native
  /**
    * Application Platform principal. See [Principal][2] for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
    */
  val platformPrincipal: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM role permitted to receive success feedback for this application.
    */
  val successFeedbackRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The percentage of success to sample (0-100)
    */
  val successFeedbackSampleRate: js.UndefOr[Input[String]] = js.native
}

object PlatformApplicationState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    eventDeliveryFailureTopicArn: Input[String] = null,
    eventEndpointCreatedTopicArn: Input[String] = null,
    eventEndpointDeletedTopicArn: Input[String] = null,
    eventEndpointUpdatedTopicArn: Input[String] = null,
    failureFeedbackRoleArn: Input[String] = null,
    name: Input[String] = null,
    platform: Input[String] = null,
    platformCredential: Input[String] = null,
    platformPrincipal: Input[String] = null,
    successFeedbackRoleArn: Input[String] = null,
    successFeedbackSampleRate: Input[String] = null
  ): PlatformApplicationState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (eventDeliveryFailureTopicArn != null) __obj.updateDynamic("eventDeliveryFailureTopicArn")(eventDeliveryFailureTopicArn.asInstanceOf[js.Any])
    if (eventEndpointCreatedTopicArn != null) __obj.updateDynamic("eventEndpointCreatedTopicArn")(eventEndpointCreatedTopicArn.asInstanceOf[js.Any])
    if (eventEndpointDeletedTopicArn != null) __obj.updateDynamic("eventEndpointDeletedTopicArn")(eventEndpointDeletedTopicArn.asInstanceOf[js.Any])
    if (eventEndpointUpdatedTopicArn != null) __obj.updateDynamic("eventEndpointUpdatedTopicArn")(eventEndpointUpdatedTopicArn.asInstanceOf[js.Any])
    if (failureFeedbackRoleArn != null) __obj.updateDynamic("failureFeedbackRoleArn")(failureFeedbackRoleArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (platformCredential != null) __obj.updateDynamic("platformCredential")(platformCredential.asInstanceOf[js.Any])
    if (platformPrincipal != null) __obj.updateDynamic("platformPrincipal")(platformPrincipal.asInstanceOf[js.Any])
    if (successFeedbackRoleArn != null) __obj.updateDynamic("successFeedbackRoleArn")(successFeedbackRoleArn.asInstanceOf[js.Any])
    if (successFeedbackSampleRate != null) __obj.updateDynamic("successFeedbackSampleRate")(successFeedbackSampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformApplicationState]
  }
}

