package typings.puppeteerCore.puppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "NetworkManager")
@js.native
open class NetworkManager protected ()
  extends typings.puppeteerCore.networkManagerMod.NetworkManager {
  def this(
    client: typings.puppeteerCore.commonConnectionMod.CDPSession,
    ignoreHTTPSErrors: Boolean,
    frameManager: typings.puppeteerCore.networkManagerMod.FrameManager
  ) = this()
}
