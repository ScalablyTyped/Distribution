package typings.puppeteerCore.apiDocsEntryMod

import typings.puppeteerCore.commonConnectionTransportMod.ConnectionTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "Connection")
@js.native
class Connection protected ()
  extends typings.puppeteerCore.commonConnectionMod.Connection {
  def this(url: String, transport: ConnectionTransport) = this()
  def this(url: String, transport: ConnectionTransport, delay: Double) = this()
}
/* static members */
object Connection {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "Connection")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSession(session: typings.puppeteerCore.commonConnectionMod.CDPSession): typings.puppeteerCore.commonConnectionMod.Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSession")(session.asInstanceOf[js.Any]).asInstanceOf[typings.puppeteerCore.commonConnectionMod.Connection]
}
