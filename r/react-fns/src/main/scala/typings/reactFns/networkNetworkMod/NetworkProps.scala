package typings.reactFns.networkNetworkMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkProps extends js.Object {
  var offlineAt: js.UndefOr[Date] = js.native
  var online: Boolean = js.native
}

object NetworkProps {
  @scala.inline
  def apply(online: Boolean): NetworkProps = {
    val __obj = js.Dynamic.literal(online = online.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkProps]
  }
  @scala.inline
  implicit class NetworkPropsOps[Self <: NetworkProps] (val x: Self) extends AnyVal {
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
    def setOnline(value: Boolean): Self = this.set("online", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfflineAt(value: Date): Self = this.set("offlineAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfflineAt: Self = this.set("offlineAt", js.undefined)
  }
  
}

