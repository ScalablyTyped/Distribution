package typings.puppeteerCore

import typings.puppeteerCore.connectionMod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserContextMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/bidi/BrowserContext", "BrowserContext")
  @js.native
  open class BrowserContext protected ()
    extends typings.puppeteerCore.browserMod.BrowserContext {
    def this(connection: Connection) = this()
    
    /* private */ var `private`: Any = js.native
  }
}
