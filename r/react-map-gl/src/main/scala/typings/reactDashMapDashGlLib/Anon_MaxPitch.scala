package typings
package reactDashMapDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxPitch extends js.Object {
  var maxPitch: js.UndefOr[scala.Double] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minPitch: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
}

object Anon_MaxPitch {
  @scala.inline
  def apply(
    maxPitch: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minPitch: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null
  ): Anon_MaxPitch = {
    val __obj = js.Dynamic.literal()
    if (maxPitch != null) __obj.updateDynamic("maxPitch")(maxPitch.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minPitch != null) __obj.updateDynamic("minPitch")(minPitch.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxPitch]
  }
}

