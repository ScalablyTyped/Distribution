package typings.pulumiAws.iotCertificateMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateArgs extends js.Object {
  /**
    * Boolean flag to indicate if the certificate should be active
    */
  val active: Input[Boolean] = js.native
  /**
    * The certificate signing request. Review
    * [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
    * for more information on generating a certificate from a certificate signing request (CSR).
    * If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
    * for more information on generating keys and a certificate.
    */
  val csr: js.UndefOr[Input[String]] = js.native
}

object CertificateArgs {
  @scala.inline
  def apply(active: Input[Boolean]): CertificateArgs = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateArgs]
  }
  @scala.inline
  implicit class CertificateArgsOps[Self <: CertificateArgs] (val x: Self) extends AnyVal {
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
    def setActive(value: Input[Boolean]): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setCsr(value: Input[String]): Self = this.set("csr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsr: Self = this.set("csr", js.undefined)
  }
  
}

