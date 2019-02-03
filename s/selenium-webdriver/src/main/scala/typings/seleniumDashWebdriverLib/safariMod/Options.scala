package typings
package seleniumDashWebdriverLib.safariMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/safari", "Options")
@js.native
class Options () extends js.Object {
  /**
    * Sets whether to force Safari to start with a clean session. Enabling this
    * option will cause all global browser data to be deleted.
    * @param {boolean} clean Whether to make sure the session has no cookies,
    *     cache entries, local storage, or databases.
    * @return {!Options} A self reference.
    */
  def setCleanSession(clean: scala.Boolean): Options = js.native
  /**
    * Sets the logging preferences for the new session.
    * @param {!./lib/logging.Preferences} prefs The logging preferences.
    * @return {!Options} A self reference.
    */
  def setLoggingPrefs(prefs: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Preferences): Options = js.native
  /**
    * Converts this options instance to a {@link Capabilities} object.
    * @param {Capabilities=} opt_capabilities The capabilities to
    *     merge these options into, if any.
    * @return {!Capabilities} The capabilities.
    */
  def toCapabilities(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  def toCapabilities(opt_capabilities: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
}

/* static members */
@JSImport("selenium-webdriver/safari", "Options")
@js.native
object Options extends js.Object {
  /**
    * Extracts the SafariDriver specific options from the given capabilities
    * object.
    * @param {!Capabilities} capabilities The capabilities object.
    * @return {!Options} The ChromeDriver options.
    */
  def fromCapabilities(capabilities: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities): seleniumDashWebdriverLib.safariMod.Options = js.native
}

