package typings.puppeteer

import typings.puppeteer.commonErrorsMod.TimeoutError
import typings.puppeteer.commonFrameManagerMod.FrameManager
import typings.puppeteer.commonFrameMod.Frame
import typings.puppeteer.commonHttpresponseMod.HTTPResponse
import typings.puppeteer.puppeteerStrings.domcontentloaded_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonLifecycleWatcherMod {
  
  @JSImport("puppeteer/lib/esm/puppeteer/common/LifecycleWatcher", "LifecycleWatcher")
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
    - typings.puppeteer.puppeteerStrings.load
    - typings.puppeteer.puppeteerStrings.DOMContentLoaded
    - typings.puppeteer.puppeteerStrings.networkIdle
    - typings.puppeteer.puppeteerStrings.networkAlmostIdle
  */
  trait ProtocolLifeCycleEvent extends StObject
  object ProtocolLifeCycleEvent {
    
    inline def DOMContentLoaded: typings.puppeteer.puppeteerStrings.DOMContentLoaded = "DOMContentLoaded".asInstanceOf[typings.puppeteer.puppeteerStrings.DOMContentLoaded]
    
    inline def load: typings.puppeteer.puppeteerStrings.load = "load".asInstanceOf[typings.puppeteer.puppeteerStrings.load]
    
    inline def networkAlmostIdle: typings.puppeteer.puppeteerStrings.networkAlmostIdle = "networkAlmostIdle".asInstanceOf[typings.puppeteer.puppeteerStrings.networkAlmostIdle]
    
    inline def networkIdle: typings.puppeteer.puppeteerStrings.networkIdle = "networkIdle".asInstanceOf[typings.puppeteer.puppeteerStrings.networkIdle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteer.puppeteerStrings.load
    - typings.puppeteer.puppeteerStrings.domcontentloaded_
    - typings.puppeteer.puppeteerStrings.networkidle0
    - typings.puppeteer.puppeteerStrings.networkidle2
  */
  trait PuppeteerLifeCycleEvent extends StObject
  object PuppeteerLifeCycleEvent {
    
    inline def domcontentloaded: domcontentloaded_ = "domcontentloaded".asInstanceOf[domcontentloaded_]
    
    inline def load: typings.puppeteer.puppeteerStrings.load = "load".asInstanceOf[typings.puppeteer.puppeteerStrings.load]
    
    inline def networkidle0: typings.puppeteer.puppeteerStrings.networkidle0 = "networkidle0".asInstanceOf[typings.puppeteer.puppeteerStrings.networkidle0]
    
    inline def networkidle2: typings.puppeteer.puppeteerStrings.networkidle2 = "networkidle2".asInstanceOf[typings.puppeteer.puppeteerStrings.networkidle2]
  }
}
