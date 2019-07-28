package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttemptsInput extends js.Object {
  var attempts: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_AttemptsInput {
  @scala.inline
  def apply(attempts: Input[Double] = null): Anon_AttemptsInput = {
    val __obj = js.Dynamic.literal()
    if (attempts != null) __obj.updateDynamic("attempts")(attempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttemptsInput]
  }
}

