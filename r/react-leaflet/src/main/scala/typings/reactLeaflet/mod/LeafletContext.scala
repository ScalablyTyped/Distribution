package typings.reactLeaflet.mod

import typings.leaflet.mod.Layer
import typings.leaflet.mod.Map_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeafletContext extends js.Object {
  var layerContainer: js.UndefOr[LayerContainer] = js.native
  var map: js.UndefOr[Map_] = js.native
  var pane: js.UndefOr[String] = js.native
  var popupContainer: js.UndefOr[Layer] = js.native
}

object LeafletContext {
  @scala.inline
  def apply(): LeafletContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeafletContext]
  }
  @scala.inline
  implicit class LeafletContextOps[Self <: LeafletContext] (val x: Self) extends AnyVal {
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
    def setLayerContainer(value: LayerContainer): Self = this.set("layerContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerContainer: Self = this.set("layerContainer", js.undefined)
    @scala.inline
    def setMap(value: Map_): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setPane(value: String): Self = this.set("pane", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    @scala.inline
    def setPopupContainer(value: Layer): Self = this.set("popupContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupContainer: Self = this.set("popupContainer", js.undefined)
  }
  
}

