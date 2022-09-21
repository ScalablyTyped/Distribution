package typings.puppeteerCore.esmPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteerCore.apiBrowserMod.IsPageTargetCallback
import typings.puppeteerCore.commonPuppeteerViewportMod.Viewport
import typings.puppeteerCore.commonTargetManagerMod.TargetManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "Target")
@js.native
open class Target protected ()
  extends typings.puppeteerCore.commonTargetMod.Target {
  def this(
    targetInfo: TargetInfo,
    session: Unit,
    browserContext: typings.puppeteerCore.apiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteerCore.puppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteerCore.commonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  def this(
    targetInfo: TargetInfo,
    session: Unit,
    browserContext: typings.puppeteerCore.apiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteerCore.puppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteerCore.commonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  def this(
    targetInfo: TargetInfo,
    session: typings.puppeteerCore.puppeteerCommonConnectionMod.CDPSession,
    browserContext: typings.puppeteerCore.apiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteerCore.puppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteerCore.commonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  /**
    * @internal
    */
  def this(
    targetInfo: TargetInfo,
    session: typings.puppeteerCore.puppeteerCommonConnectionMod.CDPSession,
    browserContext: typings.puppeteerCore.apiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteerCore.puppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteerCore.commonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
}
