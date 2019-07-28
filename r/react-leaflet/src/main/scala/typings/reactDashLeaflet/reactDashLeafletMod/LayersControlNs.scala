package typings.reactDashLeaflet.reactDashLeafletMod

import typings.leaflet.leafletMod.Layer
import typings.react.reactMod.Component
import typings.reactDashLeaflet.reactDashLeafletMod.LayersControlNs.ControlledLayer
import typings.reactDashLeaflet.reactDashLeafletMod.LayersControlNs.ControlledLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "LayersControl")
@js.native
object LayersControlNs extends js.Object {
  @js.native
  class BaseLayer[P /* <: ControlledLayerProps */] protected () extends ControlledLayer[P] {
    def this(props: ControlledLayerProps) = this()
    def addLayer(layer: Layer): Unit = js.native
  }
  
  @js.native
  class ControlledLayer[P /* <: ControlledLayerProps */] ()
    extends Component[P, js.Object, js.Any] {
    var contextValue: LeafletContext = js.native
    var layer: js.UndefOr[Layer | Null] = js.native
    def removeLayer(layer: Layer): Unit = js.native
  }
  
  trait ControlledLayerProps extends js.Object {
    var addBaseLayer: js.UndefOr[AddLayerHandler] = js.undefined
    var addOverlay: js.UndefOr[AddLayerHandler] = js.undefined
    var checked: js.UndefOr[Boolean] = js.undefined
    var children: Children
    var leaflet: js.UndefOr[LeafletContext] = js.undefined
    var name: String
    var removeLayer: js.UndefOr[RemoveLayerHandler] = js.undefined
    var removeLayerControl: js.UndefOr[RemoveLayerHandler] = js.undefined
  }
  
  @js.native
  class Overlay[P /* <: ControlledLayerProps */] protected () extends ControlledLayer[P] {
    def this(props: ControlledLayerProps) = this()
    def addLayer(layer: Layer): Unit = js.native
  }
  
}

