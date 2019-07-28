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
    * The certificate signing request. Review the
    * [IoT API Reference Guide] (http://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
    * for more information on creating a certificate from a certificate signing request (CSR).
    */
  val csr: Input[String]
}

object CertificateArgs {
  @scala.inline
  def apply(active: Input[Boolean], csr: Input[String]): CertificateArgs = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], csr = csr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CertificateArgs]
  }
}

