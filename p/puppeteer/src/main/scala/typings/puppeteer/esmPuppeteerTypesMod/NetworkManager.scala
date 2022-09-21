package typings.puppeteer.esmPuppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/esm/puppeteer/types", "NetworkManager")
@js.native
open class NetworkManager protected ()
  extends typings.puppeteer.commonNetworkManagerMod.NetworkManager {
  def this(
    client: typings.puppeteer.puppeteerCommonConnectionMod.CDPSession,
    ignoreHTTPSErrors: Boolean,
    frameManager: typings.puppeteer.commonNetworkManagerMod.FrameManager
  ) = this()
}
