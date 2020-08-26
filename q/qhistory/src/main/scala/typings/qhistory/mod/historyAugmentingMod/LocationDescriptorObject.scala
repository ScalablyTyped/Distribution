package typings.qhistory.mod.historyAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationDescriptorObject extends js.Object {
  var query: js.UndefOr[js.Object] = js.native
}

object LocationDescriptorObject {
  @scala.inline
  def apply(): LocationDescriptorObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationDescriptorObject]
  }
  @scala.inline
  implicit class LocationDescriptorObjectOps[Self <: LocationDescriptorObject] (val x: Self) extends AnyVal {
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
    def setQuery(value: js.Object): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

