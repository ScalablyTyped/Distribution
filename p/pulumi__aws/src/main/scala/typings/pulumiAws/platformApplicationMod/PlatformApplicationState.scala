package typings.pulumiAws.platformApplicationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The platform that the app is registered with. See [Platform](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for supported platforms.
    */
  val platform: js.UndefOr[Input[String]] = js.native
  
  /**
    * Application Platform credential. See [Credential](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
    */
  val platformCredential: js.UndefOr[Input[String]] = js.native
  
  /**
    * Application Platform principal. See [Principal](http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html) for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
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
  def apply(): PlatformApplicationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformApplicationState]
  }
  
  @scala.inline
  implicit class PlatformApplicationStateOps[Self <: PlatformApplicationState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setEventDeliveryFailureTopicArn(value: Input[String]): Self = this.set("eventDeliveryFailureTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventDeliveryFailureTopicArn: Self = this.set("eventDeliveryFailureTopicArn", js.undefined)
    
    @scala.inline
    def setEventEndpointCreatedTopicArn(value: Input[String]): Self = this.set("eventEndpointCreatedTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventEndpointCreatedTopicArn: Self = this.set("eventEndpointCreatedTopicArn", js.undefined)
    
    @scala.inline
    def setEventEndpointDeletedTopicArn(value: Input[String]): Self = this.set("eventEndpointDeletedTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventEndpointDeletedTopicArn: Self = this.set("eventEndpointDeletedTopicArn", js.undefined)
    
    @scala.inline
    def setEventEndpointUpdatedTopicArn(value: Input[String]): Self = this.set("eventEndpointUpdatedTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventEndpointUpdatedTopicArn: Self = this.set("eventEndpointUpdatedTopicArn", js.undefined)
    
    @scala.inline
    def setFailureFeedbackRoleArn(value: Input[String]): Self = this.set("failureFeedbackRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureFeedbackRoleArn: Self = this.set("failureFeedbackRoleArn", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPlatform(value: Input[String]): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setPlatformCredential(value: Input[String]): Self = this.set("platformCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformCredential: Self = this.set("platformCredential", js.undefined)
    
    @scala.inline
    def setPlatformPrincipal(value: Input[String]): Self = this.set("platformPrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformPrincipal: Self = this.set("platformPrincipal", js.undefined)
    
    @scala.inline
    def setSuccessFeedbackRoleArn(value: Input[String]): Self = this.set("successFeedbackRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessFeedbackRoleArn: Self = this.set("successFeedbackRoleArn", js.undefined)
    
    @scala.inline
    def setSuccessFeedbackSampleRate(value: Input[String]): Self = this.set("successFeedbackSampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessFeedbackSampleRate: Self = this.set("successFeedbackSampleRate", js.undefined)
  }
}
