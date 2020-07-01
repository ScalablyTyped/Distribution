package typings.reactLeaflet.anon

import typings.leaflet.mod.Tooltip_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tooltip[E /* <: Tooltip_ */] extends js.Object {
  var tooltip: E
}

object Tooltip {
  @scala.inline
  def apply[/* <: typings.leaflet.mod.Tooltip_ */ E](tooltip: E): Tooltip[E] = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip[E]]
  }
}

