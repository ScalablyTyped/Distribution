package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object admChannelMod {
  
  @JSImport("@pulumi/aws/pinpoint/admChannel", "AdmChannel")
  @js.native
  class AdmChannel protected () extends CustomResource {
    /**
      * Create a AdmChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AdmChannelArgs) = this()
    def this(name: String, args: AdmChannelArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The application ID.
      */
    val applicationId: Output_[String] = js.native
    
    /**
      * Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
      */
    val clientId: Output_[String] = js.native
    
    /**
      * Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
      */
    val clientSecret: Output_[String] = js.native
    
    /**
      * Specifies whether to enable the channel. Defaults to `true`.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object AdmChannel {
    
    /**
      * Get an existing AdmChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/pinpoint/admChannel", "AdmChannel.get")
    @js.native
    def get(name: String, id: Input[ID]): AdmChannel = js.native
    @JSImport("@pulumi/aws/pinpoint/admChannel", "AdmChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AdmChannel = js.native
    @JSImport("@pulumi/aws/pinpoint/admChannel", "AdmChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: AdmChannelState): AdmChannel = js.native
    @JSImport("@pulumi/aws/pinpoint/admChannel", "AdmChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: AdmChannelState, opts: CustomResourceOptions): AdmChannel = js.native
    
    /**
      * Returns true if the given object is an instance of AdmChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/pinpoint/admChannel", "AdmChannel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/admChannel.AdmChannel */ Boolean = js.native
  }
  
  @js.native
  trait AdmChannelArgs extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: Input[String] = js.native
    
    /**
      * Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
      */
    val clientId: Input[String] = js.native
    
    /**
      * Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
      */
    val clientSecret: Input[String] = js.native
    
    /**
      * Specifies whether to enable the channel. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
  }
  object AdmChannelArgs {
    
    @scala.inline
    def apply(applicationId: Input[String], clientId: Input[String], clientSecret: Input[String]): AdmChannelArgs = {
      val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdmChannelArgs]
    }
    
    @scala.inline
    implicit class AdmChannelArgsMutableBuilder[Self <: AdmChannelArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientId(value: Input[String]): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: Input[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
  
  @js.native
  trait AdmChannelState extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
      */
    val clientId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
      */
    val clientSecret: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies whether to enable the channel. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
  }
  object AdmChannelState {
    
    @scala.inline
    def apply(): AdmChannelState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdmChannelState]
    }
    
    @scala.inline
    implicit class AdmChannelStateMutableBuilder[Self <: AdmChannelState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
      
      @scala.inline
      def setClientId(value: Input[String]): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setClientSecret(value: Input[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
}
