package typings.socketIoRedis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to the redis server when creating it
  */
@js.native
trait SocketIORedisOptions extends js.Object {
  /**
    * The optional password to connect to redis on
    */
  var auth_pass: js.UndefOr[Double | String] = js.native
  /**
    * The optional host to connect to redis on
    * @default localhost
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The optional name of the key to pub/sub events on as prefix
    * @default socket.io
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The optional port to connect to redis on
    * @default 6379
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * The optional redis client to publish events on
    */
  var pubClient: js.UndefOr[js.Any] = js.native
  /**
    * The optional redis client to subscribe to events on
    */
  var subClient: js.UndefOr[js.Any] = js.native
}

object SocketIORedisOptions {
  @scala.inline
  def apply(): SocketIORedisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketIORedisOptions]
  }
  @scala.inline
  implicit class SocketIORedisOptionsOps[Self <: SocketIORedisOptions] (val x: Self) extends AnyVal {
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
    def setAuth_pass(value: Double | String): Self = this.set("auth_pass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth_pass: Self = this.set("auth_pass", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPubClient(value: js.Any): Self = this.set("pubClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubClient: Self = this.set("pubClient", js.undefined)
    @scala.inline
    def setSubClient(value: js.Any): Self = this.set("subClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubClient: Self = this.set("subClient", js.undefined)
  }
  
}

