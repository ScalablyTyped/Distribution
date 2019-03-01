package typings
package reactDashLeafletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLeafletMod {
  type AddLayerHandler = js.Function3[
    /* layer */ leafletLib.leafletMod.Layer, 
    /* name */ java.lang.String, 
    /* checked */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type AttributionControlProps = leafletLib.leafletMod.ControlNs.AttributionOptions with MapControlProps
  type Children = reactLib.reactMod.ReactNs.ReactNode | js.Array[reactLib.reactMod.ReactNs.ReactNode]
  type LatLng = leafletLib.leafletMod.LatLng | js.Array[scala.Double] | js.Object
  type LatLngBounds = leafletLib.leafletMod.LatLngBounds | js.Array[LatLng]
  type LeafletEvents = MapEvents with MarkerEvents with TileLayerEvents with PathEvents with FeatureGroupEvents with LayersControlEvents
  type MapControlProps = reactDashLeafletLib.Anon_Leaflet with leafletLib.leafletMod.ControlOptions
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type Point = (js.Tuple2[scala.Double, scala.Double]) | leafletLib.leafletMod.Point
  type RemoveLayerHandler = js.Function1[/* layer */ leafletLib.leafletMod.Layer, scala.Unit]
  type ScaleControlProps = leafletLib.leafletMod.ControlNs.ScaleOptions with MapControlProps
  type ZoomControlProps = leafletLib.leafletMod.ControlNs.ZoomOptions with MapControlProps
}
