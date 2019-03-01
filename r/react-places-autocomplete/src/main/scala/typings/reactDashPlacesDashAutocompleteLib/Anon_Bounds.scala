package typings
package reactDashPlacesDashAutocompleteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bounds extends js.Object {
  var bounds: js.UndefOr[
    googlemapsLib.googleNs.mapsNs.LatLngBounds | googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral
  ] = js.undefined
  var componentRestrictions: js.UndefOr[googlemapsLib.googleNs.mapsNs.GeocoderComponentRestrictions] = js.undefined
  var location: js.UndefOr[
    googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral
  ] = js.undefined
  var offset: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var radius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Bounds {
  @scala.inline
  def apply(
    bounds: googlemapsLib.googleNs.mapsNs.LatLngBounds | googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral = null,
    componentRestrictions: googlemapsLib.googleNs.mapsNs.GeocoderComponentRestrictions = null,
    location: googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral = null,
    offset: scala.Double | java.lang.String = null,
    radius: scala.Double | java.lang.String = null,
    types: js.Array[java.lang.String] = null
  ): Anon_Bounds = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (componentRestrictions != null) __obj.updateDynamic("componentRestrictions")(componentRestrictions)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[Anon_Bounds]
  }
}

