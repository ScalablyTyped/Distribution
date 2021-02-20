package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2clientvpn {
  
  @js.native
  trait EndpointAuthenticationOption extends StObject {
    
    /**
      * The ID of the Active Directory to be used for authentication if type is `directory-service-authentication`.
      */
    var activeDirectoryId: js.UndefOr[String] = js.native
    
    /**
      * The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in AWS Certificate Manager (ACM). Only necessary when type is set to `certificate-authentication`.
      */
    var rootCertificateChainArn: js.UndefOr[String] = js.native
    
    /**
      * The ARN of the IAM SAML identity provider if type is `federated-authentication`.
      */
    var samlProviderArn: js.UndefOr[String] = js.native
    
    /**
      * The type of client authentication to be used. Specify `certificate-authentication` to use certificate-based authentication, `directory-service-authentication` to use Active Directory authentication, or `federated-authentication` to use Federated Authentication via SAML 2.0.
      */
    var `type`: String = js.native
  }
  object EndpointAuthenticationOption {
    
    @scala.inline
    def apply(`type`: String): EndpointAuthenticationOption = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointAuthenticationOption]
    }
    
    @scala.inline
    implicit class EndpointAuthenticationOptionMutableBuilder[Self <: EndpointAuthenticationOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveDirectoryId(value: String): Self = StObject.set(x, "activeDirectoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveDirectoryIdUndefined: Self = StObject.set(x, "activeDirectoryId", js.undefined)
      
      @scala.inline
      def setRootCertificateChainArn(value: String): Self = StObject.set(x, "rootCertificateChainArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootCertificateChainArnUndefined: Self = StObject.set(x, "rootCertificateChainArn", js.undefined)
      
      @scala.inline
      def setSamlProviderArn(value: String): Self = StObject.set(x, "samlProviderArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamlProviderArnUndefined: Self = StObject.set(x, "samlProviderArn", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EndpointConnectionLogOptions extends StObject {
    
    /**
      * The name of the CloudWatch Logs log group.
      */
    var cloudwatchLogGroup: js.UndefOr[String] = js.native
    
    /**
      * The name of the CloudWatch Logs log stream to which the connection data is published.
      */
    var cloudwatchLogStream: js.UndefOr[String] = js.native
    
    /**
      * Indicates whether connection logging is enabled.
      */
    var enabled: Boolean = js.native
  }
  object EndpointConnectionLogOptions {
    
    @scala.inline
    def apply(enabled: Boolean): EndpointConnectionLogOptions = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointConnectionLogOptions]
    }
    
    @scala.inline
    implicit class EndpointConnectionLogOptionsMutableBuilder[Self <: EndpointConnectionLogOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudwatchLogGroup(value: String): Self = StObject.set(x, "cloudwatchLogGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchLogGroupUndefined: Self = StObject.set(x, "cloudwatchLogGroup", js.undefined)
      
      @scala.inline
      def setCloudwatchLogStream(value: String): Self = StObject.set(x, "cloudwatchLogStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchLogStreamUndefined: Self = StObject.set(x, "cloudwatchLogStream", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
}
