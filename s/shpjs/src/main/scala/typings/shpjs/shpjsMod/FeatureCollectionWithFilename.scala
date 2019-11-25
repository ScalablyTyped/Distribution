package typings.shpjs.shpjsMod

import typings.geojson.geojsonMod.BBox
import typings.geojson.geojsonMod.Feature
import typings.geojson.geojsonMod.FeatureCollection
import typings.geojson.geojsonMod.GeoJsonProperties
import typings.geojson.geojsonMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureCollectionWithFilename extends FeatureCollection[Geometry, GeoJsonProperties] {
  var fileName: js.UndefOr[String] = js.undefined
}

object FeatureCollectionWithFilename {
  @scala.inline
  def apply(
    features: js.Array[Feature[Geometry, GeoJsonProperties]],
    `type`: typings.geojson.geojsonStrings.FeatureCollection,
    bbox: BBox = null,
    fileName: String = null
  ): FeatureCollectionWithFilename = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureCollectionWithFilename]
  }
}

