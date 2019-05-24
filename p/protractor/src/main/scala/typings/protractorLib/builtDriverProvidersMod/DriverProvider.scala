package typings
package protractorLib.builtDriverProvidersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders", "DriverProvider")
@js.native
abstract class DriverProvider protected ()
  extends protractorLib.builtDriverProvidersDriverProviderMod.DriverProvider {
  def this(config: protractorLib.builtConfigMod.Config) = this()
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
    provider: protractorLib.builtDriverProvidersDriverProviderMod.DriverProvider,
    drivers: js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver]
  ): qLib.qMod.Promise[scala.Unit] = js.native
}

