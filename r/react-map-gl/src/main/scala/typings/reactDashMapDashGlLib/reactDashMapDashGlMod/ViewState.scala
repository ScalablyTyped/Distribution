package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewState extends js.Object {
  var altitude: js.UndefOr[scala.Double] = js.undefined
  var bearing: js.UndefOr[scala.Double] = js.undefined
  var latitude: scala.Double
  var longitude: scala.Double
  var pitch: js.UndefOr[scala.Double] = js.undefined
  var zoom: scala.Double
}

object ViewState {
  @scala.inline
  def apply(
    latitude: scala.Double,
    longitude: scala.Double,
    zoom: scala.Double,
    altitude: scala.Int | scala.Double = null,
    bearing: scala.Int | scala.Double = null,
    pitch: scala.Int | scala.Double = null
  ): ViewState = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude, zoom = zoom)
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewState]
  }
}

