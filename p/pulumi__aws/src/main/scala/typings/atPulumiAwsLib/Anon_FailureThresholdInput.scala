package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailureThresholdInput extends js.Object {
  var failureThreshold: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_FailureThresholdInput {
  @scala.inline
  def apply(failureThreshold: atPulumiPulumiLib.outputMod.Input[scala.Double] = null): Anon_FailureThresholdInput = {
    val __obj = js.Dynamic.literal()
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FailureThresholdInput]
  }
}

