package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getServerMod {
  
  @JSImport("@pulumi/aws/transfer/getServer", "getServer")
  @js.native
  def getServer(args: GetServerArgs): js.Promise[GetServerResult] = js.native
  @JSImport("@pulumi/aws/transfer/getServer", "getServer")
  @js.native
  def getServer(args: GetServerArgs, opts: InvokeOptions): js.Promise[GetServerResult] = js.native
  
  @js.native
  trait GetServerArgs extends StObject {
    
    /**
      * ID for an SFTP server.
      */
    val serverId: String = js.native
  }
  object GetServerArgs {
    
    @scala.inline
    def apply(serverId: String): GetServerArgs = {
      val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServerArgs]
    }
    
    @scala.inline
    implicit class GetServerArgsMutableBuilder[Self <: GetServerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetServerResult extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of Transfer Server
      */
    val arn: String = js.native
    
    /**
      * The endpoint of the Transfer Server (e.g. `s-12345678.server.transfer.REGION.amazonaws.com`)
      */
    val endpoint: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice.
      */
    val identityProviderType: String = js.native
    
    /**
      * Amazon Resource Name (ARN) of the IAM role used to authenticate the user account with an `identityProviderType` of `API_GATEWAY`.
      */
    val invocationRole: String = js.native
    
    /**
      * Amazon Resource Name (ARN) of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
      */
    val loggingRole: String = js.native
    
    val serverId: String = js.native
    
    /**
      * URL of the service endpoint used to authenticate users with an `identityProviderType` of `API_GATEWAY`.
      */
    val url: String = js.native
  }
  object GetServerResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetServerResultMutableBuilder[Self <: GetServerResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityProviderType(value: String): Self = StObject.set(x, "identityProviderType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvocationRole(value: String): Self = StObject.set(x, "invocationRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingRole(value: String): Self = StObject.set(x, "loggingRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
