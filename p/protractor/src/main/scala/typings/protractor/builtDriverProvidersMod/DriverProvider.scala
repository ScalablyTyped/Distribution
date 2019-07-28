package typings.protractor.builtDriverProvidersMod

import typings.protractor.builtConfigMod.Config
import typings.q.qMod.Promise
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders", "DriverProvider")
@js.native
abstract class DriverProvider protected ()
  extends typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider {
  def this(config: Config) = this()
}

/* static members */
@JSImport("protractor/built/driverProviders", "DriverProvider")
@js.native
object DriverProvider extends js.Object {
  /**
    * Quits an array of drivers and returns a q promise instead of a webdriver one
    *
    * @param drivers {webdriver.WebDriver[]} The webdriver instances
    */
  def quitDrivers(
    provider: typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider,
    drivers: js.Array[WebDriver]
  ): Promise[Unit] = js.native
}

