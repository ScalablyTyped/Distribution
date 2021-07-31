package typings.puppeteerCore.mod

import typings.devtoolsProtocol.mod.Protocol.Network.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "HTTPResponse")
@js.native
class HTTPResponse protected ()
  extends typings.puppeteerCore.httpresponseMod.HTTPResponse {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.connectionMod.CDPSession,
    request: typings.puppeteerCore.httprequestMod.HTTPRequest,
    responsePayload: Response
  ) = this()
}
