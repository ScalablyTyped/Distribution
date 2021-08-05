package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCredentialsMod {
  
  @JSImport("@pulumi/aws/ecr/getCredentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCredentials(args: GetCredentialsArgs): js.Promise[GetCredentialsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCredentials")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetCredentialsResult]]
  inline def getCredentials(args: GetCredentialsArgs, opts: InvokeOptions): js.Promise[GetCredentialsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCredentials")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCredentialsResult]]
  
  trait GetCredentialsArgs extends StObject {
    
    val registryId: String
  }
  object GetCredentialsArgs {
    
    inline def apply(registryId: String): GetCredentialsArgs = {
      val __obj = js.Dynamic.literal(registryId = registryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCredentialsArgs]
    }
    
    extension [Self <: GetCredentialsArgs](x: Self) {
      
      inline def setRegistryId(value: String): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetCredentialsResult extends StObject {
    
    val authorizationToken: String
    
    val expiresAt: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val proxyEndpoint: String
    
    val registryId: String
  }
  object GetCredentialsResult {
    
    inline def apply(
      authorizationToken: String,
      expiresAt: String,
      id: String,
      proxyEndpoint: String,
      registryId: String
    ): GetCredentialsResult = {
      val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], proxyEndpoint = proxyEndpoint.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCredentialsResult]
    }
    
    extension [Self <: GetCredentialsResult](x: Self) {
      
      inline def setAuthorizationToken(value: String): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
      
      inline def setExpiresAt(value: String): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setProxyEndpoint(value: String): Self = StObject.set(x, "proxyEndpoint", value.asInstanceOf[js.Any])
      
      inline def setRegistryId(value: String): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    }
  }
}
