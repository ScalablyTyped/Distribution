package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailChannelMod {
  
  @JSImport("@pulumi/aws/pinpoint/emailChannel", "EmailChannel")
  @js.native
  class EmailChannel protected () extends CustomResource {
    /**
      * Create a EmailChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EmailChannelArgs) = this()
    def this(name: String, args: EmailChannelArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The application ID.
      */
    val applicationId: Output_[String] = js.native
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The email address used to send emails from.
      */
    val fromAddress: Output_[String] = js.native
    
    /**
      * The ARN of an identity verified with SES.
      */
    val identity: Output_[String] = js.native
    
    /**
      * Messages per second that can be sent.
      */
    val messagesPerSecond: Output_[Double] = js.native
    
    /**
      * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
      */
    val roleArn: Output_[String] = js.native
  }
  /* static members */
  object EmailChannel {
    
    @JSImport("@pulumi/aws/pinpoint/emailChannel", "EmailChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EmailChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): EmailChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[EmailChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): EmailChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EmailChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: EmailChannelState): EmailChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[EmailChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: EmailChannelState, opts: CustomResourceOptions): EmailChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EmailChannel]
    
    /**
      * Returns true if the given object is an instance of EmailChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/emailChannel.EmailChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/emailChannel.EmailChannel */ Boolean]
  }
  
  trait EmailChannelArgs extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: Input[String]
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The email address used to send emails from.
      */
    val fromAddress: Input[String]
    
    /**
      * The ARN of an identity verified with SES.
      */
    val identity: Input[String]
    
    /**
      * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
      */
    val roleArn: Input[String]
  }
  object EmailChannelArgs {
    
    @scala.inline
    def apply(
      applicationId: Input[String],
      fromAddress: Input[String],
      identity: Input[String],
      roleArn: Input[String]
    ): EmailChannelArgs = {
      val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], fromAddress = fromAddress.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailChannelArgs]
    }
    
    @scala.inline
    implicit class EmailChannelArgsMutableBuilder[Self <: EmailChannelArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFromAddress(value: Input[String]): Self = StObject.set(x, "fromAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentity(value: Input[String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmailChannelState extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The email address used to send emails from.
      */
    val fromAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of an identity verified with SES.
      */
    val identity: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Messages per second that can be sent.
      */
    val messagesPerSecond: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
  }
  object EmailChannelState {
    
    @scala.inline
    def apply(): EmailChannelState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailChannelState]
    }
    
    @scala.inline
    implicit class EmailChannelStateMutableBuilder[Self <: EmailChannelState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFromAddress(value: Input[String]): Self = StObject.set(x, "fromAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromAddressUndefined: Self = StObject.set(x, "fromAddress", js.undefined)
      
      @scala.inline
      def setIdentity(value: Input[String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      @scala.inline
      def setMessagesPerSecond(value: Input[Double]): Self = StObject.set(x, "messagesPerSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesPerSecondUndefined: Self = StObject.set(x, "messagesPerSecond", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    }
  }
}
