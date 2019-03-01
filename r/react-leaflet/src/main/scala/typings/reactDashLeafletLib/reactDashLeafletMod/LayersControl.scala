package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "LayersControl")
@js.native
class LayersControl[P /* <: LayersControlProps */, E /* <: leafletLib.leafletMod.ControlNs.Layers */] () extends MapControl[P, E] {
  var controlProps: reactDashLeafletLib.Anon_AddBaseLayer = js.native
  def addBaseLayer(layer: leafletLib.leafletMod.Layer, name: java.lang.String, checked: scala.Boolean): scala.Unit = js.native
  def addOverlay(layer: leafletLib.leafletMod.Layer, name: java.lang.String, checked: scala.Boolean): scala.Unit = js.native
  def removeLayer(layer: leafletLib.leafletMod.Layer): scala.Unit = js.native
  def removeLayerControl(layer: leafletLib.leafletMod.Layer): scala.Unit = js.native
}

