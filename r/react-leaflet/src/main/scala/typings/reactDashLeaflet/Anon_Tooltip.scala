package typings.reactDashLeaflet

import typings.leaflet.leafletMod.Tooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tooltip[E /* <: Tooltip */] extends js.Object {
  var tooltip: E
}

object Anon_Tooltip {
  @scala.inline
  def apply[E /* <: Tooltip */](tooltip: E): Anon_Tooltip[E] = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Tooltip[E]]
  }
}

