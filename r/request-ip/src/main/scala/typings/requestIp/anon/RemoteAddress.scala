package typings.requestIp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteAddress extends js.Object {
  var remoteAddress: js.UndefOr[String] = js.native
}

object RemoteAddress {
  @scala.inline
  def apply(): RemoteAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteAddress]
  }
  @scala.inline
  implicit class RemoteAddressOps[Self <: RemoteAddress] (val x: Self) extends AnyVal {
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
    def setRemoteAddress(value: String): Self = this.set("remoteAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteAddress: Self = this.set("remoteAddress", js.undefined)
  }
  
}

