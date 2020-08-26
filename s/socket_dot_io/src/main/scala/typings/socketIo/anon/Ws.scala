package typings.socketIo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ws extends js.Object {
  var ws: js.Any = js.native
}

object Ws {
  @scala.inline
  def apply(ws: js.Any): Ws = {
    val __obj = js.Dynamic.literal(ws = ws.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ws]
  }
  @scala.inline
  implicit class WsOps[Self <: Ws] (val x: Self) extends AnyVal {
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
    def setWs(value: js.Any): Self = this.set("ws", value.asInstanceOf[js.Any])
  }
  
}

