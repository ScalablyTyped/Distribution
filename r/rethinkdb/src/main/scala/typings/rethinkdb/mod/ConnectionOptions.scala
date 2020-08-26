package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Connection options.
  *
  * See: https://rethinkdb.com/api/javascript/connect/
  */
@js.native
trait ConnectionOptions extends js.Object {
  /** The default database (default `test`) */
  var db: js.UndefOr[String] = js.native
  /** The host to connect to (default `localhost`) */
  var host: js.UndefOr[String] = js.native
  /** The password for the user account to connect as (default `''`, empty) */
  var password: js.UndefOr[String] = js.native
  /** The port to connect on (default `28015`) */
  var port: js.UndefOr[Double] = js.native
  /**
    * A hash of options to support SSL connections (default `null`). Currently,
    * there is only one option available, and if the `ssl` option is specified,
    * this key is required.
    */
  var ssl: js.UndefOr[typings.node.tlsMod.ConnectionOptions] = js.native
  /** Timeout period in seconds for the connection to be opened (default `20`) */
  var timeout: js.UndefOr[Double] = js.native
  /** The user account to connect as (default `admin`) */
  var user: js.UndefOr[String] = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
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
    def setDb(value: String): Self = this.set("db", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDb: Self = this.set("db", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setSsl(value: typings.node.tlsMod.ConnectionOptions): Self = this.set("ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

