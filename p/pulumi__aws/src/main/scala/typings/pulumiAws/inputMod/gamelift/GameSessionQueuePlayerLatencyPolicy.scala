package typings.pulumiAws.inputMod.gamelift

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameSessionQueuePlayerLatencyPolicy extends js.Object {
  /**
    * Maximum latency value that is allowed for any player.
    */
  var maximumIndividualPlayerLatencyMilliseconds: Input[Double] = js.native
  /**
    * Length of time that the policy is enforced while placing a new game session. Absence of value for this attribute means that the policy is enforced until the queue times out.
    */
  var policyDurationSeconds: js.UndefOr[Input[Double]] = js.native
}

object GameSessionQueuePlayerLatencyPolicy {
  @scala.inline
  def apply(maximumIndividualPlayerLatencyMilliseconds: Input[Double]): GameSessionQueuePlayerLatencyPolicy = {
    val __obj = js.Dynamic.literal(maximumIndividualPlayerLatencyMilliseconds = maximumIndividualPlayerLatencyMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSessionQueuePlayerLatencyPolicy]
  }
  @scala.inline
  implicit class GameSessionQueuePlayerLatencyPolicyOps[Self <: GameSessionQueuePlayerLatencyPolicy] (val x: Self) extends AnyVal {
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
    def setMaximumIndividualPlayerLatencyMilliseconds(value: Input[Double]): Self = this.set("maximumIndividualPlayerLatencyMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyDurationSeconds(value: Input[Double]): Self = this.set("policyDurationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyDurationSeconds: Self = this.set("policyDurationSeconds", js.undefined)
  }
  
}

