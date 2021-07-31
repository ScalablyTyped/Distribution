package typings.reactMapGl.mod

import typings.mapboxGl.mod.Map
import typings.mapboxGl.mod.MapboxGeoJSONFeature
import typings.mapboxGl.mod.PointLike
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-map-gl", "StaticMap")
@js.native
class StaticMap protected ()
  extends PureComponent[StaticMapProps, js.Object, js.Any] {
  def this(props: StaticMapProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: StaticMapProps, context: js.Any) = this()
  
  def getMap(): Map = js.native
  
  def queryRenderedFeatures(): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(geometry: js.Tuple2[PointLike, PointLike]): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(geometry: js.Tuple2[PointLike, PointLike], parameters: QueryRenderedFeaturesParams): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(geometry: Unit, parameters: QueryRenderedFeaturesParams): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(geometry: PointLike): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(geometry: PointLike, parameters: QueryRenderedFeaturesParams): js.Array[MapboxGeoJSONFeature] = js.native
}
