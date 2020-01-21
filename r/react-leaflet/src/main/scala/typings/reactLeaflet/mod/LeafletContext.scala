package typings.reactLeaflet.mod

import typings.leaflet.mod.Layer
import typings.leaflet.mod.Map_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafletContext extends js.Object {
  var layerContainer: js.UndefOr[LayerContainer] = js.undefined
  var map: js.UndefOr[Map_] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
  var popupContainer: js.UndefOr[Layer] = js.undefined
}

object LeafletContext {
  @scala.inline
  def apply(
    layerContainer: LayerContainer = null,
    map: Map_ = null,
    pane: String = null,
    popupContainer: Layer = null
  ): LeafletContext = {
    val __obj = js.Dynamic.literal()
    if (layerContainer != null) __obj.updateDynamic("layerContainer")(layerContainer.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (popupContainer != null) __obj.updateDynamic("popupContainer")(popupContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafletContext]
  }
}

