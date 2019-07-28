package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IntervalIntervalUnitTimes extends js.Object {
  var interval: Input[Double]
  var intervalUnit: js.UndefOr[Input[String]] = js.undefined
  var times: js.UndefOr[Input[String]] = js.undefined
}

object Anon_IntervalIntervalUnitTimes {
  @scala.inline
  def apply(interval: Input[Double], intervalUnit: Input[String] = null, times: Input[String] = null): Anon_IntervalIntervalUnitTimes = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    if (intervalUnit != null) __obj.updateDynamic("intervalUnit")(intervalUnit.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IntervalIntervalUnitTimes]
  }
}

