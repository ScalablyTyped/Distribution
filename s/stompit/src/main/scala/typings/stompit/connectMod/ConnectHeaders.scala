package typings.stompit.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectHeaders extends js.Object {
  var `accept-version`: js.UndefOr[String] = js.native
  var `heart-beat`: js.UndefOr[String] = js.native
  var host: js.UndefOr[String] = js.native
  var login: js.UndefOr[String] = js.native
  var passcode: js.UndefOr[String] = js.native
}

object ConnectHeaders {
  @scala.inline
  def apply(): ConnectHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectHeaders]
  }
  @scala.inline
  implicit class ConnectHeadersOps[Self <: ConnectHeaders] (val x: Self) extends AnyVal {
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
    def `setAccept-version`(value: String): Self = this.set("accept-version", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccept-version`: Self = this.set("accept-version", js.undefined)
    @scala.inline
    def `setHeart-beat`(value: String): Self = this.set("heart-beat", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHeart-beat`: Self = this.set("heart-beat", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogin: Self = this.set("login", js.undefined)
    @scala.inline
    def setPasscode(value: String): Self = this.set("passcode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscode: Self = this.set("passcode", js.undefined)
  }
  
}

