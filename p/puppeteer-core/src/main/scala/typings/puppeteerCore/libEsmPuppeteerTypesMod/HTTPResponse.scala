package typings.puppeteerCore.libEsmPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Network.Response
import typings.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedExtraInfoEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "HTTPResponse")
@js.native
open class HTTPResponse protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonHttpresponseMod.HTTPResponse {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.libEsmPuppeteerCommonHttpresponseMod.CDPSession,
    request: typings.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest,
    responsePayload: Response
  ) = this()
  def this(
    client: typings.puppeteerCore.libEsmPuppeteerCommonHttpresponseMod.CDPSession,
    request: typings.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest,
    responsePayload: Response,
    extraInfo: ResponseReceivedExtraInfoEvent
  ) = this()
}
