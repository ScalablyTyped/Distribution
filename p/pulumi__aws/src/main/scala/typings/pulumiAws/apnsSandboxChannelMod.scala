package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apnsSandboxChannelMod {
  
  @JSImport("@pulumi/aws/pinpoint/apnsSandboxChannel", "ApnsSandboxChannel")
  @js.native
  class ApnsSandboxChannel protected () extends CustomResource {
    /**
      * Create a ApnsSandboxChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApnsSandboxChannelArgs) = this()
    def this(name: String, args: ApnsSandboxChannelArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The application ID.
      */
    val applicationId: Output_[String] = js.native
    
    /**
      * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
      */
    val bundleId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The pem encoded TLS Certificate from Apple.
      */
    val certificate: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The default authentication method used for APNs Sandbox.
      * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
      * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
      * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
      */
    val defaultAuthenticationMethod: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The Certificate Private Key file (ie. `.key` file).
      */
    val privateKey: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
      */
    val teamId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The `.p8` file that you download from your Apple developer account when you create an authentication key.
      */
    val tokenKey: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
      */
    val tokenKeyId: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object ApnsSandboxChannel {
    
    @JSImport("@pulumi/aws/pinpoint/apnsSandboxChannel", "ApnsSandboxChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ApnsSandboxChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ApnsSandboxChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ApnsSandboxChannel]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ApnsSandboxChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ApnsSandboxChannel]
    inline def get(name: String, id: Input[ID], state: ApnsSandboxChannelState): ApnsSandboxChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ApnsSandboxChannel]
    inline def get(name: String, id: Input[ID], state: ApnsSandboxChannelState, opts: CustomResourceOptions): ApnsSandboxChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ApnsSandboxChannel]
    
    /**
      * Returns true if the given object is an instance of ApnsSandboxChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsSandboxChannel.ApnsSandboxChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/apnsSandboxChannel.ApnsSandboxChannel */ Boolean]
  }
  
  trait ApnsSandboxChannelArgs extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: Input[String]
    
    /**
      * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
      */
    val bundleId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The pem encoded TLS Certificate from Apple.
      */
    val certificate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The default authentication method used for APNs Sandbox.
      * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
      * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
      * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
      */
    val defaultAuthenticationMethod: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The Certificate Private Key file (ie. `.key` file).
      */
    val privateKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
      */
    val teamId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The `.p8` file that you download from your Apple developer account when you create an authentication key.
      */
    val tokenKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
      */
    val tokenKeyId: js.UndefOr[Input[String]] = js.undefined
  }
  object ApnsSandboxChannelArgs {
    
    inline def apply(applicationId: Input[String]): ApnsSandboxChannelArgs = {
      val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApnsSandboxChannelArgs]
    }
    
    extension [Self <: ApnsSandboxChannelArgs](x: Self) {
      
      inline def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      inline def setBundleId(value: Input[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
      
      inline def setCertificate(value: Input[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
      
      inline def setDefaultAuthenticationMethod(value: Input[String]): Self = StObject.set(x, "defaultAuthenticationMethod", value.asInstanceOf[js.Any])
      
      inline def setDefaultAuthenticationMethodUndefined: Self = StObject.set(x, "defaultAuthenticationMethod", js.undefined)
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setPrivateKey(value: Input[String]): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      inline def setTeamId(value: Input[String]): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
      
      inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
      
      inline def setTokenKey(value: Input[String]): Self = StObject.set(x, "tokenKey", value.asInstanceOf[js.Any])
      
      inline def setTokenKeyId(value: Input[String]): Self = StObject.set(x, "tokenKeyId", value.asInstanceOf[js.Any])
      
      inline def setTokenKeyIdUndefined: Self = StObject.set(x, "tokenKeyId", js.undefined)
      
      inline def setTokenKeyUndefined: Self = StObject.set(x, "tokenKey", js.undefined)
    }
  }
  
  trait ApnsSandboxChannelState extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
      */
    val bundleId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The pem encoded TLS Certificate from Apple.
      */
    val certificate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The default authentication method used for APNs Sandbox.
      * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
      * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
      * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
      */
    val defaultAuthenticationMethod: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether the channel is enabled or disabled. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The Certificate Private Key file (ie. `.key` file).
      */
    val privateKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
      */
    val teamId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The `.p8` file that you download from your Apple developer account when you create an authentication key.
      */
    val tokenKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
      */
    val tokenKeyId: js.UndefOr[Input[String]] = js.undefined
  }
  object ApnsSandboxChannelState {
    
    inline def apply(): ApnsSandboxChannelState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApnsSandboxChannelState]
    }
    
    extension [Self <: ApnsSandboxChannelState](x: Self) {
      
      inline def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
      
      inline def setBundleId(value: Input[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
      
      inline def setCertificate(value: Input[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
      
      inline def setDefaultAuthenticationMethod(value: Input[String]): Self = StObject.set(x, "defaultAuthenticationMethod", value.asInstanceOf[js.Any])
      
      inline def setDefaultAuthenticationMethodUndefined: Self = StObject.set(x, "defaultAuthenticationMethod", js.undefined)
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setPrivateKey(value: Input[String]): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      inline def setTeamId(value: Input[String]): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
      
      inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
      
      inline def setTokenKey(value: Input[String]): Self = StObject.set(x, "tokenKey", value.asInstanceOf[js.Any])
      
      inline def setTokenKeyId(value: Input[String]): Self = StObject.set(x, "tokenKeyId", value.asInstanceOf[js.Any])
      
      inline def setTokenKeyIdUndefined: Self = StObject.set(x, "tokenKeyId", js.undefined)
      
      inline def setTokenKeyUndefined: Self = StObject.set(x, "tokenKey", js.undefined)
    }
  }
}
