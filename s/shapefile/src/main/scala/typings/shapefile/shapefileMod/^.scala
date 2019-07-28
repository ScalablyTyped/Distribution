package typings.shapefile.shapefileMod

import typings.geojson.geojsonMod.Feature
import typings.geojson.geojsonMod.FeatureCollection
import typings.geojson.geojsonMod.GeoJsonProperties
import typings.geojson.geojsonMod.Geometry
import typings.geojson.geojsonMod.GeometryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shapefile", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def open(shp: Openable): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = js.native
  def open(shp: Openable, dbf: Openable): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = js.native
  def open(shp: Openable, dbf: Openable, options: Options): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = js.native
  def openDbf(source: Openable): js.Promise[Source[GeoJsonProperties]] = js.native
  def openDbf(source: Openable, options: Options): js.Promise[Source[GeoJsonProperties]] = js.native
  def openShp(source: Openable): js.Promise[Source[GeometryObject]] = js.native
  def openShp(source: Openable, options: Options): js.Promise[Source[GeometryObject]] = js.native
  def read(shp: Openable): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = js.native
  def read(shp: Openable, dbf: Openable): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = js.native
  def read(shp: Openable, dbf: Openable, options: Options): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = js.native
}

