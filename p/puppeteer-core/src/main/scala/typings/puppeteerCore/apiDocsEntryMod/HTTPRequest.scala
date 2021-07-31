package typings.puppeteerCore.apiDocsEntryMod

import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "HTTPRequest")
@js.native
class HTTPRequest protected ()
  extends typings.puppeteerCore.commonHttprequestMod.HTTPRequest {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    frame: typings.puppeteerCore.commonFrameManagerMod.Frame,
    interceptionId: String,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteerCore.commonHttprequestMod.HTTPRequest]
  ) = this()
}
