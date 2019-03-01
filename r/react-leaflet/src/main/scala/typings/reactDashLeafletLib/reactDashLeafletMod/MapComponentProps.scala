package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapComponentProps extends js.Object {
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var pane: js.UndefOr[java.lang.String] = js.undefined
}

object MapComponentProps {
  @scala.inline
  def apply(leaflet: LeafletContext = null, pane: java.lang.String = null): MapComponentProps = {
    val __obj = js.Dynamic.literal()
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[MapComponentProps]
  }
}

