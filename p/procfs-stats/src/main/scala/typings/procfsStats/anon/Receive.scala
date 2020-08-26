package typings.procfsStats.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Receive extends js.Object {
  var Receive: String = js.native
  var Transmit: String = js.native
}

object Receive {
  @scala.inline
  def apply(Receive: String, Transmit: String): Receive = {
    val __obj = js.Dynamic.literal(Receive = Receive.asInstanceOf[js.Any], Transmit = Transmit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Receive]
  }
  @scala.inline
  implicit class ReceiveOps[Self <: Receive] (val x: Self) extends AnyVal {
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
    def setReceive(value: String): Self = this.set("Receive", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransmit(value: String): Self = this.set("Transmit", value.asInstanceOf[js.Any])
  }
  
}

