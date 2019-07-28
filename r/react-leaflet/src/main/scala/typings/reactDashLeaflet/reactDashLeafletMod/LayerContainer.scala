package typings.reactDashLeaflet.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerContainer extends js.Object {
  var addLayer: AddLayerHandler
  var removeLayer: RemoveLayerHandler
}

object LayerContainer {
  @scala.inline
  def apply(addLayer: AddLayerHandler, removeLayer: RemoveLayerHandler): LayerContainer = {
    val __obj = js.Dynamic.literal(addLayer = addLayer, removeLayer = removeLayer)
  
    __obj.asInstanceOf[LayerContainer]
  }
}

