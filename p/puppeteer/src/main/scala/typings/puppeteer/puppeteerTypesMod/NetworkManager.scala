package typings.puppeteer.puppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "NetworkManager")
@js.native
open class NetworkManager protected ()
  extends typings.puppeteer.networkManagerMod.NetworkManager {
  def this(
    client: typings.puppeteer.commonConnectionMod.CDPSession,
    ignoreHTTPSErrors: Boolean,
    frameManager: typings.puppeteer.networkManagerMod.FrameManager
  ) = this()
}
