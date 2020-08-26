package typings.rsmq.mod

import typings.redis.mod.ClientOpts
import typings.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorOptions extends js.Object {
  var client: js.UndefOr[RedisClient] = js.native
  var host: js.UndefOr[String] = js.native
  var ns: js.UndefOr[String] = js.native
  var options: js.UndefOr[ClientOpts] = js.native
  var password: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var realtime: js.UndefOr[Boolean] = js.native
}

object ConstructorOptions {
  @scala.inline
  def apply(): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorOptions]
  }
  @scala.inline
  implicit class ConstructorOptionsOps[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
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
    def setClient(value: RedisClient): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setNs(value: String): Self = this.set("ns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNs: Self = this.set("ns", js.undefined)
    @scala.inline
    def setOptions(value: ClientOpts): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setRealtime(value: Boolean): Self = this.set("realtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealtime: Self = this.set("realtime", js.undefined)
  }
  
}

