package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCredentialsMod {
  
  @JSImport("@pulumi/aws/ecr/getCredentials", "getCredentials")
  @js.native
  def getCredentials(args: GetCredentialsArgs): js.Promise[GetCredentialsResult] = js.native
  @JSImport("@pulumi/aws/ecr/getCredentials", "getCredentials")
  @js.native
  def getCredentials(args: GetCredentialsArgs, opts: InvokeOptions): js.Promise[GetCredentialsResult] = js.native
  
  @js.native
  trait GetCredentialsArgs extends StObject {
    
    val registryId: String = js.native
  }
  object GetCredentialsArgs {
    
    @scala.inline
    def apply(registryId: String): GetCredentialsArgs = {
      val __obj = js.Dynamic.literal(registryId = registryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCredentialsArgs]
    }
    
    @scala.inline
    implicit class GetCredentialsArgsMutableBuilder[Self <: GetCredentialsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegistryId(value: String): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetCredentialsResult extends StObject {
    
    val authorizationToken: String = js.native
    
    val expiresAt: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val proxyEndpoint: String = js.native
    
    val registryId: String = js.native
  }
  object GetCredentialsResult {
    
    @scala.inline
    def apply(
      authorizationToken: String,
      expiresAt: String,
      id: String,
      proxyEndpoint: String,
      registryId: String
    ): GetCredentialsResult = {
      val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], proxyEndpoint = proxyEndpoint.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCredentialsResult]
    }
    
    @scala.inline
    implicit class GetCredentialsResultMutableBuilder[Self <: GetCredentialsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationToken(value: String): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresAt(value: String): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyEndpoint(value: String): Self = StObject.set(x, "proxyEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryId(value: String): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    }
  }
}
