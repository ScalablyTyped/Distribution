package typings.puppeteerCore

import typings.puppeteerCore.apiPageMod.Page
import typings.puppeteerCore.commonPuppeteerViewportMod.Viewport
import typings.puppeteerCore.commonTargetMod.Target
import typings.puppeteerCore.commonTaskQueueMod.TaskQueue
import typings.puppeteerCore.puppeteerCommonConnectionMod.CDPSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerCommonPageMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/Page", "CDPPage")
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
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/Page", "CDPPage")
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
