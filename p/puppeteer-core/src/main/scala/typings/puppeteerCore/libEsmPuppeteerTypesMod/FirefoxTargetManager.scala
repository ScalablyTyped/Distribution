package typings.puppeteerCore.libEsmPuppeteerTypesMod

import typings.puppeteerCore.libEsmPuppeteerApiBrowserMod.TargetFilterCallback
import typings.puppeteerCore.libEsmPuppeteerCommonTargetManagerMod.TargetFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/esm/puppeteer/types", "FirefoxTargetManager")
@js.native
open class FirefoxTargetManager protected ()
  extends typings.puppeteerCore.libEsmPuppeteerCommonFirefoxTargetManagerMod.FirefoxTargetManager {
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
