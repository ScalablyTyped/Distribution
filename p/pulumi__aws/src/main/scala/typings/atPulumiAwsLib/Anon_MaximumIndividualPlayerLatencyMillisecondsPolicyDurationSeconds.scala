package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds extends js.Object {
  var maximumIndividualPlayerLatencyMilliseconds: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var policyDurationSeconds: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds {
  @scala.inline
  def apply(
    maximumIndividualPlayerLatencyMilliseconds: atPulumiPulumiLib.outputMod.Input[scala.Double],
    policyDurationSeconds: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maximumIndividualPlayerLatencyMilliseconds")(maximumIndividualPlayerLatencyMilliseconds.asInstanceOf[js.Any])
    if (policyDurationSeconds != null) __obj.updateDynamic("policyDurationSeconds")(policyDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds]
  }
}

