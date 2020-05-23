package typings.reactMapGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxPitch extends js.Object {
  var maxPitch: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minPitch: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
}

object MaxPitch {
  @scala.inline
  def apply(
    maxPitch: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minPitch: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined
  ): MaxPitch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxPitch)) __obj.updateDynamic("maxPitch")(maxPitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPitch)) __obj.updateDynamic("minPitch")(minPitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxPitch]
  }
}

