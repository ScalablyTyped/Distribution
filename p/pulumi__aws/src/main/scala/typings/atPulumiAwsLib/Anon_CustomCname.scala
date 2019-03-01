package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomCname extends js.Object {
  var customCname: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var expirationInDays: scala.Double
  var s3BucketName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CustomCname {
  @scala.inline
  def apply(
    expirationInDays: scala.Double,
    customCname: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    s3BucketName: java.lang.String = null
  ): Anon_CustomCname = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expirationInDays")(expirationInDays)
    if (customCname != null) __obj.updateDynamic("customCname")(customCname)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName)
    __obj.asInstanceOf[Anon_CustomCname]
  }
}

