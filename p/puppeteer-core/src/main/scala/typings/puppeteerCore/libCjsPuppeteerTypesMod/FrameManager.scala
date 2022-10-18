package typings.puppeteerCore.libCjsPuppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "FrameManager")
@js.native
open class FrameManager protected ()
  extends typings.puppeteerCore.libCjsPuppeteerCommonFrameManagerMod.FrameManager {
  def this(
    client: typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession,
    page: typings.puppeteerCore.libCjsPuppeteerApiPageMod.Page,
    ignoreHTTPSErrors: Boolean,
    timeoutSettings: typings.puppeteerCore.libCjsPuppeteerCommonTimeoutSettingsMod.TimeoutSettings
  ) = this()
}
