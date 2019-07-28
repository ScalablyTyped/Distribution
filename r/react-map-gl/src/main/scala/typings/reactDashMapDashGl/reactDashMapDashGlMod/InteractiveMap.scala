package typings.reactDashMapDashGl.reactDashMapDashGlMod

import typings.geojson.geojsonMod.Feature
import typings.geojson.geojsonMod.GeoJsonProperties
import typings.geojson.geojsonMod.GeometryObject
import typings.mapboxDashGl.mapboxDashGlMod.Map
import typings.mapboxDashGl.mapboxDashGlMod.PointLike
import typings.react.reactMod.PureComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-map-gl", "InteractiveMap")
@js.native
class InteractiveMap ()
  extends PureComponent[InteractiveMapProps, js.Object, js.Any] {
  def getMap(): Map = js.native
  def queryRenderedFeatures(): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: js.Array[PointLike]): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: js.Array[PointLike], parameters: QueryRenderedFeaturesParams): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: PointLike): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
  def queryRenderedFeatures(geometry: PointLike, parameters: QueryRenderedFeaturesParams): js.Array[Feature[GeometryObject, GeoJsonProperties]] = js.native
}

