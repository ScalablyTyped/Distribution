package typings.reactMapGl.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.GeometryObject
import typings.mapboxGl.mod.Map
import typings.mapboxGl.mod.PointLike
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-map-gl", "StaticMap")
@js.native
class StaticMap ()
  extends Component[StaticMapProps, js.Object, js.Any] {
  def getMap(): Map = js.native
  def queryRenderedFeatures(): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: js.Array[PointLike]): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: js.Array[PointLike], parameters: QueryRenderedFeaturesParams): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: PointLike): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: PointLike, parameters: QueryRenderedFeaturesParams): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
}

