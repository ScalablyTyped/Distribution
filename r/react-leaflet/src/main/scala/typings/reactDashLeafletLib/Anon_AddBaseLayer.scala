package typings
package reactDashLeafletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddBaseLayer extends js.Object {
  var addBaseLayer: reactDashLeafletLib.reactDashLeafletMod.AddLayerHandler
  var addOverlay: reactDashLeafletLib.reactDashLeafletMod.AddLayerHandler
  var removeLayer: reactDashLeafletLib.reactDashLeafletMod.RemoveLayerHandler
  var removeLayerControl: reactDashLeafletLib.reactDashLeafletMod.RemoveLayerHandler
}

object Anon_AddBaseLayer {
  @scala.inline
  def apply(
    addBaseLayer: reactDashLeafletLib.reactDashLeafletMod.AddLayerHandler,
    addOverlay: reactDashLeafletLib.reactDashLeafletMod.AddLayerHandler,
    removeLayer: reactDashLeafletLib.reactDashLeafletMod.RemoveLayerHandler,
    removeLayerControl: reactDashLeafletLib.reactDashLeafletMod.RemoveLayerHandler
  ): Anon_AddBaseLayer = {
    val __obj = js.Dynamic.literal(addBaseLayer = addBaseLayer, addOverlay = addOverlay, removeLayer = removeLayer, removeLayerControl = removeLayerControl)
  
    __obj.asInstanceOf[Anon_AddBaseLayer]
  }
}

