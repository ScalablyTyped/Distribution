package typings.puppeteerCore.puppeteerTypesMod

import typings.puppeteerCore.browserMod.TargetFilterCallback
import typings.puppeteerCore.targetManagerMod.TargetFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "FirefoxTargetManager")
@js.native
open class FirefoxTargetManager protected ()
  extends typings.puppeteerCore.firefoxTargetManagerMod.FirefoxTargetManager {
  def this(connection: typings.puppeteerCore.commonConnectionMod.Connection, targetFactory: TargetFactory) = this()
  def this(
    connection: typings.puppeteerCore.commonConnectionMod.Connection,
    targetFactory: TargetFactory,
    targetFilterCallback: TargetFilterCallback
  ) = this()
}
