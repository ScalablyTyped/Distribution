package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CpuCreditsString extends js.Object {
  var cpuCredits: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CpuCreditsString {
  @scala.inline
  def apply(cpuCredits: java.lang.String = null): Anon_CpuCreditsString = {
    val __obj = js.Dynamic.literal()
    if (cpuCredits != null) __obj.updateDynamic("cpuCredits")(cpuCredits)
    __obj.asInstanceOf[Anon_CpuCreditsString]
  }
}

