package typings.reactLeaflet.mod.LayersControl

import typings.leaflet.mod.Layer
import typings.react.mod.Component
import typings.reactLeaflet.mod.LeafletContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "LayersControl.ControlledLayer")
@js.native
class ControlledLayer[P /* <: ControlledLayerProps */] ()
  extends Component[P, js.Object, js.Any] {
  
  var contextValue: LeafletContext = js.native
  
  var layer: js.UndefOr[Layer | Null] = js.native
  
  def removeLayer(layer: Layer): Unit = js.native
}
