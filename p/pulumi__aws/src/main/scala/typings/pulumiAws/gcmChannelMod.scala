package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gcmChannelMod {
  
  @JSImport("@pulumi/aws/pinpoint/gcmChannel", "GcmChannel")
  @js.native
  class GcmChannel protected () extends CustomResource {
    /**
      * Create a GcmChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GcmChannelArgs) = this()
    def this(name: String, args: GcmChannelArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Platform credential API key from Google.
      */
    val apiKey: Output_[String] = js.native
    
    /**
      * The application ID.
      */
    val applicationId: Output_[String] = js.native
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object GcmChannel {
    
    @JSImport("@pulumi/aws/pinpoint/gcmChannel", "GcmChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing GcmChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): GcmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[GcmChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): GcmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GcmChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: GcmChannelState): GcmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[GcmChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: GcmChannelState, opts: CustomResourceOptions): GcmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GcmChannel]
    
    /**
      * Returns true if the given object is an instance of GcmChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/gcmChannel.GcmChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/gcmChannel.GcmChannel */ Boolean]
  }
  
  trait GcmChannelArgs extends StObject {
    
    /**
      * Platform credential API key from Google.
      */
    val apiKey: Input[String]
    
    /**
      * The application ID.
      */
    val applicationId: Input[String]
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object GcmChannelArgs {
    
    @scala.inline
    def apply(apiKey: Input[String], applicationId: Input[String]): GcmChannelArgs = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], applicationId = applicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GcmChannelArgs]
    }
    
    @scala.inline
    implicit class GcmChannelArgsMutableBuilder[Self <: GcmChannelArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: Input[String]): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
  
  trait GcmChannelState extends StObject {
    
    /**
      * Platform credential API key from Google.
      */
    val apiKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The application ID.
      */
    val applicationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object GcmChannelState {
    
    @scala.inline
    def apply(): GcmChannelState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GcmChannelState]
    }
    
    @scala.inline
    implicit class GcmChannelStateMutableBuilder[Self <: GcmChannelState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: Input[String]): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
}
