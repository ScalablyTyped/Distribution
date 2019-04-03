package typings
package seleniumDashWebdriverLib.safariMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/safari", "Driver")
@js.native
class Driver ()
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver

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
  def createSession(): seleniumDashWebdriverLib.safariMod.Driver = js.native
  def createSession(opt_config: seleniumDashWebdriverLib.safariMod.Options): seleniumDashWebdriverLib.safariMod.Driver = js.native
  def createSession(opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities): seleniumDashWebdriverLib.safariMod.Driver = js.native
}

