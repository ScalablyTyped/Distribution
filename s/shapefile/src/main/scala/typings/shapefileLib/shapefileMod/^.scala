package typings
package shapefileLib.shapefileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shapefile", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def open(shp: shapefileLib.shapefileMod.Openable): js.Promise[
    shapefileLib.shapefileMod.Source[
      geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
    ]
  ] = js.native
  def open(shp: shapefileLib.shapefileMod.Openable, dbf: shapefileLib.shapefileMod.Openable): js.Promise[
    shapefileLib.shapefileMod.Source[
      geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
    ]
  ] = js.native
  def open(
    shp: shapefileLib.shapefileMod.Openable,
    dbf: shapefileLib.shapefileMod.Openable,
    options: shapefileLib.shapefileMod.Options
  ): js.Promise[
    shapefileLib.shapefileMod.Source[
      geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
    ]
  ] = js.native
  def openDbf(source: shapefileLib.shapefileMod.Openable): js.Promise[shapefileLib.shapefileMod.Source[geojsonLib.geojsonMod.GeoJsonProperties]] = js.native
  def openDbf(source: shapefileLib.shapefileMod.Openable, options: shapefileLib.shapefileMod.Options): js.Promise[shapefileLib.shapefileMod.Source[geojsonLib.geojsonMod.GeoJsonProperties]] = js.native
  def openShp(source: shapefileLib.shapefileMod.Openable): js.Promise[shapefileLib.shapefileMod.Source[geojsonLib.geojsonMod.GeometryObject]] = js.native
  def openShp(source: shapefileLib.shapefileMod.Openable, options: shapefileLib.shapefileMod.Options): js.Promise[shapefileLib.shapefileMod.Source[geojsonLib.geojsonMod.GeometryObject]] = js.native
  def read(shp: shapefileLib.shapefileMod.Openable): js.Promise[
    geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
  ] = js.native
  def read(shp: shapefileLib.shapefileMod.Openable, dbf: shapefileLib.shapefileMod.Openable): js.Promise[
    geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
  ] = js.native
  def read(
    shp: shapefileLib.shapefileMod.Openable,
    dbf: shapefileLib.shapefileMod.Openable,
    options: shapefileLib.shapefileMod.Options
  ): js.Promise[
    geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
  ] = js.native
}

