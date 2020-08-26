package typings.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnInboundInvokeValue extends js.Object {
  var data: js.Any = js.native
  var procedure: String = js.native
}

object OnInboundInvokeValue {
  @scala.inline
  def apply(data: js.Any, procedure: String): OnInboundInvokeValue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnInboundInvokeValue]
  }
  @scala.inline
  implicit class OnInboundInvokeValueOps[Self <: OnInboundInvokeValue] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcedure(value: String): Self = this.set("procedure", value.asInstanceOf[js.Any])
  }
  
}

