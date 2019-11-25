package typings.reactDashLeaflet

import typings.reactDashLeaflet.reactDashLeafletMod.LeafletContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Leaflet extends js.Object {
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
}

object Anon_Leaflet {
  @scala.inline
  def apply(leaflet: LeafletContext = null): Anon_Leaflet = {
    val __obj = js.Dynamic.literal()
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Leaflet]
  }
}

