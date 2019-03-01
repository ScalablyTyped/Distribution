package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomCnameEnabledExpirationInDays extends js.Object {
  var customCname: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var expirationInDays: js.UndefOr[scala.Double] = js.undefined
  var s3BucketName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CustomCnameEnabledExpirationInDays {
  @scala.inline
  def apply(
    customCname: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    expirationInDays: scala.Int | scala.Double = null,
    s3BucketName: java.lang.String = null
  ): Anon_CustomCnameEnabledExpirationInDays = {
    val __obj = js.Dynamic.literal()
    if (customCname != null) __obj.updateDynamic("customCname")(customCname)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expirationInDays != null) __obj.updateDynamic("expirationInDays")(expirationInDays.asInstanceOf[js.Any])
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName)
    __obj.asInstanceOf[Anon_CustomCnameEnabledExpirationInDays]
  }
}

