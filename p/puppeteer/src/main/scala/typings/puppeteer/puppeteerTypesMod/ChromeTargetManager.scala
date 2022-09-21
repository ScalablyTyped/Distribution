package typings.puppeteer.puppeteerTypesMod

import typings.puppeteer.browserMod.TargetFilterCallback
import typings.puppeteer.targetManagerMod.TargetFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "ChromeTargetManager")
@js.native
open class ChromeTargetManager protected ()
  extends typings.puppeteer.chromeTargetManagerMod.ChromeTargetManager {
  def this(connection: typings.puppeteer.commonConnectionMod.Connection, targetFactory: TargetFactory) = this()
  def this(
    connection: typings.puppeteer.commonConnectionMod.Connection,
    targetFactory: TargetFactory,
    targetFilterCallback: TargetFilterCallback
  ) = this()
}
