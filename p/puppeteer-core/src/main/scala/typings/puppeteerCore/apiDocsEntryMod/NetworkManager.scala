package typings.puppeteerCore.apiDocsEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/api-docs-entry", "NetworkManager")
@js.native
class NetworkManager protected ()
  extends typings.puppeteerCore.commonNetworkManagerMod.NetworkManager {
  def this(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    ignoreHTTPSErrors: Boolean,
    frameManager: typings.puppeteerCore.commonFrameManagerMod.FrameManager
  ) = this()
}
