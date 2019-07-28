package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaximumIndividualPlayerLatencyMilliseconds extends js.Object {
  var maximumIndividualPlayerLatencyMilliseconds: Double
  var policyDurationSeconds: js.UndefOr[Double] = js.undefined
}

object Anon_MaximumIndividualPlayerLatencyMilliseconds {
  @scala.inline
  def apply(maximumIndividualPlayerLatencyMilliseconds: Double, policyDurationSeconds: Int | Double = null): Anon_MaximumIndividualPlayerLatencyMilliseconds = {
    val __obj = js.Dynamic.literal(maximumIndividualPlayerLatencyMilliseconds = maximumIndividualPlayerLatencyMilliseconds)
    if (policyDurationSeconds != null) __obj.updateDynamic("policyDurationSeconds")(policyDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaximumIndividualPlayerLatencyMilliseconds]
  }
}

