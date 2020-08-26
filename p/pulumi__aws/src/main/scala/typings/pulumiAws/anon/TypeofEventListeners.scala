package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofEventListeners extends js.Object {
  val Core: TypeofCore = js.native
}

object TypeofEventListeners {
  @scala.inline
  def apply(Core: TypeofCore): TypeofEventListeners = {
    val __obj = js.Dynamic.literal(Core = Core.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofEventListeners]
  }
  @scala.inline
  implicit class TypeofEventListenersOps[Self <: TypeofEventListeners] (val x: Self) extends AnyVal {
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
    def setCore(value: TypeofCore): Self = this.set("Core", value.asInstanceOf[js.Any])
  }
  
}

