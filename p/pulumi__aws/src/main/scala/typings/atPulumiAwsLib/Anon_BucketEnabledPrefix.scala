package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketEnabledPrefix extends js.Object {
  var bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var prefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_BucketEnabledPrefix {
  @scala.inline
  def apply(
    bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    prefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_BucketEnabledPrefix = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketEnabledPrefix]
  }
}

