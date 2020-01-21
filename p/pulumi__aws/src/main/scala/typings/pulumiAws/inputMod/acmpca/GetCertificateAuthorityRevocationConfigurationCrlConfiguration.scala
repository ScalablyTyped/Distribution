package typings.pulumiAws.inputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityRevocationConfigurationCrlConfiguration extends js.Object {
  var customCname: js.UndefOr[String] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var expirationInDays: js.UndefOr[Double] = js.native
  var s3BucketName: js.UndefOr[String] = js.native
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
    if (customCname != null) __obj.updateDynamic("customCname")(customCname.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (expirationInDays != null) __obj.updateDynamic("expirationInDays")(expirationInDays.asInstanceOf[js.Any])
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateAuthorityRevocationConfigurationCrlConfiguration]
  }
}

