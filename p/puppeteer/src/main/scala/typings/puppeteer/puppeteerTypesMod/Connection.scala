package typings.puppeteer.puppeteerTypesMod

import typings.puppeteer.connectionTransportMod.ConnectionTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "Connection")
@js.native
open class Connection protected ()
  extends typings.puppeteer.commonConnectionMod.Connection {
  def this(url: String, transport: ConnectionTransport) = this()
  def this(url: String, transport: ConnectionTransport, delay: Double) = this()
}
/* static members */
object Connection {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/types", "Connection")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSession(session: typings.puppeteer.commonConnectionMod.CDPSession): js.UndefOr[typings.puppeteer.commonConnectionMod.Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSession")(session.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.puppeteer.commonConnectionMod.Connection]]
}
