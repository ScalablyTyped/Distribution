package typings.reactRelay.anon

import typings.reactRelay.mod.RelayPaginationProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayRelayPaginationProp extends js.Object {
  var relay: RelayPaginationProp = js.native
}

object RelayRelayPaginationProp {
  @scala.inline
  def apply(relay: RelayPaginationProp): RelayRelayPaginationProp = {
    val __obj = js.Dynamic.literal(relay = relay.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayRelayPaginationProp]
  }
  @scala.inline
  implicit class RelayRelayPaginationPropOps[Self <: RelayRelayPaginationProp] (val x: Self) extends AnyVal {
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
    def setRelay(value: RelayPaginationProp): Self = this.set("relay", value.asInstanceOf[js.Any])
  }
  
}

