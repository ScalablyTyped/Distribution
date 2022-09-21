package typings.puppeteer.esmPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/esm/puppeteer/types", "HTTPRequest")
@js.native
open class HTTPRequest protected ()
  extends typings.puppeteer.commonHttprequestMod.HTTPRequest {
  def this(
    client: typings.puppeteer.commonHttprequestMod.CDPSession,
    frame: Null,
    interceptionId: String,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteer.commonHttprequestMod.HTTPRequest]
  ) = this()
  def this(
    client: typings.puppeteer.commonHttprequestMod.CDPSession,
    frame: Null,
    interceptionId: Unit,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteer.commonHttprequestMod.HTTPRequest]
  ) = this()
  /**
    * @internal
    */
  def this(
    client: typings.puppeteer.commonHttprequestMod.CDPSession,
    frame: typings.puppeteer.commonFrameMod.Frame,
    interceptionId: String,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteer.commonHttprequestMod.HTTPRequest]
  ) = this()
  def this(
    client: typings.puppeteer.commonHttprequestMod.CDPSession,
    frame: typings.puppeteer.commonFrameMod.Frame,
    interceptionId: Unit,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteer.commonHttprequestMod.HTTPRequest]
  ) = this()
}
