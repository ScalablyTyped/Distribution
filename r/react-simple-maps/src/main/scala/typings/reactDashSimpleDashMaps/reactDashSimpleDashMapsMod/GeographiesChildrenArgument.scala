package typings.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import typings.d3DashGeo.d3DashGeoMod.GeoPath
import typings.d3DashGeo.d3DashGeoMod.GeoPermissibleObjects
import typings.d3DashGeo.d3DashGeoMod.GeoProjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeographiesChildrenArgument extends js.Object {
  var geographies: js.Array[js.Object]
  var path: GeoPath[_, GeoPermissibleObjects]
  var projection: GeoProjection
}

object GeographiesChildrenArgument {
  @scala.inline
  def apply(
    geographies: js.Array[js.Object],
    path: GeoPath[_, GeoPermissibleObjects],
    projection: GeoProjection
  ): GeographiesChildrenArgument = {
    val __obj = js.Dynamic.literal(geographies = geographies.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeographiesChildrenArgument]
  }
}

