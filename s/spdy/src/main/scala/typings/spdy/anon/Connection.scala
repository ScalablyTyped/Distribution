package typings.spdy.anon

import typings.spdy.mod.server.Protocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var connection: js.UndefOr[AutoSpdy31] = js.native
  var plain: js.UndefOr[Boolean] = js.native
  var protocols: js.UndefOr[js.Array[Protocol]] = js.native
  var `x-forwarded-for`: js.UndefOr[Boolean] = js.native
}

object Connection {
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
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
    def setConnection(value: AutoSpdy31): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    @scala.inline
    def setProtocolsVarargs(value: Protocol*): Self = this.set("protocols", js.Array(value :_*))
    @scala.inline
    def setProtocols(value: js.Array[Protocol]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    @scala.inline
    def `setX-forwarded-for`(value: Boolean): Self = this.set("x-forwarded-for", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-forwarded-for`: Self = this.set("x-forwarded-for", js.undefined)
  }
  
}

