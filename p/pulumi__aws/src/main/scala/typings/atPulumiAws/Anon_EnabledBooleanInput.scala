package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledBooleanInput extends js.Object {
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
}

object Anon_EnabledBooleanInput {
  @scala.inline
  def apply(enabled: Input[Boolean] = null): Anon_EnabledBooleanInput = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledBooleanInput]
  }
}

