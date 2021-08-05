package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2clientvpn {
  
  trait EndpointAuthenticationOption extends StObject {
    
    /**
      * The ID of the Active Directory to be used for authentication if type is `directory-service-authentication`.
      */
    var activeDirectoryId: js.UndefOr[String] = js.undefined
    
    /**
      * The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in AWS Certificate Manager (ACM). Only necessary when type is set to `certificate-authentication`.
      */
    var rootCertificateChainArn: js.UndefOr[String] = js.undefined
    
    /**
      * The ARN of the IAM SAML identity provider if type is `federated-authentication`.
      */
    var samlProviderArn: js.UndefOr[String] = js.undefined
    
    /**
      * The type of client authentication to be used. Specify `certificate-authentication` to use certificate-based authentication, `directory-service-authentication` to use Active Directory authentication, or `federated-authentication` to use Federated Authentication via SAML 2.0.
      */
    var `type`: String
  }
  object EndpointAuthenticationOption {
    
    inline def apply(`type`: String): EndpointAuthenticationOption = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointAuthenticationOption]
    }
    
    extension [Self <: EndpointAuthenticationOption](x: Self) {
      
      inline def setActiveDirectoryId(value: String): Self = StObject.set(x, "activeDirectoryId", value.asInstanceOf[js.Any])
      
      inline def setActiveDirectoryIdUndefined: Self = StObject.set(x, "activeDirectoryId", js.undefined)
      
      inline def setRootCertificateChainArn(value: String): Self = StObject.set(x, "rootCertificateChainArn", value.asInstanceOf[js.Any])
      
      inline def setRootCertificateChainArnUndefined: Self = StObject.set(x, "rootCertificateChainArn", js.undefined)
      
      inline def setSamlProviderArn(value: String): Self = StObject.set(x, "samlProviderArn", value.asInstanceOf[js.Any])
      
      inline def setSamlProviderArnUndefined: Self = StObject.set(x, "samlProviderArn", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndpointConnectionLogOptions extends StObject {
    
    /**
      * The name of the CloudWatch Logs log group.
      */
    var cloudwatchLogGroup: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the CloudWatch Logs log stream to which the connection data is published.
      */
    var cloudwatchLogStream: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates whether connection logging is enabled.
      */
    var enabled: Boolean
  }
  object EndpointConnectionLogOptions {
    
    inline def apply(enabled: Boolean): EndpointConnectionLogOptions = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointConnectionLogOptions]
    }
    
    extension [Self <: EndpointConnectionLogOptions](x: Self) {
      
      inline def setCloudwatchLogGroup(value: String): Self = StObject.set(x, "cloudwatchLogGroup", value.asInstanceOf[js.Any])
      
      inline def setCloudwatchLogGroupUndefined: Self = StObject.set(x, "cloudwatchLogGroup", js.undefined)
      
      inline def setCloudwatchLogStream(value: String): Self = StObject.set(x, "cloudwatchLogStream", value.asInstanceOf[js.Any])
      
      inline def setCloudwatchLogStreamUndefined: Self = StObject.set(x, "cloudwatchLogStream", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
}
