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
    
    @JSImport("@pulumi/aws/apigateway/domainName", "DomainName")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DomainName resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): DomainName = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DomainName]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DomainName = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DomainName]
    inline def get(name: String, id: Input[ID], state: DomainNameState): DomainName = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DomainName]
    inline def get(name: String, id: Input[ID], state: DomainNameState, opts: CustomResourceOptions): DomainName = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DomainName]
    
    /**
      * Returns true if the given object is an instance of DomainName.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/domainName.DomainName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/domainName.DomainName */ Boolean]
  }
  
  trait DomainNameArgs extends StObject {
    
    /**
      * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when an edge-optimized domain name is desired. Conflicts with `certificateName`, `certificateBody`, `certificateChain`, `certificatePrivateKey`, `regionalCertificateArn`, and `regionalCertificateName`.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The certificate issued for the domain name
      * being registered, in PEM format. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and
      * `regionalCertificateName`.
      */
    val certificateBody: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The certificate for the CA that issued the
      * certificate, along with any intermediate CA certificates required to
      * create an unbroken chain to a certificate trusted by the intended API clients. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`,
      * `regionalCertificateArn`, and `regionalCertificateName`.
      */
    val certificateChain: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The unique name to use when registering this
      * certificate as an IAM server certificate. Conflicts with `certificateArn`, `regionalCertificateArn`, and
      * `regionalCertificateName`. Required if `certificateArn` is not set.
      */
    val certificateName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The private key associated with the
      * domain certificate given in `certificateBody`. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and `regionalCertificateName`.
      */
    val certificatePrivateKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The fully-qualified domain name to register
      */
    val domainName: Input[String]
    
    /**
      * Configuration block defining API endpoint information including type. Defined below.
      */
    val endpointConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.apigateway.DomainNameEndpointConfiguration]] = js.undefined
    
    /**
      * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when a regional domain name is desired. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and `certificatePrivateKey`.
      */
    val regionalCertificateArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The user-friendly name of the certificate that will be used by regional endpoint for this domain name. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and
      * `certificatePrivateKey`.
      */
    val regionalCertificateName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are `TLS_1_0` and `TLS_1_2`. Must be configured to perform drift detection.
      */
    val securityPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DomainNameArgs {
    
    inline def apply(domainName: Input[String]): DomainNameArgs = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainNameArgs]
    }
    
    extension [Self <: DomainNameArgs](x: Self) {
      
      inline def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      inline def setCertificateBody(value: Input[String]): Self = StObject.set(x, "certificateBody", value.asInstanceOf[js.Any])
      
      inline def setCertificateBodyUndefined: Self = StObject.set(x, "certificateBody", js.undefined)
      
      inline def setCertificateChain(value: Input[String]): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
      
      inline def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
      
      inline def setCertificateName(value: Input[String]): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
      
      inline def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
      
      inline def setCertificatePrivateKey(value: Input[String]): Self = StObject.set(x, "certificatePrivateKey", value.asInstanceOf[js.Any])
      
      inline def setCertificatePrivateKeyUndefined: Self = StObject.set(x, "certificatePrivateKey", js.undefined)
      
      inline def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setEndpointConfiguration(value: Input[typings.pulumiAws.inputMod.apigateway.DomainNameEndpointConfiguration]): Self = StObject.set(x, "endpointConfiguration", value.asInstanceOf[js.Any])
      
      inline def setEndpointConfigurationUndefined: Self = StObject.set(x, "endpointConfiguration", js.undefined)
      
      inline def setRegionalCertificateArn(value: Input[String]): Self = StObject.set(x, "regionalCertificateArn", value.asInstanceOf[js.Any])
      
      inline def setRegionalCertificateArnUndefined: Self = StObject.set(x, "regionalCertificateArn", js.undefined)
      
      inline def setRegionalCertificateName(value: Input[String]): Self = StObject.set(x, "regionalCertificateName", value.asInstanceOf[js.Any])
      
      inline def setRegionalCertificateNameUndefined: Self = StObject.set(x, "regionalCertificateName", js.undefined)
      
      inline def setSecurityPolicy(value: Input[String]): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
      
      inline def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait DomainNameState extends StObject {
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when an edge-optimized domain name is desired. Conflicts with `certificateName`, `certificateBody`, `certificateChain`, `certificatePrivateKey`, `regionalCertificateArn`, and `regionalCertificateName`.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The certificate issued for the domain name
      * being registered, in PEM format. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and
      * `regionalCertificateName`.
      */
    val certificateBody: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The certificate for the CA that issued the
      * certificate, along with any intermediate CA certificates required to
      * create an unbroken chain to a certificate trusted by the intended API clients. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`,
      * `regionalCertificateArn`, and `regionalCertificateName`.
      */
    val certificateChain: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The unique name to use when registering this
      * certificate as an IAM server certificate. Conflicts with `certificateArn`, `regionalCertificateArn`, and
      * `regionalCertificateName`. Required if `certificateArn` is not set.
      */
    val certificateName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The private key associated with the
      * domain certificate given in `certificateBody`. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and `regionalCertificateName`.
      */
    val certificatePrivateKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The upload date associated with the domain certificate.
      */
    val certificateUploadDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The hostname created by Cloudfront to represent
      * the distribution that implements this domain name mapping.
      */
    val cloudfrontDomainName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * For convenience, the hosted zone ID (`Z2FDTNDATAQYW2`)
      * that can be used to create a Route53 alias record for the distribution.
      */
    val cloudfrontZoneId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The fully-qualified domain name to register
      */
    val domainName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block defining API endpoint information including type. Defined below.
      */
    val endpointConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.apigateway.DomainNameEndpointConfiguration]] = js.undefined
    
    /**
      * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when a regional domain name is desired. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and `certificatePrivateKey`.
      */
    val regionalCertificateArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The user-friendly name of the certificate that will be used by regional endpoint for this domain name. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and
      * `certificatePrivateKey`.
      */
    val regionalCertificateName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The hostname for the custom domain's regional endpoint.
      */
    val regionalDomainName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The hosted zone ID that can be used to create a Route53 alias record for the regional endpoint.
      */
    val regionalZoneId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are `TLS_1_0` and `TLS_1_2`. Must be configured to perform drift detection.
      */
    val securityPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DomainNameState {
    
    inline def apply(): DomainNameState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainNameState]
    }
    
    extension [Self <: DomainNameState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      inline def setCertificateBody(value: Input[String]): Self = StObject.set(x, "certificateBody", value.asInstanceOf[js.Any])
      
      inline def setCertificateBodyUndefined: Self = StObject.set(x, "certificateBody", js.undefined)
      
      inline def setCertificateChain(value: Input[String]): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
      
      inline def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
      
      inline def setCertificateName(value: Input[String]): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
      
      inline def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
      
      inline def setCertificatePrivateKey(value: Input[String]): Self = StObject.set(x, "certificatePrivateKey", value.asInstanceOf[js.Any])
      
      inline def setCertificatePrivateKeyUndefined: Self = StObject.set(x, "certificatePrivateKey", js.undefined)
      
      inline def setCertificateUploadDate(value: Input[String]): Self = StObject.set(x, "certificateUploadDate", value.asInstanceOf[js.Any])
      
      inline def setCertificateUploadDateUndefined: Self = StObject.set(x, "certificateUploadDate", js.undefined)
      
      inline def setCloudfrontDomainName(value: Input[String]): Self = StObject.set(x, "cloudfrontDomainName", value.asInstanceOf[js.Any])
      
      inline def setCloudfrontDomainNameUndefined: Self = StObject.set(x, "cloudfrontDomainName", js.undefined)
      
      inline def setCloudfrontZoneId(value: Input[String]): Self = StObject.set(x, "cloudfrontZoneId", value.asInstanceOf[js.Any])
      
      inline def setCloudfrontZoneIdUndefined: Self = StObject.set(x, "cloudfrontZoneId", js.undefined)
      
      inline def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      inline def setEndpointConfiguration(value: Input[typings.pulumiAws.inputMod.apigateway.DomainNameEndpointConfiguration]): Self = StObject.set(x, "endpointConfiguration", value.asInstanceOf[js.Any])
      
      inline def setEndpointConfigurationUndefined: Self = StObject.set(x, "endpointConfiguration", js.undefined)
      
      inline def setRegionalCertificateArn(value: Input[String]): Self = StObject.set(x, "regionalCertificateArn", value.asInstanceOf[js.Any])
      
      inline def setRegionalCertificateArnUndefined: Self = StObject.set(x, "regionalCertificateArn", js.undefined)
      
      inline def setRegionalCertificateName(value: Input[String]): Self = StObject.set(x, "regionalCertificateName", value.asInstanceOf[js.Any])
      
      inline def setRegionalCertificateNameUndefined: Self = StObject.set(x, "regionalCertificateName", js.undefined)
      
      inline def setRegionalDomainName(value: Input[String]): Self = StObject.set(x, "regionalDomainName", value.asInstanceOf[js.Any])
      
      inline def setRegionalDomainNameUndefined: Self = StObject.set(x, "regionalDomainName", js.undefined)
      
      inline def setRegionalZoneId(value: Input[String]): Self = StObject.set(x, "regionalZoneId", value.asInstanceOf[js.Any])
      
      inline def setRegionalZoneIdUndefined: Self = StObject.set(x, "regionalZoneId", js.undefined)
      
      inline def setSecurityPolicy(value: Input[String]): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
      
      inline def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
