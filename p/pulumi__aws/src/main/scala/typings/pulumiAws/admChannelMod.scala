package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/pinpoint/admChannel", "AdmChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AdmChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): AdmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[AdmChannel]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): AdmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AdmChannel]
    inline def get(name: String, id: Input[ID], state: AdmChannelState): AdmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AdmChannel]
    inline def get(name: String, id: Input[ID], state: AdmChannelState, opts: CustomResourceOptions): AdmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AdmChannel]
    
    /**
      * Returns true if the given object is an instance of AdmChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/admChannel.AdmChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/admChannel.AdmChannel */ Boolean]
  }
  
  trait AdmChannelArgs extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: Input[String]
    
    /**
      * Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
      */
    val clientId: Input[String]
    
    /**
      * Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
      */
    val clientSecret: Input[String]
    
    /**
      * Specifies whether to enable the channel. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object AdmChannelArgs {
    
    inline def apply(applicationId: Input[String], clientId: Input[String], clientSecret: Input[String]): AdmChannelArgs = {
      val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdmChannelArgs]
    }
    
    extension [Self <: AdmChannelArgs](x: Self) {
      
      inline def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: Input[String]): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: Input[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
  
  trait AdmChannelState extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
      */
    val clientId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
      */
    val clientSecret: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether to enable the channel. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object AdmChannelState {
    
    inline def apply(): AdmChannelState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdmChannelState]
    }
    
    extension [Self <: AdmChannelState](x: Self) {
      
      inline def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
      
      inline def setClientId(value: Input[String]): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setClientSecret(value: Input[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
}
