package typings.sccBrokerClient.clientPoolMod

import typings.jsonwebtoken.mod.Secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientPoolOptions extends js.Object {
  var authKey: js.UndefOr[Secret] = js.native
  var clientCount: js.UndefOr[Double] = js.native
  var targetURI: String = js.native
}

object ClientPoolOptions {
  @scala.inline
  def apply(targetURI: String): ClientPoolOptions = {
    val __obj = js.Dynamic.literal(targetURI = targetURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPoolOptions]
  }
  @scala.inline
  implicit class ClientPoolOptionsOps[Self <: ClientPoolOptions] (val x: Self) extends AnyVal {
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
    def setTargetURI(value: String): Self = this.set("targetURI", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthKey(value: Secret): Self = this.set("authKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthKey: Self = this.set("authKey", js.undefined)
    @scala.inline
    def setClientCount(value: Double): Self = this.set("clientCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientCount: Self = this.set("clientCount", js.undefined)
  }
  
}

