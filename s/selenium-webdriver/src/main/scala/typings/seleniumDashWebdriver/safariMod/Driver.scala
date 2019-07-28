package typings.seleniumDashWebdriver.safariMod

import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/safari", "Driver")
@js.native
class Driver () extends WebDriver

/* static members */
@JSImport("selenium-webdriver/safari", "Driver")
@js.native
object Driver extends js.Object {
  /**
    * Creates a new Safari session.
    *
    * @param {(Options|Capabilities)=} opt_config The configuration
    *     options for the new session.
    * @return {!Driver} A new driver instance.
    */
  def createSession(): Driver = js.native
  def createSession(opt_config: Options): Driver = js.native
  def createSession(opt_config: Capabilities): Driver = js.native
}

