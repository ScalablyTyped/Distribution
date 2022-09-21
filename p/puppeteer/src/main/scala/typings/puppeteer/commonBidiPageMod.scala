package typings.puppeteer

import typings.puppeteer.bidiConnectionMod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonBidiPageMod {
  
  @JSImport("puppeteer/lib/esm/puppeteer/common/bidi/Page", "Page")
  @js.native
  open class Page protected ()
    extends typings.puppeteer.apiPageMod.Page {
    def this(connection: Connection, contextId: String) = this()
  }
}
