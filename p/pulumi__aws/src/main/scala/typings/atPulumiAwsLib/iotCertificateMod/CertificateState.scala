package typings
package atPulumiAwsLib.iotCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateState extends js.Object {
  /**
    * Boolean flag to indicate if the certificate should be active
    */
  val active: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ARN of the created AWS IoT certificate
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The certificate signing request. Review the
    * [IoT API Reference Guide] (http://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
    * for more information on creating a certificate from a certificate signing request (CSR).
    */
  val csr: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object CertificateState {
  @scala.inline
  def apply(
    active: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    csr: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): CertificateState = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (csr != null) __obj.updateDynamic("csr")(csr.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateState]
  }
}

