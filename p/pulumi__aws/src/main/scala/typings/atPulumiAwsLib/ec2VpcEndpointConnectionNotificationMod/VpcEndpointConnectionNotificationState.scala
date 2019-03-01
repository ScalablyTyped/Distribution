package typings
package atPulumiAwsLib.ec2VpcEndpointConnectionNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointConnectionNotificationState extends js.Object {
  /**
    * One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
    */
  val connectionEvents: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ARN of the SNS topic for the notifications.
    */
  val connectionNotificationArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of notification.
    */
  val notificationType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The state of the notification.
    */
  val state: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the VPC Endpoint to receive notifications for.
    */
  val vpcEndpointId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the VPC Endpoint Service to receive notifications for.
    */
  val vpcEndpointServiceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object VpcEndpointConnectionNotificationState {
  @scala.inline
  def apply(
    connectionEvents: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    connectionNotificationArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    notificationType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    state: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcEndpointId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcEndpointServiceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

