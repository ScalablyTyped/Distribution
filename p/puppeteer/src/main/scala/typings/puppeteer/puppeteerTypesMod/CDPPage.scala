package typings.puppeteer.puppeteerTypesMod

import typings.puppeteer.puppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "CDPPage")
@js.native
open class CDPPage protected ()
  extends typings.puppeteer.commonPageMod.CDPPage {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteer.commonConnectionMod.CDPSession,
    target: typings.puppeteer.targetMod.Target,
    ignoreHTTPSErrors: Boolean,
    screenshotTaskQueue: typings.puppeteer.taskQueueMod.TaskQueue
  ) = this()
}
/* static members */
object CDPPage {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/types", "CDPPage")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    client: typings.puppeteer.commonConnectionMod.CDPSession,
    target: typings.puppeteer.targetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteer.taskQueueMod.TaskQueue
  ): js.Promise[typings.puppeteer.commonPageMod.CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteer.commonPageMod.CDPPage]]
  /**
    * @internal
    */
  inline def _create(
    client: typings.puppeteer.commonConnectionMod.CDPSession,
    target: typings.puppeteer.targetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteer.taskQueueMod.TaskQueue
  ): js.Promise[typings.puppeteer.commonPageMod.CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteer.commonPageMod.CDPPage]]
}
