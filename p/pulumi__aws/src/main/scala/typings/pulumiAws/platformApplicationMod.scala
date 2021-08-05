package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformApplicationMod {
  
  @JSImport("@pulumi/aws/sns/platformApplication", "PlatformApplication")
  @js.native
  class PlatformApplication protected () extends CustomResource {
    /**
      * Create a PlatformApplication resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PlatformApplicationArgs) = this()
    def this(name: String, args: PlatformApplicationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the SNS platform application
      */
    val arn: Output_[String] = js.native
    
    /**
      * SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
      */
    val eventDeliveryFailureTopicArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * SNS Topic triggered when a new platform endpoint is added to your platform application.
      */
    val eventEndpointCreatedTopicArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
      */
    val eventEndpointDeletedTopicArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * SNS Topic triggered when an existing platform endpoint is changed from your platform application.
      */
    val eventEndpointUpdatedTopicArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The IAM role permitted to receive failure feedback for this application.
      */
    val failureFeedbackRoleArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The friendly name for the SNS platform application
      */
    val name: Output_[String] = js.native
    
    /**
      * The platform that the app is registered with. See [Platform](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for supported platforms.
      */
    val platform: Output_[String] = js.native
    
    /**
      * Application Platform credential. See [Credential](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
      */
    val platformCredential: Output_[String] = js.native
    
    /**
      * Application Platform principal. See [Principal](http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html) for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
      */
    val platformPrincipal: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The IAM role permitted to receive success feedback for this application.
      */
    val successFeedbackRoleArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The percentage of success to sample (0-100)
      */
    val successFeedbackSampleRate: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object PlatformApplication {
    
    @JSImport("@pulumi/aws/sns/platformApplication", "PlatformApplication")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PlatformApplication resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): PlatformApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[PlatformApplication]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): PlatformApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PlatformApplication]
    inline def get(name: String, id: Input[ID], state: PlatformApplicationState): PlatformApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PlatformApplication]
    inline def get(name: String, id: Input[ID], state: PlatformApplicationState, opts: CustomResourceOptions): PlatformApplication = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PlatformApplication]
    
    /**
      * Returns true if the given object is an instance of PlatformApplication.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/platformApplication.PlatformApplication */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sns/platformApplication.PlatformApplication */ Boolean]
  }
  
  trait PlatformApplicationArgs extends StObject {
    
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
      * The platform that the app is registered with. See [Platform](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for supported platforms.
      */
    val platform: Input[String]
    
    /**
      * Application Platform credential. See [Credential](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
      */
    val platformCredential: Input[String]
    
    /**
      * Application Platform principal. See [Principal](http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html) for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
      */
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
    
    inline def apply(platform: Input[String], platformCredential: Input[String]): PlatformApplicationArgs = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any], platformCredential = platformCredential.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformApplicationArgs]
    }
    
    extension [Self <: PlatformApplicationArgs](x: Self) {
      
      inline def setEventDeliveryFailureTopicArn(value: Input[String]): Self = StObject.set(x, "eventDeliveryFailureTopicArn", value.asInstanceOf[js.Any])
      
      inline def setEventDeliveryFailureTopicArnUndefined: Self = StObject.set(x, "eventDeliveryFailureTopicArn", js.undefined)
      
      inline def setEventEndpointCreatedTopicArn(value: Input[String]): Self = StObject.set(x, "eventEndpointCreatedTopicArn", value.asInstanceOf[js.Any])
      
      inline def setEventEndpointCreatedTopicArnUndefined: Self = StObject.set(x, "eventEndpointCreatedTopicArn", js.undefined)
      
      inline def setEventEndpointDeletedTopicArn(value: Input[String]): Self = StObject.set(x, "eventEndpointDeletedTopicArn", value.asInstanceOf[js.Any])
      
      inline def setEventEndpointDeletedTopicArnUndefined: Self = StObject.set(x, "eventEndpointDeletedTopicArn", js.undefined)
      
      inline def setEventEndpointUpdatedTopicArn(value: Input[String]): Self = StObject.set(x, "eventEndpointUpdatedTopicArn", value.asInstanceOf[js.Any])
      
      inline def setEventEndpointUpdatedTopicArnUndefined: Self = StObject.set(x, "eventEndpointUpdatedTopicArn", js.undefined)
      
      inline def setFailureFeedbackRoleArn(value: Input[String]): Self = StObject.set(x, "failureFeedbackRoleArn", value.asInstanceOf[js.Any])
      
      inline def setFailureFeedbackRoleArnUndefined: Self = StObject.set(x, "failureFeedbackRoleArn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlatform(value: Input[String]): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformCredential(value: Input[String]): Self = StObject.set(x, "platformCredential", value.asInstanceOf[js.Any])
      
      inline def setPlatformPrincipal(value: Input[String]): Self = StObject.set(x, "platformPrincipal", value.asInstanceOf[js.Any])
      
      inline def setPlatformPrincipalUndefined: Self = StObject.set(x, "platformPrincipal", js.undefined)
      
      inline def setSuccessFeedbackRoleArn(value: Input[String]): Self = StObject.set(x, "successFeedbackRoleArn", value.asInstanceOf[js.Any])
      
      inline def setSuccessFeedbackRoleArnUndefined: Self = StObject.set(x, "successFeedbackRoleArn", js.undefined)
      
      inline def setSuccessFeedbackSampleRate(value: Input[String]): Self = StObject.set(x, "successFeedbackSampleRate", value.asInstanceOf[js.Any])
      
      inline def setSuccessFeedbackSampleRateUndefined: Self = StObject.set(x, "successFeedbackSampleRate", js.undefined)
    }
  }
  
  trait PlatformApplicationState extends StObject {
    
    /**
      * The ARN of the SNS platform application
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
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
      * The platform that the app is registered with. See [Platform](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for supported platforms.
      */
    val platform: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Application Platform credential. See [Credential](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
      */
    val platformCredential: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Application Platform principal. See [Principal](http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html) for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
      */
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
  object PlatformApplicationState {
    
    inline def apply(): PlatformApplicationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlatformApplicationState]
    }
    
    extension [Self <: PlatformApplicationState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setEventDeliveryFailureTopicArn(value: Input[String]): Self = StObject.set(x, "eventDeliveryFailureTopicArn", value.asInstanceOf[js.Any])
      
      inline def setEventDeliveryFailureTopicArnUndefined: Self = StObject.set(x, "eventDeliveryFailureTopicArn", js.undefined)
      
      inline def setEventEndpointCreatedTopicArn(value: Input[String]): Self = StObject.set(x, "eventEndpointCreatedTopicArn", value.asInstanceOf[js.Any])
      
      inline def setEventEndpointCreatedTopicArnUndefined: Self = StObject.set(x, "eventEndpointCreatedTopicArn", js.undefined)
      
      inline def setEventEndpointDeletedTopicArn(value: Input[String]): Self = StObject.set(x, "eventEndpointDeletedTopicArn", value.asInstanceOf[js.Any])
      
      inline def setEventEndpointDeletedTopicArnUndefined: Self = StObject.set(x, "eventEndpointDeletedTopicArn", js.undefined)
      
      inline def setEventEndpointUpdatedTopicArn(value: Input[String]): Self = StObject.set(x, "eventEndpointUpdatedTopicArn", value.asInstanceOf[js.Any])
      
      inline def setEventEndpointUpdatedTopicArnUndefined: Self = StObject.set(x, "eventEndpointUpdatedTopicArn", js.undefined)
      
      inline def setFailureFeedbackRoleArn(value: Input[String]): Self = StObject.set(x, "failureFeedbackRoleArn", value.asInstanceOf[js.Any])
      
      inline def setFailureFeedbackRoleArnUndefined: Self = StObject.set(x, "failureFeedbackRoleArn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlatform(value: Input[String]): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformCredential(value: Input[String]): Self = StObject.set(x, "platformCredential", value.asInstanceOf[js.Any])
      
      inline def setPlatformCredentialUndefined: Self = StObject.set(x, "platformCredential", js.undefined)
      
      inline def setPlatformPrincipal(value: Input[String]): Self = StObject.set(x, "platformPrincipal", value.asInstanceOf[js.Any])
      
      inline def setPlatformPrincipalUndefined: Self = StObject.set(x, "platformPrincipal", js.undefined)
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setSuccessFeedbackRoleArn(value: Input[String]): Self = StObject.set(x, "successFeedbackRoleArn", value.asInstanceOf[js.Any])
      
      inline def setSuccessFeedbackRoleArnUndefined: Self = StObject.set(x, "successFeedbackRoleArn", js.undefined)
      
      inline def setSuccessFeedbackSampleRate(value: Input[String]): Self = StObject.set(x, "successFeedbackSampleRate", value.asInstanceOf[js.Any])
      
      inline def setSuccessFeedbackSampleRateUndefined: Self = StObject.set(x, "successFeedbackSampleRate", js.undefined)
    }
  }
}
