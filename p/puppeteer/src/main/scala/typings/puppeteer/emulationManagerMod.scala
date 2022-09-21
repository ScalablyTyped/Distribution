package typings.puppeteer

import typings.puppeteer.commonConnectionMod.CDPSession
import typings.puppeteer.puppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emulationManagerMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/common/EmulationManager", "EmulationManager")
  @js.native
  open class EmulationManager protected () extends StObject {
    def this(client: CDPSession) = this()
    
    def emulateViewport(viewport: Viewport): js.Promise[Boolean] = js.native
    
    /* private */ var `private`: Any = js.native
  }
}
