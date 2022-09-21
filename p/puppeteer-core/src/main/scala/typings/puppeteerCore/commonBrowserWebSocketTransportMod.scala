package typings.puppeteerCore

import typings.puppeteerCore.commonConnectionTransportMod.ConnectionTransport
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonBrowserWebSocketTransportMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/BrowserWebSocketTransport", "BrowserWebSocketTransport")
  @js.native
  open class BrowserWebSocketTransport protected ()
    extends StObject
       with ConnectionTransport {
    def this(ws: WebSocket) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def send(message: String): Unit = js.native
  }
  /* static members */
  object BrowserWebSocketTransport {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/BrowserWebSocketTransport", "BrowserWebSocketTransport")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(url: String): js.Promise[BrowserWebSocketTransport] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BrowserWebSocketTransport]]
  }
}
