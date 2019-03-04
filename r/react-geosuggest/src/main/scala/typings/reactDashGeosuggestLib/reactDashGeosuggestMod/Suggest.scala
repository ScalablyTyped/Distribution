package typings
package reactDashGeosuggestLib.reactDashGeosuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suggest extends js.Object {
  var gmaps: js.UndefOr[googlemapsLib.googleNs.mapsNs.GeocoderResult] = js.undefined
  var label: java.lang.String
  var location: reactDashGeosuggestLib.Anon_Lat
  var placeId: java.lang.String
}

object Suggest {
  @scala.inline
  def apply(
    label: java.lang.String,
    location: reactDashGeosuggestLib.Anon_Lat,
    placeId: java.lang.String,
    gmaps: googlemapsLib.googleNs.mapsNs.GeocoderResult = null
  ): Suggest = {
    val __obj = js.Dynamic.literal(label = label, location = location, placeId = placeId)
    if (gmaps != null) __obj.updateDynamic("gmaps")(gmaps)
    __obj.asInstanceOf[Suggest]
  }
}

