package typings.reactRelay.anon

import typings.reactRelay.mod.RelayRefetchProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayRelayRefetchProp extends js.Object {
  var relay: RelayRefetchProp = js.native
}

object RelayRelayRefetchProp {
  @scala.inline
  def apply(relay: RelayRefetchProp): RelayRelayRefetchProp = {
    val __obj = js.Dynamic.literal(relay = relay.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayRelayRefetchProp]
  }
  @scala.inline
  implicit class RelayRelayRefetchPropOps[Self <: RelayRelayRefetchProp] (val x: Self) extends AnyVal {
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
    def setRelay(value: RelayRefetchProp): Self = this.set("relay", value.asInstanceOf[js.Any])
  }
  
}

