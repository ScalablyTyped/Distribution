package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.CloseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClosureData extends CloseData {
  var socket: typings.socketclusterServer.serversocketMod.^ = js.native
}

object ClosureData {
  @scala.inline
  def apply(code: Double, reason: String, socket: typings.socketclusterServer.serversocketMod.^): ClosureData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosureData]
  }
  @scala.inline
  implicit class ClosureDataOps[Self <: ClosureData] (val x: Self) extends AnyVal {
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
    def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = this.set("socket", value.asInstanceOf[js.Any])
  }
  
}

