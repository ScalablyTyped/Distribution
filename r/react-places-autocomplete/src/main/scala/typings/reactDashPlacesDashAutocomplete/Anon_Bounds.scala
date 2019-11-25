package typings.reactDashPlacesDashAutocomplete

import typings.googlemaps.google.maps.GeocoderComponentRestrictions
import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import typings.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bounds extends js.Object {
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  var componentRestrictions: js.UndefOr[GeocoderComponentRestrictions] = js.undefined
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var offset: js.UndefOr[Double | String] = js.undefined
  var radius: js.UndefOr[Double | String] = js.undefined
  var types: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Bounds {
  @scala.inline
  def apply(
    bounds: LatLngBounds | LatLngBoundsLiteral = null,
    componentRestrictions: GeocoderComponentRestrictions = null,
    location: LatLng | LatLngLiteral = null,
    offset: Double | String = null,
    radius: Double | String = null,
    types: js.Array[String] = null
  ): Anon_Bounds = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (componentRestrictions != null) __obj.updateDynamic("componentRestrictions")(componentRestrictions.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bounds]
  }
}

