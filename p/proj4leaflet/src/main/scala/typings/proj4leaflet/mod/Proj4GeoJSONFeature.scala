package typings.proj4leaflet.mod

import typings.geojson.mod.BBox
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.GeometryObject
import typings.proj4leaflet.AnonProperties
import typings.proj4leaflet.proj4leafletStrings.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined geojson.geojson.Feature<geojson.geojson.GeometryObject, geojson.geojson.GeoJsonProperties> & {  crs ? :{  type  :string,   properties  :{  name  :string}}} */
trait Proj4GeoJSONFeature extends js.Object {
  /**
    * Bounding box of the coordinate range of the object's Geometries, Features, or Feature Collections.
    * The value of the bbox member is an array of length 2*n where n is the number of dimensions
    * represented in the contained geometries, with all axes of the most southwesterly point
    * followed by all axes of the more northeasterly point.
    * The axes order of a bbox follows the axes order of geometries.
    * https://tools.ietf.org/html/rfc7946#section-5
    */
  var bbox: js.UndefOr[BBox] = js.undefined
  var crs: js.UndefOr[AnonProperties] = js.undefined
  /**
    * The feature's geometry
    */
  var geometry: GeometryObject
  /**
    * A value that uniquely identifies this feature in a
    * https://tools.ietf.org/html/rfc7946#section-3.2.
    */
  var id: js.UndefOr[String | Double] = js.undefined
  /**
    * Properties associated with this feature.
    */
  var properties: GeoJsonProperties
  var `type`: Feature
}

object Proj4GeoJSONFeature {
  @scala.inline
  def apply(
    geometry: GeometryObject,
    `type`: Feature,
    bbox: BBox = null,
    crs: AnonProperties = null,
    id: String | Double = null,
    properties: GeoJsonProperties = null
  ): Proj4GeoJSONFeature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proj4GeoJSONFeature]
  }
}

