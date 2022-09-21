package typings.puppeteerCore.mod

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

@JSImport("puppeteer-core", "Target")
@js.native
open class Target () extends StObject {
  
  /**
    * Get the browser the target belongs to.
    */
  def browser(): Browser = js.native
  
  /**
    * Get the browser context the target belongs to.
    */
  def browserContext(): BrowserContext = js.native
  
  /* Excluded from this release type: _initializedPromise */
  /* Excluded from this release type: _initializedCallback */
  /* Excluded from this release type: _isClosedPromise */
  /* Excluded from this release type: _closedCallback */
  /* Excluded from this release type: _isInitialized */
  /* Excluded from this release type: _targetId */
  /* Excluded from this release type: _isPageTargetCallback */
  /* Excluded from this release type: __constructor */
  /* Excluded from this release type: _session */
  /**
    * Creates a Chrome Devtools Protocol session attached to the target.
    */
  def createCDPSession(): js.Promise[CDPSession] = js.native
  
  /**
    * Get the target that opened this target. Top-level targets return `null`.
    */
  def opener(): js.UndefOr[Target] = js.native
  
  /* Excluded from this release type: _targetManager */
  /* Excluded from this release type: _getTargetInfo */
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
