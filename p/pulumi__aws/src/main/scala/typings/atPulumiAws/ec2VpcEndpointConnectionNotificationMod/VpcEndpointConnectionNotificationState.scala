package typings.atPulumiAws.ec2VpcEndpointConnectionNotificationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointConnectionNotificationState extends js.Object {
  /**
    * One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
    */
  val connectionEvents: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ARN of the SNS topic for the notifications.
    */
  val connectionNotificationArn: js.UndefOr[Input[String]] = js.native
  /**
    * The type of notification.
    */
  val notificationType: js.UndefOr[Input[String]] = js.native
  /**
    * The state of the notification.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC Endpoint to receive notifications for.
    */
  val vpcEndpointId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC Endpoint Service to receive notifications for.
    */
  val vpcEndpointServiceId: js.UndefOr[Input[String]] = js.native
}

object VpcEndpointConnectionNotificationState {
  @scala.inline
  def apply(
    connectionEvents: Input[js.Array[Input[String]]] = null,
    connectionNotificationArn: Input[String] = null,
    notificationType: Input[String] = null,
    state: Input[String] = null,
    vpcEndpointId: Input[String] = null,
    vpcEndpointServiceId: Input[String] = null
  ): VpcEndpointConnectionNotificationState = {
    val __obj = js.Dynamic.literal()
    if (connectionEvents != null) __obj.updateDynamic("connectionEvents")(connectionEvents.asInstanceOf[js.Any])
    if (connectionNotificationArn != null) __obj.updateDynamic("connectionNotificationArn")(connectionNotificationArn.asInstanceOf[js.Any])
    if (notificationType != null) __obj.updateDynamic("notificationType")(notificationType.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (vpcEndpointId != null) __obj.updateDynamic("vpcEndpointId")(vpcEndpointId.asInstanceOf[js.Any])
    if (vpcEndpointServiceId != null) __obj.updateDynamic("vpcEndpointServiceId")(vpcEndpointServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointConnectionNotificationState]
  }
}

