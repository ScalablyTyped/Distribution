package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeliveryFrequencyInput extends js.Object {
  var deliveryFrequency: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DeliveryFrequencyInput {
  @scala.inline
  def apply(deliveryFrequency: Input[String] = null): Anon_DeliveryFrequencyInput = {
    val __obj = js.Dynamic.literal()
    if (deliveryFrequency != null) __obj.updateDynamic("deliveryFrequency")(deliveryFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeliveryFrequencyInput]
  }
}

