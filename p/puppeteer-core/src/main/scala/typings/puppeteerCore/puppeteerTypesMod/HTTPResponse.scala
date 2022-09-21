package typings.puppeteerCore.puppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Network.Response
import typings.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedExtraInfoEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "HTTPResponse")
@js.native
open class HTTPResponse protected ()
  extends typings.puppeteerCore.httpresponseMod.HTTPResponse {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.httpresponseMod.CDPSession,
    request: typings.puppeteerCore.httprequestMod.HTTPRequest,
    responsePayload: Response
  ) = this()
  def this(
    client: typings.puppeteerCore.httpresponseMod.CDPSession,
    request: typings.puppeteerCore.httprequestMod.HTTPRequest,
    responsePayload: Response,
    extraInfo: ResponseReceivedExtraInfoEvent
  ) = this()
}
