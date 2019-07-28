package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcmCertificateArn extends js.Object {
  var acmCertificateArn: js.UndefOr[String] = js.undefined
  var cloudfrontDefaultCertificate: js.UndefOr[Boolean] = js.undefined
  var iamCertificateId: js.UndefOr[String] = js.undefined
  var minimumProtocolVersion: js.UndefOr[String] = js.undefined
  var sslSupportMethod: js.UndefOr[String] = js.undefined
}

object Anon_AcmCertificateArn {
  @scala.inline
  def apply(
    acmCertificateArn: String = null,
    cloudfrontDefaultCertificate: js.UndefOr[Boolean] = js.undefined,
    iamCertificateId: String = null,
    minimumProtocolVersion: String = null,
    sslSupportMethod: String = null
  ): Anon_AcmCertificateArn = {
    val __obj = js.Dynamic.literal()
    if (acmCertificateArn != null) __obj.updateDynamic("acmCertificateArn")(acmCertificateArn)
    if (!js.isUndefined(cloudfrontDefaultCertificate)) __obj.updateDynamic("cloudfrontDefaultCertificate")(cloudfrontDefaultCertificate)
    if (iamCertificateId != null) __obj.updateDynamic("iamCertificateId")(iamCertificateId)
    if (minimumProtocolVersion != null) __obj.updateDynamic("minimumProtocolVersion")(minimumProtocolVersion)
    if (sslSupportMethod != null) __obj.updateDynamic("sslSupportMethod")(sslSupportMethod)
    __obj.asInstanceOf[Anon_AcmCertificateArn]
  }
}

