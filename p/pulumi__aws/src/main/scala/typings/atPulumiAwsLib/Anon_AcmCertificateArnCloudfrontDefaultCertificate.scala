package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcmCertificateArnCloudfrontDefaultCertificate extends js.Object {
  var acmCertificateArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var cloudfrontDefaultCertificate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var iamCertificateId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var minimumProtocolVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var sslSupportMethod: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_AcmCertificateArnCloudfrontDefaultCertificate {
  @scala.inline
  def apply(
    acmCertificateArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    cloudfrontDefaultCertificate: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    iamCertificateId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    minimumProtocolVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sslSupportMethod: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

