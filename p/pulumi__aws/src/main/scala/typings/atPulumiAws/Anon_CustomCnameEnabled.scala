package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomCnameEnabled extends js.Object {
  var customCname: js.UndefOr[Input[String]] = js.undefined
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  var expirationInDays: Input[Double]
  var s3BucketName: js.UndefOr[Input[String]] = js.undefined
}

object Anon_CustomCnameEnabled {
  @scala.inline
  def apply(
    expirationInDays: Input[Double],
    customCname: Input[String] = null,
    enabled: Input[Boolean] = null,
    s3BucketName: Input[String] = null
  ): Anon_CustomCnameEnabled = {
    val __obj = js.Dynamic.literal(expirationInDays = expirationInDays.asInstanceOf[js.Any])
    if (customCname != null) __obj.updateDynamic("customCname")(customCname.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomCnameEnabled]
  }
}

