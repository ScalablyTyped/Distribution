package typings.pulumiAws.outputMod.apigatewayv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainNameDomainNameConfiguration extends js.Object {
  /**
    * The ARN of an AWS-managed certificate that will be used by the endpoint for the domain name. AWS Certificate Manager is the only supported source.
    * Use the `aws.acm.Certificate` resource to configure an ACM certificate.
    */
  var certificateArn: String = js.native
  /**
    * The endpoint type. Valid values: `REGIONAL`.
    */
  var endpointType: String = js.native
  /**
    * The Amazon Route 53 Hosted Zone ID of the endpoint.
    */
  var hostedZoneId: String = js.native
  /**
    * The Transport Layer Security (TLS) version of the [security policy](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-custom-domain-tls-version.html) for the domain name. Valid values: `TLS_1_2`.
    */
  var securityPolicy: String = js.native
  /**
    * The target domain name.
    */
  var targetDomainName: String = js.native
}

object DomainNameDomainNameConfiguration {
  @scala.inline
  def apply(
    certificateArn: String,
    endpointType: String,
    hostedZoneId: String,
    securityPolicy: String,
    targetDomainName: String
  ): DomainNameDomainNameConfiguration = {
    val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any], endpointType = endpointType.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any], securityPolicy = securityPolicy.asInstanceOf[js.Any], targetDomainName = targetDomainName.asInstanceOf[js.Any])
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
    def setCertificateArn(value: String): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointType(value: String): Self = this.set("endpointType", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostedZoneId(value: String): Self = this.set("hostedZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityPolicy(value: String): Self = this.set("securityPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDomainName(value: String): Self = this.set("targetDomainName", value.asInstanceOf[js.Any])
  }
  
}

