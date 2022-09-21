package typings.puppeteer.esmPuppeteerTypesMod

import typings.puppeteer.commonPuppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/esm/puppeteer/types", "CDPPage")
@js.native
open class CDPPage protected ()
  extends typings.puppeteer.puppeteerCommonPageMod.CDPPage {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteer.puppeteerCommonConnectionMod.CDPSession,
    target: typings.puppeteer.commonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    screenshotTaskQueue: typings.puppeteer.commonTaskQueueMod.TaskQueue
  ) = this()
}
/* static members */
object CDPPage {
  
  @JSImport("puppeteer/lib/esm/puppeteer/types", "CDPPage")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    client: typings.puppeteer.puppeteerCommonConnectionMod.CDPSession,
    target: typings.puppeteer.commonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteer.commonTaskQueueMod.TaskQueue
  ): js.Promise[typings.puppeteer.puppeteerCommonPageMod.CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteer.puppeteerCommonPageMod.CDPPage]]
  /**
    * @internal
    */
  inline def _create(
    client: typings.puppeteer.puppeteerCommonConnectionMod.CDPSession,
    target: typings.puppeteer.commonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteer.commonTaskQueueMod.TaskQueue
  ): js.Promise[typings.puppeteer.puppeteerCommonPageMod.CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteer.puppeteerCommonPageMod.CDPPage]]
}
