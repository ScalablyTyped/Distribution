package typings.reactDashLeaflet.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapComponentProps extends js.Object {
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
}

object MapComponentProps {
  @scala.inline
  def apply(leaflet: LeafletContext = null, pane: String = null): MapComponentProps = {
    val __obj = js.Dynamic.literal()
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapComponentProps]
  }
}

