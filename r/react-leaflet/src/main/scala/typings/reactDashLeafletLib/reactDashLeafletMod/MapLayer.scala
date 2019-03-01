package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "MapLayer")
@js.native
class MapLayer[P /* <: MapLayerProps */, E /* <: leafletLib.leafletMod.Layer */] () extends MapComponent[P, E] {
  var contextValue: js.UndefOr[LeafletContext | scala.Null] = js.native
  val layerContainer: LayerContainer | leafletLib.leafletMod.Map = js.native
  def createLeafletElement(props: P): E = js.native
  def updateLeafletElement(fromProps: P, toProps: P): scala.Unit = js.native
}

