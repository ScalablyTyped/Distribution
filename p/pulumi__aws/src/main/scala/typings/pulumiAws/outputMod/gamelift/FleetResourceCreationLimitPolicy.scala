package typings.pulumiAws.outputMod.gamelift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetResourceCreationLimitPolicy extends js.Object {
  /**
    * Maximum number of game sessions that an individual can create during the policy period.
    */
  var newGameSessionsPerCreator: js.UndefOr[Double] = js.native
  /**
    * Time span used in evaluating the resource creation limit policy.
    */
  var policyPeriodInMinutes: js.UndefOr[Double] = js.native
}

object FleetResourceCreationLimitPolicy {
  @scala.inline
  def apply(
    newGameSessionsPerCreator: js.UndefOr[Double] = js.undefined,
    policyPeriodInMinutes: js.UndefOr[Double] = js.undefined
  ): FleetResourceCreationLimitPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(newGameSessionsPerCreator)) __obj.updateDynamic("newGameSessionsPerCreator")(newGameSessionsPerCreator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(policyPeriodInMinutes)) __obj.updateDynamic("policyPeriodInMinutes")(policyPeriodInMinutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetResourceCreationLimitPolicy]
  }
}

