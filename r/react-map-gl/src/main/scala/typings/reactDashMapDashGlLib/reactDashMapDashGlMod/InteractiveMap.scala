package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-map-gl", "InteractiveMap")
@js.native
class InteractiveMap ()
  extends reactLib.reactMod.Component[InteractiveMapProps, js.Object, js.Any] {
  def getMap(): mapboxDashGlLib.mapboxDashGlMod.Map = js.native
  def queryRenderedFeatures(): js.Array[
    geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, geojsonLib.geojsonMod.GeoJsonProperties]
  ] = js.native
  def queryRenderedFeatures(geometry: js.Array[mapboxDashGlLib.mapboxDashGlMod.PointLike]): js.Array[
    geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, geojsonLib.geojsonMod.GeoJsonProperties]
  ] = js.native
  def queryRenderedFeatures(
    geometry: js.Array[mapboxDashGlLib.mapboxDashGlMod.PointLike],
    parameters: QueryRenderedFeaturesParams
  ): js.Array[
    geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, geojsonLib.geojsonMod.GeoJsonProperties]
  ] = js.native
  def queryRenderedFeatures(geometry: mapboxDashGlLib.mapboxDashGlMod.PointLike): js.Array[
    geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, geojsonLib.geojsonMod.GeoJsonProperties]
  ] = js.native
  def queryRenderedFeatures(geometry: mapboxDashGlLib.mapboxDashGlMod.PointLike, parameters: QueryRenderedFeaturesParams): js.Array[
    geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, geojsonLib.geojsonMod.GeoJsonProperties]
  ] = js.native
}

