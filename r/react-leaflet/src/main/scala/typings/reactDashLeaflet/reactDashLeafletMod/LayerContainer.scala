package typings.reactDashLeaflet.reactDashLeafletMod

import typings.leaflet.leafletMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerContainer extends js.Object {
  var addLayer: AddLayerHandler
  var removeLayer: RemoveLayerHandler
}

object LayerContainer {
  @scala.inline
  def apply(
    addLayer: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit,
    removeLayer: /* layer */ Layer => Unit
  ): LayerContainer = {
    val __obj = js.Dynamic.literal(addLayer = js.Any.fromFunction3(addLayer), removeLayer = js.Any.fromFunction1(removeLayer))
  
    __obj.asInstanceOf[LayerContainer]
  }
}

