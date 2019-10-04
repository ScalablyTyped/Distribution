package typings.atPulumiAws.typesInputMod.gameliftNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetResourceCreationLimitPolicy extends js.Object {
  /**
    * Maximum number of game sessions that an individual can create during the policy period.
    */
  var newGameSessionsPerCreator: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Time span used in evaluating the resource creation limit policy.
    */
  var policyPeriodInMinutes: js.UndefOr[Input[Double]] = js.undefined
}

object FleetResourceCreationLimitPolicy {
  @scala.inline
  def apply(newGameSessionsPerCreator: Input[Double] = null, policyPeriodInMinutes: Input[Double] = null): FleetResourceCreationLimitPolicy = {
    val __obj = js.Dynamic.literal()
    if (newGameSessionsPerCreator != null) __obj.updateDynamic("newGameSessionsPerCreator")(newGameSessionsPerCreator.asInstanceOf[js.Any])
    if (policyPeriodInMinutes != null) __obj.updateDynamic("policyPeriodInMinutes")(policyPeriodInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetResourceCreationLimitPolicy]
  }
}

