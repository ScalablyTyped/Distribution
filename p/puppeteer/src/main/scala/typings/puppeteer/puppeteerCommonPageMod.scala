package typings.puppeteer

import typings.puppeteer.apiPageMod.Page
import typings.puppeteer.commonPuppeteerViewportMod.Viewport
import typings.puppeteer.commonTargetMod.Target
import typings.puppeteer.commonTaskQueueMod.TaskQueue
import typings.puppeteer.puppeteerCommonConnectionMod.CDPSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerCommonPageMod {
  
  @JSImport("puppeteer/lib/esm/puppeteer/common/Page", "CDPPage")
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
    
    @JSImport("puppeteer/lib/esm/puppeteer/common/Page", "CDPPage")
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
