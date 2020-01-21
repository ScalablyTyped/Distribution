package typings.pulumiAws.iotCertificateMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateState extends js.Object {
  /**
    * Boolean flag to indicate if the certificate should be active
    */
  val active: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARN of the created certificate.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate data, in PEM format.
    */
  val certificatePem: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate signing request. Review
    * [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
    * for more information on generating a certificate from a certificate signing request (CSR).
    * If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
    * for more information on generating keys and a certificate.
    */
  val csr: js.UndefOr[Input[String]] = js.native
  /**
    * When no CSR is provided, the private key.
    */
  val privateKey: js.UndefOr[Input[String]] = js.native
  /**
    * When no CSR is provided, the public key.
    */
  val publicKey: js.UndefOr[Input[String]] = js.native
}

object CertificateState {
  @scala.inline
  def apply(
    active: Input[Boolean] = null,
    arn: Input[String] = null,
    certificatePem: Input[String] = null,
    csr: Input[String] = null,
    privateKey: Input[String] = null,
    publicKey: Input[String] = null
  ): CertificateState = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (certificatePem != null) __obj.updateDynamic("certificatePem")(certificatePem.asInstanceOf[js.Any])
    if (csr != null) __obj.updateDynamic("csr")(csr.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateState]
  }
}

