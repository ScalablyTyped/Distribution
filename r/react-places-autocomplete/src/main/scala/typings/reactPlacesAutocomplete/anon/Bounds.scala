package typings.reactPlacesAutocomplete.anon

import typings.googlemaps.google.maps.GeocoderComponentRestrictions
import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import typings.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounds extends js.Object {
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.native
  var componentRestrictions: js.UndefOr[GeocoderComponentRestrictions] = js.native
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.native
  var offset: js.UndefOr[Double | String] = js.native
  var radius: js.UndefOr[Double | String] = js.native
  var sessionToken: js.UndefOr[js.Any] = js.native
  var types: js.UndefOr[js.Array[String]] = js.native
}

object Bounds {
  @scala.inline
  def apply(): Bounds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bounds]
  }
  @scala.inline
  implicit class BoundsOps[Self <: Bounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setComponentRestrictions(value: GeocoderComponentRestrictions): Self = this.set("componentRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRestrictions: Self = this.set("componentRestrictions", js.undefined)
    @scala.inline
    def setLocation(value: LatLng | LatLngLiteral): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setOffset(value: Double | String): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setRadius(value: Double | String): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setSessionToken(value: js.Any): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionToken: Self = this.set("sessionToken", js.undefined)
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

