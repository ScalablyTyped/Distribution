package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionMatch extends js.Object {
  var action: Input[Anon_WeightedTargetsAnonVirtualNodeWeight]
  var `match`: Input[Anon_PrefixInput]
}

object Anon_ActionMatch {
  @scala.inline
  def apply(action: Input[Anon_WeightedTargetsAnonVirtualNodeWeight], `match`: Input[Anon_PrefixInput]): Anon_ActionMatch = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionMatch]
  }
}

