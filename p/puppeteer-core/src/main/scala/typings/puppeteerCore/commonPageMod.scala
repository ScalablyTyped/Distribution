package typings.puppeteerCore

import typings.puppeteerCore.commonConnectionMod.CDPSession
import typings.puppeteerCore.pageMod.Page
import typings.puppeteerCore.puppeteerViewportMod.Viewport
import typings.puppeteerCore.targetMod.Target
import typings.puppeteerCore.taskQueueMod.TaskQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonPageMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Page", "CDPPage")
  @js.native
  open class CDPPage protected () extends Page {
    /**
      * @internal
      */
    def this(client: CDPSession, target: Target, ignoreHTTPSErrors: Boolean, screenshotTaskQueue: TaskQueue) = this()
    
    /**
      * @internal
      */
    def _client(): CDPSession = js.native
  }
  /* static members */
  object CDPPage {
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Page", "CDPPage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(
      client: CDPSession,
      target: Target,
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Null,
      screenshotTaskQueue: TaskQueue
    ): js.Promise[CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CDPPage]]
    /**
      * @internal
      */
    inline def _create(
      client: CDPSession,
      target: Target,
      ignoreHTTPSErrors: Boolean,
      defaultViewport: Viewport,
      screenshotTaskQueue: TaskQueue
    ): js.Promise[CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CDPPage]]
  }
}
