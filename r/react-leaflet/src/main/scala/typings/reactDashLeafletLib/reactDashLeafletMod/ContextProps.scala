package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextProps extends js.Object {
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
}

object ContextProps {
  @scala.inline
  def apply(leaflet: LeafletContext = null): ContextProps = {
    val __obj = js.Dynamic.literal()
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    __obj.asInstanceOf[ContextProps]
  }
}

