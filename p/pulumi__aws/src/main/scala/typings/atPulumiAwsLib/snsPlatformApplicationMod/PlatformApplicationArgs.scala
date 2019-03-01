package typings
package atPulumiAwsLib.snsPlatformApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformApplicationArgs extends js.Object {
  /**
    * SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
    */
  val eventDeliveryFailureTopicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * SNS Topic triggered when a new platform endpoint is added to your platform application.
    */
  val eventEndpointCreatedTopicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
    */
  val eventEndpointDeletedTopicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * SNS Topic triggered when an existing platform endpoint is changed from your platform application.
    */
  val eventEndpointUpdatedTopicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM role permitted to receive failure feedback for this application.
    */
  val failureFeedbackRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The friendly name for the SNS platform application
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The platform that the app is registered with. See [Platform][1] for supported platforms.
    */
  val platform: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Application Platform credential. See [Credential][1] for type of credential required for platform. The value of this attribute when stored into the Terraform state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
    */
  val platformCredential: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Application Platform principal. See [Principal][2] for type of principal required for platform. The value of this attribute when stored into the Terraform state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
    */
  val platformPrincipal: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM role permitted to receive success feedback for this application.
    */
  val successFeedbackRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The percentage of success to sample (0-100)
    */
  val successFeedbackSampleRate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object PlatformApplicationArgs {
  @scala.inline
  def apply(
    platform: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    platformCredential: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    eventDeliveryFailureTopicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    eventEndpointCreatedTopicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    eventEndpointDeletedTopicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    eventEndpointUpdatedTopicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    failureFeedbackRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    platformPrincipal: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    successFeedbackRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    successFeedbackSampleRate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): PlatformApplicationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.updateDynamic("platformCredential")(platformCredential.asInstanceOf[js.Any])
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

