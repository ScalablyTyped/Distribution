package typings.reactSimpleMaps.mod

import typings.d3Geo.mod.GeoPath_
import typings.d3Geo.mod.GeoPermissibleObjects
import typings.d3Geo.mod.GeoProjection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeographiesChildrenArgument extends js.Object {
  var geographies: js.Array[_]
  var path: GeoPath_[_, GeoPermissibleObjects]
  var projection: GeoProjection_
}

object GeographiesChildrenArgument {
  @scala.inline
  def apply(geographies: js.Array[_], path: GeoPath_[_, GeoPermissibleObjects], projection: GeoProjection_): GeographiesChildrenArgument = {
    val __obj = js.Dynamic.literal(geographies = geographies.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeographiesChildrenArgument]
  }
}

