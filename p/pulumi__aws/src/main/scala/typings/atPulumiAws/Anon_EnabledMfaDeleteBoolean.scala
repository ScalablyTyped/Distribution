package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledMfaDeleteBoolean extends js.Object {
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  var mfaDelete: js.UndefOr[Input[Boolean]] = js.undefined
}

object Anon_EnabledMfaDeleteBoolean {
  @scala.inline
  def apply(enabled: Input[Boolean] = null, mfaDelete: Input[Boolean] = null): Anon_EnabledMfaDeleteBoolean = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (mfaDelete != null) __obj.updateDynamic("mfaDelete")(mfaDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledMfaDeleteBoolean]
  }
}

