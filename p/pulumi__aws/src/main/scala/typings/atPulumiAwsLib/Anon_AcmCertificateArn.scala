package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcmCertificateArn extends js.Object {
  var acmCertificateArn: js.UndefOr[java.lang.String] = js.undefined
  var cloudfrontDefaultCertificate: js.UndefOr[scala.Boolean] = js.undefined
  var iamCertificateId: js.UndefOr[java.lang.String] = js.undefined
  var minimumProtocolVersion: js.UndefOr[java.lang.String] = js.undefined
  var sslSupportMethod: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AcmCertificateArn {
  @scala.inline
  def apply(
    acmCertificateArn: java.lang.String = null,
    cloudfrontDefaultCertificate: js.UndefOr[scala.Boolean] = js.undefined,
    iamCertificateId: java.lang.String = null,
    minimumProtocolVersion: java.lang.String = null,
    sslSupportMethod: java.lang.String = null
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

