package typings.seleniumDashWebdriver

import typings.seleniumDashWebdriver.edgeMod.Driver
import typings.seleniumDashWebdriver.edgeMod.Options
import typings.seleniumDashWebdriver.remoteMod.DriverService
import typings.seleniumDashWebdriver.remoteMod.DriverService.Builder
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.CreateSessionCapabilities
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/edge", JSImport.Namespace)
@js.native
object edgeMod extends js.Object {
  @js.native
  class Driver () extends WebDriver {
    /**
      * This function is a no-op as file detectors are not supported by this
      * implementation.
      * @override
      */
    def setFileDetector(): Unit = js.native
  }
  
  @js.native
  class Options () extends Capabilities {
    /**
      * Sets the page load strategy for Edge.
      * Supported values are 'normal', 'eager', and 'none';
      *
      * @param {string} pageLoadStrategy The page load strategy to use.
      * @return {!Options} A self reference.
      */
    def setPageLoadStrategy(pageLoadStrategy: String): Options = js.native
  }
  
  @js.native
  /**
    * @param {string=} opt_exe Path to the server executable to use. If omitted,
    *   the builder will attempt to locate the MicrosoftEdgeDriver on the current
    *   PATH.
    * @throws {Error} If provided executable does not exist, or the
    *   MicrosoftEdgeDriver cannot be found on the PATH.
    */
  class ServiceBuilder () extends Builder {
    def this(opt_exe: String) = this()
  }
  
  def getDefaultService(): DriverService = js.native
  def setDefaultService(service: DriverService): Unit = js.native
  /* static members */
  @js.native
  object Driver extends js.Object {
    /**
      * Creates a new browser session for Microsoft's Edge browser.
      *
      * @param {(capabilities.Capabilities|Options)=} opt_config The configuration
      *     options.
      * @param {remote.DriverService=} opt_service The session to use; will use
      *     the {@linkplain #getDefaultService default service} by default.
      * @return {!Driver} A new driver instance.
      */
    def createSession(): Driver = js.native
    def createSession(opt_config: CreateSessionCapabilities): Driver = js.native
    def createSession(opt_config: CreateSessionCapabilities, opt_service: DriverService): Driver = js.native
  }
  
}

