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
}

