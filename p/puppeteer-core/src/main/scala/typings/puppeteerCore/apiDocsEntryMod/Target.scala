package typings.puppeteerCore.apiDocsEntryMod

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteerCore.commonPuppeteerViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "Target")
@js.native
class Target protected ()
  extends typings.puppeteerCore.commonTargetMod.Target {
  /**
    * @internal
    */
  def this(
    targetInfo: TargetInfo,
    browserContext: typings.puppeteerCore.commonBrowserMod.BrowserContext,
    sessionFactory: js.Function0[js.Promise[typings.puppeteerCore.commonConnectionMod.CDPSession]],
    ignoreHTTPSErrors: Boolean
  ) = this()
  def this(
    targetInfo: TargetInfo,
    browserContext: typings.puppeteerCore.commonBrowserMod.BrowserContext,
    sessionFactory: js.Function0[js.Promise[typings.puppeteerCore.commonConnectionMod.CDPSession]],
    ignoreHTTPSErrors: Boolean,
    defaultViewport: Viewport
  ) = this()
}
