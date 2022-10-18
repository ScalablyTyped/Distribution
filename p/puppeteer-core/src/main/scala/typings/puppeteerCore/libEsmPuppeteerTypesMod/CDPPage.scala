package typings.puppeteerCore.libEsmPuppeteerTypesMod

import typings.puppeteerCore.libEsmPuppeteerCommonPuppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "CDPPage")
@js.native
open class CDPPage protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonPageMod.CDPPage {
  /**
    * @internal
    */
  def this(
    client: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    target: typings.puppeteerCore.libEsmPuppeteerCommonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    screenshotTaskQueue: typings.puppeteerCore.libEsmPuppeteerCommonTaskQueueMod.TaskQueue
  ) = this()
}
/* static members */
object CDPPage {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/types", "CDPPage")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _create(
    client: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    target: typings.puppeteerCore.libEsmPuppeteerCommonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteerCore.libEsmPuppeteerCommonTaskQueueMod.TaskQueue
  ): js.Promise[typings.puppeteerCore.libEsmPuppeteerCommonPageMod.CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.libEsmPuppeteerCommonPageMod.CDPPage]]
  /**
    * @internal
    */
  inline def _create(
    client: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    target: typings.puppeteerCore.libEsmPuppeteerCommonTargetMod.Target,
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteerCore.libEsmPuppeteerCommonTaskQueueMod.TaskQueue
  ): js.Promise[typings.puppeteerCore.libEsmPuppeteerCommonPageMod.CDPPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(client.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ignoreHTTPSErrors.asInstanceOf[js.Any], defaultViewport.asInstanceOf[js.Any], screenshotTaskQueue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.puppeteerCore.libEsmPuppeteerCommonPageMod.CDPPage]]
}
