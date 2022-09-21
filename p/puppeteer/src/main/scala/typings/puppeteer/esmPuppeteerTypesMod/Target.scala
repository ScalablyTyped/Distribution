package typings.puppeteer.esmPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteer.apiBrowserMod.IsPageTargetCallback
import typings.puppeteer.commonPuppeteerViewportMod.Viewport
import typings.puppeteer.commonTargetManagerMod.TargetManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/esm/puppeteer/types", "Target")
@js.native
open class Target protected ()
  extends typings.puppeteer.commonTargetMod.Target {
  def this(
    targetInfo: TargetInfo,
    session: Unit,
    browserContext: typings.puppeteer.apiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteer.puppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteer.commonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  def this(
    targetInfo: TargetInfo,
    session: Unit,
    browserContext: typings.puppeteer.apiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteer.puppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteer.commonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  def this(
    targetInfo: TargetInfo,
    session: typings.puppeteer.puppeteerCommonConnectionMod.CDPSession,
    browserContext: typings.puppeteer.apiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteer.puppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteer.commonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  /**
    * @internal
    */
  def this(
    targetInfo: TargetInfo,
    session: typings.puppeteer.puppeteerCommonConnectionMod.CDPSession,
    browserContext: typings.puppeteer.apiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteer.puppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteer.commonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
}
