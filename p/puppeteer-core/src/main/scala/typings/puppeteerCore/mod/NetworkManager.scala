package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/api-docs-entry", "NetworkManager")
@js.native
class NetworkManager protected ()
  extends typings.puppeteerCore.networkManagerMod.NetworkManager {
  def this(
    client: typings.puppeteerCore.connectionMod.CDPSession,
    ignoreHTTPSErrors: Boolean,
    frameManager: typings.puppeteerCore.frameManagerMod.FrameManager
  ) = this()
}
