package typings.reactLeaflet.mod

import typings.leaflet.mod.Control_.Layers
import typings.leaflet.mod.Layer
import typings.reactLeaflet.AnonAddBaseLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "LayersControl")
@js.native
class LayersControl_[P /* <: LayersControlProps */, E /* <: Layers */] () extends MapControl[P, E] {
  var controlProps: AnonAddBaseLayer = js.native
  def addBaseLayer(layer: Layer, name: String, checked: Boolean): Unit = js.native
  def addOverlay(layer: Layer, name: String, checked: Boolean): Unit = js.native
  def removeLayer(layer: Layer): Unit = js.native
  def removeLayerControl(layer: Layer): Unit = js.native
}

