package typings.siesta.Siesta.Test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWaitForReturn extends js.Object {
  var force: js.Function = js.native
}

object IWaitForReturn {
  @scala.inline
  def apply(force: js.Function): IWaitForReturn = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWaitForReturn]
  }
  @scala.inline
  implicit class IWaitForReturnOps[Self <: IWaitForReturn] (val x: Self) extends AnyVal {
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
    def setForce(value: js.Function): Self = this.set("force", value.asInstanceOf[js.Any])
  }
  
}

