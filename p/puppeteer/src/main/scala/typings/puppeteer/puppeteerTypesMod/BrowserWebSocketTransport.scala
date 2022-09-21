package typings.puppeteer.puppeteerTypesMod

import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "BrowserWebSocketTransport")
@js.native
open class BrowserWebSocketTransport protected ()
  extends typings.puppeteer.browserWebSocketTransportMod.BrowserWebSocketTransport {
  def this(ws: WebSocket) = this()
}
/* static members */
object BrowserWebSocketTransport {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/types", "BrowserWebSocketTransport")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(url: String): js.Promise[typings.puppeteer.browserWebSocketTransportMod.BrowserWebSocketTransport] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.puppeteer.browserWebSocketTransportMod.BrowserWebSocketTransport]]
}
