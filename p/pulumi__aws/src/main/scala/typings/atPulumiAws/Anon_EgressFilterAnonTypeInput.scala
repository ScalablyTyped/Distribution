package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EgressFilterAnonTypeInput extends js.Object {
  var egressFilter: js.UndefOr[Input[Anon_TypeInput]] = js.undefined
}

object Anon_EgressFilterAnonTypeInput {
  @scala.inline
  def apply(egressFilter: Input[Anon_TypeInput] = null): Anon_EgressFilterAnonTypeInput = {
    val __obj = js.Dynamic.literal()
    if (egressFilter != null) __obj.updateDynamic("egressFilter")(egressFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EgressFilterAnonTypeInput]
  }
}

