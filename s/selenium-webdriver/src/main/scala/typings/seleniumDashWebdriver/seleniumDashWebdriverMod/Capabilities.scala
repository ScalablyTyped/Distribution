package typings.seleniumDashWebdriver.seleniumDashWebdriverMod

import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.loggingNs.Preferences
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "Capabilities")
@js.native
// region Constructors
/**
  * @param {(Capabilities|Object)=} opt_other Another set of
  *     capabilities to merge into this instance.
  * @constructor
  */
class Capabilities () extends CreateSessionCapabilities {
  def this(opt_other: js.Object) = this()
  def this(opt_other: Capabilities) = this()
  /**
    * @param {string} key The capability to return.
    * @return {*} The capability with the given key, or {@code null} if it has
    *     not been set.
    */
  def get(key: String): js.Any = js.native
  /**
    * @param {string} key The capability to check.
    * @return {boolean} Whether the specified capability is set.
    */
  def has(key: String): Boolean = js.native
  def merge(other: js.Object): Capabilities = js.native
  /**
    * Merges another set of capabilities into this instance. Any duplicates in
    * the provided set will override those already set on this instance.
    * @param {!(Capabilities|Object)} other The capabilities to
    *     merge into this instance.
    * @return {!Capabilities} A self reference.
    */
  def merge(other: Capabilities): Capabilities = js.native
  /**
    * @param {string} key The capability to set.
    * @param {*} value The capability value.  Capability values must be JSON
    *     serializable. Pass {@code null} to unset the capability.
    * @return {!Capabilities} A self reference.
    */
  def set(key: String, value: js.Any): Capabilities = js.native
  /**
    * Sets the default action to take with an unexpected alert before returning
    * an error.
    * @param {string} behavior The desired behavior; should be 'accept',
    *     'dismiss', or 'ignore'. Defaults to 'dismiss'.
    * @return {!Capabilities} A self reference.
    */
  def setAlertBehavior(): Capabilities = js.native
  def setAlertBehavior(behavior: String): Capabilities = js.native
  /**
    * Sets whether native events should be used.
    * @param {boolean} enabled Whether to enable native events.
    * @return {!Capabilities} A self reference.
    */
  def setEnableNativeEvents(enabled: Boolean): Capabilities = js.native
  def setLoggingPrefs(prefs: js.Object): Capabilities = js.native
  /**
    * Sets the logging preferences. Preferences may be specified as a
    * {@link logging.Preferences} instance, or a as a map of log-type to
    * log-level.
    * @param {!(logging.Preferences|Object.<string, string>)} prefs The
    *     logging preferences.
    * @return {!Capabilities} A self reference.
    */
  def setLoggingPrefs(prefs: Preferences): Capabilities = js.native
  /**
    * Sets the proxy configuration for this instance.
    * @param {ProxyConfig} proxy The desired proxy configuration.
    * @return {!Capabilities} A self reference.
    */
  def setProxy(proxy: ProxyConfig): Capabilities = js.native
  /**
    * Sets how elements should be scrolled into view for interaction.
    * @param {number} behavior The desired scroll behavior: either 0 to align
    *     with the top of the viewport or 1 to align with the bottom.
    * @return {!Capabilities} A self reference.
    */
  def setScrollBehavior(behavior: Double): Capabilities = js.native
  // endregion
  // region Methods
  /** @return {!Object} The JSON representation of this instance. */
  def toJSON(): js.Any = js.native
}

/* static members */
@JSImport("selenium-webdriver", "Capabilities")
@js.native
object Capabilities extends js.Object {
  // endregion
  // region Static Methods
  /**
    * @return {!Capabilities} A basic set of capabilities for Android.
    */
  def android(): Capabilities = js.native
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
    * @return {!Capabilities} A basic set of capabilities for HTMLUnit.
    */
  def htmlunit(): Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for HTMLUnit
    *                                   with enabled Javascript.
    */
  def htmlunitwithjs(): Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for
    *     Internet Explorer.
    */
  def ie(): Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for iPad.
    */
  def ipad(): Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for iPhone.
    */
  def iphone(): Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Opera.
    */
  def opera(): Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for
    *     PhantomJS.
    */
  def phantomjs(): Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Safari.
    */
  def safari(): Capabilities = js.native
}

