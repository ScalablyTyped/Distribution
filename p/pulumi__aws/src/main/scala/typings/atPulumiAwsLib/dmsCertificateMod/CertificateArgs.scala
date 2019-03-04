package typings
package atPulumiAwsLib.dmsCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateArgs extends js.Object {
  /**
    * The certificate identifier.
    */
  val certificateId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The contents of the .pem X.509 certificate file for the certificate. Either `certificate_pem` or `certificate_wallet` must be set.
    */
  val certificatePem: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The contents of the Oracle Wallet certificate for use with SSL. Either `certificate_pem` or `certificate_wallet` must be set.
    */
  val certificateWallet: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object CertificateArgs {
  @scala.inline
  def apply(
    certificateId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    certificatePem: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    certificateWallet: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): CertificateArgs = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    if (certificatePem != null) __obj.updateDynamic("certificatePem")(certificatePem.asInstanceOf[js.Any])
    if (certificateWallet != null) __obj.updateDynamic("certificateWallet")(certificateWallet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateArgs]
  }
}

