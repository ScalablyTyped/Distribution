package typings.puppeteerCore.libCjsPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "HTTPRequest")
@js.native
open class HTTPRequest protected ()
  extends typings.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.HTTPRequest {
  def this(
    client: typings.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.CDPSession,
    frame: Null,
    interceptionId: String,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
  def this(
    client: typings.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.CDPSession,
    frame: Null,
    interceptionId: Unit,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.CDPSession,
    frame: typings.puppeteerCore.libCjsPuppeteerCommonFrameMod.Frame,
    interceptionId: String,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
  def this(
    client: typings.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.CDPSession,
    frame: typings.puppeteerCore.libCjsPuppeteerCommonFrameMod.Frame,
    interceptionId: Unit,
    allowInterception: Boolean,
    event: RequestWillBeSentEvent,
    redirectChain: js.Array[typings.puppeteerCore.libCjsPuppeteerCommonHttprequestMod.HTTPRequest]
  ) = this()
}
