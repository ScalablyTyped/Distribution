package typings.reactNativeMaps.anon

import typings.reactNativeMaps.mod.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NorthEast extends js.Object {
  var northEast: LatLng = js.native
  var southWest: LatLng = js.native
}

object NorthEast {
  @scala.inline
  def apply(northEast: LatLng, southWest: LatLng): NorthEast = {
    val __obj = js.Dynamic.literal(northEast = northEast.asInstanceOf[js.Any], southWest = southWest.asInstanceOf[js.Any])
    __obj.asInstanceOf[NorthEast]
  }
  @scala.inline
  implicit class NorthEastOps[Self <: NorthEast] (val x: Self) extends AnyVal {
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
    def setNorthEast(value: LatLng): Self = this.set("northEast", value.asInstanceOf[js.Any])
    @scala.inline
    def setSouthWest(value: LatLng): Self = this.set("southWest", value.asInstanceOf[js.Any])
  }
  
}

