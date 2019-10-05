package typings.reactDashLeaflet.reactDashLeafletMod.LayersControl

import typings.leaflet.leafletMod.Layer
import typings.react.reactMod.Component
import typings.reactDashLeaflet.reactDashLeafletMod.LeafletContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "LayersControl.ControlledLayer")
@js.native
class ControlledLayer[P /* <: ControlledLayerProps */] ()
  extends Component[P, js.Object, js.Any] {
  var contextValue: LeafletContext = js.native
  var layer: js.UndefOr[Layer | Null] = js.native
  def removeLayer(layer: Layer): Unit = js.native
}

