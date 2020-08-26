package typings.reactGateway.gatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayProps extends js.Object {
  var into: String = js.native
}

object GatewayProps {
  @scala.inline
  def apply(into: String): GatewayProps = {
    val __obj = js.Dynamic.literal(into = into.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayProps]
  }
  @scala.inline
  implicit class GatewayPropsOps[Self <: GatewayProps] (val x: Self) extends AnyVal {
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
    def setInto(value: String): Self = this.set("into", value.asInstanceOf[js.Any])
  }
  
}

