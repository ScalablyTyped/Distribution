package typings.reactSortablePane.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaneProperty extends js.Object {
  var key: PaneKey = js.native
  var ref: Element | Null = js.native
}

object PaneProperty {
  @scala.inline
  def apply(): PaneProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaneProperty]
  }
  @scala.inline
  implicit class PanePropertyOps[Self <: PaneProperty] (val x: Self) extends AnyVal {
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
    def setKey(value: PaneKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    @scala.inline
    def setRef(value: Element): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

