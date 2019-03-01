package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CpuCreditsInput extends js.Object {
  var cpuCredits: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_CpuCreditsInput {
  @scala.inline
  def apply(cpuCredits: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): Anon_CpuCreditsInput = {
    val __obj = js.Dynamic.literal()
    if (cpuCredits != null) __obj.updateDynamic("cpuCredits")(cpuCredits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CpuCreditsInput]
  }
}

