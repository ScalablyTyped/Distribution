package typings
package shpjsLib.shpjsMod.shpjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShpJS extends js.Object {
  def apply(base: java.lang.String): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def apply(base: java.lang.String, whiteList: js.Array[java.lang.String]): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def apply(base: ShpJSBuffer): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def apply(base: ShpJSBuffer, whiteList: js.Array[java.lang.String]): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def combine(
    arr: js.Tuple2[
      js.Array[geojsonLib.geojsonMod.Geometry], 
      js.Array[geojsonLib.geojsonMod.GeoJsonProperties]
    ]
  ): geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties] = js.native
  def getShapeFile(base: java.lang.String): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def getShapeFile(base: java.lang.String, whiteList: js.Array[java.lang.String]): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def getShapeFile(base: ShpJSBuffer): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def getShapeFile(base: ShpJSBuffer, whiteList: js.Array[java.lang.String]): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def parseDbf(dbf: ShpJSBuffer, cpg: ShpJSBuffer): js.Array[geojsonLib.geojsonMod.GeoJsonProperties] = js.native
  def parseShp(shp: ShpJSBuffer, prj: java.lang.String): js.Array[geojsonLib.geojsonMod.Geometry] = js.native
  def parseShp(shp: ShpJSBuffer, prj: nodeLib.Buffer): js.Array[geojsonLib.geojsonMod.Geometry] = js.native
  def parseZip(buffer: ShpJSBuffer): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def parseZip(buffer: ShpJSBuffer, whiteList: js.Array[java.lang.String]): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
}

