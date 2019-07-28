package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IntervalPercentage extends js.Object {
  var interval: js.UndefOr[Input[Double]] = js.undefined
  var percentage: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_IntervalPercentage {
  @scala.inline
  def apply(interval: Input[Double] = null, percentage: Input[Double] = null): Anon_IntervalPercentage = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IntervalPercentage]
  }
}

