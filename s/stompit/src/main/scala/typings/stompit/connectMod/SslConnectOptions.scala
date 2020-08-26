package typings.stompit.connectMod

import typings.node.tlsMod.ConnectionOptions
import typings.stompit.stompitBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslConnectOptions
  extends ConnectionOptions
     with BaseConnectOptions
     with ConnectOptions {
  @JSName("ssl")
  var ssl_SslConnectOptions: `true` = js.native
}

object SslConnectOptions {
  @scala.inline
  def apply(ssl: `true`): SslConnectOptions = {
    val __obj = js.Dynamic.literal(ssl = ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SslConnectOptions]
  }
  @scala.inline
  implicit class SslConnectOptionsOps[Self <: SslConnectOptions] (val x: Self) extends AnyVal {
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
    def setSsl(value: `true`): Self = this.set("ssl", value.asInstanceOf[js.Any])
  }
  
}

