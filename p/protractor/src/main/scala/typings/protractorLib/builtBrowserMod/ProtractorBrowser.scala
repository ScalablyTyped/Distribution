package typings
package protractorLib.builtBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/browser", "ProtractorBrowser")
@js.native
class ProtractorBrowser protected ()
  extends AbstractExtendedWebDriver
     with /* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: java.lang.String) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String]) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: java.lang.String, opt_untrackOutstandingTimeouts: scala.Boolean) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String], opt_untrackOutstandingTimeouts: scala.Boolean) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: java.lang.String, opt_untrackOutstandingTimeouts: scala.Boolean, opt_blockingProxyUrl: java.lang.String) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String], opt_untrackOutstandingTimeouts: scala.Boolean, opt_blockingProxyUrl: java.lang.String) = this()
  /**
       * @type {ExpectedConditions}
       */
  var ExpectedConditions: protractorLib.builtExpectedConditionsMod.ProtractorExpectedConditions = js.native
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
       * A helper that manages debugging tests.
       */
  var debugHelper: protractorLib.builtDebuggerMod.DebugHelper = js.native
  /**
       * If specified, start a debugger server at specified port instead of repl
       * when running element explorer.
       * @public {number}
       */
  var debuggerServerPort: scala.Double = js.native
  /**
       * The wrapped webdriver instance. Use this to interact with pages that do
       * not contain Angular (such as a log-in screen).
       *
       * @type {webdriver_extensions.ExtendedWebDriver}
       */
  var driver: webdriverDashJsDashExtenderLib.webdriverDashJsDashExtenderMod.ExtendedWebDriver = js.native
  /**
       * Helper function for finding elements.
       *
       * @type {function(webdriver.Locator): ElementFinder}
       */
  @JSName("element")
  var element_Original: ElementHelper = js.native
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
       * This property is deprecated - please use waitForAngularEnabled instead.
       *
       * @deprecated
       * @type {boolean}
       */
  var ignoreSynchronization: scala.Boolean = js.native
  var internalIgnoreSynchronization: js.Any = js.native
  var internalRootEl: js.Any = js.native
  /**
       * Information about mock modules that will be installed during every
       * get().
       *
       * @type {Array<{name: string, script: function|string, args:
       * Array.<string>}>}
       */
  var `mockModules_`: js.Array[protractorLib.Anon_Script] = js.native
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
  var `plugins_`: protractorLib.builtPluginsMod.Plugins = js.native
  /**
       * Resolved when the browser is ready for use.  Resolves to the browser, so
       * you can do:
       *
       *   forkedBrowser = await browser.forkNewDriverInstance().ready;
       *
       * Set by the runner.
       *
       * @type {webdriver.promise.Promise.<ProtractorBrowser>}
       */
  var ready: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[ProtractorBrowser] = js.native
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
  var `trackOutstandingTimeouts_`: scala.Boolean = js.native
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
       * Add the base mock modules used for all Protractor tests.
       *
       * @private
       */
  /* private */ def `addBaseMockModules_`(): js.Any = js.native
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
  def addMockModule(name: java.lang.String, script: js.Function, moduleArgs: js.Any*): scala.Unit = js.native
  /**
       * Set the css selector for an element on which to find Angular. This is usually
       * 'body' but if your ng-app is on a subsection of the page it may be
       * a subelement.
       *
       * The change will be made within WebDriver's control flow, so that commands after
       * this method is called use the new app root. Pass nothing to get a promise that
       * resolves to the value of the selector.
       *
       * @param {string|webdriver.promise.Promise<string>} value The new selector.
       * @returns A promise that resolves with the value of the selector.
       */
  def angularAppRoot(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String] = js.native
  /**
       * Set the css selector for an element on which to find Angular. This is usually
       * 'body' but if your ng-app is on a subsection of the page it may be
       * a subelement.
       *
       * The change will be made within WebDriver's control flow, so that commands after
       * this method is called use the new app root. Pass nothing to get a promise that
       * resolves to the value of the selector.
       *
       * @param {string|webdriver.promise.Promise<string>} value The new selector.
       * @returns A promise that resolves with the value of the selector.
       */
  def angularAppRoot(value: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String] = js.native
  /**
       * Set the css selector for an element on which to find Angular. This is usually
       * 'body' but if your ng-app is on a subsection of the page it may be
       * a subelement.
       *
       * The change will be made within WebDriver's control flow, so that commands after
       * this method is called use the new app root. Pass nothing to get a promise that
       * resolves to the value of the selector.
       *
       * @param {string|webdriver.promise.Promise<string>} value The new selector.
       * @returns A promise that resolves with the value of the selector.
       */
  def angularAppRoot(value: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String]): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String] = js.native
  /**
       * Clear the list of registered mock modules.
       */
  def clearMockModules(): scala.Unit = js.native
  /**
       * Determine if the control flow is enabled.
       *
       * @returns true if the control flow is enabled, false otherwise.
       */
  def controlFlowIsEnabled(): js.Any = js.native
  /**
       * Adds a task to the control flow to pause the test and inject helper
       * functions
       * into the browser, so that debugging may be done in the browser console.
       *
       * This should be used under node in debug mode, i.e. with
       * protractor debug <configuration.js>
       *
       * @example
       * While in the debugger, commands can be scheduled through webdriver by
       * entering the repl:
       *   debug> repl
       *   > element(by.input('user')).sendKeys('Laura');
       *   > browser.debugger();
       *   Press Ctrl + c to leave debug repl
       *   debug> c
       *
       * This will run the sendKeys command as the next task, then re-enter the
       * debugger.
       */
  def debugger(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
       * Helper function for finding elements.
       *
       * @type {function(webdriver.Locator): ElementFinder}
       */
  def element(locator: protractorLib.builtLocatorsMod.Locator): protractorLib.builtElementMod.ElementFinder = js.native
  /**
       * See browser.explore().
       */
  def enterRepl(): scala.Unit = js.native
  /**
       * See browser.explore().
       */
  def enterRepl(opt_debugPort: scala.Double): scala.Unit = js.native
  /**
       * The same as {@code webdriver.WebDriver.prototype.executeAsyncScript},
       * but with a customized description for debugging.
       *
       * @private
       * @param {!(string|Function)} script The script to execute.
       * @param {string} description A description for debugging purposes.
       * @param {...*} var_args The arguments to pass to the script.
       * @returns {!webdriver.promise.Promise.<T>} A promise that will resolve to
       * the
       *    scripts return value.
       * @template T
       */
  /* private */ def `executeAsyncScript_`(
    script: js.Any,
    description: js.Any,
    /* import warning: Dropping repeated marker of param TsIdentSimple(scriptArgs) because its type None is not an array type */scriptArgs: js.Any
  ): js.Any = js.native
  /**
       * The same as {@code webdriver.WebDriver.prototype.executeScript},
       * but with a customized description for debugging.
       *
       * @private
       * @param {!(string|Function)} script The script to execute.
       * @param {string} description A description of the command for debugging.
       * @param {...*} var_args The arguments to pass to the script.
       * @returns {!webdriver.promise.Promise.<T>} A promise that will resolve to
       * the scripts return value.
       * @template T
       */
  def executeScriptWithDescription(script: java.lang.String, description: java.lang.String, scriptArgs: js.Any*): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
       * The same as {@code webdriver.WebDriver.prototype.executeScript},
       * but with a customized description for debugging.
       *
       * @private
       * @param {!(string|Function)} script The script to execute.
       * @param {string} description A description of the command for debugging.
       * @param {...*} var_args The arguments to pass to the script.
       * @returns {!webdriver.promise.Promise.<T>} A promise that will resolve to
       * the scripts return value.
       * @template T
       */
  def executeScriptWithDescription(script: js.Function, description: java.lang.String, scriptArgs: js.Any*): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
       * Beta (unstable) explore function for entering the repl loop from
       * any point in the control flow. Use browser.explore() in your test.
       * Does not require changes to the command line (no need to add 'debug').
       * Note, if you are wrapping your own instance of Protractor, you must
       * expose globals 'browser' and 'protractor' for pause to work.
       *
       * @example
       * element(by.id('foo')).click();
       * browser.explore();
       * // Execution will stop before the next click action.
       * element(by.id('bar')).click();
       *
       * @param {number=} opt_debugPort Optional port to use for the debugging
       * process
       */
  def explore(): scala.Unit = js.native
  /**
       * Beta (unstable) explore function for entering the repl loop from
       * any point in the control flow. Use browser.explore() in your test.
       * Does not require changes to the command line (no need to add 'debug').
       * Note, if you are wrapping your own instance of Protractor, you must
       * expose globals 'browser' and 'protractor' for pause to work.
       *
       * @example
       * element(by.id('foo')).click();
       * browser.explore();
       * // Execution will stop before the next click action.
       * element(by.id('bar')).click();
       *
       * @param {number=} opt_debugPort Optional port to use for the debugging
       * process
       */
  def explore(opt_debugPort: scala.Double): scala.Unit = js.native
  /**
       * Fork another instance of browser for use in interactive tests.
       *
       * @example
       * // Running with control flow enabled
       * var fork = browser.forkNewDriverInstance();
       * fork.get('page1'); // 'page1' gotten by forked browser
       *
       * // Running with control flow disabled
       * var forked = await browser.forkNewDriverInstance().ready;
       * await forked.get('page1'); // 'page1' gotten by forked browser
       *
       * @param {boolean=} useSameUrl Whether to navigate to current url on creation
       * @param {boolean=} copyMockModules Whether to apply same mock modules on creation
       * @param {boolean=} copyConfigUpdates Whether to copy over changes to `baseUrl` and similar
       *   properties initialized to values in the the config.  Defaults to `true`
       *
       * @returns {ProtractorBrowser} A browser instance.
       */
  def forkNewDriverInstance(): ProtractorBrowser = js.native
  /**
       * Fork another instance of browser for use in interactive tests.
       *
       * @example
       * // Running with control flow enabled
       * var fork = browser.forkNewDriverInstance();
       * fork.get('page1'); // 'page1' gotten by forked browser
       *
       * // Running with control flow disabled
       * var forked = await browser.forkNewDriverInstance().ready;
       * await forked.get('page1'); // 'page1' gotten by forked browser
       *
       * @param {boolean=} useSameUrl Whether to navigate to current url on creation
       * @param {boolean=} copyMockModules Whether to apply same mock modules on creation
       * @param {boolean=} copyConfigUpdates Whether to copy over changes to `baseUrl` and similar
       *   properties initialized to values in the the config.  Defaults to `true`
       *
       * @returns {ProtractorBrowser} A browser instance.
       */
  def forkNewDriverInstance(useSameUrl: scala.Boolean): ProtractorBrowser = js.native
  /**
       * Fork another instance of browser for use in interactive tests.
       *
       * @example
       * // Running with control flow enabled
       * var fork = browser.forkNewDriverInstance();
       * fork.get('page1'); // 'page1' gotten by forked browser
       *
       * // Running with control flow disabled
       * var forked = await browser.forkNewDriverInstance().ready;
       * await forked.get('page1'); // 'page1' gotten by forked browser
       *
       * @param {boolean=} useSameUrl Whether to navigate to current url on creation
       * @param {boolean=} copyMockModules Whether to apply same mock modules on creation
       * @param {boolean=} copyConfigUpdates Whether to copy over changes to `baseUrl` and similar
       *   properties initialized to values in the the config.  Defaults to `true`
       *
       * @returns {ProtractorBrowser} A browser instance.
       */
  def forkNewDriverInstance(useSameUrl: scala.Boolean, copyMockModules: scala.Boolean): ProtractorBrowser = js.native
  /**
       * Fork another instance of browser for use in interactive tests.
       *
       * @example
       * // Running with control flow enabled
       * var fork = browser.forkNewDriverInstance();
       * fork.get('page1'); // 'page1' gotten by forked browser
       *
       * // Running with control flow disabled
       * var forked = await browser.forkNewDriverInstance().ready;
       * await forked.get('page1'); // 'page1' gotten by forked browser
       *
       * @param {boolean=} useSameUrl Whether to navigate to current url on creation
       * @param {boolean=} copyMockModules Whether to apply same mock modules on creation
       * @param {boolean=} copyConfigUpdates Whether to copy over changes to `baseUrl` and similar
       *   properties initialized to values in the the config.  Defaults to `true`
       *
       * @returns {ProtractorBrowser} A browser instance.
       */
  def forkNewDriverInstance(useSameUrl: scala.Boolean, copyMockModules: scala.Boolean, copyConfigUpdates: scala.Boolean): ProtractorBrowser = js.native
  /**
       * @see webdriver.WebDriver.get
       *
       * Navigate to the given destination and loads mock modules before
       * Angular. Assumes that the page being loaded uses Angular.
       * If you need to access a page which does not have Angular on load, use
       * the wrapped webdriver directly.
       *
       * @example
       * browser.get('https://angularjs.org/');
       * expect(browser.getCurrentUrl()).toBe('https://angularjs.org/');
       *
       * @param {string} destination Destination URL.
       * @param {number=} opt_timeout Number of milliseconds to wait for Angular to
       *     start.
       */
  def get(destination: java.lang.String, timeout: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
       * Deprecated, use `browser.getCurrentUrl()` instead.
       *
       * Despite its name, this function will generally return `$location.url()`, though in some
       * cases it will return `$location.absUrl()` instead.  This function is only here for legacy
       * users, and will probably be removed in Protractor 6.0.
       *
       * @deprecated Please use `browser.getCurrentUrl()`
       * @example
       * browser.get('http://angular.github.io/protractor/#/api');
       * expect(browser.getLocationAbsUrl())
       *     .toBe('http://angular.github.io/protractor/#/api');
       * @returns {webdriver.promise.Promise<string>} The current absolute url from
       * AngularJS.
       */
  def getLocationAbsUrl(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
       * Get the processed configuration object that is currently being run. This
       * will contain the specs and capabilities properties of the current runner
       * instance.
       *
       * Set by the runner.
       *
       * @returns {webdriver.promise.Promise} A promise which resolves to the
       * capabilities object.
       */
  def getProcessedConfig(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
       * Get a list of the current mock modules.
       *
       * @returns {Array.<!string|Function>} The list of mock modules.
       */
  def getRegisteredMockModules(): js.Array[java.lang.String | js.Function] = js.native
  /**
       * Tests if an element is present on the page.
       * @see webdriver.WebDriver.isElementPresent
       * @returns {!webdriver.promise.Promise} A promise that will resolve to whether
       *     the element is present on the page.
       */
  def isElementPresent(locatorOrElement: protractorLib.builtElementMod.ElementFinder): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
       * Tests if an element is present on the page.
       * @see webdriver.WebDriver.isElementPresent
       * @returns {!webdriver.promise.Promise} A promise that will resolve to whether
       *     the element is present on the page.
       */
  def isElementPresent(locatorOrElement: protractorLib.builtLocatorsMod.Locator): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
       * Tests if an element is present on the page.
       * @see webdriver.WebDriver.isElementPresent
       * @returns {!webdriver.promise.Promise} A promise that will resolve to whether
       *     the element is present on the page.
       */
  def isElementPresent(locatorOrElement: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
       * Beta (unstable) pause function for debugging webdriver tests. Use
       * browser.pause() in your test to enter the protractor debugger from that
       * point in the control flow.
       * Does not require changes to the command line (no need to add 'debug').
       * Note, if you are wrapping your own instance of Protractor, you must
       * expose globals 'browser' and 'protractor' for pause to work.
       *
       * @example
       * element(by.id('foo')).click();
       * browser.pause();
       * // Execution will stop before the next click action.
       * element(by.id('bar')).click();
       *
       * @param {number=} opt_debugPort Optional port to use for the debugging
       * process
       */
  def pause(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
       * Beta (unstable) pause function for debugging webdriver tests. Use
       * browser.pause() in your test to enter the protractor debugger from that
       * point in the control flow.
       * Does not require changes to the command line (no need to add 'debug').
       * Note, if you are wrapping your own instance of Protractor, you must
       * expose globals 'browser' and 'protractor' for pause to work.
       *
       * @example
       * element(by.id('foo')).click();
       * browser.pause();
       * // Execution will stop before the next click action.
       * element(by.id('bar')).click();
       *
       * @param {number=} opt_debugPort Optional port to use for the debugging
       * process
       */
  def pause(opt_debugPort: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
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
  def refresh(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
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
  def refresh(opt_timeout: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
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
       * This function behaves slightly differently depending on if the webdriver control flow is
       * enabled.  If the control flow is enabled, the global `browser` object is synchronously
       * replaced. If the control flow is disabled, the global `browser` is replaced asynchronously
       * after the old driver quits.
       *
       * Set by the runner.
       *
       * @example
       * // Running against global browser, with control flow enabled
       * browser.get('page1');
       * browser.restart();
       * browser.get('page2'); // 'page2' gotten by restarted browser
       *
       * // Running against global browser, with control flow disabled
       * await browser.get('page1');
       * await browser.restart();
       * await browser.get('page2'); // 'page2' gotten by restarted browser
       *
       * // Running against forked browsers, with the control flow enabled
       * // In this case, you may prefer `restartSync` (documented below)
       * var forked = browser.forkNewDriverInstance();
       * fork.get('page1');
       * fork.restart().then(function(fork) {
       *   fork.get('page2'); // 'page2' gotten by restarted fork
       * });
       *
       * // Running against forked browsers, with the control flow disabled
       * var forked = await browser.forkNewDriverInstance().ready;
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
       * @returns {webdriver.promise.Promise<ProtractorBrowser>} A promise resolving to the restarted
       *   browser
       */
  def restart(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[ProtractorBrowser] = js.native
  /**
       * Like `restart`, but instead of returning a promise resolving to the new browser instance,
       * returns the new browser instance directly.  Can only be used when the control flow is enabled.
       *
       * @example
       * // Running against global browser
       * browser.get('page1');
       * browser.restartSync();
       * browser.get('page2'); // 'page2' gotten by restarted browser
       *
       * // Running against forked browsers
       * var forked = browser.forkNewDriverInstance();
       * fork.get('page1');
       * fork = fork.restartSync();
       * fork.get('page2'); // 'page2' gotten by restarted fork
       *
       * @throws {TypeError} Will throw an error if the control flow is not enabled
       * @returns {ProtractorBrowser} The restarted browser
       */
  def restartSync(): ProtractorBrowser = js.native
  /**
       * Browse to another page using in-page navigation.
       *
       * @example
       * browser.get('http://angular.github.io/protractor/#/tutorial');
       * browser.setLocation('api');
       * expect(browser.getCurrentUrl())
       *     .toBe('http://angular.github.io/protractor/#/api');
       *
       * @param {string} url In page URL using the same syntax as $location.url()
       * @returns {!webdriver.promise.Promise} A promise that will resolve once
       *    page has been changed.
       */
  def setLocation(url: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
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
       * @returns {!webdriver.promise.Promise} A promise that will resolve to the
       *    scripts return value.
       */
  def waitForAngular(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
       * Instruct webdriver to wait until Angular has finished rendering and has
       * no outstanding $http or $timeout calls before continuing.
       * Note that Protractor automatically applies this command before every
       * WebDriver action.
       *
       * @param {string=} opt_description An optional description to be added
       *     to webdriver logs.
       * @returns {!webdriver.promise.Promise} A promise that will resolve to the
       *    scripts return value.
       */
  def waitForAngular(opt_description: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
       * If set to false, Protractor will not wait for Angular $http and $timeout
       * tasks to complete before interacting with the browser. This can cause
       * flaky tests, but should be used if, for instance, your app continuously
       * polls an API with $timeout.
       *
       * Call waitForAngularEnabled() without passing a value to read the current
       * state without changing it.
       */
  def waitForAngularEnabled(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Boolean] = js.native
  /**
       * If set to false, Protractor will not wait for Angular $http and $timeout
       * tasks to complete before interacting with the browser. This can cause
       * flaky tests, but should be used if, for instance, your app continuously
       * polls an API with $timeout.
       *
       * Call waitForAngularEnabled() without passing a value to read the current
       * state without changing it.
       */
  def waitForAngularEnabled(enabled: scala.Boolean): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Boolean] = js.native
  /**
       * If set to false, Protractor will not wait for Angular $http and $timeout
       * tasks to complete before interacting with the browser. This can cause
       * flaky tests, but should be used if, for instance, your app continuously
       * polls an API with $timeout.
       *
       * Call waitForAngularEnabled() without passing a value to read the current
       * state without changing it.
       */
  def waitForAngularEnabled(enabled: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Boolean]): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Boolean] = js.native
}

@JSImport("protractor/built/browser", "ProtractorBrowser")
@js.native
object ProtractorBrowser extends js.Object {
  /**
       * @type {ProtractorBy}
       */
  var By: protractorLib.builtLocatorsMod.ProtractorBy = js.native
}

