package typings.primus.mod

import typings.node.httpMod.IncomingMessage
import typings.primus.anon.Authenticate
import typings.primus.primusStrings.browserchannel
import typings.primus.primusStrings.engineDotio
import typings.primus.primusStrings.faye
import typings.primus.primusStrings.sockjs
import typings.primus.primusStrings.uws
import typings.primus.primusStrings.websockets
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrimusOptions extends js.Object {
  
  var authorization: js.UndefOr[AuthorizationHandler] = js.native
  
  var compression: js.UndefOr[Boolean] = js.native
  
  var credentials: js.UndefOr[Boolean] = js.native
  
  var exposed: js.UndefOr[Boolean] = js.native
  
  var global: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[Boolean] = js.native
  
  var idGenerator: js.UndefOr[js.Function0[String]] = js.native
  
  var maxAge: js.UndefOr[String] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var methods: js.UndefOr[String] = js.native
  
  // Cors
  var origins: js.UndefOr[String] = js.native
  
  var parser: js.UndefOr[String | Parser] = js.native
  
  var pathname: js.UndefOr[String] = js.native
  
  var pingInterval: js.UndefOr[Double] = js.native
  
  var plugin: js.UndefOr[String | js.Object] = js.native
  
  var transformer: js.UndefOr[websockets | engineDotio | browserchannel | sockjs | faye | uws] = js.native
  
  var transport: js.UndefOr[js.Object] = js.native
}
object PrimusOptions {
  
  @scala.inline
  def apply(): PrimusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimusOptions]
  }
  
  @scala.inline
  implicit class PrimusOptionsOps[Self <: PrimusOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthorization(
      value: (/* req */ IncomingMessage, /* done */ js.Function1[/* err */ js.UndefOr[String | Error | Authenticate], Unit]) => Unit
    ): Self = this.set("authorization", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAuthorization: Self = this.set("authorization", js.undefined)
    
    @scala.inline
    def setCompression(value: Boolean): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setCredentials(value: Boolean): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setExposed(value: Boolean): Self = this.set("exposed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposed: Self = this.set("exposed", js.undefined)
    
    @scala.inline
    def setGlobal(value: String): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    
    @scala.inline
    def setHeaders(value: Boolean): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setIdGenerator(value: () => String): Self = this.set("idGenerator", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIdGenerator: Self = this.set("idGenerator", js.undefined)
    
    @scala.inline
    def setMaxAge(value: String): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMethods(value: String): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setOrigins(value: String): Self = this.set("origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigins: Self = this.set("origins", js.undefined)
    
    @scala.inline
    def setParser(value: String | Parser): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathname: Self = this.set("pathname", js.undefined)
    
    @scala.inline
    def setPingInterval(value: Double): Self = this.set("pingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePingInterval: Self = this.set("pingInterval", js.undefined)
    
    @scala.inline
    def setPlugin(value: String | js.Object): Self = this.set("plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    
    @scala.inline
    def setTransformer(value: websockets | engineDotio | browserchannel | sockjs | faye | uws): Self = this.set("transformer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformer: Self = this.set("transformer", js.undefined)
    
    @scala.inline
    def setTransport(value: js.Object): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
  }
}
