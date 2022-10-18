package typings.puppeteerCore.libCjsPuppeteerTypesMod

import typings.puppeteerCore.libCjsPuppeteerCommonPuppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "CDPPage")
@js.native
open class CDPPage protected ()
  extends typings.puppeteerCore.libCjsPuppeteerCommonPageMod.CDPPage {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    target: typings.puppeteerCore.libCjsPuppeteerCommonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    screenshotTaskQueue: typings.puppeteerCore.libCjsPuppeteerCommonTaskQueueMod.TaskQueue
  ) = this()
}
/* static members */
object CDPPage {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/types", "CDPPage")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    client: typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    target: typings.puppeteerCore.libCjsPuppeteerCommonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteerCore.libCjsPuppeteerCommonTaskQueueMod.TaskQueue
  ): js.Promise[typings.puppeteerCore.libCjsPuppeteerCommonPageMod.CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.libCjsPuppeteerCommonPageMod.CDPPage]]
  /**
    * @internal
    */
  inline def _create(
    client: typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    target: typings.puppeteerCore.libCjsPuppeteerCommonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteerCore.libCjsPuppeteerCommonTaskQueueMod.TaskQueue
  ): js.Promise[typings.puppeteerCore.libCjsPuppeteerCommonPageMod.CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.libCjsPuppeteerCommonPageMod.CDPPage]]
}
