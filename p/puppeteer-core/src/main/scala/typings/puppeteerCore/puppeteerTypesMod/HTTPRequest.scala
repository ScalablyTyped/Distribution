package typings.puppeteerCore.puppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "HTTPRequest")
@js.native
open class HTTPRequest protected ()
  extends typings.puppeteerCore.httprequestMod.HTTPRequest {
  def this(
    client: typings.puppeteerCore.httprequestMod.CDPSession,
    frame: Null,
    interceptionId: String,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteerCore.httprequestMod.HTTPRequest]
  ) = this()
  def this(
    client: typings.puppeteerCore.httprequestMod.CDPSession,
    frame: Null,
    interceptionId: Unit,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteerCore.httprequestMod.HTTPRequest]
  ) = this()
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.httprequestMod.CDPSession,
    frame: typings.puppeteerCore.frameMod.Frame,
    interceptionId: String,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteerCore.httprequestMod.HTTPRequest]
  ) = this()
  def this(
    client: typings.puppeteerCore.httprequestMod.CDPSession,
    frame: typings.puppeteerCore.frameMod.Frame,
    interceptionId: Unit,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteerCore.httprequestMod.HTTPRequest]
  ) = this()
}
