package typings.puppeteer.esmPuppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/esm/puppeteer/types", "FrameManager")
@js.native
open class FrameManager protected ()
  extends typings.puppeteer.commonFrameManagerMod.FrameManager {
  def this(
    client: typings.puppeteer.puppeteerCommonConnectionMod.CDPSession,
    page: typings.puppeteer.apiPageMod.Page,
    ignoreHTTPSErrors: Boolean,
    timeoutSettings: typings.puppeteer.commonTimeoutSettingsMod.TimeoutSettings
  ) = this()
}
