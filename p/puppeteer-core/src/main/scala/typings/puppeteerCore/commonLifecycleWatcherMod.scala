package typings.puppeteerCore

import typings.node.NodeJS.Timeout
import typings.puppeteerCore.commonErrorsMod.TimeoutError
import typings.puppeteerCore.commonFrameManagerMod.Frame
import typings.puppeteerCore.commonFrameManagerMod.FrameManager
import typings.puppeteerCore.commonHelperMod.PuppeteerEventListener
import typings.puppeteerCore.commonHttprequestMod.HTTPRequest
import typings.puppeteerCore.commonHttpresponseMod.HTTPResponse
import typings.puppeteerCore.puppeteerCoreStrings.domcontentloaded_
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonLifecycleWatcherMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/LifecycleWatcher", "LifecycleWatcher")
  @js.native
  class LifecycleWatcher protected () extends StObject {
    def this(
      frameManager: FrameManager,
      frame: Frame,
      waitUntil: js.Array[PuppeteerLifeCycleEvent],
      timeout: Double
    ) = this()
    def this(frameManager: FrameManager, frame: Frame, waitUntil: PuppeteerLifeCycleEvent, timeout: Double) = this()
    
    def _checkLifecycleComplete(): Unit = js.native
    
    def _createTimeoutPromise(): js.Promise[TimeoutError | Null] = js.native
    
    var _eventListeners: js.Array[PuppeteerEventListener] = js.native
    
    var _expectedLifecycle: js.Array[ProtocolLifeCycleEvent] = js.native
    
    var _frame: Frame = js.native
    
    var _frameManager: FrameManager = js.native
    
    var _hasSameDocumentNavigation: js.UndefOr[Boolean] = js.native
    
    var _initialLoaderId: String = js.native
    
    def _lifecycleCallback(): Unit = js.native
    
    var _lifecyclePromise: js.Promise[Unit] = js.native
    
    var _maximumTimer: js.UndefOr[Timeout] = js.native
    
    def _navigatedWithinDocument(frame: Frame): Unit = js.native
    
    var _navigationRequest: js.UndefOr[HTTPRequest] = js.native
    
    def _newDocumentNavigationCompleteCallback(): Unit = js.native
    def _newDocumentNavigationCompleteCallback(x: Error): Unit = js.native
    
    var _newDocumentNavigationPromise: js.Promise[Error | Null] = js.native
    
    def _onFrameDetached(frame: Frame): Unit = js.native
    
    def _onRequest(request: HTTPRequest): Unit = js.native
    
    def _sameDocumentNavigationCompleteCallback(): Unit = js.native
    def _sameDocumentNavigationCompleteCallback(x: Error): Unit = js.native
    
    var _sameDocumentNavigationPromise: js.Promise[Error | Null] = js.native
    
    def _terminate(error: Error): Unit = js.native
    
    def _terminationCallback(): Unit = js.native
    def _terminationCallback(x: Error): Unit = js.native
    
    var _terminationPromise: js.Promise[Error | Null] = js.native
    
    var _timeout: Double = js.native
    
    var _timeoutPromise: js.Promise[TimeoutError | Null] = js.native
    
    def dispose(): Unit = js.native
    
    def lifecyclePromise(): js.Promise[Unit] = js.native
    
    def navigationResponse(): HTTPResponse | Null = js.native
    
    def newDocumentNavigationPromise(): js.Promise[Error | Null] = js.native
    
    def sameDocumentNavigationPromise(): js.Promise[Error | Null] = js.native
    
    def timeoutOrTerminationPromise(): js.Promise[Error | TimeoutError | Null] = js.native
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
