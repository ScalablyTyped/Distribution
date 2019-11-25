package typings.reactDashMapDashGl.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewState extends js.Object {
  var altitude: js.UndefOr[Double] = js.undefined
  var bearing: js.UndefOr[Double] = js.undefined
  var latitude: Double
  var longitude: Double
  var pitch: js.UndefOr[Double] = js.undefined
  var zoom: Double
}

object ViewState {
  @scala.inline
  def apply(
    latitude: Double,
    longitude: Double,
    zoom: Double,
    altitude: Int | Double = null,
    bearing: Int | Double = null,
    pitch: Int | Double = null
  ): ViewState = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewState]
  }
}

