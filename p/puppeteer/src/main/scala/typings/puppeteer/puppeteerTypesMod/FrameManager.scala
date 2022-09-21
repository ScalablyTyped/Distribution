package typings.puppeteer.puppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "FrameManager")
@js.native
open class FrameManager protected ()
  extends typings.puppeteer.frameManagerMod.FrameManager {
  def this(
    client: typings.puppeteer.commonConnectionMod.CDPSession,
    page: typings.puppeteer.pageMod.Page,
    ignoreHTTPSErrors: Boolean,
    timeoutSettings: typings.puppeteer.timeoutSettingsMod.TimeoutSettings
  ) = this()
}
