package typings.reactGeosuggest.mod

import typings.googlemaps.google.maps.GeocoderResult
import typings.reactGeosuggest.anon.Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suggest extends js.Object {
  var gmaps: js.UndefOr[GeocoderResult] = js.native
  var label: String = js.native
  var location: Lat = js.native
  var placeId: String = js.native
}

object Suggest {
  @scala.inline
  def apply(label: String, location: Lat, placeId: String): Suggest = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggest]
  }
  @scala.inline
  implicit class SuggestOps[Self <: Suggest] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Lat): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceId(value: String): Self = this.set("placeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGmaps(value: GeocoderResult): Self = this.set("gmaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmaps: Self = this.set("gmaps", js.undefined)
  }
  
}

