package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.apigateway.DomainNameEndpointConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apigatewayDomainNameMod {
  
  @JSImport("@pulumi/aws/apigateway/domainName", "DomainName")
  @js.native
  class DomainName protected () extends CustomResource {
    /**
      * Create a DomainName resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainNameArgs) = this()
    def this(name: String, args: DomainNameArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: Output_[String] = js.native
    
    /**
      * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when an edge-optimized domain name is desired. Conflicts with `certificateName`, `certificateBody`, `certificateChain`, `certificatePrivateKey`, `regionalCertificateArn`, and `regionalCertificateName`.
      */
    val certificateArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The certificate issued for the domain name
      * being registered, in PEM format. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and
      * `regionalCertificateName`.
      */
    val certificateBody: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The certificate for the CA that issued the
      * certificate, along with any intermediate CA certificates required to
      * create an unbroken chain to a certificate trusted by the intended API clients. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`,
      * `regionalCertificateArn`, and `regionalCertificateName`.
      */
    val certificateChain: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The unique name to use when registering this
      * certificate as an IAM server certificate. Conflicts with `certificateArn`, `regionalCertificateArn`, and
      * `regionalCertificateName`. Required if `certificateArn` is not set.
      */
    val certificateName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The private key associated with the
      * domain certificate given in `certificateBody`. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and `regionalCertificateName`.
      */
    val certificatePrivateKey: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The upload date associated with the domain certificate.
      */
    val certificateUploadDate: Output_[String] = js.native
    
    /**
      * The hostname created by Cloudfront to represent
      * the distribution that implements this domain name mapping.
      */
    val cloudfrontDomainName: Output_[String] = js.native
    
    /**
      * For convenience, the hosted zone ID (`Z2FDTNDATAQYW2`)
      * that can be used to create a Route53 alias record for the distribution.
      */
    val cloudfrontZoneId: Output_[String] = js.native
    
    /**
      * The fully-qualified domain name to register
      */
    val domainName: Output_[String] = js.native
    
    /**
      * Configuration block defining API endpoint information including type. Defined below.
      */
    val endpointConfiguration: Output_[DomainNameEndpointConfiguration] = js.native
    
    /**
      * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when a regional domain name is desired. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and `certificatePrivateKey`.
      */
    val regionalCertificateArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The user-friendly name of the certificate that will be used by regional endpoint for this domain name. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and
      * `certificatePrivateKey`.
      */
    val regionalCertificateName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The hostname for the custom domain's regional endpoint.
      */
    val regionalDomainName: Output_[String] = js.native
    
    /**
      * The hosted zone ID that can be used to create a Route53 alias record for the regional endpoint.
      */
    val regionalZoneId: Output_[String] = js.native
    
    /**
      * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are `TLS_1_0` and `TLS_1_2`. Must be configured to perform drift detection.
      */
    val securityPolicy: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object DomainName {
    
    /**
      * Get an existing DomainName resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigateway/domainName", "DomainName.get")
    @js.native
    def get(name: String, id: Input[ID]): DomainName = js.native
    @JSImport("@pulumi/aws/apigateway/domainName", "DomainName.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DomainName = js.native
    @JSImport("@pulumi/aws/apigateway/domainName", "DomainName.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainNameState): DomainName = js.native
    @JSImport("@pulumi/aws/apigateway/domainName", "DomainName.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainNameState, opts: CustomResourceOptions): DomainName = js.native
    
    /**
      * Returns true if the given object is an instance of DomainName.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigateway/domainName", "DomainName.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/domainName.DomainName */ Boolean = js.native
  }
  
  @js.native
  trait DomainNameArgs extends StObject {
    
    /**
      * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when an edge-optimized domain name is desired. Conflicts with `certificateName`, `certificateBody`, `certificateChain`, `certificatePrivateKey`, `regionalCertificateArn`, and `regionalCertificateName`.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The certificate issued for the domain name
      * being registered, in PEM format. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and
      * `regionalCertificateName`.
      */
    val certificateBody: js.UndefOr[Input[String]] = js.native
    
    /**
      * The certificate for the CA that issued the
      * certificate, along with any intermediate CA certificates required to
      * create an unbroken chain to a certificate trusted by the intended API clients. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`,
      * `regionalCertificateArn`, and `regionalCertificateName`.
      */
    val certificateChain: js.UndefOr[Input[String]] = js.native
    
    /**
      * The unique name to use when registering this
      * certificate as an IAM server certificate. Conflicts with `certificateArn`, `regionalCertificateArn`, and
      * `regionalCertificateName`. Required if `certificateArn` is not set.
      */
    val certificateName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The private key associated with the
      * domain certificate given in `certificateBody`. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and `regionalCertificateName`.
      */
    val certificatePrivateKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The fully-qualified domain name to register
      */
    val domainName: Input[String] = js.native
    
    /**
      * Configuration block defining API endpoint information including type. Defined below.
      */
    val endpointConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.apigateway.DomainNameEndpointConfiguration]] = js.native
    
    /**
      * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when a regional domain name is desired. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and `certificatePrivateKey`.
      */
    val regionalCertificateArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The user-friendly name of the certificate that will be used by regional endpoint for this domain name. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and
      * `certificatePrivateKey`.
      */
    val regionalCertificateName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are `TLS_1_0` and `TLS_1_2`. Must be configured to perform drift detection.
      */
    val securityPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object DomainNameArgs {
    
    @scala.inline
    def apply(domainName: Input[String]): DomainNameArgs = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainNameArgs]
    }
    
    @scala.inline
    implicit class DomainNameArgsMutableBuilder[Self <: DomainNameArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      @scala.inline
      def setCertificateBody(value: Input[String]): Self = StObject.set(x, "certificateBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateBodyUndefined: Self = StObject.set(x, "certificateBody", js.undefined)
      
      @scala.inline
      def setCertificateChain(value: Input[String]): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
      
      @scala.inline
      def setCertificateName(value: Input[String]): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
      
      @scala.inline
      def setCertificatePrivateKey(value: Input[String]): Self = StObject.set(x, "certificatePrivateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificatePrivateKeyUndefined: Self = StObject.set(x, "certificatePrivateKey", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointConfiguration(value: Input[typings.pulumiAws.inputMod.apigateway.DomainNameEndpointConfiguration]): Self = StObject.set(x, "endpointConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointConfigurationUndefined: Self = StObject.set(x, "endpointConfiguration", js.undefined)
      
      @scala.inline
      def setRegionalCertificateArn(value: Input[String]): Self = StObject.set(x, "regionalCertificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionalCertificateArnUndefined: Self = StObject.set(x, "regionalCertificateArn", js.undefined)
      
      @scala.inline
      def setRegionalCertificateName(value: Input[String]): Self = StObject.set(x, "regionalCertificateName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionalCertificateNameUndefined: Self = StObject.set(x, "regionalCertificateName", js.undefined)
      
      @scala.inline
      def setSecurityPolicy(value: Input[String]): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait DomainNameState extends StObject {
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when an edge-optimized domain name is desired. Conflicts with `certificateName`, `certificateBody`, `certificateChain`, `certificatePrivateKey`, `regionalCertificateArn`, and `regionalCertificateName`.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The certificate issued for the domain name
      * being registered, in PEM format. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and
      * `regionalCertificateName`.
      */
    val certificateBody: js.UndefOr[Input[String]] = js.native
    
    /**
      * The certificate for the CA that issued the
      * certificate, along with any intermediate CA certificates required to
      * create an unbroken chain to a certificate trusted by the intended API clients. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`,
      * `regionalCertificateArn`, and `regionalCertificateName`.
      */
    val certificateChain: js.UndefOr[Input[String]] = js.native
    
    /**
      * The unique name to use when registering this
      * certificate as an IAM server certificate. Conflicts with `certificateArn`, `regionalCertificateArn`, and
      * `regionalCertificateName`. Required if `certificateArn` is not set.
      */
    val certificateName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The private key associated with the
      * domain certificate given in `certificateBody`. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and `regionalCertificateName`.
      */
    val certificatePrivateKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The upload date associated with the domain certificate.
      */
    val certificateUploadDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The hostname created by Cloudfront to represent
      * the distribution that implements this domain name mapping.
      */
    val cloudfrontDomainName: js.UndefOr[Input[String]] = js.native
    
    /**
      * For convenience, the hosted zone ID (`Z2FDTNDATAQYW2`)
      * that can be used to create a Route53 alias record for the distribution.
      */
    val cloudfrontZoneId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The fully-qualified domain name to register
      */
    val domainName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block defining API endpoint information including type. Defined below.
      */
    val endpointConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.apigateway.DomainNameEndpointConfiguration]] = js.native
    
    /**
      * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when a regional domain name is desired. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and `certificatePrivateKey`.
      */
    val regionalCertificateArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The user-friendly name of the certificate that will be used by regional endpoint for this domain name. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and
      * `certificatePrivateKey`.
      */
    val regionalCertificateName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The hostname for the custom domain's regional endpoint.
      */
    val regionalDomainName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The hosted zone ID that can be used to create a Route53 alias record for the regional endpoint.
      */
    val regionalZoneId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are `TLS_1_0` and `TLS_1_2`. Must be configured to perform drift detection.
      */
    val securityPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object DomainNameState {
    
    @scala.inline
    def apply(): DomainNameState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainNameState]
    }
    
    @scala.inline
    implicit class DomainNameStateMutableBuilder[Self <: DomainNameState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      @scala.inline
      def setCertificateBody(value: Input[String]): Self = StObject.set(x, "certificateBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateBodyUndefined: Self = StObject.set(x, "certificateBody", js.undefined)
      
      @scala.inline
      def setCertificateChain(value: Input[String]): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
      
      @scala.inline
      def setCertificateName(value: Input[String]): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
      
      @scala.inline
      def setCertificatePrivateKey(value: Input[String]): Self = StObject.set(x, "certificatePrivateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificatePrivateKeyUndefined: Self = StObject.set(x, "certificatePrivateKey", js.undefined)
      
      @scala.inline
      def setCertificateUploadDate(value: Input[String]): Self = StObject.set(x, "certificateUploadDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateUploadDateUndefined: Self = StObject.set(x, "certificateUploadDate", js.undefined)
      
      @scala.inline
      def setCloudfrontDomainName(value: Input[String]): Self = StObject.set(x, "cloudfrontDomainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudfrontDomainNameUndefined: Self = StObject.set(x, "cloudfrontDomainName", js.undefined)
      
      @scala.inline
      def setCloudfrontZoneId(value: Input[String]): Self = StObject.set(x, "cloudfrontZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudfrontZoneIdUndefined: Self = StObject.set(x, "cloudfrontZoneId", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setEndpointConfiguration(value: Input[typings.pulumiAws.inputMod.apigateway.DomainNameEndpointConfiguration]): Self = StObject.set(x, "endpointConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointConfigurationUndefined: Self = StObject.set(x, "endpointConfiguration", js.undefined)
      
      @scala.inline
      def setRegionalCertificateArn(value: Input[String]): Self = StObject.set(x, "regionalCertificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionalCertificateArnUndefined: Self = StObject.set(x, "regionalCertificateArn", js.undefined)
      
      @scala.inline
      def setRegionalCertificateName(value: Input[String]): Self = StObject.set(x, "regionalCertificateName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionalCertificateNameUndefined: Self = StObject.set(x, "regionalCertificateName", js.undefined)
      
      @scala.inline
      def setRegionalDomainName(value: Input[String]): Self = StObject.set(x, "regionalDomainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionalDomainNameUndefined: Self = StObject.set(x, "regionalDomainName", js.undefined)
      
      @scala.inline
      def setRegionalZoneId(value: Input[String]): Self = StObject.set(x, "regionalZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionalZoneIdUndefined: Self = StObject.set(x, "regionalZoneId", js.undefined)
      
      @scala.inline
      def setSecurityPolicy(value: Input[String]): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
