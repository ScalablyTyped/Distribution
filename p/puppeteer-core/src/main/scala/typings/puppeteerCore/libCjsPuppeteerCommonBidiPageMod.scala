package typings.puppeteerCore

import typings.puppeteerCore.libCjsPuppeteerCommonBidiConnectionMod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonBidiPageMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/bidi/Page", "Page")
  @js.native
  open class Page protected ()
    extends typings.puppeteerCore.libCjsPuppeteerApiPageMod.Page {
    def this(connection: Connection, contextId: String) = this()
  }
}
