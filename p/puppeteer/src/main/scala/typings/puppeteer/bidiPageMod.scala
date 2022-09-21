package typings.puppeteer

import typings.puppeteer.connectionMod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bidiPageMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/common/bidi/Page", "Page")
  @js.native
  open class Page protected ()
    extends typings.puppeteer.pageMod.Page {
    def this(connection: Connection, contextId: String) = this()
  }
}
