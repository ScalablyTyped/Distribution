package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionMatch extends js.Object {
  var action: atPulumiPulumiLib.outputMod.Input[Anon_WeightedTargetsAnonVirtualNodeWeight]
  var `match`: atPulumiPulumiLib.outputMod.Input[Anon_PrefixInput]
}

object Anon_ActionMatch {
  @scala.inline
  def apply(
    action: atPulumiPulumiLib.outputMod.Input[Anon_WeightedTargetsAnonVirtualNodeWeight],
    `match`: atPulumiPulumiLib.outputMod.Input[Anon_PrefixInput]
  ): Anon_ActionMatch = {
    val __obj = js.Dynamic.literal(`match` = `match`.asInstanceOf[js.Any])
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionMatch]
  }
}

