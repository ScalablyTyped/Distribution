package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceCapacityProviderStrategy extends js.Object {
  var base: js.UndefOr[Input[Double]] = js.native
  var capacityProvider: Input[String] = js.native
  var weight: js.UndefOr[Input[Double]] = js.native
}

object ServiceCapacityProviderStrategy {
  @scala.inline
  def apply(capacityProvider: Input[String], base: Input[Double] = null, weight: Input[Double] = null): ServiceCapacityProviderStrategy = {
    val __obj = js.Dynamic.literal(capacityProvider = capacityProvider.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceCapacityProviderStrategy]
  }
}

