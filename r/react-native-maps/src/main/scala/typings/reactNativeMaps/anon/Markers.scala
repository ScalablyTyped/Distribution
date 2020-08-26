package typings.reactNativeMaps.anon

import typings.reactNativeMaps.mod.KmlMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Markers extends js.Object {
  var markers: js.Array[KmlMarker] = js.native
}

object Markers {
  @scala.inline
  def apply(markers: js.Array[KmlMarker]): Markers = {
    val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Markers]
  }
  @scala.inline
  implicit class MarkersOps[Self <: Markers] (val x: Self) extends AnyVal {
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
    def setMarkersVarargs(value: KmlMarker*): Self = this.set("markers", js.Array(value :_*))
    @scala.inline
    def setMarkers(value: js.Array[KmlMarker]): Self = this.set("markers", value.asInstanceOf[js.Any])
  }
  
}

