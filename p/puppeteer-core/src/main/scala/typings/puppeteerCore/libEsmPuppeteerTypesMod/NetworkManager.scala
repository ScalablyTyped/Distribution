package typings.puppeteerCore.libEsmPuppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "NetworkManager")
@js.native
open class NetworkManager protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonNetworkManagerMod.NetworkManager {
  def this(
    client: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession,
    ignoreHTTPSErrors: Boolean,
    frameManager: typings.puppeteerCore.libEsmPuppeteerCommonNetworkManagerMod.FrameManager
  ) = this()
}
