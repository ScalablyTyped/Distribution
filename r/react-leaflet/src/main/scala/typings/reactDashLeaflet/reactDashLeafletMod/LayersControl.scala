package typings.reactDashLeaflet.reactDashLeafletMod

import typings.leaflet.leafletMod.ControlNs.Layers
import typings.leaflet.leafletMod.Layer
import typings.reactDashLeaflet.Anon_AddBaseLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "LayersControl")
@js.native
class LayersControl[P /* <: LayersControlProps */, E /* <: Layers */] () extends MapControl[P, E] {
  var controlProps: Anon_AddBaseLayer = js.native
  def addBaseLayer(layer: Layer, name: String, checked: Boolean): Unit = js.native
  def addOverlay(layer: Layer, name: String, checked: Boolean): Unit = js.native
  def removeLayer(layer: Layer): Unit = js.native
  def removeLayerControl(layer: Layer): Unit = js.native
}

