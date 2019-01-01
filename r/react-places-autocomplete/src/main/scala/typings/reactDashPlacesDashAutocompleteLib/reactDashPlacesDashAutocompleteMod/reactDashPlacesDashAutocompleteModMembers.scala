package typings
package reactDashPlacesDashAutocompleteLib.reactDashPlacesDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-places-autocomplete", JSImport.Namespace)
@js.native
object reactDashPlacesDashAutocompleteModMembers extends js.Object {
  def geocodeByAddress(address: java.lang.String): js.Promise[js.Array[googlemapsLib.googleNs.mapsNs.GeocoderResult]] = js.native
  def geocodeByPlaceId(placeId: java.lang.String): js.Promise[js.Array[googlemapsLib.googleNs.mapsNs.GeocoderResult]] = js.native
  def getLatLng(results: googlemapsLib.googleNs.mapsNs.GeocoderResult): js.Promise[googlemapsLib.googleNs.mapsNs.LatLngLiteral] = js.native
}

