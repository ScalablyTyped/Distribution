package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2clientvpn {
  
  trait EndpointAuthenticationOption extends StObject {
    
    /**
      * The ID of the Active Directory to be used for authentication if type is `directory-service-authentication`.
      */
    var activeDirectoryId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in AWS Certificate Manager (ACM). Only necessary when type is set to `certificate-authentication`.
      */
    var rootCertificateChainArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the IAM SAML identity provider if type is `federated-authentication`.
      */
    var samlProviderArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of client authentication to be used. Specify `certificate-authentication` to use certificate-based authentication, `directory-service-authentication` to use Active Directory authentication, or `federated-authentication` to use Federated Authentication via SAML 2.0.
      */
    var `type`: Input[String]
  }
  object EndpointAuthenticationOption {
    
    @scala.inline
    def apply(`type`: Input[String]): EndpointAuthenticationOption = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointAuthenticationOption]
    }
    
    @scala.inline
    implicit class EndpointAuthenticationOptionMutableBuilder[Self <: EndpointAuthenticationOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveDirectoryId(value: Input[String]): Self = StObject.set(x, "activeDirectoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveDirectoryIdUndefined: Self = StObject.set(x, "activeDirectoryId", js.undefined)
      
      @scala.inline
      def setRootCertificateChainArn(value: Input[String]): Self = StObject.set(x, "rootCertificateChainArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootCertificateChainArnUndefined: Self = StObject.set(x, "rootCertificateChainArn", js.undefined)
      
      @scala.inline
      def setSamlProviderArn(value: Input[String]): Self = StObject.set(x, "samlProviderArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamlProviderArnUndefined: Self = StObject.set(x, "samlProviderArn", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndpointConnectionLogOptions extends StObject {
    
    /**
      * The name of the CloudWatch Logs log group.
      */
    var cloudwatchLogGroup: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the CloudWatch Logs log stream to which the connection data is published.
      */
    var cloudwatchLogStream: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether connection logging is enabled.
      */
    var enabled: Input[Boolean]
  }
  object EndpointConnectionLogOptions {
    
    @scala.inline
    def apply(enabled: Input[Boolean]): EndpointConnectionLogOptions = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointConnectionLogOptions]
    }
    
    @scala.inline
    implicit class EndpointConnectionLogOptionsMutableBuilder[Self <: EndpointConnectionLogOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudwatchLogGroup(value: Input[String]): Self = StObject.set(x, "cloudwatchLogGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchLogGroupUndefined: Self = StObject.set(x, "cloudwatchLogGroup", js.undefined)
      
      @scala.inline
      def setCloudwatchLogStream(value: Input[String]): Self = StObject.set(x, "cloudwatchLogStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchLogStreamUndefined: Self = StObject.set(x, "cloudwatchLogStream", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
}
