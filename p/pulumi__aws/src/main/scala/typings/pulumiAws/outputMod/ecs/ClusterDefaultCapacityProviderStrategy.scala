package typings.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterDefaultCapacityProviderStrategy extends js.Object {
  var base: js.UndefOr[Double] = js.native
  var capacityProvider: String = js.native
  var weight: js.UndefOr[Double] = js.native
}

object ClusterDefaultCapacityProviderStrategy {
  @scala.inline
  def apply(
    capacityProvider: String,
    base: js.UndefOr[Double] = js.undefined,
    weight: js.UndefOr[Double] = js.undefined
  ): ClusterDefaultCapacityProviderStrategy = {
    val __obj = js.Dynamic.literal(capacityProvider = capacityProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(base)) __obj.updateDynamic("base")(base.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterDefaultCapacityProviderStrategy]
  }
}

