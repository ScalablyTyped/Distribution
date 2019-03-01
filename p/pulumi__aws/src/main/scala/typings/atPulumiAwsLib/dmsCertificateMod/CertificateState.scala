package typings
package atPulumiAwsLib.dmsCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  val certificateArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The certificate identifier.
    */
  val certificateId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The contents of the .pem X.509 certificate file for the certificate. Either `certificate_pem` or `certificate_wallet` must be set.
    */
  val certificatePem: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The contents of the Oracle Wallet certificate for use with SSL. Either `certificate_pem` or `certificate_wallet` must be set.
    */
  val certificateWallet: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object CertificateState {
  @scala.inline
  def apply(
    certificateArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    certificateId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    certificatePem: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    certificateWallet: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): CertificateState = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId.asInstanceOf[js.Any])
    if (certificatePem != null) __obj.updateDynamic("certificatePem")(certificatePem.asInstanceOf[js.Any])
    if (certificateWallet != null) __obj.updateDynamic("certificateWallet")(certificateWallet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateState]
  }
}

