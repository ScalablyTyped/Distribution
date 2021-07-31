package typings.puppeteerCore.mod

import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "HTTPRequest")
@js.native
class HTTPRequest protected ()
  extends typings.puppeteerCore.httprequestMod.HTTPRequest {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.connectionMod.CDPSession,
    frame: typings.puppeteerCore.frameManagerMod.Frame,
    interceptionId: String,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteerCore.httprequestMod.HTTPRequest]
  ) = this()
}
