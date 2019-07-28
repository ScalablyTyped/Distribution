package typings.reactDashPlacesDashAutocomplete.reactDashPlacesDashAutocompleteMod

import typings.googlemaps.googleNs.mapsNs.GeocoderResult
import typings.googlemaps.googleNs.mapsNs.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-places-autocomplete", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def geocodeByAddress(address: String): js.Promise[js.Array[GeocoderResult]] = js.native
  def geocodeByPlaceId(placeId: String): js.Promise[js.Array[GeocoderResult]] = js.native
  def getLatLng(results: GeocoderResult): js.Promise[LatLngLiteral] = js.native
}

