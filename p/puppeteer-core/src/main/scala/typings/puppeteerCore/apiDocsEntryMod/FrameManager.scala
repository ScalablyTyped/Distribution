package typings.puppeteerCore.apiDocsEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "FrameManager")
@js.native
class FrameManager protected ()
  extends typings.puppeteerCore.commonFrameManagerMod.FrameManager {
  def this(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    page: typings.puppeteerCore.commonPageMod.Page,
    ignoreHTTPSErrors: Boolean,
    timeoutSettings: typings.puppeteerCore.commonTimeoutSettingsMod.TimeoutSettings
  ) = this()
}
