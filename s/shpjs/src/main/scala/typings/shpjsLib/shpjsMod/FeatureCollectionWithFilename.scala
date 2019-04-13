package typings
package shpjsLib.shpjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureCollectionWithFilename
  extends geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties] {
  var fileName: js.UndefOr[java.lang.String] = js.undefined
}

object FeatureCollectionWithFilename {
  @scala.inline
  def apply(
    features: js.Array[
      geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
    ],
    `type`: geojsonLib.geojsonMod.GeoJsonTypes,
    type_FeatureCollection: geojsonLib.geojsonLibStrings.FeatureCollection,
    bbox: geojsonLib.geojsonMod.BBox = null,
    fileName: java.lang.String = null
  ): FeatureCollectionWithFilename = {
    val __obj = js.Dynamic.literal(features = features)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(type_FeatureCollection)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    __obj.asInstanceOf[FeatureCollectionWithFilename]
  }
}

