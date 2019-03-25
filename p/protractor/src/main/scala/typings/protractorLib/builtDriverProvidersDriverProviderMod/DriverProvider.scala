package typings
package protractorLib.builtDriverProvidersDriverProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/driverProvider", "DriverProvider")
@js.native
abstract class DriverProvider protected () extends js.Object {
  def this(config: protractorLib.builtConfigMod.Config) = this()
  var bpRunner: js.Any = js.native
  var config_ : protractorLib.builtConfigMod.Config = js.native
  var drivers_ : js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver] = js.native
  def getBPUrl(): java.lang.String = js.native
  /**
    * Get all existing drivers.
    *
    * @public
    * @return array of webdriver instances
    */
  def getExistingDrivers(): js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver] = js.native
  /**
    * Create a new driver.
    *
    * @public
    * @return a promise to a webdriver instance
    */
  def getNewDriver(): js.Promise[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver] = js.native
  /**
    * Quit a driver.
    *
    * @public
    * @param webdriver instance
    */
  def quitDriver(driver: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver): js.Promise[scala.Unit] = js.native
  /**
    * Set up environment specific to a particular driver provider. Overridden
    * by each driver provider.
    */
  /* protected */ def setupDriverEnv(): js.Promise[_] = js.native
  /**
    * Default setup environment method, common to all driver providers.
    */
  def setupEnv(): js.Promise[_] = js.native
  /**
    * Teardown and destroy the environment and do any associated cleanup.
    * Shuts down the drivers.
    *
    * @public
    * @return {Promise<any>} A promise which will resolve when the environment is down.
    */
  def teardownEnv(): js.Promise[_] = js.native
  /**
    * Default update job method.
    * @return a promise
    */
  def updateJob(update: js.Any): js.Promise[_] = js.native
}

/* static members */
@JSImport("protractor/built/driverProviders/driverProvider", "DriverProvider")
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
  ): js.Promise[scala.Unit] = js.native
}

