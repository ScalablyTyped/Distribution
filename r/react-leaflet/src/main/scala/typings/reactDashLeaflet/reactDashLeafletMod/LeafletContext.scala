package typings.reactDashLeaflet.reactDashLeafletMod

import typings.leaflet.leafletMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafletContext extends js.Object {
  var layerContainer: js.UndefOr[LayerContainer] = js.undefined
  var map: js.UndefOr[typings.leaflet.leafletMod.Map] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
  var popupContainer: js.UndefOr[Layer] = js.undefined
}

object LeafletContext {
  @scala.inline
  def apply(
    layerContainer: LayerContainer = null,
    map: typings.leaflet.leafletMod.Map = null,
    pane: String = null,
    popupContainer: Layer = null
  ): LeafletContext = {
    val __obj = js.Dynamic.literal()
    if (layerContainer != null) __obj.updateDynamic("layerContainer")(layerContainer)
    if (map != null) __obj.updateDynamic("map")(map)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (popupContainer != null) __obj.updateDynamic("popupContainer")(popupContainer)
    __obj.asInstanceOf[LeafletContext]
  }
}

