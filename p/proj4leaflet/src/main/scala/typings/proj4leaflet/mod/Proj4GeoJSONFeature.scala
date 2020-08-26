package typings.proj4leaflet.mod

import typings.geojson.mod.BBox
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.GeometryObject
import typings.proj4leaflet.anon.Properties
import typings.proj4leaflet.proj4leafletStrings.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined geojson.geojson.Feature<geojson.geojson.GeometryObject, geojson.geojson.GeoJsonProperties> & {  crs :{  type :string,   properties :{  name :string}} | undefined} */
@js.native
trait Proj4GeoJSONFeature extends js.Object {
  /**
    * Bounding box of the coordinate range of the object's Geometries, Features, or Feature Collections.
    * The value of the bbox member is an array of length 2*n where n is the number of dimensions
    * represented in the contained geometries, with all axes of the most southwesterly point
    * followed by all axes of the more northeasterly point.
    * The axes order of a bbox follows the axes order of geometries.
    * https://tools.ietf.org/html/rfc7946#section-5
    */
  var bbox: js.UndefOr[BBox] = js.native
  var crs: js.UndefOr[Properties] = js.native
  /**
    * The feature's geometry
    */
  var geometry: GeometryObject = js.native
  /**
    * A value that uniquely identifies this feature in a
    * https://tools.ietf.org/html/rfc7946#section-3.2.
    */
  var id: js.UndefOr[String | Double] = js.native
  /**
    * Properties associated with this feature.
    */
  var properties: GeoJsonProperties = js.native
  var `type`: Feature = js.native
}

object Proj4GeoJSONFeature {
  @scala.inline
  def apply(geometry: GeometryObject, `type`: Feature): Proj4GeoJSONFeature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proj4GeoJSONFeature]
  }
  @scala.inline
  implicit class Proj4GeoJSONFeatureOps[Self <: Proj4GeoJSONFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGeometry(value: GeometryObject): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Feature): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBbox(value: BBox): Self = this.set("bbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBbox: Self = this.set("bbox", js.undefined)
    @scala.inline
    def setCrs(value: Properties): Self = this.set("crs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrs: Self = this.set("crs", js.undefined)
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setProperties(value: GeoJsonProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertiesNull: Self = this.set("properties", null)
  }
  
}

