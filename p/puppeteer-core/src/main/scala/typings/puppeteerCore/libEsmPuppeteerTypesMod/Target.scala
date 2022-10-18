package typings.puppeteerCore.libEsmPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteerCore.libEsmPuppeteerApiBrowserMod.IsPageTargetCallback
import typings.puppeteerCore.libEsmPuppeteerCommonPuppeteerViewportMod.Viewport
import typings.puppeteerCore.libEsmPuppeteerCommonTargetManagerMod.TargetManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "Target")
@js.native
open class Target protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonTargetMod.Target {
  def this(
    targetInfo: TargetInfo,
    session: Unit,
    browserContext: typings.puppeteerCore.libEsmPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteerCore.libEsmPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  def this(
    targetInfo: TargetInfo,
    session: Unit,
    browserContext: typings.puppeteerCore.libEsmPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteerCore.libEsmPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  def this(
    targetInfo: TargetInfo,
    session: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    browserContext: typings.puppeteerCore.libEsmPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteerCore.libEsmPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  /**
    * @internal
    */
  def this(
    targetInfo: TargetInfo,
    session: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    browserContext: typings.puppeteerCore.libEsmPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteerCore.libEsmPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
}
