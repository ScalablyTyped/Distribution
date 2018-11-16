package typings
package reactDashLeafletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLeafletMod {
  type AttributionControlProps = leafletLib.leafletMod.ControlNs.AttributionOptions
  type Children = reactLib.reactMod.ReactNs.ReactNode | js.Array[reactLib.reactMod.ReactNs.ReactNode]
  type LeafletEvents = MapEvents with MarkerEvents with TileLayerEvents with PathEvents with FeatureGroupEvents with LayersControlEvents
  type MapControlProps = leafletLib.leafletMod.ControlOptions
  type ScaleControlProps = leafletLib.leafletMod.ControlNs.ScaleOptions
  type ZoomControlProps = leafletLib.leafletMod.ControlNs.ZoomOptions
}
