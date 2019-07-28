package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcmCertificateArnCloudfrontDefaultCertificate extends js.Object {
  var acmCertificateArn: js.UndefOr[Input[String]] = js.undefined
  var cloudfrontDefaultCertificate: js.UndefOr[Input[Boolean]] = js.undefined
  var iamCertificateId: js.UndefOr[Input[String]] = js.undefined
  var minimumProtocolVersion: js.UndefOr[Input[String]] = js.undefined
  var sslSupportMethod: js.UndefOr[Input[String]] = js.undefined
}

object Anon_AcmCertificateArnCloudfrontDefaultCertificate {
  @scala.inline
  def apply(
    acmCertificateArn: Input[String] = null,
    cloudfrontDefaultCertificate: Input[Boolean] = null,
    iamCertificateId: Input[String] = null,
    minimumProtocolVersion: Input[String] = null,
    sslSupportMethod: Input[String] = null
  ): Anon_AcmCertificateArnCloudfrontDefaultCertificate = {
    val __obj = js.Dynamic.literal()
    if (acmCertificateArn != null) __obj.updateDynamic("acmCertificateArn")(acmCertificateArn.asInstanceOf[js.Any])
    if (cloudfrontDefaultCertificate != null) __obj.updateDynamic("cloudfrontDefaultCertificate")(cloudfrontDefaultCertificate.asInstanceOf[js.Any])
    if (iamCertificateId != null) __obj.updateDynamic("iamCertificateId")(iamCertificateId.asInstanceOf[js.Any])
    if (minimumProtocolVersion != null) __obj.updateDynamic("minimumProtocolVersion")(minimumProtocolVersion.asInstanceOf[js.Any])
    if (sslSupportMethod != null) __obj.updateDynamic("sslSupportMethod")(sslSupportMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AcmCertificateArnCloudfrontDefaultCertificate]
  }
}

