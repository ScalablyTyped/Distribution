package typings.atPulumiAws.typesOutputMod.gamelift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameSessionQueuePlayerLatencyPolicy extends js.Object {
  /**
    * Maximum latency value that is allowed for any player.
    */
  var maximumIndividualPlayerLatencyMilliseconds: Double
  /**
    * Length of time that the policy is enforced while placing a new game session. Absence of value for this attribute means that the policy is enforced until the queue times out.
    */
  var policyDurationSeconds: js.UndefOr[Double] = js.undefined
}

object GameSessionQueuePlayerLatencyPolicy {
  @scala.inline
  def apply(maximumIndividualPlayerLatencyMilliseconds: Double, policyDurationSeconds: Int | Double = null): GameSessionQueuePlayerLatencyPolicy = {
    val __obj = js.Dynamic.literal(maximumIndividualPlayerLatencyMilliseconds = maximumIndividualPlayerLatencyMilliseconds)
    if (policyDurationSeconds != null) __obj.updateDynamic("policyDurationSeconds")(policyDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSessionQueuePlayerLatencyPolicy]
  }
}

