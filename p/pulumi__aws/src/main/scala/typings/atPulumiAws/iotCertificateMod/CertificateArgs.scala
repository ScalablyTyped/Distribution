package typings.atPulumiAws.iotCertificateMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateArgs extends js.Object {
  /**
    * Boolean flag to indicate if the certificate should be active
    */
  val active: Input[Boolean]
  /**
    * The certificate signing request. Review
    * [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
    * for more information on generating a certificate from a certificate signing request (CSR).
    * If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
    * for more information on generating keys and a certificate.
    */
  val csr: js.UndefOr[Input[String]] = js.undefined
}

object CertificateArgs {
  @scala.inline
  def apply(active: Input[Boolean], csr: Input[String] = null): CertificateArgs = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    if (csr != null) __obj.updateDynamic("csr")(csr.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateArgs]
  }
}

