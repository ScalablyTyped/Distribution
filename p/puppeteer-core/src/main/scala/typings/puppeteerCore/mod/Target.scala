package typings.puppeteerCore.mod

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteerCore.puppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "Target")
@js.native
class Target protected ()
  extends typings.puppeteerCore.targetMod.Target {
  /**
    * @internal
    */
  def this(
    targetInfo: TargetInfo,
    browserContext: typings.puppeteerCore.browserMod.BrowserContext,
    sessionFactory: js.Function0[js.Promise[typings.puppeteerCore.connectionMod.CDPSession]],
    ignoreHTTPSErrors: Boolean
  ) = this()
  def this(
    targetInfo: TargetInfo,
    browserContext: typings.puppeteerCore.browserMod.BrowserContext,
    sessionFactory: js.Function0[js.Promise[typings.puppeteerCore.connectionMod.CDPSession]],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport
  ) = this()
}
