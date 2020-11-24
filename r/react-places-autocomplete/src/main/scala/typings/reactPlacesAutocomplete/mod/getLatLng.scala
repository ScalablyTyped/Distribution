package typings.reactPlacesAutocomplete.mod

import typings.googlemaps.google.maps.GeocoderResult
import typings.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-places-autocomplete", "getLatLng")
@js.native
object getLatLng extends js.Object {
  
  def apply(results: GeocoderResult): js.Promise[LatLngLiteral] = js.native
}
