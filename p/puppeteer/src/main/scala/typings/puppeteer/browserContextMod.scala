package typings.puppeteer

import typings.puppeteer.connectionMod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserContextMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/common/bidi/BrowserContext", "BrowserContext")
  @js.native
  open class BrowserContext protected ()
    extends typings.puppeteer.browserMod.BrowserContext {
    def this(connection: Connection) = this()
    
    /* private */ var `private`: Any = js.native
  }
}
