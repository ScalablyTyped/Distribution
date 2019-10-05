package typings.reactDashLeaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLeafletMod {
  import typings.leaflet.leafletMod.Control.AttributionOptions
  import typings.leaflet.leafletMod.Control.Layers
  import typings.leaflet.leafletMod.Control.ScaleOptions
  import typings.leaflet.leafletMod.Control.ZoomOptions
  import typings.leaflet.leafletMod.ControlOptions
  import typings.leaflet.leafletMod.Layer
  import typings.react.reactMod.ReactNode
  import typings.reactDashLeaflet.Anon_Leaflet
  import typings.std.Exclude
  import typings.std.Pick

  type AddLayerHandler = js.Function3[/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean], Unit]
  type AttributionControlProps = AttributionOptions with MapControlProps
  type Children = ReactNode | js.Array[ReactNode]
  type LatLng = typings.leaflet.leafletMod.LatLng | js.Array[Double] | js.Object
  type LatLngBounds = typings.leaflet.leafletMod.LatLngBounds | js.Array[LatLng]
  type LayersControl[P /* <: LayersControlProps */, E /* <: Layers */] = LayersControl_[P, E]
  type LeafletEvents = MapEvents with MarkerEvents with TileLayerEvents with PathEvents with FeatureGroupEvents with LayersControlEvents
  type MapControlProps = Anon_Leaflet with ControlOptions
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Point = (js.Tuple2[Double, Double]) | typings.leaflet.leafletMod.Point
  type RemoveLayerHandler = js.Function1[/* layer */ Layer, Unit]
  type ScaleControlProps = ScaleOptions with MapControlProps
  type ZoomControlProps = ZoomOptions with MapControlProps
}
