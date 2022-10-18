package typings.puppeteerCore.libCjsPuppeteerTypesMod

import typings.puppeteerCore.libCjsPuppeteerApiBrowserMod.TargetFilterCallback
import typings.puppeteerCore.libCjsPuppeteerCommonTargetManagerMod.TargetFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "FirefoxTargetManager")
@js.native
open class FirefoxTargetManager protected ()
  extends typings.puppeteerCore.libCjsPuppeteerCommonFirefoxTargetManagerMod.FirefoxTargetManager {
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
