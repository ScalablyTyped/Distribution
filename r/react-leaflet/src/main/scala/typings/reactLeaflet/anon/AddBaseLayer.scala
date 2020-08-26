package typings.reactLeaflet.anon

import typings.leaflet.mod.Layer
import typings.reactLeaflet.mod.AddLayerHandler
import typings.reactLeaflet.mod.RemoveLayerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddBaseLayer extends js.Object {
  var addBaseLayer: AddLayerHandler = js.native
  var addOverlay: AddLayerHandler = js.native
  var removeLayer: RemoveLayerHandler = js.native
  var removeLayerControl: RemoveLayerHandler = js.native
}

object AddBaseLayer {
  @scala.inline
  def apply(
    addBaseLayer: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit,
    addOverlay: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit,
    removeLayer: /* layer */ Layer => Unit,
    removeLayerControl: /* layer */ Layer => Unit
  ): AddBaseLayer = {
    val __obj = js.Dynamic.literal(addBaseLayer = js.Any.fromFunction3(addBaseLayer), addOverlay = js.Any.fromFunction3(addOverlay), removeLayer = js.Any.fromFunction1(removeLayer), removeLayerControl = js.Any.fromFunction1(removeLayerControl))
    __obj.asInstanceOf[AddBaseLayer]
  }
  @scala.inline
  implicit class AddBaseLayerOps[Self <: AddBaseLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddBaseLayer(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = this.set("addBaseLayer", js.Any.fromFunction3(value))
    @scala.inline
    def setAddOverlay(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = this.set("addOverlay", js.Any.fromFunction3(value))
    @scala.inline
    def setRemoveLayer(value: /* layer */ Layer => Unit): Self = this.set("removeLayer", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveLayerControl(value: /* layer */ Layer => Unit): Self = this.set("removeLayerControl", js.Any.fromFunction1(value))
  }
  
}

