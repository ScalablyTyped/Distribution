package typings.redis.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOpts extends js.Object {
  var auth_pass: js.UndefOr[String] = js.native
  var connect_timeout: js.UndefOr[Double] = js.native
  var db: js.UndefOr[String | Double] = js.native
  var detect_buffers: js.UndefOr[Boolean] = js.native
  var enable_offline_queue: js.UndefOr[Boolean] = js.native
  var family: js.UndefOr[String] = js.native
  var host: js.UndefOr[String] = js.native
  var max_attempts: js.UndefOr[Double] = js.native
  var no_ready_check: js.UndefOr[Boolean] = js.native
  var parser: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var prefix: js.UndefOr[String] = js.native
  var rename_commands: js.UndefOr[StringDictionary[String] | Null] = js.native
  var retry_max_delay: js.UndefOr[Double] = js.native
  var retry_strategy: js.UndefOr[RetryStrategy] = js.native
  var retry_unfulfilled_commands: js.UndefOr[Boolean] = js.native
  var return_buffers: js.UndefOr[Boolean] = js.native
  var socket_initial_delay: js.UndefOr[Double] = js.native
  var socket_keepalive: js.UndefOr[Boolean] = js.native
  var string_numbers: js.UndefOr[Boolean] = js.native
  var tls: js.UndefOr[js.Any] = js.native
  var url: js.UndefOr[String] = js.native
}

object ClientOpts {
  @scala.inline
  def apply(): ClientOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOpts]
  }
  @scala.inline
  implicit class ClientOptsOps[Self <: ClientOpts] (val x: Self) extends AnyVal {
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
    def setAuth_pass(value: String): Self = this.set("auth_pass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth_pass: Self = this.set("auth_pass", js.undefined)
    @scala.inline
    def setConnect_timeout(value: Double): Self = this.set("connect_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnect_timeout: Self = this.set("connect_timeout", js.undefined)
    @scala.inline
    def setDb(value: String | Double): Self = this.set("db", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDb: Self = this.set("db", js.undefined)
    @scala.inline
    def setDetect_buffers(value: Boolean): Self = this.set("detect_buffers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetect_buffers: Self = this.set("detect_buffers", js.undefined)
    @scala.inline
    def setEnable_offline_queue(value: Boolean): Self = this.set("enable_offline_queue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable_offline_queue: Self = this.set("enable_offline_queue", js.undefined)
    @scala.inline
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setMax_attempts(value: Double): Self = this.set("max_attempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_attempts: Self = this.set("max_attempts", js.undefined)
    @scala.inline
    def setNo_ready_check(value: Boolean): Self = this.set("no_ready_check", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNo_ready_check: Self = this.set("no_ready_check", js.undefined)
    @scala.inline
    def setParser(value: String): Self = this.set("parser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setRename_commands(value: StringDictionary[String]): Self = this.set("rename_commands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRename_commands: Self = this.set("rename_commands", js.undefined)
    @scala.inline
    def setRename_commandsNull: Self = this.set("rename_commands", null)
    @scala.inline
    def setRetry_max_delay(value: Double): Self = this.set("retry_max_delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry_max_delay: Self = this.set("retry_max_delay", js.undefined)
    @scala.inline
    def setRetry_strategy(value: /* options */ RetryStrategyOptions => js.UndefOr[Double | Error]): Self = this.set("retry_strategy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRetry_strategy: Self = this.set("retry_strategy", js.undefined)
    @scala.inline
    def setRetry_unfulfilled_commands(value: Boolean): Self = this.set("retry_unfulfilled_commands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry_unfulfilled_commands: Self = this.set("retry_unfulfilled_commands", js.undefined)
    @scala.inline
    def setReturn_buffers(value: Boolean): Self = this.set("return_buffers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_buffers: Self = this.set("return_buffers", js.undefined)
    @scala.inline
    def setSocket_initial_delay(value: Double): Self = this.set("socket_initial_delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocket_initial_delay: Self = this.set("socket_initial_delay", js.undefined)
    @scala.inline
    def setSocket_keepalive(value: Boolean): Self = this.set("socket_keepalive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocket_keepalive: Self = this.set("socket_keepalive", js.undefined)
    @scala.inline
    def setString_numbers(value: Boolean): Self = this.set("string_numbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteString_numbers: Self = this.set("string_numbers", js.undefined)
    @scala.inline
    def setTls(value: js.Any): Self = this.set("tls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

