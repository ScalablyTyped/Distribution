package typings.puppeteerCore.mod

import typings.puppeteerCore.connectionTransportMod.ConnectionTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "Connection")
@js.native
class Connection protected ()
  extends typings.puppeteerCore.connectionMod.Connection {
  def this(url: String, transport: ConnectionTransport) = this()
  def this(url: String, transport: ConnectionTransport, delay: Double) = this()
}
/* static members */
object Connection {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "Connection")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromSession(session: typings.puppeteerCore.connectionMod.CDPSession): typings.puppeteerCore.connectionMod.Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSession")(session.asInstanceOf[js.Any]).asInstanceOf[typings.puppeteerCore.connectionMod.Connection]
}
