package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxValueMinValue extends js.Object {
  var maxValue: js.UndefOr[Input[String]] = js.undefined
  var minValue: js.UndefOr[Input[String]] = js.undefined
}

object Anon_MaxValueMinValue {
  @scala.inline
  def apply(maxValue: Input[String] = null, minValue: Input[String] = null): Anon_MaxValueMinValue = {
    val __obj = js.Dynamic.literal()
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxValueMinValue]
  }
}

