package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smsChannelMod {
  
  @JSImport("@pulumi/aws/pinpoint/smsChannel", "SmsChannel")
  @js.native
  class SmsChannel protected () extends CustomResource {
    /**
      * Create a SmsChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SmsChannelArgs) = this()
    def this(name: String, args: SmsChannelArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The application ID.
      */
    val applicationId: Output_[String] = js.native
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Promotional messages per second that can be sent.
      */
    val promotionalMessagesPerSecond: Output_[Double] = js.native
    
    /**
      * Sender identifier of your messages.
      */
    val senderId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Short Code registered with the phone provider.
      */
    val shortCode: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Transactional messages per second that can be sent.
      */
    val transactionalMessagesPerSecond: Output_[Double] = js.native
  }
  /* static members */
  object SmsChannel {
    
    @JSImport("@pulumi/aws/pinpoint/smsChannel", "SmsChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SmsChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): SmsChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SmsChannel]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SmsChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SmsChannel]
    inline def get(name: String, id: Input[ID], state: SmsChannelState): SmsChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SmsChannel]
    inline def get(name: String, id: Input[ID], state: SmsChannelState, opts: CustomResourceOptions): SmsChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SmsChannel]
    
    /**
      * Returns true if the given object is an instance of SmsChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/smsChannel.SmsChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/smsChannel.SmsChannel */ Boolean]
  }
  
  trait SmsChannelArgs extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: Input[String]
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Sender identifier of your messages.
      */
    val senderId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Short Code registered with the phone provider.
      */
    val shortCode: js.UndefOr[Input[String]] = js.undefined
  }
  object SmsChannelArgs {
    
    inline def apply(applicationId: Input[String]): SmsChannelArgs = {
      val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmsChannelArgs]
    }
    
    extension [Self <: SmsChannelArgs](x: Self) {
      
      inline def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setSenderId(value: Input[String]): Self = StObject.set(x, "senderId", value.asInstanceOf[js.Any])
      
      inline def setSenderIdUndefined: Self = StObject.set(x, "senderId", js.undefined)
      
      inline def setShortCode(value: Input[String]): Self = StObject.set(x, "shortCode", value.asInstanceOf[js.Any])
      
      inline def setShortCodeUndefined: Self = StObject.set(x, "shortCode", js.undefined)
    }
  }
  
  trait SmsChannelState extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Promotional messages per second that can be sent.
      */
    val promotionalMessagesPerSecond: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Sender identifier of your messages.
      */
    val senderId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Short Code registered with the phone provider.
      */
    val shortCode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Transactional messages per second that can be sent.
      */
    val transactionalMessagesPerSecond: js.UndefOr[Input[Double]] = js.undefined
  }
  object SmsChannelState {
    
    inline def apply(): SmsChannelState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmsChannelState]
    }
    
    extension [Self <: SmsChannelState](x: Self) {
      
      inline def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setPromotionalMessagesPerSecond(value: Input[Double]): Self = StObject.set(x, "promotionalMessagesPerSecond", value.asInstanceOf[js.Any])
      
      inline def setPromotionalMessagesPerSecondUndefined: Self = StObject.set(x, "promotionalMessagesPerSecond", js.undefined)
      
      inline def setSenderId(value: Input[String]): Self = StObject.set(x, "senderId", value.asInstanceOf[js.Any])
      
      inline def setSenderIdUndefined: Self = StObject.set(x, "senderId", js.undefined)
      
      inline def setShortCode(value: Input[String]): Self = StObject.set(x, "shortCode", value.asInstanceOf[js.Any])
      
      inline def setShortCodeUndefined: Self = StObject.set(x, "shortCode", js.undefined)
      
      inline def setTransactionalMessagesPerSecond(value: Input[Double]): Self = StObject.set(x, "transactionalMessagesPerSecond", value.asInstanceOf[js.Any])
      
      inline def setTransactionalMessagesPerSecondUndefined: Self = StObject.set(x, "transactionalMessagesPerSecond", js.undefined)
    }
  }
}
