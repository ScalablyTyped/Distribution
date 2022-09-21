package typings.puppeteerCore.puppeteerTypesMod

import typings.puppeteerCore.puppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "CDPPage")
@js.native
open class CDPPage protected ()
  extends typings.puppeteerCore.commonPageMod.CDPPage {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    target: typings.puppeteerCore.targetMod.Target,
    ignoreHTTPSErrors: Boolean,
    screenshotTaskQueue: typings.puppeteerCore.taskQueueMod.TaskQueue
  ) = this()
}
/* static members */
object CDPPage {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/types", "CDPPage")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    target: typings.puppeteerCore.targetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteerCore.taskQueueMod.TaskQueue
  ): js.Promise[typings.puppeteerCore.commonPageMod.CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.commonPageMod.CDPPage]]
  /**
    * @internal
    */
  inline def _create(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    target: typings.puppeteerCore.targetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteerCore.taskQueueMod.TaskQueue
  ): js.Promise[typings.puppeteerCore.commonPageMod.CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.commonPageMod.CDPPage]]
}
