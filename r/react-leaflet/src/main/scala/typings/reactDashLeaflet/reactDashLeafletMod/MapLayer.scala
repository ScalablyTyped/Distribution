package typings.reactDashLeaflet.reactDashLeafletMod

import typings.leaflet.leafletMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "MapLayer")
@js.native
class MapLayer[P /* <: MapLayerProps */, E /* <: Layer */] () extends MapComponent[P, E] {
  var contextValue: js.UndefOr[LeafletContext | Null] = js.native
  val layerContainer: LayerContainer | typings.leaflet.leafletMod.Map = js.native
  def createLeafletElement(props: P): E = js.native
  def updateLeafletElement(fromProps: P, toProps: P): Unit = js.native
}

