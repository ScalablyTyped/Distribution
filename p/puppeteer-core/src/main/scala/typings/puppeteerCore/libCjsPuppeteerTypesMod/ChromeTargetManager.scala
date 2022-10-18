package typings.puppeteerCore.libCjsPuppeteerTypesMod

import typings.puppeteerCore.libCjsPuppeteerApiBrowserMod.TargetFilterCallback
import typings.puppeteerCore.libCjsPuppeteerCommonTargetManagerMod.TargetFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "ChromeTargetManager")
@js.native
open class ChromeTargetManager protected ()
  extends typings.puppeteerCore.libCjsPuppeteerCommonChromeTargetManagerMod.ChromeTargetManager {
  def this(
    connection: typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.Connection,
    targetFactory: TargetFactory
  ) = this()
  def this(
    connection: typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.Connection,
    targetFactory: TargetFactory,
    targetFilterCallback: TargetFilterCallback
  ) = this()
}
