package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecrGetAuthorizationTokenMod {
  
  @JSImport("@pulumi/aws/ecr/getAuthorizationToken", "getAuthorizationToken")
  @js.native
  def getAuthorizationToken(): js.Promise[GetAuthorizationTokenResult] = js.native
  @JSImport("@pulumi/aws/ecr/getAuthorizationToken", "getAuthorizationToken")
  @js.native
  def getAuthorizationToken(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetAuthorizationTokenResult] = js.native
  @JSImport("@pulumi/aws/ecr/getAuthorizationToken", "getAuthorizationToken")
  @js.native
  def getAuthorizationToken(args: GetAuthorizationTokenArgs): js.Promise[GetAuthorizationTokenResult] = js.native
  @JSImport("@pulumi/aws/ecr/getAuthorizationToken", "getAuthorizationToken")
  @js.native
  def getAuthorizationToken(args: GetAuthorizationTokenArgs, opts: InvokeOptions): js.Promise[GetAuthorizationTokenResult] = js.native
  
  @js.native
  trait GetAuthorizationTokenArgs extends StObject {
    
    /**
      * AWS account ID of the ECR Repository. If not specified the default account is assumed.
      */
    val registryId: js.UndefOr[String] = js.native
  }
  object GetAuthorizationTokenArgs {
    
    @scala.inline
    def apply(): GetAuthorizationTokenArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAuthorizationTokenArgs]
    }
    
    @scala.inline
    implicit class GetAuthorizationTokenArgsMutableBuilder[Self <: GetAuthorizationTokenArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegistryId(value: String): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    }
  }
  
  @js.native
  trait GetAuthorizationTokenResult extends StObject {
    
    /**
      * Temporary IAM authentication credentials to access the ECR repository encoded in base64 in the form of `user_name:password`.
      */
    val authorizationToken: String = js.native
    
    /**
      * The time in UTC RFC3339 format when the authorization token expires.
      */
    val expiresAt: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Password decoded from the authorization token.
      */
    val password: String = js.native
    
    /**
      * The registry URL to use in the docker login command.
      */
    val proxyEndpoint: String = js.native
    
    val registryId: js.UndefOr[String] = js.native
    
    /**
      * User name decoded from the authorization token.
      */
    val userName: String = js.native
  }
  object GetAuthorizationTokenResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetAuthorizationTokenResultMutableBuilder[Self <: GetAuthorizationTokenResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationToken(value: String): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresAt(value: String): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyEndpoint(value: String): Self = StObject.set(x, "proxyEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryId(value: String): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    }
  }
}
