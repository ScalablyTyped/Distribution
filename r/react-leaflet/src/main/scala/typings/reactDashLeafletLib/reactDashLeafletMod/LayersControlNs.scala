package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "LayersControl")
@js.native
object LayersControlNs extends js.Object {
  
  trait BaseControlledLayerProps extends js.Object {
    var checked: js.UndefOr[scala.Boolean] = js.undefined
    var children: js.UndefOr[reactDashLeafletLib.reactDashLeafletMod.Children] = js.undefined
    var removeLayer: js.UndefOr[js.Function1[/* layer */ leafletLib.leafletMod.Layer, scala.Unit]] = js.undefined
    var removeLayerControl: js.UndefOr[js.Function1[/* layer */ leafletLib.leafletMod.Layer, scala.Unit]] = js.undefined
  }
  
  @js.native
  class BaseLayer[P /* <: ControlledLayerProps */] () extends ControlledLayer[P]
  
  @js.native
  class ControlledLayer[P /* <: BaseControlledLayerProps */] ()
    extends reactLib.reactMod.Component[P, js.Object, js.Any] {
    var layer: js.UndefOr[leafletLib.leafletMod.Layer] = js.native
    def addLayer(): scala.Unit = js.native
    def getChildContext(): reactDashLeafletLib.Anon_LayerContainer_976206209 = js.native
    def removeLayer(layer: leafletLib.leafletMod.Layer): scala.Unit = js.native
  }
  
  
  trait ControlledLayerProps extends BaseControlledLayerProps {
    var addBaseLayer: js.UndefOr[
        js.Function3[
          /* layer */ leafletLib.leafletMod.Layer, 
          /* name */ java.lang.String, 
          /* checked */ scala.Boolean, 
          scala.Unit
        ]
      ] = js.undefined
    var addOverlay: js.UndefOr[
        js.Function3[
          /* layer */ leafletLib.leafletMod.Layer, 
          /* name */ java.lang.String, 
          /* checked */ scala.Boolean, 
          scala.Unit
        ]
      ] = js.undefined
    var name: java.lang.String
  }
  
  @js.native
  class Overlay[P /* <: ControlledLayerProps */] () extends ControlledLayer[P]
  
}

