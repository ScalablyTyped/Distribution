package typings.pulumiAws.dmsCertificateMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate identifier.
    */
  val certificateId: js.UndefOr[Input[String]] = js.native
  /**
    * The contents of the .pem X.509 certificate file for the certificate. Either `certificatePem` or `certificateWallet` must be set.
    */
  val certificatePem: js.UndefOr[Input[String]] = js.native
  /**
    * The contents of the Oracle Wallet certificate for use with SSL. Either `certificatePem` or `certificateWallet` must be set.
    */
  val certificateWallet: js.UndefOr[Input[String]] = js.native
}

object CertificateState {
  @scala.inline
  def apply(
    certificateArn: Input[String] = null,
    certificateId: Input[String] = null,
    certificatePem: Input[String] = null,
    certificateWallet: Input[String] = null
  ): CertificateState = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId.asInstanceOf[js.Any])
    if (certificatePem != null) __obj.updateDynamic("certificatePem")(certificatePem.asInstanceOf[js.Any])
    if (certificateWallet != null) __obj.updateDynamic("certificateWallet")(certificateWallet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateState]
  }
}

