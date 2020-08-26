package typings.pulumiAws.inputMod.acmpca

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthorityCertificateAuthorityConfiguration extends js.Object {
  /**
    * Type of the public key algorithm and size, in bits, of the key pair that your key pair creates when it issues a certificate. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
    */
  var keyAlgorithm: Input[String] = js.native
  /**
    * Name of the algorithm your private CA uses to sign certificate requests. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
    */
  var signingAlgorithm: Input[String] = js.native
  /**
    * Nested argument that contains X.500 distinguished name information. At least one nested attribute must be specified.
    */
  var subject: Input[CertificateAuthorityCertificateAuthorityConfigurationSubject] = js.native
}

object CertificateAuthorityCertificateAuthorityConfiguration {
  @scala.inline
  def apply(
    keyAlgorithm: Input[String],
    signingAlgorithm: Input[String],
    subject: Input[CertificateAuthorityCertificateAuthorityConfigurationSubject]
  ): CertificateAuthorityCertificateAuthorityConfiguration = {
    val __obj = js.Dynamic.literal(keyAlgorithm = keyAlgorithm.asInstanceOf[js.Any], signingAlgorithm = signingAlgorithm.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthorityCertificateAuthorityConfiguration]
  }
  @scala.inline
  implicit class CertificateAuthorityCertificateAuthorityConfigurationOps[Self <: CertificateAuthorityCertificateAuthorityConfiguration] (val x: Self) extends AnyVal {
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
    def setKeyAlgorithm(value: Input[String]): Self = this.set("keyAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigningAlgorithm(value: Input[String]): Self = this.set("signingAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: Input[CertificateAuthorityCertificateAuthorityConfigurationSubject]): Self = this.set("subject", value.asInstanceOf[js.Any])
  }
  
}

