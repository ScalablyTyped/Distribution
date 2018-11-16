package typings
package seleniumDashWebdriverLib.firefoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/firefox", "Options")
@js.native
class Options () extends js.Object {
  /**
       * Specify additional command line arguments that should be used when starting
       * the Firefox browser.
       *
       * @param {...(string|!Array<string>)} args The arguments to include.
       * @return {!Options} A self reference.
       */
  def addArguments(args: java.lang.String*): Options = js.native
  /**
       * Add extensions that should be installed when starting Firefox.
       *
       * @param {...string} paths The paths to the extension XPI files to install.
       * @return {!Options} A self reference.
       */
  def addExtensions(paths: java.lang.String*): Options = js.native
  /**
       * Sets the browser to be in headless mode.
       *
       * @return {!Options} A self reference.
       */
  def headless(): Options = js.native
  /**
       * Sets the binary to use. The binary may be specified as the path to a Firefox
       * executable, or as a {@link Binary} object.
       *
       * @param {(string|!Binary)} binary The binary to use.
       * @return {!Options} A self reference.
       */
  def setBinary(binary: java.lang.String): Options = js.native
  /**
       * Sets the binary to use. The binary may be specified as the path to a Firefox
       * executable, or as a {@link Binary} object.
       *
       * @param {(string|!Binary)} binary The binary to use.
       * @return {!Options} A self reference.
       */
  def setBinary(binary: js.Any): Options = js.native
  /**
       * Sets the logging preferences for the new session.
       * @param {logging.Preferences} prefs The logging preferences.
       * @return {!Options} A self reference.
       */
  def setLoggingPreferences(prefs: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Preferences): Options = js.native
  /**
       * @param {string} key the preference key.
       * @param {(string|number|boolean)} value the preference value.
       * @return {!Options} A self reference.
       * @throws {TypeError} if either the key or value has an invalid type.
       */
  def setPreference(key: java.lang.String, value: java.lang.String): Options = js.native
  /**
       * @param {string} key the preference key.
       * @param {(string|number|boolean)} value the preference value.
       * @return {!Options} A self reference.
       * @throws {TypeError} if either the key or value has an invalid type.
       */
  def setPreference(key: java.lang.String, value: scala.Boolean): Options = js.native
  /**
       * @param {string} key the preference key.
       * @param {(string|number|boolean)} value the preference value.
       * @return {!Options} A self reference.
       * @throws {TypeError} if either the key or value has an invalid type.
       */
  def setPreference(key: java.lang.String, value: scala.Double): Options = js.native
  /**
       * Sets the profile to use. The profile may be specified as a
       * {@link Profile} object or as the path to an existing Firefox profile to use
       * as a template.
       *
       * @param {(string|!Profile)} profile The profile to use.
       * @return {!Options} A self reference.
       */
  def setProfile(profile: java.lang.String): Options = js.native
  /**
       * Sets the profile to use. The profile may be specified as a
       * {@link Profile} object or as the path to an existing Firefox profile to use
       * as a template.
       *
       * @param {(string|!Profile)} profile The profile to use.
       * @return {!Options} A self reference.
       */
  def setProfile(profile: js.Any): Options = js.native
  /**
       * Sets the proxy to use.
       *
       * @param {capabilities.ProxyConfig} proxy The proxy configuration to use.
       * @return {!Options} A self reference.
       */
  def setProxy(proxy: seleniumDashWebdriverLib.seleniumDashWebdriverMod.ProxyConfig): Options = js.native
  /**
       * Converts these options to a {@link capabilities.Capabilities} instance.
       *
       * @return {!capabilities.Capabilities} A new capabilities object.
       */
  def toCapabilities(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  /**
       * Sets whether to use Mozilla's geckodriver to drive the browser. This option
       * is enabled by default and required for Firefox 47+.
       *
       * @param {boolean} enable Whether to enable the geckodriver.
       * @see https://github.com/mozilla/geckodriver
       */
  def useGeckoDriver(enable: scala.Boolean): Options = js.native
  /**
      * Sets the initial window size when running in
      * {@linkplain #headless headless} mode.
      *
      * @param {{width: number, height: number}} size The desired window size.
      * @return {!Options} A self reference.
      * @throws {TypeError} if width or height is unspecified, not a number, or
      *     less than or equal to 0.
      */
  def windowSize(size: seleniumDashWebdriverLib.Anon_Height): Options = js.native
}

