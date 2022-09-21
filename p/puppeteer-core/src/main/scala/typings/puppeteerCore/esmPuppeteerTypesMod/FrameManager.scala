package typings.puppeteerCore.esmPuppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "FrameManager")
@js.native
open class FrameManager protected ()
  extends typings.puppeteerCore.commonFrameManagerMod.FrameManager {
  def this(
    client: typings.puppeteerCore.puppeteerCommonConnectionMod.CDPSession,
    page: typings.puppeteerCore.apiPageMod.Page,
    ignoreHTTPSErrors: Boolean,
    timeoutSettings: typings.puppeteerCore.commonTimeoutSettingsMod.TimeoutSettings
  ) = this()
}
