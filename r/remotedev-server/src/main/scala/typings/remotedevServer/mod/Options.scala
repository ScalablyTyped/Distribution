package typings.remotedevServer.mod

import typings.remotedevServer.remotedevServerStrings.http
import typings.remotedevServer.remotedevServerStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** The cert file for running a HTTPS server (`protocol` must be set to "https"). */
  var cert: js.UndefOr[String] = js.native
  
  /** Database configuration, can be an object or a path to a JSON configuration file. */
  var dbOptions: js.UndefOr[String] = js.native
  
  /** Hostname. */
  var hostname: js.UndefOr[String] = js.native
  
  /** The key file for running a HTTPS server (`protocol` must be set to "https"). */
  var key: js.UndefOr[String] = js.native
  
  var logHTTPRequests: js.UndefOr[Boolean] = js.native
  
  /** The socket server log level. */
  var logLevel: js.UndefOr[LogLevel] = js.native
  
  /** The key passphrase for running a HTTPS server (`protocol` must be set to "https"). */
  var passphrase: js.UndefOr[String] = js.native
  
  /** Port. */
  var port: js.UndefOr[Double] = js.native
  
  /** Protocol. */
  var protocol: js.UndefOr[http | https] = js.native
  
  /** The socket server websocket engine. */
  var wsEngine: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setDbOptions(value: String): Self = this.set("dbOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbOptions: Self = this.set("dbOptions", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLogHTTPRequests(value: Boolean): Self = this.set("logHTTPRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogHTTPRequests: Self = this.set("logHTTPRequests", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProtocol(value: http | https): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setWsEngine(value: String): Self = this.set("wsEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsEngine: Self = this.set("wsEngine", js.undefined)
  }
}
