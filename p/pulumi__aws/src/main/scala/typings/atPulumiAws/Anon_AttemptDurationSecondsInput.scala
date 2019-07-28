package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttemptDurationSecondsInput extends js.Object {
  var attemptDurationSeconds: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_AttemptDurationSecondsInput {
  @scala.inline
  def apply(attemptDurationSeconds: Input[Double] = null): Anon_AttemptDurationSecondsInput = {
    val __obj = js.Dynamic.literal()
    if (attemptDurationSeconds != null) __obj.updateDynamic("attemptDurationSeconds")(attemptDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttemptDurationSecondsInput]
  }
}

