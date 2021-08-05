package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecrGetAuthorizationTokenMod {
  
  @JSImport("@pulumi/aws/ecr/getAuthorizationToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAuthorizationToken(): js.Promise[GetAuthorizationTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizationToken")().asInstanceOf[js.Promise[GetAuthorizationTokenResult]]
  inline def getAuthorizationToken(args: Unit, opts: InvokeOptions): js.Promise[GetAuthorizationTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizationToken")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAuthorizationTokenResult]]
  inline def getAuthorizationToken(args: GetAuthorizationTokenArgs): js.Promise[GetAuthorizationTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizationToken")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAuthorizationTokenResult]]
  inline def getAuthorizationToken(args: GetAuthorizationTokenArgs, opts: InvokeOptions): js.Promise[GetAuthorizationTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAuthorizationToken")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAuthorizationTokenResult]]
  
  trait GetAuthorizationTokenArgs extends StObject {
    
    /**
      * AWS account ID of the ECR Repository. If not specified the default account is assumed.
      */
    val registryId: js.UndefOr[String] = js.undefined
  }
  object GetAuthorizationTokenArgs {
    
    inline def apply(): GetAuthorizationTokenArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAuthorizationTokenArgs]
    }
    
    extension [Self <: GetAuthorizationTokenArgs](x: Self) {
      
      inline def setRegistryId(value: String): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
      
      inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    }
  }
  
  trait GetAuthorizationTokenResult extends StObject {
    
    /**
      * Temporary IAM authentication credentials to access the ECR repository encoded in base64 in the form of `user_name:password`.
      */
    val authorizationToken: String
    
    /**
      * The time in UTC RFC3339 format when the authorization token expires.
      */
    val expiresAt: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Password decoded from the authorization token.
      */
    val password: String
    
    /**
      * The registry URL to use in the docker login command.
      */
    val proxyEndpoint: String
    
    val registryId: js.UndefOr[String] = js.undefined
    
    /**
      * User name decoded from the authorization token.
      */
    val userName: String
  }
  object GetAuthorizationTokenResult {
    
    inline def apply(
      authorizationToken: String,
      expiresAt: String,
      id: String,
      password: String,
      proxyEndpoint: String,
      userName: String
    ): GetAuthorizationTokenResult = {
      val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], proxyEndpoint = proxyEndpoint.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAuthorizationTokenResult]
    }
    
    extension [Self <: GetAuthorizationTokenResult](x: Self) {
      
      inline def setAuthorizationToken(value: String): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
      
      inline def setExpiresAt(value: String): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setProxyEndpoint(value: String): Self = StObject.set(x, "proxyEndpoint", value.asInstanceOf[js.Any])
      
      inline def setRegistryId(value: String): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
      
      inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
      
      inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    }
  }
}
