package typings.protractor

import typings.blockingProxy.mod.BPClient
import typings.protractor.anon.Args
import typings.protractor.elementMod.ElementArrayFinder
import typings.protractor.elementMod.ElementFinder
import typings.protractor.expectedConditionsMod.ProtractorExpectedConditions
import typings.protractor.locatorsMod.Locator
import typings.protractor.locatorsMod.ProtractorBy
import typings.protractor.pluginsMod.Plugins
import typings.seleniumWebdriver.mod.WebDriver
import typings.seleniumWebdriver.mod.WebElement
import typings.webdriverJsExtender.mod.ExtendedWebDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("protractor/built/browser", "AbstractExtendedWebDriver")
  @js.native
  class AbstractExtendedWebDriver ()
    extends AbstractWebDriver
       with ExtendedWebDriver
  
  @JSImport("protractor/built/browser", "AbstractWebDriver")
  @js.native
  class AbstractWebDriver () extends WebDriver
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @JSImport("protractor/built/browser", "ProtractorBrowser")
  @js.native
  class ProtractorBrowser protected () extends AbstractExtendedWebDriver {
    def this(webdriverInstance: WebDriver) = this()
    def this(webdriverInstance: WebDriver, opt_baseUrl: String) = this()
    def this(webdriverInstance: WebDriver, opt_baseUrl: String, opt_rootElement: String) = this()
    def this(webdriverInstance: WebDriver, opt_baseUrl: String, opt_rootElement: js.Promise[String]) = this()
    def this(webdriverInstance: WebDriver, opt_baseUrl: Unit, opt_rootElement: String) = this()
    def this(webdriverInstance: WebDriver, opt_baseUrl: Unit, opt_rootElement: js.Promise[String]) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: String,
      opt_rootElement: String,
      opt_untrackOutstandingTimeouts: Boolean
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: String,
      opt_rootElement: js.Promise[String],
      opt_untrackOutstandingTimeouts: Boolean
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: String,
      opt_rootElement: Unit,
      opt_untrackOutstandingTimeouts: Boolean
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: Unit,
      opt_rootElement: String,
      opt_untrackOutstandingTimeouts: Boolean
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: Unit,
      opt_rootElement: js.Promise[String],
      opt_untrackOutstandingTimeouts: Boolean
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: Unit,
      opt_rootElement: Unit,
      opt_untrackOutstandingTimeouts: Boolean
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: String,
      opt_rootElement: String,
      opt_untrackOutstandingTimeouts: Boolean,
      opt_blockingProxyUrl: String
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: String,
      opt_rootElement: String,
      opt_untrackOutstandingTimeouts: Unit,
      opt_blockingProxyUrl: String
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: String,
      opt_rootElement: js.Promise[String],
      opt_untrackOutstandingTimeouts: Boolean,
      opt_blockingProxyUrl: String
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: String,
      opt_rootElement: js.Promise[String],
      opt_untrackOutstandingTimeouts: Unit,
      opt_blockingProxyUrl: String
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: String,
      opt_rootElement: Unit,
      opt_untrackOutstandingTimeouts: Boolean,
      opt_blockingProxyUrl: String
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: String,
      opt_rootElement: Unit,
      opt_untrackOutstandingTimeouts: Unit,
      opt_blockingProxyUrl: String
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: Unit,
      opt_rootElement: String,
      opt_untrackOutstandingTimeouts: Boolean,
      opt_blockingProxyUrl: String
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: Unit,
      opt_rootElement: String,
      opt_untrackOutstandingTimeouts: Unit,
      opt_blockingProxyUrl: String
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: Unit,
      opt_rootElement: js.Promise[String],
      opt_untrackOutstandingTimeouts: Boolean,
      opt_blockingProxyUrl: String
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: Unit,
      opt_rootElement: js.Promise[String],
      opt_untrackOutstandingTimeouts: Unit,
      opt_blockingProxyUrl: String
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: Unit,
      opt_rootElement: Unit,
      opt_untrackOutstandingTimeouts: Boolean,
      opt_blockingProxyUrl: String
    ) = this()
    def this(
      webdriverInstance: WebDriver,
      opt_baseUrl: Unit,
      opt_rootElement: Unit,
      opt_untrackOutstandingTimeouts: Unit,
      opt_blockingProxyUrl: String
    ) = this()
    
    /**
      * Shorthand function for finding elements by css.
      *
      * @type {function(string): ElementFinder}
      */
    @JSName("$")
    def $(query: String): ElementFinder = js.native
    
    /**
      * Shorthand function for finding arrays of elements by css.
      *
      * @type {function(string): ElementArrayFinder}
      */
    @JSName("$$")
    def DollarDollar(query: String): ElementArrayFinder = js.native
    
    /**
      * @type {ExpectedConditions}
      */
    var ExpectedConditions: ProtractorExpectedConditions = js.native
    
    /**
      * Add the base mock modules used for all Protractor tests.
      *
      * @private
      */
    /* private */ def addBaseMockModules_(): js.Any = js.native
    
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
    def addMockModule(name: String, script: String, moduleArgs: js.Any*): Unit = js.native
    def addMockModule(name: String, script: js.Function, moduleArgs: js.Any*): Unit = js.native
    
    var allScriptsTimeout: Double = js.native
    
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
    def angularAppRoot(): js.Promise[String] = js.native
    def angularAppRoot(value: String): js.Promise[String] = js.native
    def angularAppRoot(value: js.Promise[String]): js.Promise[String] = js.native
    
    /**
      * All get methods will be resolved against this base URL. Relative URLs are =
      * resolved the way anchor tags resolve.
      *
      * @type {string}
      */
    var baseUrl: String = js.native
    
    /**
      * The client used to control the BlockingProxy. If unset, BlockingProxy is
      * not being used and Protractor will handle client-side synchronization.
      */
    var bpClient: BPClient = js.native
    
    /**
      * Clear the list of registered mock modules.
      */
    def clearMockModules(): Unit = js.native
    
    /**
      * Determine if the control flow is enabled.
      *
      * @returns true if the control flow is enabled, false otherwise.
      */
    def controlFlowIsEnabled(): js.Any = js.native
    
    /**
      * If specified, start a debugger server at specified port instead of repl
      * when running element explorer.
      * @public {number}
      */
    var debuggerServerPort: Double = js.native
    
    /**
      * The wrapped webdriver instance. Use this to interact with pages that do
      * not contain Angular (such as a log-in screen).
      *
      * @type {webdriver_extensions.ExtendedWebDriver}
      */
    var driver: ExtendedWebDriver = js.native
    
    /**
      * Helper function for finding elements.
      *
      * @type {function(webdriver.Locator): ElementFinder}
      */
    def element(locator: Locator): ElementFinder = js.native
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
      * @returns {!webdriver.promise.Promise.<T>} A promise that will resolve to
      * the
      *    scripts return value.
      * @template T
      */
    /* private */ def executeAsyncScript_(
      script: js.Any,
      description: js.Any,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param scriptArgs because its type <none> is not an array type */ scriptArgs: js.Any
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
    def executeScriptWithDescription(script: String, description: String, scriptArgs: js.Any*): js.Promise[js.Any] = js.native
    def executeScriptWithDescription(script: js.Function, description: String, scriptArgs: js.Any*): js.Promise[js.Any] = js.native
    
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
    def forkNewDriverInstance(useSameUrl: Boolean): ProtractorBrowser = js.native
    def forkNewDriverInstance(useSameUrl: Boolean, copyMockModules: Boolean): ProtractorBrowser = js.native
    def forkNewDriverInstance(useSameUrl: Boolean, copyMockModules: Boolean, copyConfigUpdates: Boolean): ProtractorBrowser = js.native
    def forkNewDriverInstance(useSameUrl: Boolean, copyMockModules: Unit, copyConfigUpdates: Boolean): ProtractorBrowser = js.native
    def forkNewDriverInstance(useSameUrl: Unit, copyMockModules: Boolean): ProtractorBrowser = js.native
    def forkNewDriverInstance(useSameUrl: Unit, copyMockModules: Boolean, copyConfigUpdates: Boolean): ProtractorBrowser = js.native
    def forkNewDriverInstance(useSameUrl: Unit, copyMockModules: Unit, copyConfigUpdates: Boolean): ProtractorBrowser = js.native
    
    def get(destination: String, timeout: Double): js.Promise[js.Any] = js.native
    
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
    def getLocationAbsUrl(): js.Promise[js.Any] = js.native
    
    /**
      * Timeout in milliseconds to wait for pages to load when calling `get`.
      *
      * @type {number}
      */
    var getPageTimeout: Double = js.native
    
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
    def getProcessedConfig(): js.Promise[js.Any] = js.native
    
    /**
      * Get a list of the current mock modules.
      *
      * @returns {Array.<!string|Function>} The list of mock modules.
      */
    def getRegisteredMockModules(): js.Array[String | js.Function] = js.native
    
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
    var ignoreSynchronization: Boolean = js.native
    
    /* private */ var internalIgnoreSynchronization: js.Any = js.native
    
    /* private */ var internalRootEl: js.Any = js.native
    
    def isElementPresent(locatorOrElement: ElementFinder): js.Promise[js.Any] = js.native
    /**
      * Tests if an element is present on the page.
      * @see webdriver.WebDriver.isElementPresent
      * @returns {!webdriver.promise.Promise} A promise that will resolve to whether
      *     the element is present on the page.
      */
    def isElementPresent(locatorOrElement: Locator): js.Promise[js.Any] = js.native
    def isElementPresent(locatorOrElement: WebElement): js.Promise[js.Any] = js.native
    
    /**
      * Information about mock modules that will be installed during every
      * get().
      *
      * @type {Array<{name: string, script: function|string, args:
      * Array.<string>}>}
      */
    var mockModules_ : js.Array[Args] = js.native
    
    /**
      * If true, Protractor will interpret any angular apps it comes across as
      * hybrid angular1/angular2 apps.
      *
      * @type {boolean}
      */
    var ng12Hybrid: Boolean = js.native
    
    /**
      * An object that holds custom test parameters.
      *
      * @type {Object}
      */
    var params: js.Any = js.native
    
    var plugins_ : Plugins = js.native
    
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
    var ready: js.Promise[ProtractorBrowser] = js.native
    
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
    def refresh(): js.Promise[js.Any] = js.native
    def refresh(opt_timeout: Double): js.Promise[js.Any] = js.native
    
    /**
      * Remove a registered mock module.
      *
      * @example
      * browser.removeMockModule('modName');
      *
      * @param {!string} name The name of the module to remove.
      */
    def removeMockModule(name: String): Unit = js.native
    
    /**
      * The reset URL to use between page loads.
      *
      * @type {string}
      */
    var resetUrl: String = js.native
    
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
    def restart(): js.Promise[ProtractorBrowser] = js.native
    
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
      * The css selector for an element on which to find Angular. This is usually
      * 'body' but if your ng-app is on a subsection of the page it may be
      * a subelement.
      *
      * This property is deprecated - please use angularAppRoot() instead.
      *
      * @deprecated
      * @type {string}
      */
    var rootEl: String = js.native
    
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
    def setLocation(url: String): js.Promise[js.Any] = js.native
    
    /**
      * If true, Protractor will track outstanding $timeouts and report them in the
      * error message if Protractor fails to synchronize with Angular in time.
      * @private {boolean}
      */
    var trackOutstandingTimeouts_ : Boolean = js.native
    
    /**
      * Instead of using a single root element, search through all angular apps
      * available on the page when finding elements or waiting for stability.
      * Only compatible with Angular2.
      */
    def useAllAngular2AppRoots(): Unit = js.native
    
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
    def waitForAngular(): js.Promise[js.Any] = js.native
    def waitForAngular(opt_description: String): js.Promise[js.Any] = js.native
    
    /**
      * If set to false, Protractor will not wait for Angular $http and $timeout
      * tasks to complete before interacting with the browser. This can cause
      * flaky tests, but should be used if, for instance, your app continuously
      * polls an API with $timeout.
      *
      * Call waitForAngularEnabled() without passing a value to read the current
      * state without changing it.
      */
    def waitForAngularEnabled(): js.Promise[Boolean] = js.native
    def waitForAngularEnabled(enabled: js.Promise[Boolean]): js.Promise[Boolean] = js.native
    def waitForAngularEnabled(enabled: Boolean): js.Promise[Boolean] = js.native
  }
  /* static members */
  object ProtractorBrowser {
    
    @JSImport("protractor/built/browser", "ProtractorBrowser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {ProtractorBy}
      */
    @JSImport("protractor/built/browser", "ProtractorBrowser.By")
    @js.native
    def By: ProtractorBy = js.native
    inline def By_=(x: ProtractorBy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("By")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ElementHelper
    extends js.Function {
    
    def apply(locator: Locator): ElementFinder = js.native
    
    def all(locator: Locator): ElementArrayFinder = js.native
  }
}
