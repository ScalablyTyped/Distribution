package typings.pulumiAws.vpcEndpointConnectionNotificationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointConnectionNotificationArgs extends js.Object {
  /**
    * One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
    */
  val connectionEvents: Input[js.Array[Input[String]]] = js.native
  /**
    * The ARN of the SNS topic for the notifications.
    */
  val connectionNotificationArn: Input[String] = js.native
  /**
    * The ID of the VPC Endpoint to receive notifications for.
    */
  val vpcEndpointId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC Endpoint Service to receive notifications for.
    */
  val vpcEndpointServiceId: js.UndefOr[Input[String]] = js.native
}

object VpcEndpointConnectionNotificationArgs {
  @scala.inline
  def apply(
    connectionEvents: Input[js.Array[Input[String]]],
    connectionNotificationArn: Input[String],
    vpcEndpointId: Input[String] = null,
    vpcEndpointServiceId: Input[String] = null
  ): VpcEndpointConnectionNotificationArgs = {
    val __obj = js.Dynamic.literal(connectionEvents = connectionEvents.asInstanceOf[js.Any], connectionNotificationArn = connectionNotificationArn.asInstanceOf[js.Any])
    if (vpcEndpointId != null) __obj.updateDynamic("vpcEndpointId")(vpcEndpointId.asInstanceOf[js.Any])
    if (vpcEndpointServiceId != null) __obj.updateDynamic("vpcEndpointServiceId")(vpcEndpointServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointConnectionNotificationArgs]
  }
}

