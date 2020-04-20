package typings.reactLeaflet

import typings.leaflet.mod.Layer
import typings.reactLeaflet.mod.AddLayerHandler
import typings.reactLeaflet.mod.RemoveLayerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddBaseLayer extends js.Object {
  var addBaseLayer: AddLayerHandler
  var addOverlay: AddLayerHandler
  var removeLayer: RemoveLayerHandler
  var removeLayerControl: RemoveLayerHandler
}

object AnonAddBaseLayer {
  @scala.inline
  def apply(
    addBaseLayer: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit,
    addOverlay: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit,
    removeLayer: /* layer */ Layer => Unit,
    removeLayerControl: /* layer */ Layer => Unit
  ): AnonAddBaseLayer = {
    val __obj = js.Dynamic.literal(addBaseLayer = js.Any.fromFunction3(addBaseLayer), addOverlay = js.Any.fromFunction3(addOverlay), removeLayer = js.Any.fromFunction1(removeLayer), removeLayerControl = js.Any.fromFunction1(removeLayerControl))
    __obj.asInstanceOf[AnonAddBaseLayer]
  }
}

