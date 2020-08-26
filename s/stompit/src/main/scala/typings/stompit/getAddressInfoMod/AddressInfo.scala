package typings.stompit.getAddressInfoMod

import typings.stompit.connectMod.ConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressInfo extends js.Object {
  var connectArgs: ConnectOptions = js.native
  var host: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var pseudoUri: String = js.native
  var transport: String = js.native
  var transportPath: String = js.native
}

object AddressInfo {
  @scala.inline
  def apply(connectArgs: ConnectOptions, pseudoUri: String, transport: String, transportPath: String): AddressInfo = {
    val __obj = js.Dynamic.literal(connectArgs = connectArgs.asInstanceOf[js.Any], pseudoUri = pseudoUri.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any], transportPath = transportPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressInfo]
  }
  @scala.inline
  implicit class AddressInfoOps[Self <: AddressInfo] (val x: Self) extends AnyVal {
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
    def setConnectArgs(value: ConnectOptions): Self = this.set("connectArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setPseudoUri(value: String): Self = this.set("pseudoUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransport(value: String): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransportPath(value: String): Self = this.set("transportPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

