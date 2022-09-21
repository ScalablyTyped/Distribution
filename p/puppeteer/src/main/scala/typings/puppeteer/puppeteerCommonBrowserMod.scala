package typings.puppeteer

import typings.node.childProcessMod.ChildProcess
import typings.puppeteer.apiBrowserMod.Browser
import typings.puppeteer.apiBrowserMod.BrowserCloseCallback
import typings.puppeteer.apiBrowserMod.BrowserContext
import typings.puppeteer.apiBrowserMod.IsPageTargetCallback
import typings.puppeteer.apiBrowserMod.TargetFilterCallback
import typings.puppeteer.commonPuppeteerViewportMod.Viewport
import typings.puppeteer.commonTargetManagerMod.TargetManager
import typings.puppeteer.puppeteerCommonConnectionMod.Connection
import typings.puppeteer.puppeteerStrings.chrome
import typings.puppeteer.puppeteerStrings.firefox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerCommonBrowserMod {
  
  @JSImport("puppeteer/lib/esm/puppeteer/common/Browser", "CDPBrowser")
  @js.native
  open class CDPBrowser protected () extends Browser {
    /**
      * @internal
      */
    def this(
      product: js.UndefOr[chrome | firefox],
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: js.UndefOr[Viewport | Null],
      process: js.UndefOr[ChildProcess],
      closeCallback: js.UndefOr[BrowserCloseCallback],
      targetFilterCallback: js.UndefOr[TargetFilterCallback],
      isPageTargetCallback: js.UndefOr[IsPageTargetCallback]
    ) = this()
    
    /**
      * @internal
      */
    def _targetManager(): TargetManager = js.native
    
    /* private */ var `private`: Any = js.native
  }
  /* static members */
  object CDPBrowser {
    
    @JSImport("puppeteer/lib/esm/puppeteer/common/Browser", "CDPBrowser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    inline def _create(
      product: js.UndefOr[firefox | chrome],
      connection: Connection,
      contextIds: js.Array[String],
      ignoreHTTPSErrors: Boolean,
      defaultViewport: js.UndefOr[Viewport | Null],
      process: js.UndefOr[ChildProcess],
      closeCallback: js.UndefOr[BrowserCloseCallback],
      targetFilterCallback: js.UndefOr[TargetFilterCallback],
      isPageTargetCallback: js.UndefOr[IsPageTargetCallback]
    ): js.Promise[CDPBrowser] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(product.asInstanceOf[js.Any], connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], targetFilterCallback.asInstanceOf[js.Any], isPageTargetCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CDPBrowser]]
  }
  
  @JSImport("puppeteer/lib/esm/puppeteer/common/Browser", "CDPBrowserContext")
  @js.native
  open class CDPBrowserContext protected () extends BrowserContext {
    /**
      * @internal
      */
    def this(connection: Connection, browser: CDPBrowser) = this()
    def this(connection: Connection, browser: CDPBrowser, contextId: String) = this()
    
    /* private */ var `private`: Any = js.native
  }
}
