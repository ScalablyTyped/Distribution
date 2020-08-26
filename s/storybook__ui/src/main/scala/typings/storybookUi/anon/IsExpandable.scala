package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsExpandable extends js.Object {
  var isExpandable: js.UndefOr[Boolean] = js.native
  var isExpanded: js.UndefOr[Boolean] = js.native
}

object IsExpandable {
  @scala.inline
  def apply(): IsExpandable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsExpandable]
  }
  @scala.inline
  implicit class IsExpandableOps[Self <: IsExpandable] (val x: Self) extends AnyVal {
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
    def setIsExpandable(value: Boolean): Self = this.set("isExpandable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExpandable: Self = this.set("isExpandable", js.undefined)
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
  }
  
}

