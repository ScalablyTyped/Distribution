package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getServerMod {
  
  @JSImport("@pulumi/aws/transfer/getServer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getServer(args: GetServerArgs): js.Promise[GetServerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServer")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetServerResult]]
  inline def getServer(args: GetServerArgs, opts: InvokeOptions): js.Promise[GetServerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getServer")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServerResult]]
  
  trait GetServerArgs extends StObject {
    
    /**
      * ID for an SFTP server.
      */
    val serverId: String
  }
  object GetServerArgs {
    
    inline def apply(serverId: String): GetServerArgs = {
      val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServerArgs]
    }
    
    extension [Self <: GetServerArgs](x: Self) {
      
      inline def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetServerResult extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of Transfer Server
      */
    val arn: String
    
    /**
      * The endpoint of the Transfer Server (e.g. `s-12345678.server.transfer.REGION.amazonaws.com`)
      */
    val endpoint: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice.
      */
    val identityProviderType: String
    
    /**
      * Amazon Resource Name (ARN) of the IAM role used to authenticate the user account with an `identityProviderType` of `API_GATEWAY`.
      */
    val invocationRole: String
    
    /**
      * Amazon Resource Name (ARN) of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
      */
    val loggingRole: String
    
    val serverId: String
    
    /**
      * URL of the service endpoint used to authenticate users with an `identityProviderType` of `API_GATEWAY`.
      */
    val url: String
  }
  object GetServerResult {
    
    inline def apply(
      arn: String,
      endpoint: String,
      id: String,
      identityProviderType: String,
      invocationRole: String,
      loggingRole: String,
      serverId: String,
      url: String
    ): GetServerResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identityProviderType = identityProviderType.asInstanceOf[js.Any], invocationRole = invocationRole.asInstanceOf[js.Any], loggingRole = loggingRole.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServerResult]
    }
    
    extension [Self <: GetServerResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdentityProviderType(value: String): Self = StObject.set(x, "identityProviderType", value.asInstanceOf[js.Any])
      
      inline def setInvocationRole(value: String): Self = StObject.set(x, "invocationRole", value.asInstanceOf[js.Any])
      
      inline def setLoggingRole(value: String): Self = StObject.set(x, "loggingRole", value.asInstanceOf[js.Any])
      
      inline def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
