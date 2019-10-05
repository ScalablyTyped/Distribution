package typings.reactDashGeosuggest.reactDashGeosuggestMod

import typings.googlemaps.google.maps.GeocoderResult
import typings.reactDashGeosuggest.Anon_Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suggest extends js.Object {
  var gmaps: js.UndefOr[GeocoderResult] = js.undefined
  var label: String
  var location: Anon_Lat
  var placeId: String
}

object Suggest {
  @scala.inline
  def apply(label: String, location: Anon_Lat, placeId: String, gmaps: GeocoderResult = null): Suggest = {
    val __obj = js.Dynamic.literal(label = label, location = location, placeId = placeId)
    if (gmaps != null) __obj.updateDynamic("gmaps")(gmaps)
    __obj.asInstanceOf[Suggest]
  }
}

