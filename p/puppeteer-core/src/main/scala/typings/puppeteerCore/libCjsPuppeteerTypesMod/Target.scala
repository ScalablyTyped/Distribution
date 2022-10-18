package typings.puppeteerCore.libCjsPuppeteerTypesMod

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteerCore.libCjsPuppeteerApiBrowserMod.IsPageTargetCallback
import typings.puppeteerCore.libCjsPuppeteerCommonPuppeteerViewportMod.Viewport
import typings.puppeteerCore.libCjsPuppeteerCommonTargetManagerMod.TargetManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "Target")
@js.native
open class Target protected ()
  extends typings.puppeteerCore.libCjsPuppeteerCommonTargetMod.Target {
  def this(
    targetInfo: TargetInfo,
    session: Unit,
    browserContext: typings.puppeteerCore.libCjsPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteerCore.libCjsPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  def this(
    targetInfo: TargetInfo,
    session: Unit,
    browserContext: typings.puppeteerCore.libCjsPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteerCore.libCjsPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  def this(
    targetInfo: TargetInfo,
    session: typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    browserContext: typings.puppeteerCore.libCjsPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Null,
    screenshotTaskQueue: typings.puppeteerCore.libCjsPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
  /**
    * @internal
    */
  def this(
    targetInfo: TargetInfo,
    session: typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    browserContext: typings.puppeteerCore.libCjsPuppeteerApiBrowserMod.BrowserContext,
    targetManager: TargetManager,
    sessionFactory: js.Function1[
        /* isAutoAttachEmulated */ Boolean, 
        js.Promise[typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession]
      ],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport,
    screenshotTaskQueue: typings.puppeteerCore.libCjsPuppeteerCommonTaskQueueMod.TaskQueue,
    isPageTargetCallback: IsPageTargetCallback
  ) = this()
}
