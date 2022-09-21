package typings.puppeteer.puppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Network.Response
import typings.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedExtraInfoEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "HTTPResponse")
@js.native
open class HTTPResponse protected ()
  extends typings.puppeteer.httpresponseMod.HTTPResponse {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteer.httpresponseMod.CDPSession,
    request: typings.puppeteer.httprequestMod.HTTPRequest,
    responsePayload: Response
  ) = this()
  def this(
    client: typings.puppeteer.httpresponseMod.CDPSession,
    request: typings.puppeteer.httprequestMod.HTTPRequest,
    responsePayload: Response,
    extraInfo: ResponseReceivedExtraInfoEvent
  ) = this()
}
