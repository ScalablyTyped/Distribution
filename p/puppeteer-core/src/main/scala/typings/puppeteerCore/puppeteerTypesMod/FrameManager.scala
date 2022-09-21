package typings.puppeteerCore.puppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "FrameManager")
@js.native
open class FrameManager protected ()
  extends typings.puppeteerCore.frameManagerMod.FrameManager {
  def this(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    page: typings.puppeteerCore.pageMod.Page,
    ignoreHTTPSErrors: Boolean,
    timeoutSettings: typings.puppeteerCore.timeoutSettingsMod.TimeoutSettings
  ) = this()
}
