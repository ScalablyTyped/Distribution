package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "FrameManager")
@js.native
class FrameManager protected ()
  extends typings.puppeteerCore.frameManagerMod.FrameManager {
  def this(
    client: typings.puppeteerCore.connectionMod.CDPSession,
    page: typings.puppeteerCore.pageMod.Page,
    ignoreHTTPSErrors: Boolean,
    timeoutSettings: typings.puppeteerCore.timeoutSettingsMod.TimeoutSettings
  ) = this()
}
