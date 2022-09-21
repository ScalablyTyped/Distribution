package typings.puppeteer.puppeteerTypesMod

import typings.node.childProcessMod.ChildProcess
import typings.puppeteer.browserMod.BrowserCloseCallback
import typings.puppeteer.browserMod.IsPageTargetCallback
import typings.puppeteer.browserMod.TargetFilterCallback
import typings.puppeteer.puppeteerStrings.chrome
import typings.puppeteer.puppeteerStrings.firefox
import typings.puppeteer.puppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "CDPBrowser")
@js.native
open class CDPBrowser protected ()
  extends typings.puppeteer.commonBrowserMod.CDPBrowser {
  /**
    * @internal
    */
  def this(
    product: js.UndefOr[chrome | firefox],
    connection: typings.puppeteer.commonConnectionMod.Connection,
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
  
  @JSImport("puppeteer/lib/cjs/puppeteer/types", "CDPBrowser")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _create(
    product: js.UndefOr[firefox | chrome],
    connection: typings.puppeteer.commonConnectionMod.Connection,
    contextIds: js.Array[String],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: js.UndefOr[Viewport | Null],
    process: js.UndefOr[ChildProcess],
    closeCallback: js.UndefOr[BrowserCloseCallback],
    targetFilterCallback: js.UndefOr[TargetFilterCallback],
    isPageTargetCallback: js.UndefOr[IsPageTargetCallback]
  ): js.Promise[typings.puppeteer.commonBrowserMod.CDPBrowser] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(product.asInstanceOf[js.Any], connection.asInstanceOf[js.Any], contextIds.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], process.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], targetFilterCallback.asInstanceOf[js.Any], isPageTargetCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteer.commonBrowserMod.CDPBrowser]]
}
