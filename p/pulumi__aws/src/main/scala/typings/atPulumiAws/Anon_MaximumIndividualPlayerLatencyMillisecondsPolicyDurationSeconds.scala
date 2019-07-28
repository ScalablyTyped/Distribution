package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds extends js.Object {
  var maximumIndividualPlayerLatencyMilliseconds: Input[Double]
  var policyDurationSeconds: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds {
  @scala.inline
  def apply(
    maximumIndividualPlayerLatencyMilliseconds: Input[Double],
    policyDurationSeconds: Input[Double] = null
  ): Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds = {
    val __obj = js.Dynamic.literal(maximumIndividualPlayerLatencyMilliseconds = maximumIndividualPlayerLatencyMilliseconds.asInstanceOf[js.Any])
    if (policyDurationSeconds != null) __obj.updateDynamic("policyDurationSeconds")(policyDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds]
  }
}

