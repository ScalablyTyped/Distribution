package typings.pulumiAws.inputMod.apigatewayv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainNameDomainNameConfiguration extends js.Object {
  
  /**
    * The ARN of an AWS-managed certificate that will be used by the endpoint for the domain name. AWS Certificate Manager is the only supported source.
    * Use the `aws.acm.Certificate` resource to configure an ACM certificate.
    */
  var certificateArn: Input[String] = js.native
  
  /**
    * The endpoint type. Valid values: `REGIONAL`.
    */
  var endpointType: Input[String] = js.native
  
  /**
    * The Amazon Route 53 Hosted Zone ID of the endpoint.
    */
  var hostedZoneId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Transport Layer Security (TLS) version of the [security policy](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-custom-domain-tls-version.html) for the domain name. Valid values: `TLS_1_2`.
    */
  var securityPolicy: Input[String] = js.native
  
  /**
    * The target domain name.
    */
  var targetDomainName: js.UndefOr[Input[String]] = js.native
}
object DomainNameDomainNameConfiguration {
  
  @scala.inline
  def apply(certificateArn: Input[String], endpointType: Input[String], securityPolicy: Input[String]): DomainNameDomainNameConfiguration = {
    val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any], endpointType = endpointType.asInstanceOf[js.Any], securityPolicy = securityPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainNameDomainNameConfiguration]
  }
  
  @scala.inline
  implicit class DomainNameDomainNameConfigurationOps[Self <: DomainNameDomainNameConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCertificateArn(value: Input[String]): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointType(value: Input[String]): Self = this.set("endpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPolicy(value: Input[String]): Self = this.set("securityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneId(value: Input[String]): Self = this.set("hostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostedZoneId: Self = this.set("hostedZoneId", js.undefined)
    
    @scala.inline
    def setTargetDomainName(value: Input[String]): Self = this.set("targetDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetDomainName: Self = this.set("targetDomainName", js.undefined)
  }
}
