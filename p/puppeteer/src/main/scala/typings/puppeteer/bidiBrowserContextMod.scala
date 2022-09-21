package typings.puppeteer

import typings.puppeteer.bidiConnectionMod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bidiBrowserContextMod {
  
  @JSImport("puppeteer/lib/esm/puppeteer/common/bidi/BrowserContext", "BrowserContext")
  @js.native
  open class BrowserContext protected ()
    extends typings.puppeteer.apiBrowserMod.BrowserContext {
    def this(connection: Connection) = this()
    
    /* private */ var `private`: Any = js.native
  }
}
