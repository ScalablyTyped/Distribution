package typings.sharepoint.SPAnimation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends js.Object {
  def RunAnimation(): Unit = js.native
}

object Object {
  @scala.inline
  def apply(RunAnimation: () => Unit): Object = {
    val __obj = js.Dynamic.literal(RunAnimation = js.Any.fromFunction0(RunAnimation))
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  implicit class ObjectOps[Self <: Object] (val x: Self) extends AnyVal {
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
    def setRunAnimation(value: () => Unit): Self = this.set("RunAnimation", js.Any.fromFunction0(value))
  }
  
}

