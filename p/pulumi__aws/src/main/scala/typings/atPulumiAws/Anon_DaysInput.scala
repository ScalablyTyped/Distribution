package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DaysInput extends js.Object {
  var days: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_DaysInput {
  @scala.inline
  def apply(days: Input[Double] = null): Anon_DaysInput = {
    val __obj = js.Dynamic.literal()
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DaysInput]
  }
}

