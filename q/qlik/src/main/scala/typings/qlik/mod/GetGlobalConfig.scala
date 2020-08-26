package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGlobalConfig extends js.Object {
  var host: String = js.native
  var identity: String = js.native
  var isSecure: Boolean = js.native
  var port: String = js.native
  var prefix: String = js.native
}

object GetGlobalConfig {
  @scala.inline
  def apply(host: String, identity: String, isSecure: Boolean, port: String, prefix: String): GetGlobalConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGlobalConfig]
  }
  @scala.inline
  implicit class GetGlobalConfigOps[Self <: GetGlobalConfig] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: String): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSecure(value: Boolean): Self = this.set("isSecure", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
  }
  
}

