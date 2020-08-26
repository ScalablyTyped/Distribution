package typings.reactLeaflet.anon

import typings.leaflet.mod.Tooltip_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tooltip[E /* <: Tooltip_ */] extends js.Object {
  var tooltip: E = js.native
}

object Tooltip {
  @scala.inline
  def apply[/* <: typings.leaflet.mod.Tooltip_ */ E](tooltip: E): Tooltip[E] = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip[E]]
  }
  @scala.inline
  implicit class TooltipOps[Self <: Tooltip[_], /* <: typings.leaflet.mod.Tooltip_ */ E] (val x: Self with Tooltip[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTooltip(value: E): Self = this.set("tooltip", value.asInstanceOf[js.Any])
  }
  
}

