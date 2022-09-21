package typings.puppeteerCore

import typings.puppeteerCore.commonErrorsMod.TimeoutError
import typings.puppeteerCore.commonFrameManagerMod.FrameManager
import typings.puppeteerCore.commonFrameMod.Frame
import typings.puppeteerCore.commonHttpresponseMod.HTTPResponse
import typings.puppeteerCore.puppeteerCoreStrings.domcontentloaded_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonLifecycleWatcherMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/LifecycleWatcher", "LifecycleWatcher")
  @js.native
  open class LifecycleWatcher protected () extends StObject {
    def this(
      frameManager: FrameManager,
      frame: Frame,
      waitUntil: js.Array[PuppeteerLifeCycleEvent],
      timeout: Double
    ) = this()
    def this(frameManager: FrameManager, frame: Frame, waitUntil: PuppeteerLifeCycleEvent, timeout: Double) = this()
    
    def dispose(): Unit = js.native
    
    def lifecyclePromise(): js.Promise[Unit] = js.native
    
    def navigationResponse(): js.Promise[HTTPResponse | Null] = js.native
    
    def newDocumentNavigationPromise(): js.Promise[js.UndefOr[js.Error]] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def sameDocumentNavigationPromise(): js.Promise[js.UndefOr[js.Error]] = js.native
    
    def timeoutOrTerminationPromise(): js.Promise[js.UndefOr[js.Error | TimeoutError]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.load
    - typings.puppeteerCore.puppeteerCoreStrings.DOMContentLoaded
    - typings.puppeteerCore.puppeteerCoreStrings.networkIdle
    - typings.puppeteerCore.puppeteerCoreStrings.networkAlmostIdle
  */
  trait ProtocolLifeCycleEvent extends StObject
  object ProtocolLifeCycleEvent {
    
    inline def DOMContentLoaded: typings.puppeteerCore.puppeteerCoreStrings.DOMContentLoaded = "DOMContentLoaded".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.DOMContentLoaded]
    
    inline def load: typings.puppeteerCore.puppeteerCoreStrings.load = "load".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.load]
    
    inline def networkAlmostIdle: typings.puppeteerCore.puppeteerCoreStrings.networkAlmostIdle = "networkAlmostIdle".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.networkAlmostIdle]
    
    inline def networkIdle: typings.puppeteerCore.puppeteerCoreStrings.networkIdle = "networkIdle".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.networkIdle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.load
    - typings.puppeteerCore.puppeteerCoreStrings.domcontentloaded_
    - typings.puppeteerCore.puppeteerCoreStrings.networkidle0
    - typings.puppeteerCore.puppeteerCoreStrings.networkidle2
  */
  trait PuppeteerLifeCycleEvent extends StObject
  object PuppeteerLifeCycleEvent {
    
    inline def domcontentloaded: domcontentloaded_ = "domcontentloaded".asInstanceOf[domcontentloaded_]
    
    inline def load: typings.puppeteerCore.puppeteerCoreStrings.load = "load".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.load]
    
    inline def networkidle0: typings.puppeteerCore.puppeteerCoreStrings.networkidle0 = "networkidle0".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.networkidle0]
    
    inline def networkidle2: typings.puppeteerCore.puppeteerCoreStrings.networkidle2 = "networkidle2".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.networkidle2]
  }
}
