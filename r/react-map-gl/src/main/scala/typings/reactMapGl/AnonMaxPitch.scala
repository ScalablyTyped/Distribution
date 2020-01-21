package typings.reactMapGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxPitch extends js.Object {
  var maxPitch: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minPitch: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
}

object AnonMaxPitch {
  @scala.inline
  def apply(
    maxPitch: Int | Double = null,
    maxZoom: Int | Double = null,
    minPitch: Int | Double = null,
    minZoom: Int | Double = null
  ): AnonMaxPitch = {
    val __obj = js.Dynamic.literal()
    if (maxPitch != null) __obj.updateDynamic("maxPitch")(maxPitch.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minPitch != null) __obj.updateDynamic("minPitch")(minPitch.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxPitch]
  }
}

