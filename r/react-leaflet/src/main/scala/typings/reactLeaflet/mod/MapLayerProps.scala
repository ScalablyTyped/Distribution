package typings.reactLeaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerProps extends MapComponentProps {
  var attribution: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[Children] = js.undefined
}

object MapLayerProps {
  @scala.inline
  def apply(
    attribution: String = null,
    children: Children = null,
    leaflet: LeafletContext = null,
    pane: String = null
  ): MapLayerProps = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerProps]
  }
}

