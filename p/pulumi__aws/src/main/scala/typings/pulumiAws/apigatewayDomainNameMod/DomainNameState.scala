package typings.pulumiAws.apigatewayDomainNameMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.apigateway.DomainNameEndpointConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainNameState extends js.Object {
  
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
  val endpointConfiguration: js.UndefOr[Input[DomainNameEndpointConfiguration]] = js.native
  
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
  implicit class DomainNameStateOps[Self <: DomainNameState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCertificateArn(value: Input[String]): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
    
    @scala.inline
    def setCertificateBody(value: Input[String]): Self = this.set("certificateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateBody: Self = this.set("certificateBody", js.undefined)
    
    @scala.inline
    def setCertificateChain(value: Input[String]): Self = this.set("certificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateChain: Self = this.set("certificateChain", js.undefined)
    
    @scala.inline
    def setCertificateName(value: Input[String]): Self = this.set("certificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateName: Self = this.set("certificateName", js.undefined)
    
    @scala.inline
    def setCertificatePrivateKey(value: Input[String]): Self = this.set("certificatePrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificatePrivateKey: Self = this.set("certificatePrivateKey", js.undefined)
    
    @scala.inline
    def setCertificateUploadDate(value: Input[String]): Self = this.set("certificateUploadDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateUploadDate: Self = this.set("certificateUploadDate", js.undefined)
    
    @scala.inline
    def setCloudfrontDomainName(value: Input[String]): Self = this.set("cloudfrontDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudfrontDomainName: Self = this.set("cloudfrontDomainName", js.undefined)
    
    @scala.inline
    def setCloudfrontZoneId(value: Input[String]): Self = this.set("cloudfrontZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudfrontZoneId: Self = this.set("cloudfrontZoneId", js.undefined)
    
    @scala.inline
    def setDomainName(value: Input[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setEndpointConfiguration(value: Input[DomainNameEndpointConfiguration]): Self = this.set("endpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointConfiguration: Self = this.set("endpointConfiguration", js.undefined)
    
    @scala.inline
    def setRegionalCertificateArn(value: Input[String]): Self = this.set("regionalCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionalCertificateArn: Self = this.set("regionalCertificateArn", js.undefined)
    
    @scala.inline
    def setRegionalCertificateName(value: Input[String]): Self = this.set("regionalCertificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionalCertificateName: Self = this.set("regionalCertificateName", js.undefined)
    
    @scala.inline
    def setRegionalDomainName(value: Input[String]): Self = this.set("regionalDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionalDomainName: Self = this.set("regionalDomainName", js.undefined)
    
    @scala.inline
    def setRegionalZoneId(value: Input[String]): Self = this.set("regionalZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionalZoneId: Self = this.set("regionalZoneId", js.undefined)
    
    @scala.inline
    def setSecurityPolicy(value: Input[String]): Self = this.set("securityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityPolicy: Self = this.set("securityPolicy", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
