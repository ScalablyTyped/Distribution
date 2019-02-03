package typings
package seleniumDashWebdriverLib.chromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/chrome", "Options")
@js.native
/**
  * @constructor
  */
class Options () extends js.Object {
  /**
    * Add additional command line arguments to use when launching the Chrome
    * browser.  Each argument may be specified with or without the '--' prefix
    * (e.g. '--foo' and 'foo'). Arguments with an associated value should be
    * delimited by an '=': 'foo=bar'.
    * @param {...(string|!Array.<string>)} var_args The arguments to add.
    * @return {!Options} A self reference.
    */
  def addArguments(var_args: java.lang.String*): Options = js.native
  /**
    * Add additional extensions to install when launching Chrome. Each extension
    * should be specified as the path to the packed CRX file, or a Buffer for an
    * extension.
    * @param {...(string|!Buffer|!Array.<(string|!Buffer)>)} var_args The
    *     extensions to add.
    * @return {!Options} A self reference.
    */
  def addExtensions(var_args: js.Any*): Options = js.native
  /**
    * Sets the name of the activity hosting a Chrome-based Android WebView. This
    * option must be set to connect to an [Android WebView](
    * https://sites.google.com/a/chromium.org/chromedriver/getting-started/getting-started---android)
    *
    * @param {string} name The activity name.
    * @return {!Options} A self reference.
    */
  def androidActivity(name: java.lang.String): Options = js.native
  /**
    * Configures the ChromeDriver to launch Chrome on Android via adb. This
    * function is shorthand for
    * {@link #androidPackage options.androidPackage('com.android.chrome')}.
    * @return {!Options} A self reference.
    */
  def androidChrome(): Options = js.native
  /**
    * Sets the device serial number to connect to via ADB. If not specified, the
    * ChromeDriver will select an unused device at random. An error will be
    * returned if all devices already have active sessions.
    *
    * @param {string} serial The device serial number to connect to.
    * @return {!Options} A self reference.
    */
  def androidDeviceSerial(serial: java.lang.String): Options = js.native
  /**
    * Sets the package name of the Chrome or WebView app.
    *
    * @param {?string} pkg The package to connect to, or `null` to disable Android
    *     and switch back to using desktop Chrome.
    * @return {!Options} A self reference.
    */
  def androidPackage(pkg: java.lang.String): Options = js.native
  /**
    * Sets the process name of the Activity hosting the WebView (as given by `ps`).
    * If not specified, the process name is assumed to be the same as
    * {@link #androidPackage}.
    *
    * @param {string} processName The main activity name.
    * @return {!Options} A self reference.
    */
  def androidProcess(processName: java.lang.String): Options = js.native
  /**
    * Sets whether to connect to an already-running instead of the specified
    * {@linkplain #androidProcess app} instead of launching the app with a clean
    * data directory.
    *
    * @param {boolean} useRunning Whether to connect to a running instance.
    * @return {!Options} A self reference.
    */
  def androidUseRunningApp(useRunning: scala.Boolean): Options = js.native
  /**
    * Sets whether to leave the started Chrome browser running if the controlling
    * ChromeDriver service is killed before {@link webdriver.WebDriver#quit()} is
    * called.
    * @param {boolean} detach Whether to leave the browser running if the
    *     chromedriver service is killed before the session.
    * @return {!Options} A self reference.
    */
  def detachDriver(detach: scala.Boolean): Options = js.native
  /**
    * List of Chrome command line switches to exclude that ChromeDriver by default
    * passes when starting Chrome.  Do not prefix switches with '--'.
    *
    * @param {...(string|!Array<string>)} var_args The switches to exclude.
    * @return {!Options} A self reference.
    */
  def excludeSwitches(var_args: java.lang.String*): Options = js.native
  /**
    * Configures the chromedriver to start Chrome in headless mode.
    *
    * > __NOTE:__ Resizing the browser window in headless mode is only supported
    * > in Chrome 60. Users are encouraged to set an initial window size with
    * > the {@link #windowSize windowSize({width, height})} option.
    *
    * @return {!Options} A self reference.
    */
  def headless(): Options = js.native
  /**
    * Sets the path to the Chrome binary to use. On Mac OS X, this path should
    * reference the actual Chrome executable, not just the application binary
    * (e.g. '/Applications/Google Chrome.app/Contents/MacOS/Google Chrome').
    *
    * The binary path be absolute or relative to the chromedriver server
    * executable, but it must exist on the machine that will launch Chrome.
    *
    * @param {string} path The path to the Chrome binary to use.
    * @return {!Options} A self reference.
    */
  def setChromeBinaryPath(path: java.lang.String): Options = js.native
  /**
    * Sets the path to Chrome's log file. This path should exist on the machine
    * that will launch Chrome.
    * @param {string} path Path to the log file to use.
    * @return {!Options} A self reference.
    */
  def setChromeLogFile(path: java.lang.String): Options = js.native
  /**
    * Sets the directory to store Chrome minidumps in. This option is only
    * supported when ChromeDriver is running on Linux.
    * @param {string} path The directory path.
    * @return {!Options} A self reference.
    */
  def setChromeMinidumpPath(path: java.lang.String): Options = js.native
  /**
    * Sets preferences for the 'Local State' file in Chrome's user data
    * directory.
    * @param {!Object} state Dictionary of local state preferences.
    * @return {!Options} A self reference.
    */
  def setLocalState(state: js.Any): Options = js.native
  /**
    * Sets the logging preferences for the new session.
    * @param {!webdriver.logging.Preferences} prefs The logging preferences.
    * @return {!Options} A self reference.
    */
  def setLoggingPrefs(prefs: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Preferences): Options = js.native
  /**
    * Configures Chrome to emulate a mobile device. For more information, refer
    * to the ChromeDriver project page on [mobile emulation][em]. Configuration
    * options include:
    *
    * - `deviceName`: The name of a pre-configured [emulated device][devem]
    * - `width`: screen width, in pixels
    * - `height`: screen height, in pixels
    * - `pixelRatio`: screen pixel ratio
    *
    * __Example 1: Using a Pre-configured Device__
    *
    *     let options = new chrome.Options().setMobileEmulation(
    *         {deviceName: 'Google Nexus 5'});
    *
    *     let driver = new chrome.Driver(options);
    *
    * __Example 2: Using Custom Screen Configuration__
    *
    *     let options = new chrome.Options().setMobileEmulation({
    *         width: 360,
    *         height: 640,
    *         pixelRatio: 3.0
    *     });
    *
    *     let driver = new chrome.Driver(options);
    *
    *
    * [em]: https://sites.google.com/a/chromium.org/chromedriver/mobile-emulation
    * [devem]: https://developer.chrome.com/devtools/docs/device-mode
    *
    * @param {?({deviceName: string}|
    *           {width: number, height: number, pixelRatio: number})} config The
    *     mobile emulation configuration, or `null` to disable emulation.
    * @return {!Options} A self reference.
    */
  def setMobileEmulation(config: js.Any): Options = js.native
  /**
    * Sets the performance logging preferences. Options include:
    *
    * - `enableNetwork`: Whether or not to collect events from Network domain.
    * - `enablePage`: Whether or not to collect events from Page domain.
    * - `enableTimeline`: Whether or not to collect events from Timeline domain.
    *     Note: when tracing is enabled, Timeline domain is implicitly disabled,
    *     unless `enableTimeline` is explicitly set to true.
    * - `tracingCategories`: A comma-separated string of Chrome tracing categories
    *     for which trace events should be collected. An unspecified or empty
    *     string disables tracing.
    * - `bufferUsageReportingInterval`: The requested number of milliseconds
    *     between DevTools trace buffer usage events. For example, if 1000, then
    *     once per second, DevTools will report how full the trace buffer is. If a
    *     report indicates the buffer usage is 100%, a warning will be issued.
    *
    * @param {{enableNetwork: boolean,
    *          enablePage: boolean,
    *          enableTimeline: boolean,
    *          tracingCategories: string,
    *          bufferUsageReportingInterval: number}} prefs The performance
    *     logging preferences.
    * @return {!Options} A self reference.
    */
  def setPerfLoggingPrefs(prefs: IPerfLoggingPrefs): Options = js.native
  /**
    * Sets the proxy settings for the new session.
    * @param {webdriver.ProxyConfig} proxy The proxy configuration to use.
    * @return {!Options} A self reference.
    */
  def setProxy(proxy: seleniumDashWebdriverLib.seleniumDashWebdriverMod.ProxyConfig): Options = js.native
  /**
    * Sets the user preferences for Chrome's user profile. See the 'Preferences'
    * file in Chrome's user data directory for examples.
    * @param {!Object} prefs Dictionary of user preferences to use.
    * @return {!Options} A self reference.
    */
  def setUserPreferences(prefs: js.Any): Options = js.native
  /**
    * Converts this options instance to a {@link webdriver.Capabilities} object.
    * @param {webdriver.Capabilities=} opt_capabilities The capabilities to merge
    *     these options into, if any.
    * @return {!webdriver.Capabilities} The capabilities.
    */
  def toCapabilities(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  def toCapabilities(opt_capabilities: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
}

/* static members */
@JSImport("selenium-webdriver/chrome", "Options")
@js.native
object Options extends js.Object {
  /**
    * Extracts the ChromeDriver specific options from the given capabilities
    * object.
    * @param {!webdriver.Capabilities} capabilities The capabilities object.
    * @return {!Options} The ChromeDriver options.
    */
  def fromCapabilities(capabilities: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities): seleniumDashWebdriverLib.chromeMod.Options = js.native
}

