package typings.puppeteer

import typings.puppeteer.connectionTransportMod.ConnectionTransport
import typings.ws.mod.Data
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeWebSocketTransportMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/node/NodeWebSocketTransport", "NodeWebSocketTransport")
  @js.native
  open class NodeWebSocketTransport protected ()
    extends StObject
       with ConnectionTransport {
    def this(ws: WebSocket) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    @JSName("onmessage")
    var onmessage_NodeWebSocketTransport: js.UndefOr[js.Function1[/* message */ Data, Unit]] = js.native
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def send(message: String): Unit = js.native
  }
  /* static members */
  object NodeWebSocketTransport {
    
    @JSImport("puppeteer/lib/cjs/puppeteer/node/NodeWebSocketTransport", "NodeWebSocketTransport")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(url: String): js.Promise[NodeWebSocketTransport] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NodeWebSocketTransport]]
  }
}
