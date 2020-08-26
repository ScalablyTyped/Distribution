package typings.pulumiAws.inputMod.gamelift

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetResourceCreationLimitPolicy extends js.Object {
  /**
    * Maximum number of game sessions that an individual can create during the policy period.
    */
  var newGameSessionsPerCreator: js.UndefOr[Input[Double]] = js.native
  /**
    * Time span used in evaluating the resource creation limit policy.
    */
  var policyPeriodInMinutes: js.UndefOr[Input[Double]] = js.native
}

object FleetResourceCreationLimitPolicy {
  @scala.inline
  def apply(): FleetResourceCreationLimitPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetResourceCreationLimitPolicy]
  }
  @scala.inline
  implicit class FleetResourceCreationLimitPolicyOps[Self <: FleetResourceCreationLimitPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNewGameSessionsPerCreator(value: Input[Double]): Self = this.set("newGameSessionsPerCreator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewGameSessionsPerCreator: Self = this.set("newGameSessionsPerCreator", js.undefined)
    @scala.inline
    def setPolicyPeriodInMinutes(value: Input[Double]): Self = this.set("policyPeriodInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyPeriodInMinutes: Self = this.set("policyPeriodInMinutes", js.undefined)
  }
  
}

