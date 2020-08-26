package typings.simpleUrlCache.mod

import typings.simpleUrlCache.mod.privateN.StorageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisStorageConfig extends StorageConfig {
  var db: js.UndefOr[String] = js.native
  var host: String = js.native
  var password: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var port: Double = js.native
  var socket_keepalive: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[String] = js.native
}

object RedisStorageConfig {
  @scala.inline
  def apply(host: String, port: Double, `type`: String): RedisStorageConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedisStorageConfig]
  }
  @scala.inline
  implicit class RedisStorageConfigOps[Self <: RedisStorageConfig] (val x: Self) extends AnyVal {
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setDb(value: String): Self = this.set("db", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDb: Self = this.set("db", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSocket_keepalive(value: Boolean): Self = this.set("socket_keepalive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocket_keepalive: Self = this.set("socket_keepalive", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

