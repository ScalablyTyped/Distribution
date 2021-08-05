package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteerCore.commonBrowserMod.Browser
import typings.puppeteerCore.commonBrowserMod.BrowserContext
import typings.puppeteerCore.commonConnectionMod.CDPSession
import typings.puppeteerCore.commonPageMod.Page
import typings.puppeteerCore.commonPuppeteerViewportMod.Viewport
import typings.puppeteerCore.commonWebWorkerMod.WebWorker
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

object commonTargetMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/Target", "Target")
  @js.native
  class Target protected () extends StObject {
    /**
      * @internal
      */
    def this(
      targetInfo: TargetInfo,
      browserContext: BrowserContext,
      sessionFactory: js.Function0[js.Promise[CDPSession]],
      ignoreHTTPSErrors: Boolean
    ) = this()
    def this(
      targetInfo: TargetInfo,
      browserContext: BrowserContext,
      sessionFactory: js.Function0[js.Promise[CDPSession]],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Viewport
    ) = this()
    
    /* private */ var _browserContext: js.Any = js.native
    
    /**
      * @internal
      */
    def _closedCallback(): Unit = js.native
    
    /* private */ var _defaultViewport: js.Any = js.native
    
    /* private */ var _ignoreHTTPSErrors: js.Any = js.native
    
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
    
    /* private */ var _pagePromise: js.Any = js.native
    
    /* private */ var _sessionFactory: js.Any = js.native
    
    /**
      * @internal
      */
    var _targetId: String = js.native
    
    /* private */ var _targetInfo: js.Any = js.native
    
    /**
      * @internal
      */
    def _targetInfoChanged(targetInfo: TargetInfo): Unit = js.native
    
    /* private */ var _workerPromise: js.Any = js.native
    
    /**
      * Get the browser the target belongs to.
      */
    def browser(): Browser = js.native
    
    def browserContext(): BrowserContext = js.native
    
    /**
      * Creates a Chrome Devtools Protocol session attached to the target.
      */
    def createCDPSession(): js.Promise[CDPSession] = js.native
    
    /**
      * Get the target that opened this target. Top-level targets return `null`.
      */
    def opener(): Target | Null = js.native
    
    /**
      * If the target is not of type `"page"` or `"background_page"`, returns `null`.
      */
    def page(): js.Promise[Page | Null] = js.native
    
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
