package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "Builder")
@js.native
class Builder () extends js.Object {
  /**
     * Creates a new WebDriver client based on this builder's current
     * configuration.
     *
     * This method will return a {@linkplain ThenableWebDriver} instance, allowing
     * users to issue commands directly without calling `then()`. The returned
     * thenable wraps a promise that will resolve to a concrete
     * {@linkplain webdriver.WebDriver WebDriver} instance. The promise will be
     * rejected if the remote end fails to create a new session.
     *
     * @return {!ThenableWebDriver} A new WebDriver instance.
     * @throws {Error} If the current configuration is invalid.
     */
  def build(): ThenableWebDriver = js.native
  // endregion
  // region Methods
  /**
     * Configures this builder to ignore any environment variable overrides and to
     * only use the configuration specified through this instance's API.
     *
     * @return {!Builder} A self reference.
     */
  def disableEnvironmentOverrides(): Builder = js.native
  /**
     * Configures the target browser for clients created by this instance.
     * Any calls to {@link #withCapabilities} after this function will
     * overwrite these settings.
     *
     * <p>You may also define the target browser using the {@code SELENIUM_BROWSER}
     * environment variable. If set, this environment variable should be of the
     * form {@code browser[:[version][:platform]]}.
     *
     * @param {(string|Browser)} name The name of the target browser;
     *     common defaults are available on the {@link Browser} enum.
     * @param {string=} opt_version A desired version; may be omitted if any
     *     version should be used.
     * @param {string=} opt_platform The desired platform; may be omitted if any
     *     version may be used.
     * @return {!Builder} A self reference.
     */
  def forBrowser(name: java.lang.String): Builder = js.native
  /**
     * Configures the target browser for clients created by this instance.
     * Any calls to {@link #withCapabilities} after this function will
     * overwrite these settings.
     *
     * <p>You may also define the target browser using the {@code SELENIUM_BROWSER}
     * environment variable. If set, this environment variable should be of the
     * form {@code browser[:[version][:platform]]}.
     *
     * @param {(string|Browser)} name The name of the target browser;
     *     common defaults are available on the {@link Browser} enum.
     * @param {string=} opt_version A desired version; may be omitted if any
     *     version should be used.
     * @param {string=} opt_platform The desired platform; may be omitted if any
     *     version may be used.
     * @return {!Builder} A self reference.
     */
  def forBrowser(name: java.lang.String, opt_version: java.lang.String): Builder = js.native
  /**
     * Configures the target browser for clients created by this instance.
     * Any calls to {@link #withCapabilities} after this function will
     * overwrite these settings.
     *
     * <p>You may also define the target browser using the {@code SELENIUM_BROWSER}
     * environment variable. If set, this environment variable should be of the
     * form {@code browser[:[version][:platform]]}.
     *
     * @param {(string|Browser)} name The name of the target browser;
     *     common defaults are available on the {@link Browser} enum.
     * @param {string=} opt_version A desired version; may be omitted if any
     *     version should be used.
     * @param {string=} opt_platform The desired platform; may be omitted if any
     *     version may be used.
     * @return {!Builder} A self reference.
     */
  def forBrowser(name: java.lang.String, opt_version: java.lang.String, opt_platform: java.lang.String): Builder = js.native
  /**
     * Returns the base set of capabilities this instance is currently configured
     * to use.
     * @return {!Capabilities} The current capabilities for this builder.
     */
  def getCapabilities(): Capabilities = js.native
  /**
     * @return {chrome.Options} the Chrome specific options currently configured
     *     for this builder.
     */
  def getChromeOptions(): seleniumDashWebdriverLib.chromeMod.Options = js.native
  /**
     * @return {firefox.Options} the Firefox specific options currently configured
     *     for this instance.
     */
  def getFirefoxOptions(): seleniumDashWebdriverLib.firefoxMod.Options = js.native
  /**
     * @return {safari.Options} the Safari specific options currently configured
     *     for this instance.
     */
  def getSafariOptions(): seleniumDashWebdriverLib.safariMod.Options = js.native
  /**
     * @return {string} The URL of the WebDriver server this instance is configured
     *     to use.
     */
  def getServerUrl(): java.lang.String = js.native
  /**
     * @return {?string} The URL of the proxy server to use for the WebDriver's
     *    HTTP connections, or `null` if not set.
     */
  def getWebDriverProxy(): java.lang.String = js.native
  /**
     * Sets the default action to take with an unexpected alert before returning
     * an error.
     * @param {string} beahvior The desired behavior; should be 'accept', 'dismiss',
     *     or 'ignore'. Defaults to 'dismiss'.
     * @return {!Builder} A self reference.
     */
  def setAlertBehavior(behavior: java.lang.String): Builder = js.native
  /**
     * Sets Chrome-specific options for drivers created by this builder. Any
     * logging or proxy settings defined on the given options will take precedence
     * over those set through {@link #setLoggingPrefs} and {@link #setProxy},
     * respectively.
     *
     * @param {!chrome.Options} options The ChromeDriver options to use.
     * @return {!Builder} A self reference.
     */
  def setChromeOptions(options: seleniumDashWebdriverLib.chromeMod.Options): Builder = js.native
  /**
     * Sets the service builder to use for managing the chromedriver child process
     * when creating new Chrome sessions.
     *
     * @param {chrome.ServiceBuilder} service the service to use.
     * @return {!Builder} A self reference.
     */
  def setChromeService(service: seleniumDashWebdriverLib.chromeMod.ServiceBuilder): Builder = js.native
  /**
     * Sets the control flow that created drivers should execute actions in. If
     * the flow is never set, or is set to {@code null}, it will use the active
     * flow at the time {@link #build()} is called.
     * @param {promise.ControlFlow} flow The control flow to use, or
     *     {@code null} to
     * @return {!Builder} A self reference.
     */
  def setControlFlow(flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow): Builder = js.native
  /**
     * Set {@linkplain edge.Options options} specific to Microsoft's Edge browser
     * for drivers created by this builder. Any proxy settings defined on the
     * given options will take precedence over those set through
     * {@link #setProxy}.
     *
     * @param {!edge.Options} options The MicrosoftEdgeDriver options to use.
     * @return {!Builder} A self reference.
     */
  def setEdgeOptions(options: seleniumDashWebdriverLib.edgeMod.Options): Builder = js.native
  /**
     * Sets the {@link edge.ServiceBuilder} to use to manage the
     * MicrosoftEdgeDriver child process when creating sessions locally.
     *
     * @param {edge.ServiceBuilder} service the service to use.
     * @return {!Builder} a self reference.
     */
  def setEdgeService(service: seleniumDashWebdriverLib.edgeMod.ServiceBuilder): Builder = js.native
  /**
     * Sets whether native events should be used.
     * @param {boolean} enabled Whether to enable native events.
     * @return {!Builder} A self reference.
     */
  def setEnableNativeEvents(enabled: scala.Boolean): Builder = js.native
  /**
     * Sets Firefox-specific options for drivers created by this builder. Any
     * logging or proxy settings defined on the given options will take precedence
     * over those set through {@link #setLoggingPrefs} and {@link #setProxy},
     * respectively.
     *
     * @param {!firefox.Options} options The FirefoxDriver options to use.
     * @return {!Builder} A self reference.
     */
  def setFirefoxOptions(options: seleniumDashWebdriverLib.firefoxMod.Options): Builder = js.native
  /**
     * Sets the {@link firefox.ServiceBuilder} to use to manage the geckodriver
     * child process when creating Firefox sessions locally.
     *
     * @param {firefox.ServiceBuilder} service the service to use.
     * @return {!Builder} a self reference.
     */
  def setFirefoxService(service: seleniumDashWebdriverLib.firefoxMod.ServiceBuilder): Builder = js.native
  /**
     * Set Internet Explorer specific {@linkplain ie.Options options} for drivers
     * created by this builder. Any proxy settings defined on the given options
     * will take precedence over those set through {@link #setProxy}.
     *
     * @param {!ie.Options} options The IEDriver options to use.
     * @return {!Builder} A self reference.
     */
  def setIeOptions(options: seleniumDashWebdriverLib.ieMod.Options): Builder = js.native
  /**
     * Sets the logging preferences for the created session. Preferences may be
     * changed by repeated calls, or by calling {@link #withCapabilities}.
     * @param {!(logging.Preferences|Object.<string, string>)} prefs The
     *     desired logging preferences.
     * @return {!Builder} A self reference.
     */
  def setLoggingPrefs(prefs: js.Object): Builder = js.native
  /**
     * Sets the logging preferences for the created session. Preferences may be
     * changed by repeated calls, or by calling {@link #withCapabilities}.
     * @param {!(logging.Preferences|Object.<string, string>)} prefs The
     *     desired logging preferences.
     * @return {!Builder} A self reference.
     */
  def setLoggingPrefs(prefs: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Preferences): Builder = js.native
  /**
     * Sets Opera specific {@linkplain opera.Options options} for drivers created
     * by this builder. Any logging or proxy settings defined on the given options
     * will take precedence over those set through {@link #setLoggingPrefs} and
     * {@link #setProxy}, respectively.
     *
     * @param {!opera.Options} options The OperaDriver options to use.
     * @return {!Builder} A self reference.
     */
  def setOperaOptions(options: seleniumDashWebdriverLib.operaMod.Options): Builder = js.native
  /**
     * Sets the proxy configuration to use for WebDriver clients created by this
     * builder. Any calls to {@link #withCapabilities} after this function will
     * overwrite these settings.
     * @param {!capabilities.ProxyConfig} config The configuration to use.
     * @return {!Builder} A self reference.
     */
  def setProxy(config: ProxyConfig): Builder = js.native
  /**
     * Sets Safari specific {@linkplain safari.Options options} for drivers
     * created by this builder. Any logging settings defined on the given options
     * will take precedence over those set through {@link #setLoggingPrefs}.
     *
     * @param {!safari.Options} options The Safari options to use.
     * @return {!Builder} A self reference.
     */
  def setSafariOptions(options: seleniumDashWebdriverLib.safariMod.Options): Builder = js.native
  /**
     * Sets how elements should be scrolled into view for interaction.
     * @param {number} behavior The desired scroll behavior: either 0 to align with
     *     the top of the viewport or 1 to align with the bottom.
     * @return {!Builder} A self reference.
     */
  def setScrollBehavior(behavior: scala.Double): Builder = js.native
  /**
     * Sets the http agent to use for each request.
     * If this method is not called, the Builder will use http.globalAgent by default.
     *
     * @param {http.Agent} agent The agent to use for each request.
     * @return {!Builder} A self reference.
     */
  def usingHttpAgent(agent: js.Any): Builder = js.native
  /**
     * Sets the URL of a remote WebDriver server to use. Once a remote URL has been
     * specified, the builder direct all new clients to that server. If this method
     * is never called, the Builder will attempt to create all clients locally.
     *
     * <p>As an alternative to this method, you may also set the
     * {@code SELENIUM_REMOTE_URL} environment variable.
     *
     * @param {string} url The URL of a remote server to use.
     * @return {!Builder} A self reference.
     */
  def usingServer(url: java.lang.String): Builder = js.native
  /**
     * Sets the URL of the proxy to use for the WebDriver's HTTP connections.
     * If this method is never called, the Builder will create a connection
     * without a proxy.
     *
     * @param {string} proxy The URL of a proxy to use.
     * @return {!Builder} A self reference.
     */
  def usingWebDriverProxy(proxy: java.lang.String): Builder = js.native
  /**
     * Sets the desired capabilities when requesting a new session. This will
     * overwrite any previously set capabilities.
     * @param {!(Object|Capabilities)} capabilities The desired
     *     capabilities for a new session.
     * @return {!Builder} A self reference.
     */
  def withCapabilities(capabilities: js.Object): Builder = js.native
  /**
     * Sets the desired capabilities when requesting a new session. This will
     * overwrite any previously set capabilities.
     * @param {!(Object|Capabilities)} capabilities The desired
     *     capabilities for a new session.
     * @return {!Builder} A self reference.
     */
  def withCapabilities(capabilities: Capabilities): Builder = js.native
}

