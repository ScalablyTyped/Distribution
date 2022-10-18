package typings.puppeteerCore.libEsmPuppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "FrameManager")
@js.native
open class FrameManager protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonFrameManagerMod.FrameManager {
  def this(
    client: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    page: typings.puppeteerCore.libEsmPuppeteerApiPageMod.Page,
    ignoreHTTPSErrors: Boolean,
    timeoutSettings: typings.puppeteerCore.libEsmPuppeteerCommonTimeoutSettingsMod.TimeoutSettings
  ) = this()
}
