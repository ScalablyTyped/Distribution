package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteerCore.libCjsPuppeteerApiBrowserContextMod.BrowserContext
import typings.puppeteerCore.libCjsPuppeteerApiBrowserMod.Browser
import typings.puppeteerCore.libCjsPuppeteerApiBrowserMod.IsPageTargetCallback
import typings.puppeteerCore.libCjsPuppeteerApiPageMod.Page
import typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession
import typings.puppeteerCore.libCjsPuppeteerCommonPuppeteerViewportMod.Viewport
import typings.puppeteerCore.libCjsPuppeteerCommonTargetManagerMod.TargetManager
import typings.puppeteerCore.libCjsPuppeteerCommonTaskQueueMod.TaskQueue
import typings.puppeteerCore.libCjsPuppeteerCommonWebWorkerMod.WebWorker
import typings.puppeteerCore.puppeteerCoreStrings.background_page
import typings.puppeteerCore.puppeteerCoreStrings.browser
import typings.puppeteerCore.puppeteerCoreStrings.other
import typings.puppeteerCore.puppeteerCoreStrings.page
import typings.puppeteerCore.puppeteerCoreStrings.service_worker
import typings.puppeteerCore.puppeteerCoreStrings.shared_worker
import typings.puppeteerCore.puppeteerCoreStrings.webview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonTargetMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Target", "Target")
  @js.native
  open class Target protected () extends StObject {
    def this(
      targetInfo: TargetInfo,
      session: Unit,
      browserContext: BrowserContext,
      targetManager: TargetManager,
      sessionFactory: js.Function1[/* isAutoAttachEmulated */ Boolean, js.Promise[CDPSession]],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Null,
      screenshotTaskQueue: TaskQueue,
      isPageTargetCallback: IsPageTargetCallback
    ) = this()
    def this(
      targetInfo: TargetInfo,
      session: Unit,
      browserContext: BrowserContext,
      targetManager: TargetManager,
      sessionFactory: js.Function1[/* isAutoAttachEmulated */ Boolean, js.Promise[CDPSession]],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Viewport,
      screenshotTaskQueue: TaskQueue,
      isPageTargetCallback: IsPageTargetCallback
    ) = this()
    def this(
      targetInfo: TargetInfo,
      session: CDPSession,
      browserContext: BrowserContext,
      targetManager: TargetManager,
      sessionFactory: js.Function1[/* isAutoAttachEmulated */ Boolean, js.Promise[CDPSession]],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Null,
      screenshotTaskQueue: TaskQueue,
      isPageTargetCallback: IsPageTargetCallback
    ) = this()
    /**
      * @internal
      */
    def this(
      targetInfo: TargetInfo,
      session: CDPSession,
      browserContext: BrowserContext,
      targetManager: TargetManager,
      sessionFactory: js.Function1[/* isAutoAttachEmulated */ Boolean, js.Promise[CDPSession]],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Viewport,
      screenshotTaskQueue: TaskQueue,
      isPageTargetCallback: IsPageTargetCallback
    ) = this()
    
    /**
      * @internal
      */
    def _closedCallback(): Unit = js.native
    
    /**
      * @internal
      */
    def _getTargetInfo(): TargetInfo = js.native
    
    /**
      * @internal
      */
    def _initializedCallback(x: Boolean): Unit = js.native
    
    /**
      * @internal
      */
    var _initializedPromise: js.Promise[Boolean] = js.native
    
    /**
      * @internal
      */
    var _isClosedPromise: js.Promise[Unit] = js.native
    
    /**
      * @internal
      */
    var _isInitialized: Boolean = js.native
    
    /**
      * @internal
      */
    def _isPageTargetCallback(target: TargetInfo): Boolean = js.native
    /**
      * @internal
      */
    @JSName("_isPageTargetCallback")
    var _isPageTargetCallback_Original: IsPageTargetCallback = js.native
    
    /**
      * @internal
      */
    def _session(): js.UndefOr[CDPSession] = js.native
    
    /**
      * @internal
      */
    var _targetId: String = js.native
    
    /**
      * @internal
      */
    def _targetInfoChanged(targetInfo: TargetInfo): Unit = js.native
    
    /**
      * @internal
      */
    def _targetManager(): TargetManager = js.native
    
    /**
      * Get the browser the target belongs to.
      */
    def browser(): Browser = js.native
    
    /**
      * Get the browser context the target belongs to.
      */
    def browserContext(): BrowserContext = js.native
    
    /**
      * Creates a Chrome Devtools Protocol session attached to the target.
      */
    def createCDPSession(): js.Promise[CDPSession] = js.native
    
    /**
      * Get the target that opened this target. Top-level targets return `null`.
      */
    def opener(): js.UndefOr[Target] = js.native
    
    /**
      * If the target is not of type `"page"` or `"background_page"`, returns `null`.
      */
    def page(): js.Promise[Page | Null] = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Identifies what kind of target this is.
      *
      * @remarks
      *
      * See {@link https://developer.chrome.com/extensions/background_pages | docs} for more info about background pages.
      */
    def `type`(): page | background_page | service_worker | shared_worker | other | browser | webview = js.native
    
    def url(): String = js.native
    
    /**
      * If the target is not of type `"service_worker"` or `"shared_worker"`, returns `null`.
      */
    def worker(): js.Promise[WebWorker | Null] = js.native
  }
}
