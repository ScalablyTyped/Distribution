package typings.reactLeaflet

import typings.reactLeaflet.mod.LeafletContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeaflet extends js.Object {
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
}

object AnonLeaflet {
  @scala.inline
  def apply(leaflet: LeafletContext = null): AnonLeaflet = {
    val __obj = js.Dynamic.literal()
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeaflet]
  }
}

