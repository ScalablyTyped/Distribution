package typings.reactLeaflet

import typings.leaflet.mod.Tooltip_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTooltip[E /* <: Tooltip_ */] extends js.Object {
  var tooltip: E
}

object AnonTooltip {
  @scala.inline
  def apply[E /* <: Tooltip_ */](tooltip: E): AnonTooltip[E] = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTooltip[E]]
  }
}

