package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomCnameEnabled extends js.Object {
  var customCname: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var expirationInDays: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var s3BucketName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_CustomCnameEnabled {
  @scala.inline
  def apply(
    expirationInDays: atPulumiPulumiLib.outputMod.Input[scala.Double],
    customCname: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    s3BucketName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_CustomCnameEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expirationInDays")(expirationInDays.asInstanceOf[js.Any])
    if (customCname != null) __obj.updateDynamic("customCname")(customCname.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomCnameEnabled]
  }
}

