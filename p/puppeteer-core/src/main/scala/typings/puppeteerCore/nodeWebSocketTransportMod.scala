package typings.puppeteerCore

import typings.puppeteerCore.connectionTransportMod.ConnectionTransport
import typings.ws.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeWebSocketTransportMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/node/NodeWebSocketTransport", "NodeWebSocketTransport")
  @js.native
  class NodeWebSocketTransport protected ()
    extends StObject
       with ConnectionTransport {
    def this(ws: ^) = this()
    
    /* private */ var _ws: js.Any = js.native
    
    /* CompleteClass */
    override def close(): js.Any = js.native
    
    def send(message: String): Unit = js.native
    /* CompleteClass */
    override def send(string: js.Any): js.Any = js.native
  }
  /* static members */
  object NodeWebSocketTransport {
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/node/NodeWebSocketTransport", "NodeWebSocketTransport")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(url: String): js.Promise[NodeWebSocketTransport] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NodeWebSocketTransport]]
  }
}
