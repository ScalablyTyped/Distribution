package typings.pulumiAws.inputMod.batch

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDefinitionTimeout extends js.Object {
  var attemptDurationSeconds: js.UndefOr[Input[Double]] = js.native
}

object JobDefinitionTimeout {
  @scala.inline
  def apply(attemptDurationSeconds: Input[Double] = null): JobDefinitionTimeout = {
    val __obj = js.Dynamic.literal()
    if (attemptDurationSeconds != null) __obj.updateDynamic("attemptDurationSeconds")(attemptDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDefinitionTimeout]
  }
}

