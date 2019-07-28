package typings.reactDashLeaflet

import typings.reactDashLeaflet.reactDashLeafletMod.AddLayerHandler
import typings.reactDashLeaflet.reactDashLeafletMod.RemoveLayerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddBaseLayer extends js.Object {
  var addBaseLayer: AddLayerHandler
  var addOverlay: AddLayerHandler
  var removeLayer: RemoveLayerHandler
  var removeLayerControl: RemoveLayerHandler
}

object Anon_AddBaseLayer {
  @scala.inline
  def apply(
    addBaseLayer: AddLayerHandler,
    addOverlay: AddLayerHandler,
    removeLayer: RemoveLayerHandler,
    removeLayerControl: RemoveLayerHandler
  ): Anon_AddBaseLayer = {
    val __obj = js.Dynamic.literal(addBaseLayer = addBaseLayer, addOverlay = addOverlay, removeLayer = removeLayer, removeLayerControl = removeLayerControl)
  
    __obj.asInstanceOf[Anon_AddBaseLayer]
  }
}

