package typings.puppeteer.puppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteer.browserMod.IsPageTargetCallback
import typings.puppeteer.puppeteerViewportMod.Viewport
import typings.puppeteer.targetManagerMod.TargetManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "Target")
@js.native
open class Target protected ()
  extends typings.puppeteer.targetMod.Target {
  def this(
    targetInfo: TargetInfo,
    session: Unit,
    browserContext: typings.puppeteer.browserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteer.commonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteer.taskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  def this(
    targetInfo: TargetInfo,
    session: Unit,
    browserContext: typings.puppeteer.browserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteer.commonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteer.taskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  def this(
    targetInfo: TargetInfo,
    session: typings.puppeteer.commonConnectionMod.CDPSession,
    browserContext: typings.puppeteer.browserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteer.commonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteer.taskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  /**
    * @internal
    */
  def this(
    targetInfo: TargetInfo,
    session: typings.puppeteer.commonConnectionMod.CDPSession,
    browserContext: typings.puppeteer.browserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteer.commonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteer.taskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
}
