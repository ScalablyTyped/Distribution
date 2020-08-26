package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPath extends js.Object {
  def setPendingReplace(): Unit = js.native
}

object ObjectPath {
  @scala.inline
  def apply(setPendingReplace: () => Unit): ObjectPath = {
    val __obj = js.Dynamic.literal(setPendingReplace = js.Any.fromFunction0(setPendingReplace))
    __obj.asInstanceOf[ObjectPath]
  }
  @scala.inline
  implicit class ObjectPathOps[Self <: ObjectPath] (val x: Self) extends AnyVal {
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
    def setSetPendingReplace(value: () => Unit): Self = this.set("setPendingReplace", js.Any.fromFunction0(value))
  }
  
}

