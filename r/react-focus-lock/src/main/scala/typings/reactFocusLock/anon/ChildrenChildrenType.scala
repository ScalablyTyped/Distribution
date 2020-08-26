package typings.reactFocusLock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenChildrenType[ChildrenType] extends js.Object {
  var children: ChildrenType = js.native
}

object ChildrenChildrenType {
  @scala.inline
  def apply[ChildrenType](children: ChildrenType): ChildrenChildrenType[ChildrenType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenChildrenType[ChildrenType]]
  }
  @scala.inline
  implicit class ChildrenChildrenTypeOps[Self <: ChildrenChildrenType[_], ChildrenType] (val x: Self with ChildrenChildrenType[ChildrenType]) extends AnyVal {
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
    def setChildren(value: ChildrenType): Self = this.set("children", value.asInstanceOf[js.Any])
  }
  
}

