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
    * @param {promise.ControlFlow=} opt_flow The control flow to create
    *     the driver under.
    * @return {!Driver} A new driver instance.
    */
  def createSession(): seleniumDashWebdriverLib.safariMod.Driver = js.native
  def createSession(opt_config: seleniumDashWebdriverLib.safariMod.Options): seleniumDashWebdriverLib.safariMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.safariMod.Options,
    opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow
  ): seleniumDashWebdriverLib.safariMod.Driver = js.native
  def createSession(opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities): seleniumDashWebdriverLib.safariMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities,
    opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow
  ): seleniumDashWebdriverLib.safariMod.Driver = js.native
}

