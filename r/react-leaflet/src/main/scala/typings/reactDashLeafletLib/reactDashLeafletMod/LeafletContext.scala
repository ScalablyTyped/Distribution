package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafletContext extends js.Object {
  var layerContainer: js.UndefOr[LayerContainer] = js.undefined
  var map: js.UndefOr[leafletLib.leafletMod.Map] = js.undefined
  var pane: js.UndefOr[java.lang.String] = js.undefined
  var popupContainer: js.UndefOr[leafletLib.leafletMod.Layer] = js.undefined
}

object LeafletContext {
  @scala.inline
  def apply(
    layerContainer: LayerContainer = null,
    map: leafletLib.leafletMod.Map = null,
    pane: java.lang.String = null,
    popupContainer: leafletLib.leafletMod.Layer = null
  ): LeafletContext = {
    val __obj = js.Dynamic.literal()
    if (layerContainer != null) __obj.updateDynamic("layerContainer")(layerContainer)
    if (map != null) __obj.updateDynamic("map")(map)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (popupContainer != null) __obj.updateDynamic("popupContainer")(popupContainer)
    __obj.asInstanceOf[LeafletContext]
  }
}

