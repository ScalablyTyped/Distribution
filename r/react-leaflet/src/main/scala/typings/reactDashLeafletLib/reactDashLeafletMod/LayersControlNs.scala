package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "LayersControl")
@js.native
object LayersControlNs extends js.Object {
  @js.native
  class BaseLayer[P /* <: ControlledLayerProps */] protected () extends ControlledLayer[P] {
    def this(props: ControlledLayerProps) = this()
    def addLayer(layer: leafletLib.leafletMod.Layer): scala.Unit = js.native
  }
  
  @js.native
  class ControlledLayer[P /* <: ControlledLayerProps */] ()
    extends reactLib.reactMod.Component[P, js.Object, js.Any] {
    var contextValue: reactDashLeafletLib.reactDashLeafletMod.LeafletContext = js.native
    var layer: js.UndefOr[leafletLib.leafletMod.Layer | scala.Null] = js.native
    def removeLayer(layer: leafletLib.leafletMod.Layer): scala.Unit = js.native
  }
  
  trait ControlledLayerProps extends js.Object {
    var addBaseLayer: js.UndefOr[reactDashLeafletLib.reactDashLeafletMod.AddLayerHandler] = js.undefined
    var addOverlay: js.UndefOr[reactDashLeafletLib.reactDashLeafletMod.AddLayerHandler] = js.undefined
    var checked: js.UndefOr[scala.Boolean] = js.undefined
    var children: reactDashLeafletLib.reactDashLeafletMod.Children
    var leaflet: js.UndefOr[reactDashLeafletLib.reactDashLeafletMod.LeafletContext] = js.undefined
    var name: java.lang.String
    var removeLayer: js.UndefOr[reactDashLeafletLib.reactDashLeafletMod.RemoveLayerHandler] = js.undefined
    var removeLayerControl: js.UndefOr[reactDashLeafletLib.reactDashLeafletMod.RemoveLayerHandler] = js.undefined
  }
  
  @js.native
  class Overlay[P /* <: ControlledLayerProps */] protected () extends ControlledLayer[P] {
    def this(props: ControlledLayerProps) = this()
    def addLayer(layer: leafletLib.leafletMod.Layer): scala.Unit = js.native
  }
  
}

