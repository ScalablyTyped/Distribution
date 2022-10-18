package typings.puppeteerCore.libEsmPuppeteerTypesMod

import typings.puppeteerCore.libEsmPuppeteerApiBrowserMod.TargetFilterCallback
import typings.puppeteerCore.libEsmPuppeteerCommonTargetManagerMod.TargetFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "ChromeTargetManager")
@js.native
open class ChromeTargetManager protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonChromeTargetManagerMod.ChromeTargetManager {
  def this(
    connection: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.Connection,
    targetFactory: TargetFactory
  ) = this()
  def this(
    connection: typings.puppeteerCore.libEsmPuppeteerCommonConnectionMod.Connection,
    targetFactory: TargetFactory,
    targetFilterCallback: TargetFilterCallback
  ) = this()
}
