package typings.pulumiAws.vpcEndpointConnectionNotificationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): VpcEndpointConnectionNotificationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointConnectionNotificationState]
  }
  
  @scala.inline
  implicit class VpcEndpointConnectionNotificationStateOps[Self <: VpcEndpointConnectionNotificationState] (val x: Self) extends AnyVal {
    
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
    def deleteConnectionEvents: Self = this.set("connectionEvents", js.undefined)
    
    @scala.inline
    def setConnectionNotificationArn(value: Input[String]): Self = this.set("connectionNotificationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionNotificationArn: Self = this.set("connectionNotificationArn", js.undefined)
    
    @scala.inline
    def setNotificationType(value: Input[String]): Self = this.set("notificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationType: Self = this.set("notificationType", js.undefined)
    
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
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
