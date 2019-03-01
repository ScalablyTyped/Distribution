package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewGameSessionsPerCreatorPolicyPeriodInMinutes extends js.Object {
  var newGameSessionsPerCreator: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var policyPeriodInMinutes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_NewGameSessionsPerCreatorPolicyPeriodInMinutes {
  @scala.inline
  def apply(
    newGameSessionsPerCreator: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    policyPeriodInMinutes: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_NewGameSessionsPerCreatorPolicyPeriodInMinutes = {
    val __obj = js.Dynamic.literal()
    if (newGameSessionsPerCreator != null) __obj.updateDynamic("newGameSessionsPerCreator")(newGameSessionsPerCreator.asInstanceOf[js.Any])
    if (policyPeriodInMinutes != null) __obj.updateDynamic("policyPeriodInMinutes")(policyPeriodInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NewGameSessionsPerCreatorPolicyPeriodInMinutes]
  }
}

