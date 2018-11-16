package typings
package reactDashPlacesDashAutocompleteLib.reactDashPlacesDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-places-autocomplete", JSImport.Namespace)
@js.native
object reactDashPlacesDashAutocompleteModMembers extends js.Object {
  def geocodeByAddress(address: java.lang.String): stdLib.Promise[js.Array[googlemapsLib.googleNs.mapsNs.GeocoderResult]] = js.native
  def geocodeByAddress(
    address: java.lang.String,
    callback: js.Function2[
      /* results */ js.Array[googlemapsLib.googleNs.mapsNs.GeocoderResult], 
      /* status */ googlemapsLib.googleNs.mapsNs.GeocoderStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def geocodeByPlaceId(placeId: java.lang.String): stdLib.Promise[js.Array[googlemapsLib.googleNs.mapsNs.GeocoderResult]] = js.native
  def geocodeByPlaceId(
    placeId: java.lang.String,
    callback: js.Function2[
      /* results */ js.Array[googlemapsLib.googleNs.mapsNs.GeocoderResult], 
      /* status */ googlemapsLib.googleNs.mapsNs.GeocoderStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getLatLng(results: googlemapsLib.googleNs.mapsNs.GeocoderResult): stdLib.Promise[googlemapsLib.googleNs.mapsNs.LatLngLiteral] = js.native
}

