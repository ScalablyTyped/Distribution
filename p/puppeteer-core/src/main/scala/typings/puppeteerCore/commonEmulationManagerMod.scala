package typings.puppeteerCore

import typings.puppeteerCore.commonConnectionMod.CDPSession
import typings.puppeteerCore.commonPuppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonEmulationManagerMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/EmulationManager", "EmulationManager")
  @js.native
  class EmulationManager protected () extends StObject {
    def this(client: CDPSession) = this()
    
    var _client: CDPSession = js.native
    
    var _emulatingMobile: Boolean = js.native
    
    var _hasTouch: Boolean = js.native
    
    def emulateViewport(viewport: Viewport): js.Promise[Boolean] = js.native
  }
}
