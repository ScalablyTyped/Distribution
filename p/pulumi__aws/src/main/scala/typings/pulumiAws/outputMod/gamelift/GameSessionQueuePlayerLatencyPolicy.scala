package typings.pulumiAws.outputMod.gamelift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameSessionQueuePlayerLatencyPolicy extends js.Object {
  /**
    * Maximum latency value that is allowed for any player.
    */
  var maximumIndividualPlayerLatencyMilliseconds: Double = js.native
  /**
    * Length of time that the policy is enforced while placing a new game session. Absence of value for this attribute means that the policy is enforced until the queue times out.
    */
  var policyDurationSeconds: js.UndefOr[Double] = js.native
}

object GameSessionQueuePlayerLatencyPolicy {
  @scala.inline
  def apply(
    maximumIndividualPlayerLatencyMilliseconds: Double,
    policyDurationSeconds: js.UndefOr[Double] = js.undefined
  ): GameSessionQueuePlayerLatencyPolicy = {
    val __obj = js.Dynamic.literal(maximumIndividualPlayerLatencyMilliseconds = maximumIndividualPlayerLatencyMilliseconds.asInstanceOf[js.Any])
    if (!js.isUndefined(policyDurationSeconds)) __obj.updateDynamic("policyDurationSeconds")(policyDurationSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSessionQueuePlayerLatencyPolicy]
  }
}

