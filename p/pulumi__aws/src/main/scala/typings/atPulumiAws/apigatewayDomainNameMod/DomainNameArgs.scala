package typings.atPulumiAws.apigatewayDomainNameMod

import typings.atPulumiAws.Anon_TypesInput
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainNameArgs extends js.Object {
  /**
    * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when an edge-optimized domain name is desired. Conflicts with `certificate_name`, `certificate_body`, `certificate_chain`, `certificate_private_key`, `regional_certificate_arn`, and `regional_certificate_name`.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The certificate issued for the domain name
    * being registered, in PEM format. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and
    * `regional_certificate_name`.
    */
  val certificateBody: js.UndefOr[Input[String]] = js.undefined
  /**
    * The certificate for the CA that issued the
    * certificate, along with any intermediate CA certificates required to
    * create an unbroken chain to a certificate trusted by the intended API clients. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`,
    * `regional_certificate_arn`, and `regional_certificate_name`.
    */
  val certificateChain: js.UndefOr[Input[String]] = js.undefined
  /**
    * The unique name to use when registering this
    * certificate as an IAM server certificate. Conflicts with `certificate_arn`, `regional_certificate_arn`, and
    * `regional_certificate_name`. Required if `certificate_arn` is not set.
    */
  val certificateName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The private key associated with the
    * domain certificate given in `certificate_body`. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and `regional_certificate_name`.
    */
  val certificatePrivateKey: js.UndefOr[Input[String]] = js.undefined
  /**
    * The fully-qualified domain name to register
    */
  val domainName: Input[String]
  /**
    * Configuration block defining API endpoint information including type. Defined below.
    */
  val endpointConfiguration: js.UndefOr[Input[Anon_TypesInput]] = js.undefined
  /**
    * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when a regional domain name is desired. Conflicts with `certificate_arn`, `certificate_name`, `certificate_body`, `certificate_chain`, and `certificate_private_key`.
    */
  val regionalCertificateArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The user-friendly name of the certificate that will be used by regional endpoint for this domain name. Conflicts with `certificate_arn`, `certificate_name`, `certificate_body`, `certificate_chain`, and
    * `certificate_private_key`.
    */
  val regionalCertificateName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are `TLS_1_0` and `TLS_1_2`. Must be configured to perform drift detection.
    */
  val securityPolicy: js.UndefOr[Input[String]] = js.undefined
}

object DomainNameArgs {
  @scala.inline
  def apply(
    domainName: Input[String],
    certificateArn: Input[String] = null,
    certificateBody: Input[String] = null,
    certificateChain: Input[String] = null,
    certificateName: Input[String] = null,
    certificatePrivateKey: Input[String] = null,
    endpointConfiguration: Input[Anon_TypesInput] = null,
    regionalCertificateArn: Input[String] = null,
    regionalCertificateName: Input[String] = null,
    securityPolicy: Input[String] = null
  ): DomainNameArgs = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (certificateBody != null) __obj.updateDynamic("certificateBody")(certificateBody.asInstanceOf[js.Any])
    if (certificateChain != null) __obj.updateDynamic("certificateChain")(certificateChain.asInstanceOf[js.Any])
    if (certificateName != null) __obj.updateDynamic("certificateName")(certificateName.asInstanceOf[js.Any])
    if (certificatePrivateKey != null) __obj.updateDynamic("certificatePrivateKey")(certificatePrivateKey.asInstanceOf[js.Any])
    if (endpointConfiguration != null) __obj.updateDynamic("endpointConfiguration")(endpointConfiguration.asInstanceOf[js.Any])
    if (regionalCertificateArn != null) __obj.updateDynamic("regionalCertificateArn")(regionalCertificateArn.asInstanceOf[js.Any])
    if (regionalCertificateName != null) __obj.updateDynamic("regionalCertificateName")(regionalCertificateName.asInstanceOf[js.Any])
    if (securityPolicy != null) __obj.updateDynamic("securityPolicy")(securityPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainNameArgs]
  }
}

