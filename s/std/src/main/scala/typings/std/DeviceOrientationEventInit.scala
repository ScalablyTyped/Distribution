package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceOrientationEventInit extends EventInit {
  var absolute: js.UndefOr[scala.Boolean] = js.undefined
  var alpha: js.UndefOr[Double | Null] = js.undefined
  var beta: js.UndefOr[Double | Null] = js.undefined
  var gamma: js.UndefOr[Double | Null] = js.undefined
}

object DeviceOrientationEventInit {
  @scala.inline
  def apply(
    absolute: js.UndefOr[scala.Boolean] = js.undefined,
    alpha: js.UndefOr[Null | Double] = js.undefined,
    beta: js.UndefOr[Null | Double] = js.undefined,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    gamma: js.UndefOr[Null | Double] = js.undefined
  ): DeviceOrientationEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (!js.isUndefined(beta)) __obj.updateDynamic("beta")(beta.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gamma)) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceOrientationEventInit]
  }
}

