package typings.puppeteerCore.esmPuppeteerTypesMod

import typings.puppeteerCore.commonPuppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "CDPPage")
@js.native
open class CDPPage protected ()
  extends typings.puppeteerCore.puppeteerCommonPageMod.CDPPage {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.puppeteerCommonConnectionMod.CDPSession,
    target: typings.puppeteerCore.commonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    screenshotTaskQueue: typings.puppeteerCore.commonTaskQueueMod.TaskQueue
  ) = this()
}
/* static members */
object CDPPage {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/types", "CDPPage")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    client: typings.puppeteerCore.puppeteerCommonConnectionMod.CDPSession,
    target: typings.puppeteerCore.commonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteerCore.commonTaskQueueMod.TaskQueue
  ): js.Promise[typings.puppeteerCore.puppeteerCommonPageMod.CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.puppeteerCommonPageMod.CDPPage]]
  /**
    * @internal
    */
  inline def _create(
    client: typings.puppeteerCore.puppeteerCommonConnectionMod.CDPSession,
    target: typings.puppeteerCore.commonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteerCore.commonTaskQueueMod.TaskQueue
  ): js.Promise[typings.puppeteerCore.puppeteerCommonPageMod.CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.puppeteerCommonPageMod.CDPPage]]
}
