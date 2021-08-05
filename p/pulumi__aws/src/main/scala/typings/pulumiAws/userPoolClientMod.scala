package typings.pulumiAws

import typings.pulumiAws.outputMod.cognito.UserPoolClientAnalyticsConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userPoolClientMod {
  
  @JSImport("@pulumi/aws/cognito/userPoolClient", "UserPoolClient")
  @js.native
  class UserPoolClient protected () extends CustomResource {
    /**
      * Create a UserPoolClient resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserPoolClientArgs) = this()
    def this(name: String, args: UserPoolClientArgs, opts: CustomResourceOptions) = this()
    
    /**
      * List of allowed OAuth flows (code, implicit, client_credentials).
      */
    val allowedOauthFlows: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
      */
    val allowedOauthFlowsUserPoolClient: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
      */
    val allowedOauthScopes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
      */
    val analyticsConfiguration: Output_[js.UndefOr[UserPoolClientAnalyticsConfiguration]] = js.native
    
    /**
      * List of allowed callback URLs for the identity providers.
      */
    val callbackUrls: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The client secret of the user pool client.
      */
    val clientSecret: Output_[String] = js.native
    
    /**
      * The default redirect URI. Must be in the list of callback URLs.
      */
    val defaultRedirectUri: Output_[js.UndefOr[String]] = js.native
    
    /**
      * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY,  USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
      */
    val explicitAuthFlows: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Should an application secret be generated.
      */
    val generateSecret: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * List of allowed logout URLs for the identity providers.
      */
    val logoutUrls: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The name of the application client.
      */
    val name: Output_[String] = js.native
    
    /**
      * Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
      */
    val preventUserExistenceErrors: Output_[String] = js.native
    
    /**
      * List of user pool attributes the application client can read from.
      */
    val readAttributes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The time limit in days refresh tokens are valid for.
      */
    val refreshTokenValidity: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * List of provider names for the identity providers that are supported on this client.
      */
    val supportedIdentityProviders: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The user pool the client belongs to.
      */
    val userPoolId: Output_[String] = js.native
    
    /**
      * List of user pool attributes the application client can write to.
      */
    val writeAttributes: Output_[js.UndefOr[js.Array[String]]] = js.native
  }
  /* static members */
  object UserPoolClient {
    
    @JSImport("@pulumi/aws/cognito/userPoolClient", "UserPoolClient")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing UserPoolClient resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): UserPoolClient = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[UserPoolClient]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): UserPoolClient = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UserPoolClient]
    inline def get(name: String, id: Input[ID], state: UserPoolClientState): UserPoolClient = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[UserPoolClient]
    inline def get(name: String, id: Input[ID], state: UserPoolClientState, opts: CustomResourceOptions): UserPoolClient = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UserPoolClient]
    
    /**
      * Returns true if the given object is an instance of UserPoolClient.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolClient.UserPoolClient */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cognito/userPoolClient.UserPoolClient */ Boolean]
  }
  
  trait UserPoolClientArgs extends StObject {
    
    /**
      * List of allowed OAuth flows (code, implicit, client_credentials).
      */
    val allowedOauthFlows: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
      */
    val allowedOauthFlowsUserPoolClient: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
      */
    val allowedOauthScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
      */
    val analyticsConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolClientAnalyticsConfiguration]] = js.undefined
    
    /**
      * List of allowed callback URLs for the identity providers.
      */
    val callbackUrls: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The default redirect URI. Must be in the list of callback URLs.
      */
    val defaultRedirectUri: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY,  USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
      */
    val explicitAuthFlows: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Should an application secret be generated.
      */
    val generateSecret: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * List of allowed logout URLs for the identity providers.
      */
    val logoutUrls: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of the application client.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
      */
    val preventUserExistenceErrors: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of user pool attributes the application client can read from.
      */
    val readAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The time limit in days refresh tokens are valid for.
      */
    val refreshTokenValidity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * List of provider names for the identity providers that are supported on this client.
      */
    val supportedIdentityProviders: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The user pool the client belongs to.
      */
    val userPoolId: Input[String]
    
    /**
      * List of user pool attributes the application client can write to.
      */
    val writeAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object UserPoolClientArgs {
    
    inline def apply(userPoolId: Input[String]): UserPoolClientArgs = {
      val __obj = js.Dynamic.literal(userPoolId = userPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserPoolClientArgs]
    }
    
    extension [Self <: UserPoolClientArgs](x: Self) {
      
      inline def setAllowedOauthFlows(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedOauthFlows", value.asInstanceOf[js.Any])
      
      inline def setAllowedOauthFlowsUndefined: Self = StObject.set(x, "allowedOauthFlows", js.undefined)
      
      inline def setAllowedOauthFlowsUserPoolClient(value: Input[Boolean]): Self = StObject.set(x, "allowedOauthFlowsUserPoolClient", value.asInstanceOf[js.Any])
      
      inline def setAllowedOauthFlowsUserPoolClientUndefined: Self = StObject.set(x, "allowedOauthFlowsUserPoolClient", js.undefined)
      
      inline def setAllowedOauthFlowsVarargs(value: Input[String]*): Self = StObject.set(x, "allowedOauthFlows", js.Array(value :_*))
      
      inline def setAllowedOauthScopes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedOauthScopes", value.asInstanceOf[js.Any])
      
      inline def setAllowedOauthScopesUndefined: Self = StObject.set(x, "allowedOauthScopes", js.undefined)
      
      inline def setAllowedOauthScopesVarargs(value: Input[String]*): Self = StObject.set(x, "allowedOauthScopes", js.Array(value :_*))
      
      inline def setAnalyticsConfiguration(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolClientAnalyticsConfiguration]): Self = StObject.set(x, "analyticsConfiguration", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsConfigurationUndefined: Self = StObject.set(x, "analyticsConfiguration", js.undefined)
      
      inline def setCallbackUrls(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "callbackUrls", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlsUndefined: Self = StObject.set(x, "callbackUrls", js.undefined)
      
      inline def setCallbackUrlsVarargs(value: Input[String]*): Self = StObject.set(x, "callbackUrls", js.Array(value :_*))
      
      inline def setDefaultRedirectUri(value: Input[String]): Self = StObject.set(x, "defaultRedirectUri", value.asInstanceOf[js.Any])
      
      inline def setDefaultRedirectUriUndefined: Self = StObject.set(x, "defaultRedirectUri", js.undefined)
      
      inline def setExplicitAuthFlows(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "explicitAuthFlows", value.asInstanceOf[js.Any])
      
      inline def setExplicitAuthFlowsUndefined: Self = StObject.set(x, "explicitAuthFlows", js.undefined)
      
      inline def setExplicitAuthFlowsVarargs(value: Input[String]*): Self = StObject.set(x, "explicitAuthFlows", js.Array(value :_*))
      
      inline def setGenerateSecret(value: Input[Boolean]): Self = StObject.set(x, "generateSecret", value.asInstanceOf[js.Any])
      
      inline def setGenerateSecretUndefined: Self = StObject.set(x, "generateSecret", js.undefined)
      
      inline def setLogoutUrls(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "logoutUrls", value.asInstanceOf[js.Any])
      
      inline def setLogoutUrlsUndefined: Self = StObject.set(x, "logoutUrls", js.undefined)
      
      inline def setLogoutUrlsVarargs(value: Input[String]*): Self = StObject.set(x, "logoutUrls", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPreventUserExistenceErrors(value: Input[String]): Self = StObject.set(x, "preventUserExistenceErrors", value.asInstanceOf[js.Any])
      
      inline def setPreventUserExistenceErrorsUndefined: Self = StObject.set(x, "preventUserExistenceErrors", js.undefined)
      
      inline def setReadAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "readAttributes", value.asInstanceOf[js.Any])
      
      inline def setReadAttributesUndefined: Self = StObject.set(x, "readAttributes", js.undefined)
      
      inline def setReadAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "readAttributes", js.Array(value :_*))
      
      inline def setRefreshTokenValidity(value: Input[Double]): Self = StObject.set(x, "refreshTokenValidity", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenValidityUndefined: Self = StObject.set(x, "refreshTokenValidity", js.undefined)
      
      inline def setSupportedIdentityProviders(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "supportedIdentityProviders", value.asInstanceOf[js.Any])
      
      inline def setSupportedIdentityProvidersUndefined: Self = StObject.set(x, "supportedIdentityProviders", js.undefined)
      
      inline def setSupportedIdentityProvidersVarargs(value: Input[String]*): Self = StObject.set(x, "supportedIdentityProviders", js.Array(value :_*))
      
      inline def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
      
      inline def setWriteAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "writeAttributes", value.asInstanceOf[js.Any])
      
      inline def setWriteAttributesUndefined: Self = StObject.set(x, "writeAttributes", js.undefined)
      
      inline def setWriteAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "writeAttributes", js.Array(value :_*))
    }
  }
  
  trait UserPoolClientState extends StObject {
    
    /**
      * List of allowed OAuth flows (code, implicit, client_credentials).
      */
    val allowedOauthFlows: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
      */
    val allowedOauthFlowsUserPoolClient: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
      */
    val allowedOauthScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
      */
    val analyticsConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.cognito.UserPoolClientAnalyticsConfiguration]] = js.undefined
    
    /**
      * List of allowed callback URLs for the identity providers.
      */
    val callbackUrls: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The client secret of the user pool client.
      */
    val clientSecret: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The default redirect URI. Must be in the list of callback URLs.
      */
    val defaultRedirectUri: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY,  USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
      */
    val explicitAuthFlows: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Should an application secret be generated.
      */
    val generateSecret: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * List of allowed logout URLs for the identity providers.
      */
    val logoutUrls: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of the application client.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
      */
    val preventUserExistenceErrors: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of user pool attributes the application client can read from.
      */
    val readAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The time limit in days refresh tokens are valid for.
      */
    val refreshTokenValidity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * List of provider names for the identity providers that are supported on this client.
      */
    val supportedIdentityProviders: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The user pool the client belongs to.
      */
    val userPoolId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of user pool attributes the application client can write to.
      */
    val writeAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object UserPoolClientState {
    
    inline def apply(): UserPoolClientState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserPoolClientState]
    }
    
    extension [Self <: UserPoolClientState](x: Self) {
      
      inline def setAllowedOauthFlows(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedOauthFlows", value.asInstanceOf[js.Any])
      
      inline def setAllowedOauthFlowsUndefined: Self = StObject.set(x, "allowedOauthFlows", js.undefined)
      
      inline def setAllowedOauthFlowsUserPoolClient(value: Input[Boolean]): Self = StObject.set(x, "allowedOauthFlowsUserPoolClient", value.asInstanceOf[js.Any])
      
      inline def setAllowedOauthFlowsUserPoolClientUndefined: Self = StObject.set(x, "allowedOauthFlowsUserPoolClient", js.undefined)
      
      inline def setAllowedOauthFlowsVarargs(value: Input[String]*): Self = StObject.set(x, "allowedOauthFlows", js.Array(value :_*))
      
      inline def setAllowedOauthScopes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedOauthScopes", value.asInstanceOf[js.Any])
      
      inline def setAllowedOauthScopesUndefined: Self = StObject.set(x, "allowedOauthScopes", js.undefined)
      
      inline def setAllowedOauthScopesVarargs(value: Input[String]*): Self = StObject.set(x, "allowedOauthScopes", js.Array(value :_*))
      
      inline def setAnalyticsConfiguration(value: Input[typings.pulumiAws.inputMod.cognito.UserPoolClientAnalyticsConfiguration]): Self = StObject.set(x, "analyticsConfiguration", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsConfigurationUndefined: Self = StObject.set(x, "analyticsConfiguration", js.undefined)
      
      inline def setCallbackUrls(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "callbackUrls", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlsUndefined: Self = StObject.set(x, "callbackUrls", js.undefined)
      
      inline def setCallbackUrlsVarargs(value: Input[String]*): Self = StObject.set(x, "callbackUrls", js.Array(value :_*))
      
      inline def setClientSecret(value: Input[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setDefaultRedirectUri(value: Input[String]): Self = StObject.set(x, "defaultRedirectUri", value.asInstanceOf[js.Any])
      
      inline def setDefaultRedirectUriUndefined: Self = StObject.set(x, "defaultRedirectUri", js.undefined)
      
      inline def setExplicitAuthFlows(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "explicitAuthFlows", value.asInstanceOf[js.Any])
      
      inline def setExplicitAuthFlowsUndefined: Self = StObject.set(x, "explicitAuthFlows", js.undefined)
      
      inline def setExplicitAuthFlowsVarargs(value: Input[String]*): Self = StObject.set(x, "explicitAuthFlows", js.Array(value :_*))
      
      inline def setGenerateSecret(value: Input[Boolean]): Self = StObject.set(x, "generateSecret", value.asInstanceOf[js.Any])
      
      inline def setGenerateSecretUndefined: Self = StObject.set(x, "generateSecret", js.undefined)
      
      inline def setLogoutUrls(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "logoutUrls", value.asInstanceOf[js.Any])
      
      inline def setLogoutUrlsUndefined: Self = StObject.set(x, "logoutUrls", js.undefined)
      
      inline def setLogoutUrlsVarargs(value: Input[String]*): Self = StObject.set(x, "logoutUrls", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPreventUserExistenceErrors(value: Input[String]): Self = StObject.set(x, "preventUserExistenceErrors", value.asInstanceOf[js.Any])
      
      inline def setPreventUserExistenceErrorsUndefined: Self = StObject.set(x, "preventUserExistenceErrors", js.undefined)
      
      inline def setReadAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "readAttributes", value.asInstanceOf[js.Any])
      
      inline def setReadAttributesUndefined: Self = StObject.set(x, "readAttributes", js.undefined)
      
      inline def setReadAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "readAttributes", js.Array(value :_*))
      
      inline def setRefreshTokenValidity(value: Input[Double]): Self = StObject.set(x, "refreshTokenValidity", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenValidityUndefined: Self = StObject.set(x, "refreshTokenValidity", js.undefined)
      
      inline def setSupportedIdentityProviders(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "supportedIdentityProviders", value.asInstanceOf[js.Any])
      
      inline def setSupportedIdentityProvidersUndefined: Self = StObject.set(x, "supportedIdentityProviders", js.undefined)
      
      inline def setSupportedIdentityProvidersVarargs(value: Input[String]*): Self = StObject.set(x, "supportedIdentityProviders", js.Array(value :_*))
      
      inline def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
      
      inline def setUserPoolIdUndefined: Self = StObject.set(x, "userPoolId", js.undefined)
      
      inline def setWriteAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "writeAttributes", value.asInstanceOf[js.Any])
      
      inline def setWriteAttributesUndefined: Self = StObject.set(x, "writeAttributes", js.undefined)
      
      inline def setWriteAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "writeAttributes", js.Array(value :_*))
    }
  }
}
