package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "MapLayer")
@js.native
class MapLayer[P /* <: MapLayerProps */, E /* <: leafletLib.leafletMod.Class */] () extends MapComponent[P, E] {
  val layerContainer: LayerContainer | leafletLib.leafletMod.Map = js.native
  def createLeafletElement(props: P): E = js.native
  def updateLeafletElement(fromProps: P, toProps: P): scala.Unit = js.native
}

