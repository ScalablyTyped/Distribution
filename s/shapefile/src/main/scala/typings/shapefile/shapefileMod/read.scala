package typings.shapefile.shapefileMod

import typings.geojson.geojsonMod.FeatureCollection
import typings.geojson.geojsonMod.GeoJsonProperties
import typings.geojson.geojsonMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shapefile", "read")
@js.native
object read extends js.Object {
  def apply(shp: Openable): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = js.native
  def apply(shp: Openable, dbf: Openable): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = js.native
  def apply(shp: Openable, dbf: Openable, options: Options): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = js.native
}

