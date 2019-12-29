package typings.seleniumDashWebdriver.libCapabilitiesMod

import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.CreateSessionCapabilities
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.ProxyConfig
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.logging.Preferences
import typings.std.IterableIterator
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/lib/capabilities", "Capabilities")
@js.native
// region Constructors
/**
  * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
  *     capabilities to initialize this instance from.
  */
class Capabilities () extends CreateSessionCapabilities {
  def this(other: js.Object) = this()
  def this(other: Capabilities) = this()
  def this(other: Map[String, _]) = this()
  /**
    * Deletes an entry from this set of capabilities.
    *
    * @param {string} key the capability key to delete.
    */
  def delete(key: String): Boolean = js.native
  /**
    * @param {string} key The capability to return.
    * @return {*} The capability with the given key, or {@code null} if it has
    *     not been set.
    */
  def get(key: String): js.Any = js.native
  /**
    * @return {boolean} whether the session is configured to accept insecure
    *     TLS certificates.
    */
  def getAcceptInsecureCerts(): Boolean = js.native
  /**
    * @return {(UserPromptHandler|undefined)} the behavior pattern for responding
    *     to unhandled user prompts, or undefined if not set.
    */
  def getAlertBehavior(): js.UndefOr[String] = js.native
  /**
    * @return {(string|undefined)} the configured browser name, or undefined if
    *     not set.
    */
  def getBrowserName(): js.UndefOr[String] = js.native
  /**
    * @return {(string|undefined)} the configured browser version, or undefined
    *     if not set.
    */
  def getBrowserVersion(): js.UndefOr[String] = js.native
  /**
    * Returns the configured page load strategy.
    *
    * @return {(string|undefined)} the page load strategy.
    */
  def getPageLoadStrategy(): js.UndefOr[String] = js.native
  /**
    * @return {(string|undefined)} the configured platform or undefined if not
    *     set.
    */
  def getPlatform(): js.UndefOr[String] = js.native
  /**
    * @return {(proxy.Config|undefined)} the configured proxy settings, or
    *     undefined if not set.
    */
  def getProxy(): js.UndefOr[ProxyConfig] = js.native
  /**
    * @param {string} key The capability to check.
    * @return {boolean} Whether the specified capability is set.
    */
  def has(key: String): Boolean = js.native
  /**
    * @return {!Iterator<string>} an iterator of the keys set.
    */
  def keys(): IterableIterator[String] = js.native
  def merge(other: js.Object): Capabilities = js.native
  /**
    * Merges another set of capabilities into this instance.
    * @param {!(Capabilities|Map<String, ?>|Object<string, ?>)} other The other
    *     set of capabilities to merge.
    * @return {!Capabilities} A self reference.
    */
  def merge(other: Capabilities): Capabilities = js.native
  def merge(other: Map[String, _]): Capabilities = js.native
  /**
    * @param {string} key The capability key.
    * @param {*} value The capability value.
    * @return {!Capabilities} A self reference.
    * @throws {TypeError} If the `key` is not a string.
    */
  def set(key: String, value: js.Any): Capabilities = js.native
  /**
    * Sets whether a WebDriver session should implicitly accept self-signed, or
    * other untrusted TLS certificates on navigation.
    *
    * @param {boolean} accept whether to accept insecure certs.
    * @return {!Capabilities} a self reference.
    */
  def setAcceptInsecureCerts(accept: Boolean): Capabilities = js.native
  /**
    * Sets the default action to take with an unexpected alert before returning
    * an error. If unspecified, WebDriver will default to
    * {@link UserPromptHandler.DISMISS_AND_NOTIFY}.
    *
    * @param {?UserPromptHandler} behavior The way WebDriver should respond to
    *     unhandled user prompts.
    * @return {!Capabilities} A self reference.
    */
  def setAlertBehavior(behavior: String): Capabilities = js.native
  /**
    * Sets the name of the target browser.
    *
    * @param {(Browser|string)} name the browser name.
    * @return {!Capabilities} a self reference.
    */
  def setBrowserName(name: String): Capabilities = js.native
  /**
    * Sets the desired version of the target browser.
    *
    * @param {string} version the desired version.
    * @return {!Capabilities} a self reference.
    */
  def setBrowserVersion(version: String): Capabilities = js.native
  def setLoggingPrefs(prefs: js.Object): Capabilities = js.native
  /**
    * Sets the logging preferences. Preferences may be specified as a
    * {@link ./logging.Preferences} instance, or as a map of log-type to
    * log-level.
    * @param {!(./logging.Preferences|Object<string>)} prefs The logging
    *     preferences.
    * @return {!Capabilities} A self reference.
    */
  def setLoggingPrefs(prefs: Preferences): Capabilities = js.native
  /**
    * Sets the desired page loading strategy for a new WebDriver session.
    *
    * @param {PageLoadStrategy} strategy the desired strategy.
    * @return {!Capabilities} a self reference.
    */
  def setPageLoadStrategy(strategy: String): Capabilities = js.native
  /**
    * Sets the target platform.
    *
    * @param {(Platform|string)} platform the target platform.
    * @return {!Capabilities} a self reference.
    */
  def setPlatform(platform: String): Capabilities = js.native
  /**
    * Sets the proxy configuration for this instance.
    * @param {proxy.Config} proxy The desired proxy configuration.
    * @return {!Capabilities} A self reference.
    */
  def setProxy(proxy: ProxyConfig): Capabilities = js.native
}

/* static members */
@JSImport("selenium-webdriver/lib/capabilities", "Capabilities")
@js.native
object Capabilities extends js.Object {
  // endregion
  // region Static Methods
  /**
    * @return {!Capabilities} A basic set of capabilities for Chrome.
    */
  def chrome(): Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Microsoft Edge.
    */
  def edge(): Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Firefox.
    */
  def firefox(): Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for
    *     Internet Explorer.
    */
  def ie(): Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Safari.
    */
  def safari(): Capabilities = js.native
}

