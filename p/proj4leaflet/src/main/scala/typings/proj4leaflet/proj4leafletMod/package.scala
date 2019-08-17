package typings.proj4leaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object proj4leafletMod {
  import typings.geojson.geojsonMod.Feature
  import typings.geojson.geojsonMod.GeoJsonProperties
  import typings.geojson.geojsonMod.GeometryObject
  import typings.proj4leaflet.Anon_Crs

  type Proj4GeoJSONFeature = (Feature[GeometryObject, GeoJsonProperties]) with Anon_Crs
}
