package typings.atPulumiAws.typesInputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateAuthorityRevocationConfigurationCrlConfiguration extends js.Object {
  var customCname: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var expirationInDays: js.UndefOr[Double] = js.undefined
  var s3BucketName: js.UndefOr[String] = js.undefined
}

object GetCertificateAuthorityRevocationConfigurationCrlConfiguration {
  @scala.inline
  def apply(
    customCname: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expirationInDays: Int | Double = null,
    s3BucketName: String = null
  ): GetCertificateAuthorityRevocationConfigurationCrlConfiguration = {
    val __obj = js.Dynamic.literal()
    if (customCname != null) __obj.updateDynamic("customCname")(customCname)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expirationInDays != null) __obj.updateDynamic("expirationInDays")(expirationInDays.asInstanceOf[js.Any])
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName)
    __obj.asInstanceOf[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]
  }
}

