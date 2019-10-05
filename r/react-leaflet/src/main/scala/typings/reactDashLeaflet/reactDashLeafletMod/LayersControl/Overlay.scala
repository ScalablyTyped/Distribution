package typings.reactDashLeaflet.reactDashLeafletMod.LayersControl

import typings.leaflet.leafletMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "LayersControl.Overlay")
@js.native
class Overlay[P /* <: ControlledLayerProps */] protected () extends ControlledLayer[P] {
  def this(props: ControlledLayerProps) = this()
  def addLayer(layer: Layer): Unit = js.native
}

