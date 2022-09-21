package typings.puppeteerCore

import typings.puppeteerCore.connectionMod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bidiPageMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/bidi/Page", "Page")
  @js.native
  open class Page protected ()
    extends typings.puppeteerCore.pageMod.Page {
    def this(connection: Connection, contextId: String) = this()
  }
}
