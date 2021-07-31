package typings.puppeteerCore

import typings.puppeteerCore.anon.Close
import typings.puppeteerCore.anon.Disconnected
import typings.puppeteerCore.anon.DisconnectedSymbol
import typings.puppeteerCore.anon.ExecutionContextCreated
import typings.puppeteerCore.anon.Request
import typings.puppeteerCore.anon.TargetChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonEventsMod {
  
  object Events {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/Events", "Events.Browser")
    @js.native
    val Browser: Disconnected = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/Events", "Events.BrowserContext")
    @js.native
    val BrowserContext: TargetChanged = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/Events", "Events.CDPSession")
    @js.native
    val CDPSession: DisconnectedSymbol = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/Events", "Events.Connection")
    @js.native
    val Connection: DisconnectedSymbol = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/Events", "Events.FrameManager")
    @js.native
    val FrameManager: ExecutionContextCreated = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/Events", "Events.NetworkManager")
    @js.native
    val NetworkManager: Request = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/Events", "Events.Page")
    @js.native
    val Page: Close = js.native
  }
}
