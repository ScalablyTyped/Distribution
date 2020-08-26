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
  def apply(connectionEvents: Input[js.Array[Input[String]]], connectionNotificationArn: Input[String]): VpcEndpointConnectionNotificationArgs = {
    val __obj = js.Dynamic.literal(connectionEvents = connectionEvents.asInstanceOf[js.Any], connectionNotificationArn = connectionNotificationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointConnectionNotificationArgs]
  }
  @scala.inline
  implicit class VpcEndpointConnectionNotificationArgsOps[Self <: VpcEndpointConnectionNotificationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectionEventsVarargs(value: Input[String]*): Self = this.set("connectionEvents", js.Array(value :_*))
    @scala.inline
    def setConnectionEvents(value: Input[js.Array[Input[String]]]): Self = this.set("connectionEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionNotificationArn(value: Input[String]): Self = this.set("connectionNotificationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcEndpointId(value: Input[String]): Self = this.set("vpcEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpointId: Self = this.set("vpcEndpointId", js.undefined)
    @scala.inline
    def setVpcEndpointServiceId(value: Input[String]): Self = this.set("vpcEndpointServiceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpointServiceId: Self = this.set("vpcEndpointServiceId", js.undefined)
  }
  
}

