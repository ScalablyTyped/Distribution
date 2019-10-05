package typings.reactDashLeaflet

import typings.leaflet.leafletMod.Layer
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
    addBaseLayer: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit,
    addOverlay: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit,
    removeLayer: /* layer */ Layer => Unit,
    removeLayerControl: /* layer */ Layer => Unit
  ): Anon_AddBaseLayer = {
    val __obj = js.Dynamic.literal(addBaseLayer = js.Any.fromFunction3(addBaseLayer), addOverlay = js.Any.fromFunction3(addOverlay), removeLayer = js.Any.fromFunction1(removeLayer), removeLayerControl = js.Any.fromFunction1(removeLayerControl))
  
    __obj.asInstanceOf[Anon_AddBaseLayer]
  }
}

