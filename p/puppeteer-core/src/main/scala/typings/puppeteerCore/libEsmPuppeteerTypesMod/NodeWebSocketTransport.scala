package typings.puppeteerCore.libEsmPuppeteerTypesMod

import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "NodeWebSocketTransport")
@js.native
open class NodeWebSocketTransport protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonNodeWebSocketTransportMod.NodeWebSocketTransport {
  def this(ws: WebSocket) = this()
}
/* static members */
object NodeWebSocketTransport {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/types", "NodeWebSocketTransport")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(url: String): js.Promise[
    typings.puppeteerCore.libEsmPuppeteerCommonNodeWebSocketTransportMod.NodeWebSocketTransport
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.puppeteerCore.libEsmPuppeteerCommonNodeWebSocketTransportMod.NodeWebSocketTransport
  ]]
}
