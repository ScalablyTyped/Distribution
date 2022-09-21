package typings.puppeteerCore

import typings.puppeteerCore.bidiConnectionMod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bidiBrowserContextMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/bidi/BrowserContext", "BrowserContext")
  @js.native
  open class BrowserContext protected ()
    extends typings.puppeteerCore.apiBrowserMod.BrowserContext {
    def this(connection: Connection) = this()
    
    /* private */ var `private`: Any = js.native
  }
}
