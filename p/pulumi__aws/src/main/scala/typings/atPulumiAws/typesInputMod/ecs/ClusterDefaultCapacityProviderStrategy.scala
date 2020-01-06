package typings.atPulumiAws.typesInputMod.ecs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterDefaultCapacityProviderStrategy extends js.Object {
  var base: js.UndefOr[Input[Double]] = js.native
  var capacityProvider: Input[String] = js.native
  var weight: js.UndefOr[Input[Double]] = js.native
}

object ClusterDefaultCapacityProviderStrategy {
  @scala.inline
  def apply(capacityProvider: Input[String], base: Input[Double] = null, weight: Input[Double] = null): ClusterDefaultCapacityProviderStrategy = {
    val __obj = js.Dynamic.literal(capacityProvider = capacityProvider.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterDefaultCapacityProviderStrategy]
  }
}

