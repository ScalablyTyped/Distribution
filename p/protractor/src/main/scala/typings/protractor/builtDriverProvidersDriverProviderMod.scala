package typings.protractor

import typings.protractor.builtConfigMod.Config
import typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import typings.q.qMod.Promise
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/driverProvider", JSImport.Namespace)
@js.native
object builtDriverProvidersDriverProviderMod extends js.Object {
  @js.native
  abstract class DriverProvider protected () extends js.Object {
    def this(config: Config) = this()
    var bpRunner: js.Any = js.native
    var config_ : Config = js.native
    var drivers_ : js.Array[WebDriver] = js.native
    def getBPUrl(): String = js.native
    /**
      * Get all existing drivers.
      *
      * @public
      * @return array of webdriver instances
      */
    def getExistingDrivers(): js.Array[WebDriver] = js.native
    /**
      * Create a new driver.
      *
      * @public
      * @return webdriver instance
      */
    def getNewDriver(): WebDriver = js.native
    /**
      * Quit a driver.
      *
      * @public
      * @param webdriver instance
      */
    def quitDriver(driver: WebDriver): js.Promise[Unit] = js.native
    /**
      * Set up environment specific to a particular driver provider. Overridden
      * by each driver provider.
      */
    /* protected */ def setupDriverEnv(): Promise[_] = js.native
    /**
      * Default setup environment method, common to all driver providers.
      */
    def setupEnv(): Promise[_] = js.native
    /**
      * Teardown and destroy the environment and do any associated cleanup.
      * Shuts down the drivers.
      *
      * @public
      * @return {q.Promise<any>} A promise which will resolve when the environment is down.
      */
    def teardownEnv(): Promise[_] = js.native
    /**
      * Default update job method.
      * @return a promise
      */
    def updateJob(update: js.Any): Promise[_] = js.native
  }
  
  /* static members */
  @js.native
  object DriverProvider extends js.Object {
    /**
      * Quits an array of drivers and returns a q promise instead of a webdriver one
      *
      * @param drivers {webdriver.WebDriver[]} The webdriver instances
      */
    def quitDrivers(provider: DriverProvider, drivers: js.Array[WebDriver]): Promise[Unit] = js.native
  }
  
}

