package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerProps extends MapComponentProps {
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  var children: js.UndefOr[Children] = js.undefined
}

object MapLayerProps {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    children: Children = null,
    leaflet: LeafletContext = null,
    pane: java.lang.String = null
  ): MapLayerProps = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[MapLayerProps]
  }
}

