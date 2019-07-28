package typings.atPulumiAws.dmsCertificateMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateArgs extends js.Object {
  /**
    * The certificate identifier.
    */
  val certificateId: Input[String]
  /**
    * The contents of the .pem X.509 certificate file for the certificate. Either `certificate_pem` or `certificate_wallet` must be set.
    */
  val certificatePem: js.UndefOr[Input[String]] = js.undefined
  /**
    * The contents of the Oracle Wallet certificate for use with SSL. Either `certificate_pem` or `certificate_wallet` must be set.
    */
  val certificateWallet: js.UndefOr[Input[String]] = js.undefined
}

object CertificateArgs {
  @scala.inline
  def apply(
    certificateId: Input[String],
    certificatePem: Input[String] = null,
    certificateWallet: Input[String] = null
  ): CertificateArgs = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    if (certificatePem != null) __obj.updateDynamic("certificatePem")(certificatePem.asInstanceOf[js.Any])
    if (certificateWallet != null) __obj.updateDynamic("certificateWallet")(certificateWallet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateArgs]
  }
}

