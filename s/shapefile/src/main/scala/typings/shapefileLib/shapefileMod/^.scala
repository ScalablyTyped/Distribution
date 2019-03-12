package typings
package shapefileLib.shapefileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shapefile", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def open(shp: Openable): js.Promise[
    Source[
      geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
    ]
  ] = js.native
  def open(shp: Openable, dbf: Openable): js.Promise[
    Source[
      geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
    ]
  ] = js.native
  def open(shp: Openable, dbf: Openable, options: Options): js.Promise[
    Source[
      geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
    ]
  ] = js.native
  def openDbf(source: Openable): js.Promise[Source[geojsonLib.geojsonMod.GeoJsonProperties]] = js.native
  def openDbf(source: Openable, options: Options): js.Promise[Source[geojsonLib.geojsonMod.GeoJsonProperties]] = js.native
  def openShp(source: Openable): js.Promise[Source[geojsonLib.geojsonMod.GeometryObject]] = js.native
  def openShp(source: Openable, options: Options): js.Promise[Source[geojsonLib.geojsonMod.GeometryObject]] = js.native
  def read(shp: Openable): js.Promise[
    geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
  ] = js.native
  def read(shp: Openable, dbf: Openable): js.Promise[
    geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
  ] = js.native
  def read(shp: Openable, dbf: Openable, options: Options): js.Promise[
    geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
  ] = js.native
}

