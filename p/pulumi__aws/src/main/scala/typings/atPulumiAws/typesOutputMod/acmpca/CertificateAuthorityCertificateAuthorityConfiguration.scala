package typings.atPulumiAws.typesOutputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateAuthorityCertificateAuthorityConfiguration extends js.Object {
  /**
    * Type of the public key algorithm and size, in bits, of the key pair that your key pair creates when it issues a certificate. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
    */
  var keyAlgorithm: String
  /**
    * Name of the algorithm your private CA uses to sign certificate requests. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
    */
  var signingAlgorithm: String
  /**
    * Nested argument that contains X.500 distinguished name information. At least one nested attribute must be specified.
    */
  var subject: CertificateAuthorityCertificateAuthorityConfigurationSubject
}

object CertificateAuthorityCertificateAuthorityConfiguration {
  @scala.inline
  def apply(
    keyAlgorithm: String,
    signingAlgorithm: String,
    subject: CertificateAuthorityCertificateAuthorityConfigurationSubject
  ): CertificateAuthorityCertificateAuthorityConfiguration = {
    val __obj = js.Dynamic.literal(keyAlgorithm = keyAlgorithm, signingAlgorithm = signingAlgorithm, subject = subject)
  
    __obj.asInstanceOf[CertificateAuthorityCertificateAuthorityConfiguration]
  }
}

