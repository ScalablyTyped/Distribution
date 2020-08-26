package typings.reactLeaflet.mod

import typings.leaflet.mod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerContainer extends js.Object {
  var addLayer: AddLayerHandler = js.native
  var removeLayer: RemoveLayerHandler = js.native
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
  @scala.inline
  implicit class LayerContainerOps[Self <: LayerContainer] (val x: Self) extends AnyVal {
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
    def setAddLayer(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = this.set("addLayer", js.Any.fromFunction3(value))
    @scala.inline
    def setRemoveLayer(value: /* layer */ Layer => Unit): Self = this.set("removeLayer", js.Any.fromFunction1(value))
  }
  
}

