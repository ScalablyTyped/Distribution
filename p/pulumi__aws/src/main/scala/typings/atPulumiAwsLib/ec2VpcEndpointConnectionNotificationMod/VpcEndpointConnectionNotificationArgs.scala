package typings
package atPulumiAwsLib.ec2VpcEndpointConnectionNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointConnectionNotificationArgs extends js.Object {
  /**
    * One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
    */
  val connectionEvents: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * The ARN of the SNS topic for the notifications.
    */
  val connectionNotificationArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the VPC Endpoint to receive notifications for.
    */
  val vpcEndpointId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the VPC Endpoint Service to receive notifications for.
    */
  val vpcEndpointServiceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object VpcEndpointConnectionNotificationArgs {
  @scala.inline
  def apply(
    connectionEvents: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    connectionNotificationArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vpcEndpointId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcEndpointServiceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): VpcEndpointConnectionNotificationArgs = {
    val __obj = js.Dynamic.literal(connectionEvents = connectionEvents.asInstanceOf[js.Any], connectionNotificationArn = connectionNotificationArn.asInstanceOf[js.Any])
    if (vpcEndpointId != null) __obj.updateDynamic("vpcEndpointId")(vpcEndpointId.asInstanceOf[js.Any])
    if (vpcEndpointServiceId != null) __obj.updateDynamic("vpcEndpointServiceId")(vpcEndpointServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointConnectionNotificationArgs]
  }
}

