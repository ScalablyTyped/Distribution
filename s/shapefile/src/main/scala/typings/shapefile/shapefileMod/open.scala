package typings.shapefile.shapefileMod

import typings.geojson.geojsonMod.Feature
import typings.geojson.geojsonMod.GeoJsonProperties
import typings.geojson.geojsonMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shapefile", "open")
@js.native
object open extends js.Object {
  def apply(shp: Openable): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = js.native
  def apply(shp: Openable, dbf: Openable): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = js.native
  def apply(shp: Openable, dbf: Openable, options: Options): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = js.native
}

