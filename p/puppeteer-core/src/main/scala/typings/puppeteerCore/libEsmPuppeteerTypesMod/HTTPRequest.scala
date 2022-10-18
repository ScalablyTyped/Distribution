package typings.puppeteerCore.libEsmPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "HTTPRequest")
@js.native
open class HTTPRequest protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest {
  def this(
    client: typings.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.CDPSession,
    frame: Null,
    interceptionId: String,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
  def this(
    client: typings.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.CDPSession,
    frame: Null,
    interceptionId: Unit,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.CDPSession,
    frame: typings.puppeteerCore.libEsmPuppeteerCommonFrameMod.Frame,
    interceptionId: String,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
  def this(
    client: typings.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.CDPSession,
    frame: typings.puppeteerCore.libEsmPuppeteerCommonFrameMod.Frame,
    interceptionId: Unit,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteerCore.libEsmPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
}
