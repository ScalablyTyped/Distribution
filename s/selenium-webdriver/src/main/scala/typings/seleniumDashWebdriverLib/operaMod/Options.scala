package typings
package seleniumDashWebdriverLib.operaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/opera", "Options")
@js.native
class Options () extends js.Object {
  /**
       * Add additional command line arguments to use when launching the Opera
       * browser.  Each argument may be specified with or without the '--' prefix
       * (e.g. '--foo' and 'foo'). Arguments with an associated value should be
       * delimited by an '=': 'foo=bar'.
       * @param {...(string|!Array.<string>)} var_args The arguments to add.
       * @return {!Options} A self reference.
       */
  def addArguments(var_args: java.lang.String*): Options = js.native
  /**
       * Add additional extensions to install when launching Opera. Each extension
       * should be specified as the path to the packed CRX file, or a Buffer for an
       * extension.
       * @param {...(string|!Buffer|!Array.<(string|!Buffer)>)} var_args The
       *     extensions to add.
       * @return {!Options} A self reference.
       */
  def addExtensions(var_args: js.Any*): Options = js.native
  /**
       * Sets the logging preferences for the new session.
       * @param {!./lib/logging.Preferences} prefs The logging preferences.
       * @return {!Options} A self reference.
       */
  def setLoggingPrefs(prefs: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Preferences): Options = js.native
  /**
       * Sets the path to the Opera binary to use. On Mac OS X, this path should
       * reference the actual Opera executable, not just the application binary. The
       * binary path be absolute or relative to the operadriver server executable, but
       * it must exist on the machine that will launch Opera.
       *
       * @param {string} path The path to the Opera binary to use.
       * @return {!Options} A self reference.
       */
  def setOperaBinaryPath(path: java.lang.String): Options = js.native
  /**
       * Sets the proxy settings for the new session.
       * @param {capabilities.ProxyConfig} proxy The proxy configuration to use.
       * @return {!Options} A self reference.
       */
  def setProxy(proxy: seleniumDashWebdriverLib.seleniumDashWebdriverMod.ProxyConfig): Options = js.native
  /**
       * Converts this options instance to a {@link capabilities.Capabilities}
       *     object.
       * @param {capabilities.Capabilities=} opt_capabilities The capabilities to
       *     merge these options into, if any.
       * @return {!capabilities.Capabilities} The capabilities.
       */
  def toCapabilities(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  /**
       * Converts this options instance to a {@link capabilities.Capabilities}
       *     object.
       * @param {capabilities.Capabilities=} opt_capabilities The capabilities to
       *     merge these options into, if any.
       * @return {!capabilities.Capabilities} The capabilities.
       */
  def toCapabilities(opt_capabilities: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
}

@JSImport("selenium-webdriver/opera", "Options")
@js.native
object Options extends js.Object {
  /**
       * Extracts the OperaDriver specific options from the given capabilities
       * object.
       * @param {!capabilities.Capabilities} caps The capabilities object.
       * @return {!Options} The OperaDriver options.
       */
  def fromCapabilities(caps: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities): seleniumDashWebdriverLib.operaMod.Options = js.native
}

