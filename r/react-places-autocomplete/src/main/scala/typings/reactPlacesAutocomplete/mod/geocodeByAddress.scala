package typings.reactPlacesAutocomplete.mod

import typings.googlemaps.google.maps.GeocoderResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-places-autocomplete", "geocodeByAddress")
@js.native
object geocodeByAddress extends js.Object {
  
  def apply(address: String): js.Promise[js.Array[GeocoderResult]] = js.native
}
