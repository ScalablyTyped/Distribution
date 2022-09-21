package typings.puppeteerCore.esmPuppeteerTypesMod

import typings.node.childProcessMod.ChildProcess
import typings.puppeteerCore.apiBrowserMod.BrowserCloseCallback
import typings.puppeteerCore.apiBrowserMod.IsPageTargetCallback
import typings.puppeteerCore.apiBrowserMod.TargetFilterCallback
import typings.puppeteerCore.commonPuppeteerViewportMod.Viewport
import typings.puppeteerCore.puppeteerCoreStrings.chrome
import typings.puppeteerCore.puppeteerCoreStrings.firefox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "CDPBrowser")
@js.native
open class CDPBrowser protected ()
  extends typings.puppeteerCore.puppeteerCommonBrowserMod.CDPBrowser {
  /**
    * @internal
    */
  def this(
    product: js.UndefOr[chrome | firefox],
    connection: typings.puppeteerCore.puppeteerCommonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: js.UndefOr[Viewport | Null],
    process: js.UndefOr[ChildProcess],
    closeCallback: js.UndefOr[BrowserCloseCallback],
    targetFilterCallback: js.UndefOr[TargetFilterCallback],
    isPageTargetCallback: js.UndefOr[IsPageTargetCallback]
  ) = this()
}
/* static members */
object CDPBrowser {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/types", "CDPBrowser")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _create(
    product: js.UndefOr[firefox | chrome],
    connection: typings.puppeteerCore.puppeteerCommonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: js.UndefOr[Viewport | Null],
    process: js.UndefOr[ChildProcess],
    closeCallback: js.UndefOr[BrowserCloseCallback],
    targetFilterCallback: js.UndefOr[TargetFilterCallback],
    isPageTargetCallback: js.UndefOr[IsPageTargetCallback]
  ): js.Promise[typings.puppeteerCore.puppeteerCommonBrowserMod.CDPBrowser] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(product.asInstanceOf[js.Any], connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], targetFilterCallback.asInstanceOf[js.Any], isPageTargetCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.puppeteerCommonBrowserMod.CDPBrowser]]
}
