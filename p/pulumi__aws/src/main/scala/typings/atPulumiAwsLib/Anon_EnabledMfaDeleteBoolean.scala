package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledMfaDeleteBoolean extends js.Object {
  var enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var mfaDelete: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object Anon_EnabledMfaDeleteBoolean {
  @scala.inline
  def apply(
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    mfaDelete: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_EnabledMfaDeleteBoolean = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (mfaDelete != null) __obj.updateDynamic("mfaDelete")(mfaDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledMfaDeleteBoolean]
  }
}

