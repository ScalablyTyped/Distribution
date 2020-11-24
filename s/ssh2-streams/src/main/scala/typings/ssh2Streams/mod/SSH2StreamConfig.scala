package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSH2StreamConfig extends js.Object {
  
  /**
    * This option allows you to explicitly override the default transport layer algorithms used for the connection. Each value must be an array of valid algorithms for that category. The order of the algorithms in the arrays are important, with the most favorable being first.
    */
  var algorithms: js.UndefOr[Algorithms] = js.native
  
  /**
    * A message that is sent to clients immediately upon connection, before handshaking begins.
    */
  var banner: js.UndefOr[String] = js.native
  
  /**
    * Set this to a function that receives a single string argument to get detailed (local) debug information.
    */
  var debug: js.UndefOr[js.Function1[/* information */ String, _]] = js.native
  
  /**
    * This is the highWaterMark to use for the parser stream.
    * @default 32 * 1024
    */
  var highWaterMark: js.UndefOr[Double] = js.native
  
  /**
    * If in server mode, an object keyed on host key format.
    */
  var hostKeys: js.UndefOr[HostKeys] = js.native
  
  /**
    * A custom server software name/version identifier.
    * @default 'ssh2js' + moduleVersion + 'srv'
    */
  var ident: js.UndefOr[String] = js.native
  
  /**
    * This is the maximum packet size that will be accepted. It should be 35000 bytes or larger to be compatible with other SSH2 implementations.
    * @default 35000
    */
  var maxPacketSize: js.UndefOr[Double] = js.native
  
  /**
    * Set to true to create an instance in server mode.
    */
  var server: js.UndefOr[Boolean] = js.native
}
object SSH2StreamConfig {
  
  @scala.inline
  def apply(): SSH2StreamConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSH2StreamConfig]
  }
  
  @scala.inline
  implicit class SSH2StreamConfigOps[Self <: SSH2StreamConfig] (val x: Self) extends AnyVal {
    
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
    def setAlgorithms(value: Algorithms): Self = this.set("algorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithms: Self = this.set("algorithms", js.undefined)
    
    @scala.inline
    def setBanner(value: String): Self = this.set("banner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBanner: Self = this.set("banner", js.undefined)
    
    @scala.inline
    def setDebug(value: /* information */ String => _): Self = this.set("debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
    
    @scala.inline
    def setHostKeys(value: HostKeys): Self = this.set("hostKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostKeys: Self = this.set("hostKeys", js.undefined)
    
    @scala.inline
    def setIdent(value: String): Self = this.set("ident", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdent: Self = this.set("ident", js.undefined)
    
    @scala.inline
    def setMaxPacketSize(value: Double): Self = this.set("maxPacketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPacketSize: Self = this.set("maxPacketSize", js.undefined)
    
    @scala.inline
    def setServer(value: Boolean): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
}
