package typings.reactSimpleMaps.mod

import typings.d3Geo.mod.GeoPath_
import typings.d3Geo.mod.GeoPermissibleObjects
import typings.d3Geo.mod.GeoProjection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeographiesChildrenArgument extends js.Object {
  var geographies: js.Array[_] = js.native
  var path: GeoPath_[_, GeoPermissibleObjects] = js.native
  var projection: GeoProjection_ = js.native
}

object GeographiesChildrenArgument {
  @scala.inline
  def apply(geographies: js.Array[_], path: GeoPath_[_, GeoPermissibleObjects], projection: GeoProjection_): GeographiesChildrenArgument = {
    val __obj = js.Dynamic.literal(geographies = geographies.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeographiesChildrenArgument]
  }
  @scala.inline
  implicit class GeographiesChildrenArgumentOps[Self <: GeographiesChildrenArgument] (val x: Self) extends AnyVal {
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
    def setGeographiesVarargs(value: js.Any*): Self = this.set("geographies", js.Array(value :_*))
    @scala.inline
    def setGeographies(value: js.Array[_]): Self = this.set("geographies", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: GeoPath_[_, GeoPermissibleObjects]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjection(value: GeoProjection_): Self = this.set("projection", value.asInstanceOf[js.Any])
  }
  
}

