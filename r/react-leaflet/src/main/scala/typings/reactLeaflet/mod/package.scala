package typings.reactLeaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddLayerHandler = js.Function3[
    /* layer */ typings.leaflet.mod.Layer, 
    /* name */ java.lang.String, 
    /* checked */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type AttributionControlProps = typings.leaflet.mod.Control_.AttributionOptions with typings.reactLeaflet.mod.MapControlProps
  type Children = typings.react.mod.ReactNode | js.Array[typings.react.mod.ReactNode]
  type LatLng = typings.leaflet.mod.LatLng_ | js.Array[scala.Double] | js.Object
  type LatLngBounds = typings.leaflet.mod.LatLngBounds_ | js.Array[typings.reactLeaflet.mod.LatLng]
  type LayersControl[P /* <: typings.reactLeaflet.mod.LayersControlProps */, E /* <: typings.leaflet.mod.Control_.Layers */] = typings.reactLeaflet.mod.LayersControl_[P, E]
  type LeafletEvents = typings.reactLeaflet.mod.MapEvents with typings.reactLeaflet.mod.MarkerEvents with typings.reactLeaflet.mod.TileLayerEvents with typings.reactLeaflet.mod.PathEvents with typings.reactLeaflet.mod.FeatureGroupEvents with typings.reactLeaflet.mod.LayersControlEvents
  type MapControlProps = typings.reactLeaflet.AnonLeaflet with typings.leaflet.mod.ControlOptions
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type Point = (js.Tuple2[scala.Double, scala.Double]) | typings.leaflet.mod.Point_
  type RemoveLayerHandler = js.Function1[/* layer */ typings.leaflet.mod.Layer, scala.Unit]
  type ScaleControlProps = typings.leaflet.mod.Control_.ScaleOptions with typings.reactLeaflet.mod.MapControlProps
  type ZoomControlProps = typings.leaflet.mod.Control_.ZoomOptions with typings.reactLeaflet.mod.MapControlProps
}
