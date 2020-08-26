package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsExpanded extends js.Object {
  var childIds: Null = js.native
  var isExpanded: Boolean = js.native
}

object IsExpanded {
  @scala.inline
  def apply(childIds: Null, isExpanded: Boolean): IsExpanded = {
    val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsExpanded]
  }
  @scala.inline
  implicit class IsExpandedOps[Self <: IsExpanded] (val x: Self) extends AnyVal {
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
    def setChildIds(value: Null): Self = this.set("childIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
  }
  
}

