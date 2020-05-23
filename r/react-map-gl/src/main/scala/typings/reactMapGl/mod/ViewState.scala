package typings.reactMapGl.mod

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
    altitude: js.UndefOr[Double] = js.undefined,
    bearing: js.UndefOr[Double] = js.undefined,
    pitch: js.UndefOr[Double] = js.undefined
  ): ViewState = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bearing)) __obj.updateDynamic("bearing")(bearing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewState]
  }
}

