package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DaysModeYears extends js.Object {
  var days: js.UndefOr[Input[Double]] = js.undefined
  var mode: Input[String]
  var years: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_DaysModeYears {
  @scala.inline
  def apply(mode: Input[String], days: Input[Double] = null, years: Input[Double] = null): Anon_DaysModeYears = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DaysModeYears]
  }
}

