package typings.puppeteerCore.apiDocsEntryMod

import typings.devtoolsProtocol.mod.Protocol.Network.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "HTTPResponse")
@js.native
class HTTPResponse protected ()
  extends typings.puppeteerCore.commonHttpresponseMod.HTTPResponse {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    request: typings.puppeteerCore.commonHttprequestMod.HTTPRequest,
    responsePayload: Response
  ) = this()
}
