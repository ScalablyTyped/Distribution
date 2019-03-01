package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxConcurrentRunsInput extends js.Object {
  var maxConcurrentRuns: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_MaxConcurrentRunsInput {
  @scala.inline
  def apply(maxConcurrentRuns: atPulumiPulumiLib.outputMod.Input[scala.Double] = null): Anon_MaxConcurrentRunsInput = {
    val __obj = js.Dynamic.literal()
    if (maxConcurrentRuns != null) __obj.updateDynamic("maxConcurrentRuns")(maxConcurrentRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxConcurrentRunsInput]
  }
}

