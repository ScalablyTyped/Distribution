package typings.puppeteerCore.libEsmPuppeteerTypesMod

import typings.puppeteerCore.libEsmPuppeteerCommonConnectionTransportMod.ConnectionTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "Connection")
@js.native
open class Connection protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.Connection {
  def this(url: String, transport: ConnectionTransport) = this()
  def this(url: String, transport: ConnectionTransport, delay: Double) = this()
}
/* static members */
object Connection {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/types", "Connection")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSession(session: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession): js.UndefOr[typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSession")(session.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.Connection]]
}
