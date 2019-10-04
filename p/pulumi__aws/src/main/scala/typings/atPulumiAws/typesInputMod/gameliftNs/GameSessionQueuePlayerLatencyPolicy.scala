package typings.atPulumiAws.typesInputMod.gameliftNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameSessionQueuePlayerLatencyPolicy extends js.Object {
  /**
    * Maximum latency value that is allowed for any player.
    */
  var maximumIndividualPlayerLatencyMilliseconds: Input[Double]
  /**
    * Length of time that the policy is enforced while placing a new game session. Absence of value for this attribute means that the policy is enforced until the queue times out.
    */
  var policyDurationSeconds: js.UndefOr[Input[Double]] = js.undefined
}

object GameSessionQueuePlayerLatencyPolicy {
  @scala.inline
  def apply(
    maximumIndividualPlayerLatencyMilliseconds: Input[Double],
    policyDurationSeconds: Input[Double] = null
  ): GameSessionQueuePlayerLatencyPolicy = {
    val __obj = js.Dynamic.literal(maximumIndividualPlayerLatencyMilliseconds = maximumIndividualPlayerLatencyMilliseconds.asInstanceOf[js.Any])
    if (policyDurationSeconds != null) __obj.updateDynamic("policyDurationSeconds")(policyDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSessionQueuePlayerLatencyPolicy]
  }
}

