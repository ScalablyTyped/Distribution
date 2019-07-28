package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomCnameEnabledExpirationInDays extends js.Object {
  var customCname: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var expirationInDays: js.UndefOr[Double] = js.undefined
  var s3BucketName: js.UndefOr[String] = js.undefined
}

object Anon_CustomCnameEnabledExpirationInDays {
  @scala.inline
  def apply(
    customCname: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expirationInDays: Int | Double = null,
    s3BucketName: String = null
  ): Anon_CustomCnameEnabledExpirationInDays = {
    val __obj = js.Dynamic.literal()
    if (customCname != null) __obj.updateDynamic("customCname")(customCname)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expirationInDays != null) __obj.updateDynamic("expirationInDays")(expirationInDays.asInstanceOf[js.Any])
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName)
    __obj.asInstanceOf[Anon_CustomCnameEnabledExpirationInDays]
  }
}

