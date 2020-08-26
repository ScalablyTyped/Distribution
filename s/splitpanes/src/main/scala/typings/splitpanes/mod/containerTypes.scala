package typings.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait containerTypes extends js.Object {
  var offsetLeft: Null | Double = js.native
  var offsetTop: Null | Double = js.native
  var vnode: js.Any = js.native
}

object containerTypes {
  @scala.inline
  def apply(vnode: js.Any): containerTypes = {
    val __obj = js.Dynamic.literal(vnode = vnode.asInstanceOf[js.Any])
    __obj.asInstanceOf[containerTypes]
  }
  @scala.inline
  implicit class containerTypesOps[Self <: containerTypes] (val x: Self) extends AnyVal {
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
    def setVnode(value: js.Any): Self = this.set("vnode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetLeft(value: Double): Self = this.set("offsetLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetLeftNull: Self = this.set("offsetLeft", null)
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetTopNull: Self = this.set("offsetTop", null)
  }
  
}

