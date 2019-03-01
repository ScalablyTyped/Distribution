package typings
package reactDashLeafletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Leaflet extends js.Object {
  var leaflet: js.UndefOr[reactDashLeafletLib.reactDashLeafletMod.LeafletContext] = js.undefined
}

object Anon_Leaflet {
  @scala.inline
  def apply(leaflet: reactDashLeafletLib.reactDashLeafletMod.LeafletContext = null): Anon_Leaflet = {
    val __obj = js.Dynamic.literal()
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    __obj.asInstanceOf[Anon_Leaflet]
  }
}

