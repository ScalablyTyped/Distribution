package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedIpRangeSecretToken extends js.Object {
  var allowedIpRange: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var secretToken: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_AllowedIpRangeSecretToken {
  @scala.inline
  def apply(
    allowedIpRange: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    secretToken: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_AllowedIpRangeSecretToken = {
    val __obj = js.Dynamic.literal()
    if (allowedIpRange != null) __obj.updateDynamic("allowedIpRange")(allowedIpRange.asInstanceOf[js.Any])
    if (secretToken != null) __obj.updateDynamic("secretToken")(secretToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowedIpRangeSecretToken]
  }
}

