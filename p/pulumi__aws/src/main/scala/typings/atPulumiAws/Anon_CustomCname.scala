package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomCname extends js.Object {
  var customCname: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var expirationInDays: Double
  var s3BucketName: js.UndefOr[String] = js.undefined
}

object Anon_CustomCname {
  @scala.inline
  def apply(
    expirationInDays: Double,
    customCname: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    s3BucketName: String = null
  ): Anon_CustomCname = {
    val __obj = js.Dynamic.literal(expirationInDays = expirationInDays)
    if (customCname != null) __obj.updateDynamic("customCname")(customCname)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName)
    __obj.asInstanceOf[Anon_CustomCname]
  }
}

