package typings.stompit.connectMod

import typings.node.netMod.Socket
import typings.stompit.socketMod.SocketOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseConnectOptions extends SocketOptions {
  // This connectionListener type comes from @types/node
  var connect: js.UndefOr[
    js.Function2[
      /* options */ ConnectOptions, 
      /* connectionListener */ js.UndefOr[js.Function0[Unit]], 
      Socket
    ]
  ] = js.native
  var connectHeaders: js.UndefOr[ConnectHeaders] = js.native
  var ssl: js.UndefOr[Boolean] = js.native
}

object BaseConnectOptions {
  @scala.inline
  def apply(): BaseConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseConnectOptions]
  }
  @scala.inline
  implicit class BaseConnectOptionsOps[Self <: BaseConnectOptions] (val x: Self) extends AnyVal {
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
    def setConnect(
      value: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[js.Function0[Unit]]) => Socket
    ): Self = this.set("connect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    @scala.inline
    def setConnectHeaders(value: ConnectHeaders): Self = this.set("connectHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectHeaders: Self = this.set("connectHeaders", js.undefined)
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
  }
  
}

