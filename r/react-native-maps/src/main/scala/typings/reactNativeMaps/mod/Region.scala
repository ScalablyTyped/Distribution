package typings.reactNativeMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Region extends js.Object {
  var latitude: Double = js.native
  var latitudeDelta: Double = js.native
  var longitude: Double = js.native
  var longitudeDelta: Double = js.native
}

object Region {
  @scala.inline
  def apply(latitude: Double, latitudeDelta: Double, longitude: Double, longitudeDelta: Double): Region = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], latitudeDelta = latitudeDelta.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], longitudeDelta = longitudeDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  @scala.inline
  implicit class RegionOps[Self <: Region] (val x: Self) extends AnyVal {
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
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatitudeDelta(value: Double): Self = this.set("latitudeDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitudeDelta(value: Double): Self = this.set("longitudeDelta", value.asInstanceOf[js.Any])
  }
  
}

