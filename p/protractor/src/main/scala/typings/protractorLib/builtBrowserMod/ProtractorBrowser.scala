package typings
package protractorLib.builtBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/browser", "ProtractorBrowser")
@js.native
class ProtractorBrowser protected ()
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: java.lang.String) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: js.Promise[java.lang.String]) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: java.lang.String, opt_untrackOutstandingTimeouts: scala.Boolean) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: js.Promise[java.lang.String], opt_untrackOutstandingTimeouts: scala.Boolean) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: java.lang.String, opt_untrackOutstandingTimeouts: scala.Boolean, opt_blockingProxyUrl: java.lang.String) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: js.Promise[java.lang.String], opt_untrackOutstandingTimeouts: scala.Boolean, opt_blockingProxyUrl: java.lang.String) = this()
  /**
    * @type {ExpectedConditions}
    */
  var ExpectedConditions: protractorLib.builtExpectedConditionsMod.ProtractorExpectedConditions = js.native
  /**
    * Add the base mock modules used for all Protractor tests.
    *
    * @private
    */
  var addBaseMockModules_ : js.Any = js.native
  var allScriptsTimeout: scala.Double = js.native
  /**
    * All get methods will be resolved against this base URL. Relative URLs are =
    * resolved the way anchor tags resolve.
    *
    * @type {string}
    */
  var baseUrl: java.lang.String = js.native
  /**
    * The client used to control the BlockingProxy. If unset, BlockingProxy is
    * not being used and Protractor will handle client-side synchronization.
    */
  var bpClient: blockingDashProxyLib.blockingDashProxyMod.BPClient = js.native
  /**
    * If specified, start a debugger server at specified port instead of repl
    * when running element explorer.
    * @public {number}
    */
  var debuggerServerPort: scala.Double = js.native
  /**
    * The browser's WebDriver instance
    *
    * @type {webdriver.WebDriver}
    */
  var driver: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver = js.native
  /**
    * Helper function for finding elements.
    *
    * @type {function(webdriver.Locator): ElementFinder}
    */
  @JSName("element")
  var element_Original: ElementHelper = js.native
  /**
    * The same as {@code webdriver.WebDriver.prototype.executeAsyncScript},
    * but with a customized description for debugging.
    *
    * @private
    * @param {!(string|Function)} script The script to execute.
    * @param {string} description A description for debugging purposes.
    * @param {...*} var_args The arguments to pass to the script.
    * @returns {!Promise<T>} A promise that will resolve to
    * the
    *    scripts return value.
    * @template T
    */
  var executeAsyncScript_ : js.Any = js.native
  /**
    * Timeout in milliseconds to wait for pages to load when calling `get`.
    *
    * @type {number}
    */
  var getPageTimeout: scala.Double = js.native
  /**
    * If true, Protractor will not attempt to synchronize with the page before
    * performing actions. This can be harmful because Protractor will not wait
    * until $timeouts and $http calls have been processed, which can cause
    * tests to become flaky. This should be used only when necessary, such as
    * when a page continuously polls an API using $timeout.
    *
    * Initialized to `false` by the runner.
    *
    * ignoreSynchornization is deprecated.
    *
    * Please use waitForAngularEnabled instead.
    *
    * @deprecated
    * @type {boolean}
    */
  var internalIgnoreSynchronization: js.Any = js.native
  var internalRootEl: js.Any = js.native
  /**
    * Information about mock modules that will be installed during every
    * get().
    *
    * @type {Array<{name: string, script: function|string, args: Array.<string>}>}
    */
  var mockModules_ : js.Array[protractorLib.Anon_Args] = js.native
  /**
    * If true, Protractor will interpret any angular apps it comes across as
    * hybrid angular1/angular2 apps.
    *
    * @type {boolean}
    */
  var ng12Hybrid: scala.Boolean = js.native
  /**
    * An object that holds custom test parameters.
    *
    * @type {Object}
    */
  var params: js.Any = js.native
  var plugins_ : protractorLib.builtPluginsMod.Plugins = js.native
  /**
    * Resolved when the browser is ready for use.  Resolves to the browser, so
    * you can do:
    *
    *   forkedBrowser = await browser.forkNewDriverInstance();
    *
    * Set by the runner.
    *
    * @type {Promise<ProtractorBrowser>}
    */
  var ready: js.Promise[ProtractorBrowser] = js.native
  /**
    * The reset URL to use between page loads.
    *
    * @type {string}
    */
  var resetUrl: java.lang.String = js.native
  /**
    * The css selector for an element on which to find Angular. This is usually
    * 'body' but if your ng-app is on a subsection of the page it may be
    * a subelement.
    *
    * This property is deprecated - please use angularAppRoot() instead.
    *
    * @deprecated
    * @type {string}
    */
  var rootEl: java.lang.String = js.native
  /**
    * If true, Protractor will track outstanding $timeouts and report them in the
    * error message if Protractor fails to synchronize with Angular in time.
    * @private {boolean}
    */
  var trackOutstandingTimeouts_ : scala.Boolean = js.native
  /**
    * Shorthand function for finding elements by css.
    *
    * @type {function(string): ElementFinder}
    */
  @JSName("$")
  def $(query: java.lang.String): protractorLib.builtElementMod.ElementFinder = js.native
  /**
    * Shorthand function for finding arrays of elements by css.
    *
    * @type {function(string): ElementArrayFinder}
    */
  @JSName("$$")
  def $$(query: java.lang.String): protractorLib.builtElementMod.ElementArrayFinder = js.native
  /**
    * Add a module to load before Angular whenever Protractor.get is called.
    * Modules will be registered after existing modules already on the page,
    * so any module registered here will override preexisting modules with the
    * same name.
    *
    * @example
    * browser.addMockModule('modName', function() {
    *   angular.module('modName', []).value('foo', 'bar');
    * });
    *
    * @param {!string} name The name of the module to load or override.
    * @param {!string|Function} script The JavaScript to load the module.
    *     Note that this will be executed in the browser context, so it cannot
    *     access variables from outside its scope.
    * @param {...*} varArgs Any additional arguments will be provided to
    *     the script and may be referenced using the `arguments` object.
    */
  def addMockModule(name: java.lang.String, script: java.lang.String, moduleArgs: js.Any*): scala.Unit = js.native
  def addMockModule(name: java.lang.String, script: js.Function, moduleArgs: js.Any*): scala.Unit = js.native
  /**
    * Set the css selector for an element on which to find Angular. This is usually
    * 'body' but if your ng-app is on a subsection of the page it may be
    * a subelement.
    *
    * @param {string|Promise<string>} valuePromise The new selector.
    * @returns A promise that resolves with the value of the selector.
    */
  def angularAppRoot(): js.Promise[java.lang.String] = js.native
  def angularAppRoot(valuePromise: java.lang.String): js.Promise[java.lang.String] = js.native
  def angularAppRoot(valuePromise: js.Promise[java.lang.String]): js.Promise[java.lang.String] = js.native
  /**
    * Clear the list of registered mock modules.
    */
  def clearMockModules(): scala.Unit = js.native
  /**
    * Helper function for finding elements.
    *
    * @type {function(webdriver.Locator): ElementFinder}
    */
  def element(locator: protractorLib.builtLocatorsMod.Locator): protractorLib.builtElementMod.ElementFinder = js.native
  /**
    * The same as {@code webdriver.WebDriver.prototype.executeScript},
    * but with a customized description for debugging.
    *
    * @private
    * @param {!(string|Function)} script The script to execute.
    * @param {string} description A description of the command for debugging.
    * @param {...*} var_args The arguments to pass to the script.
    * @returns {!Promise<T>} A promise that will resolve to
    * the scripts return value.
    * @template T
    */
  def executeScriptWithDescription(script: java.lang.String, description: java.lang.String, scriptArgs: js.Any*): js.Promise[_] = js.native
  def executeScriptWithDescription(script: js.Function, description: java.lang.String, scriptArgs: js.Any*): js.Promise[_] = js.native
  /**
    * Waits for Angular to finish renderActionSequenceing before searching for elements.
    * @see webdriver.WebDriver.findElement
    * @returns {!webdriver.WebElementPromise} A promise that will be resolved to
    *      the located {@link webdriver.WebElement}.
    */
  def findElement(locator: protractorLib.builtLocatorsMod.Locator): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementPromise = js.native
  /**
    * Waits for Angular to finish rendering before searching for elements.
    * @see webdriver.WebDriver.findElements
    * @returns {!Promise} A promise that will be resolved to an
    *     array of the located {@link webdriver.WebElement}s.
    */
  def findElements(locator: protractorLib.builtLocatorsMod.Locator): js.Promise[js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement]] = js.native
  /**
    * Fork another instance of browser for use in interactive tests.
    *
    * @example
    * var forked = await browser.forkNewDriverInstance();
    * await forked.get('page1'); // 'page1' gotten by forked browser
    *
    * @param {boolean=} useSameUrl Whether to navigate to current url on creation
    * @param {boolean=} copyMockModules Whether to apply same mock modules on creation
    * @param {boolean=} copyConfigUpdates Whether to copy over changes to `baseUrl` and similar
    *   properties initialized to values in the the config.  Defaults to `true`
    *
    * @returns {ProtractorBrowser} A browser instance.
    */
  def forkNewDriverInstance(): js.Promise[ProtractorBrowser] = js.native
  def forkNewDriverInstance(useSameUrl: scala.Boolean): js.Promise[ProtractorBrowser] = js.native
  def forkNewDriverInstance(useSameUrl: scala.Boolean, copyMockModules: scala.Boolean): js.Promise[ProtractorBrowser] = js.native
  def forkNewDriverInstance(useSameUrl: scala.Boolean, copyMockModules: scala.Boolean, copyConfigUpdates: scala.Boolean): js.Promise[ProtractorBrowser] = js.native
  /**
    * @see webdriver.WebDriver.get
    *
    * Navigate to the given destination and loads mock modules before
    * Angular. Assumes that the page being loaded uses Angular.
    * If you need to access a page which does not have Angular on load, use
    * the wrapped webdriver directly.
    *
    * @example
    * await browser.get('https://angularjs.org/');
    * expect(await browser.getCurrentUrl()).toBe('https://angularjs.org/');
    *
    * @param {string} destination Destination URL.
    * @param {number=} opt_timeout Number of milliseconds to wait for Angular to
    *     start.
    */
  def get(destination: java.lang.String): js.Promise[scala.Unit] = js.native
  def get(destination: java.lang.String, timeout: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Deprecated, use `browser.getCurrentUrl()` instead.
    *
    * Despite its name, this function will generally return `$location.url()`, though in some
    * cases it will return `$location.absUrl()` instead.  This function is only here for legacy
    * users, and will probably be removed in Protractor 6.0.
    *
    * @deprecated Please use `browser.getCurrentUrl()`
    * @example
    * await browser.get('http://angular.github.io/protractor/#/api');
    * expect(await browser.getLocationAbsUrl())
    *     .toBe('http://angular.github.io/protractor/#/api');
    * @returns {Promise<string>} The current absolute url from
    * AngularJS.
    */
  def getLocationAbsUrl(): js.Promise[_] = js.native
  /**
    * Get the processed configuration object that is currently being run. This
    * will contain the specs and capabilities properties of the current runner
    * instance.
    *
    * Set by the runner.
    *
    * @returns {Promise} A promise which resolves to the
    * capabilities object.
    */
  def getProcessedConfig(): js.Promise[_] = js.native
  /**
    * Get a list of the current mock modules.
    *
    * @returns {Array.<!string|Function>} The list of mock modules.
    */
  def getRegisteredMockModules(): js.Array[java.lang.String | js.Function] = js.native
  def isElementPresent(locatorOrElement: protractorLib.builtElementMod.ElementFinder): js.Promise[_] = js.native
  /**
    * Tests if an element is present on the page.
    * @see webdriver.WebDriver.isElementPresent
    * @returns {!Promise} A promise that will resolve to whether
    *     the element is present on the page.
    */
  def isElementPresent(locatorOrElement: protractorLib.builtLocatorsMod.Locator): js.Promise[_] = js.native
  def isElementPresent(locatorOrElement: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): js.Promise[_] = js.native
  /**
    * Mixin navigation methods back into the navigation object so that
    * they are invoked as before, i.e. driver.navigate().refresh()
    */
  def navigate(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Navigation = js.native
  /**
    * @see webdriver.WebDriver.refresh
    *
    * Makes a full reload of the current page and loads mock modules before
    * Angular. Assumes that the page being loaded uses Angular.
    * If you need to access a page which does not have Angular on load, use
    * the wrapped webdriver directly.
    *
    * @param {number=} opt_timeout Number of milliseconds to wait for Angular to start.
    */
  def refresh(): js.Promise[scala.Unit] = js.native
  def refresh(opt_timeout: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Remove a registered mock module.
    *
    * @example
    * browser.removeMockModule('modName');
    *
    * @param {!string} name The name of the module to remove.
    */
  def removeMockModule(name: java.lang.String): scala.Unit = js.native
  /**
    * Restart the browser.  This is done by closing this browser instance and creating a new one.
    * A promise resolving to the new instance is returned, and if this function was called on the
    * global `browser` instance then Protractor will automatically overwrite the global `browser`
    * variable.
    *
    * When restarting a forked browser, it is the caller's job to overwrite references to the old
    * instance.
    *
    * Set by the runner.
    *
    * @example
    * // Running against global browser
    * await browser.get('page1');
    * await browser.restart();
    * await browser.get('page2'); // 'page2' gotten by restarted browser
    *
    * // Running against forked browsers
    * var forked = await browser.forkNewDriverInstance();
    * await fork.get('page1');
    * fork = await fork.restart();
    * await fork.get('page2'); // 'page2' gotten by restarted fork
    *
    * // Unexpected behavior can occur if you save references to the global `browser`
    * var savedBrowser = browser;
    * browser.get('foo').then(function() {
    *   console.log(browser === savedBrowser); // false
    * });
    * browser.restart();
    *
    * @returns {Promise<ProtractorBrowser>} A promise resolving to the restarted
    *   browser
    */
  def restart(): js.Promise[ProtractorBrowser] = js.native
  /**
    * Browse to another page using in-page navigation.
    *
    * @example
    * await browser.get('http://angular.github.io/protractor/#/tutorial');
    * await browser.setLocation('api');
    * expect(await browser.getCurrentUrl())
    *     .toBe('http://angular.g../../ithub.io/protractor/#/api');
    *
    * @param {string} url In page URL using the same syntax as $location.url()
    * @returns {!Promise} A promise that will resolve once
    *    page has been changed.
    */
  def setLocation(url: java.lang.String): js.Promise[_] = js.native
  /**
    * Instead of using a single root element, search through all angular apps
    * available on the page when finding elements or waiting for stability.
    * Only compatible with Angular2.
    */
  def useAllAngular2AppRoots(): scala.Unit = js.native
  /**
    * Instruct webdriver to wait until Angular has finished rendering and has
    * no outstanding $http or $timeout calls before continuing.
    * Note that Protractor automatically applies this command before every
    * WebDriver action.
    *
    * @param {string=} opt_description An optional description to be added
    *     to webdriver logs.
    * @returns {!Promise} A promise that will resolve to the
    *    scripts return value.
    */
  def waitForAngular(): js.Promise[_] = js.native
  def waitForAngular(opt_description: java.lang.String): js.Promise[_] = js.native
  /**
    * If set to false, Protractor will not wait for Angular $http and $timeout
    * tasks to complete before interacting with the browser. This can cause
    * flaky tests, but should be used if, for instance, your app continuously
    * polls an API with $timeout.
    *
    * Call waitForAngularEnabled() without passing a value to read the current
    * state without changing it.
    */
  def waitForAngularEnabled(): js.Promise[scala.Boolean] = js.native
  def waitForAngularEnabled(enabledPromise: js.Promise[scala.Boolean]): js.Promise[scala.Boolean] = js.native
  def waitForAngularEnabled(enabledPromise: scala.Boolean): js.Promise[scala.Boolean] = js.native
}

/* static members */
@JSImport("protractor/built/browser", "ProtractorBrowser")
@js.native
object ProtractorBrowser extends js.Object {
  /**
    * @type {ProtractorBy}
    */
  var By: protractorLib.builtLocatorsMod.ProtractorBy = js.native
}

