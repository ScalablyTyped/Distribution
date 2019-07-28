package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxCapacityMinCapacity extends js.Object {
  var maxCapacity: js.UndefOr[Input[Double]] = js.undefined
  var minCapacity: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_MaxCapacityMinCapacity {
  @scala.inline
  def apply(maxCapacity: Input[Double] = null, minCapacity: Input[Double] = null): Anon_MaxCapacityMinCapacity = {
    val __obj = js.Dynamic.literal()
    if (maxCapacity != null) __obj.updateDynamic("maxCapacity")(maxCapacity.asInstanceOf[js.Any])
    if (minCapacity != null) __obj.updateDynamic("minCapacity")(minCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxCapacityMinCapacity]
  }
}

