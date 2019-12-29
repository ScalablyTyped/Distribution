package typings.seleniumDashWebdriver.seleniumDashWebdriverMod

import typings.seleniumDashWebdriver.Anon_Async
import typings.seleniumDashWebdriver.Anon_AsyncBoolean
import typings.seleniumDashWebdriver.Anon_Bridge
import typings.seleniumDashWebdriver.httpMod.Executor
import typings.seleniumDashWebdriver.libCommandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "WebDriver")
@js.native
class WebDriver protected () extends js.Object {
  def this(session: js.Promise[Session], executor: Executor) = this()
  // region Constructors
  /**
    * @param {!(Session|Promise<!Session>)} session Either a
    *     known session or a promise that will be resolved to a session.
    * @param {!command.Executor} executor The executor to use when sending
    *     commands to the browser.
    */
  def this(session: Session, executor: Executor) = this()
  /**
    * Creates a new action sequence using this driver. The sequence will not be
    * scheduled for execution until {@link actions.ActionSequence#perform} is
    * called. Example:
    *
    *     driver.actions().
    *         mouseDown(element1).
    *         mouseMove(element2).
    *         mouseUp().
    *         perform();
    *
    * @return {!actions.ActionSequence} A new action sequence for this instance.
    */
  def actions(): typings.seleniumDashWebdriver.libInputMod.Actions = js.native
  def actions(options: Anon_Async): typings.seleniumDashWebdriver.libInputMod.Actions = js.native
  def actions(options: Anon_AsyncBoolean): typings.seleniumDashWebdriver.libInputMod.Actions = js.native
  def actions(options: Anon_Bridge): typings.seleniumDashWebdriver.libInputMod.Actions = js.native
  /**
    * Schedules a command to close the current window.
    * @return {!Promise.<void>} A promise that will be resolved
    *     when this command has completed.
    */
  def close(): js.Promise[Unit] = js.native
  // endregion
  // region Methods
  /**
    * Schedules a {@link command.Command} to be executed by this driver's
    * {@link command.Executor}.
    *
    * @param {!command.Command} command The command to schedule.
    * @param {string} description A description of the command for debugging.
    * @return {!Promise<T>} A promise that will be resolved
    *     with the command result.
    * @template T
    */
  def execute[T](command: Command): js.Promise[T] = js.native
  def execute[T](command: Command, description: String): js.Promise[T] = js.native
  /**
    * Schedules a command to execute asynchronous JavaScript in the context of
    * the currently selected frame or window. The script fragment will be
    * executed as the body of an anonymous function. If the script is provided as
    * a function object, that function will be converted to a string for
    * injection into the target window.
    *
    * Any arguments provided in addition to the script will be included as script
    * arguments and may be referenced using the {@code arguments} object.
    * Arguments may be a boolean, number, string, or {@code WebElement}.
    * Arrays and objects may also be used as script arguments as long as each
    * item adheres to the types previously mentioned.
    *
    * Unlike executing synchronous JavaScript with {@link #executeScript},
    * scripts executed with this function must explicitly signal they are
    * finished by invoking the provided callback. This callback will always be
    * injected into the executed function as the last argument, and thus may be
    * referenced with {@code arguments[arguments.length - 1]}. The following
    * steps will be taken for resolving this functions return value against the
    * first argument to the script's callback function:
    *
    * - For a HTML element, the value will resolve to a
    *     {@link WebElement}
    * - Null and undefined return values will resolve to null
    * - Booleans, numbers, and strings will resolve as is
    * - Functions will resolve to their string representation
    * - For arrays and objects, each member item will be converted according to
    *     the rules above
    *
    * __Example #1:__ Performing a sleep that is synchronized with the currently
    * selected window:
    *
    *     var start = new Date().getTime();
    *     driver.executeAsyncScript(
    *         'window.setTimeout(arguments[arguments.length - 1], 500);').
    *         then(function() {
    *           console.log(
    *               'Elapsed time: ' + (new Date().getTime() - start) + ' ms');
    *         });
    *
    * __Example #2:__ Synchronizing a test with an AJAX application:
    *
    *     var button = driver.findElement(By.id('compose-button'));
    *     button.click();
    *     driver.executeAsyncScript(
    *         'var callback = arguments[arguments.length - 1];' +
    *         'mailClient.getComposeWindowWidget().onload(callback);');
    *     driver.switchTo().frame('composeWidget');
    *     driver.findElement(By.id('to')).sendKeys('dog@example.com');
    *
    * __Example #3:__ Injecting a XMLHttpRequest and waiting for the result. In
    * this example, the inject script is specified with a function literal. When
    * using this format, the function is converted to a string for injection, so
    * it should not reference any symbols not defined in the scope of the page
    * under test.
    *
    *     driver.executeAsyncScript(function() {
    *       var callback = arguments[arguments.length - 1];
    *       var xhr = new XMLHttpRequest();
    *       xhr.open('GET', '/resource/data.json', true);
    *       xhr.onreadystatechange = function() {
    *         if (xhr.readyState == 4) {
    *           callback(xhr.responseText);
    *         }
    *       }
    *       xhr.send('');
    *     }).then(function(str) {
    *       console.log(JSON.parse(str)['food']);
    *     });
    *
    * @param {!(string|Function)} script The script to execute.
    * @param {...*} var_args The arguments to pass to the script.
    * @return {!Promise.<T>} A promise that will resolve to the
    *    scripts return value.
    * @template T
    */
  def executeAsyncScript[T](script: String, var_args: js.Any*): js.Promise[T] = js.native
  def executeAsyncScript[T](script: js.Function, var_args: js.Any*): js.Promise[T] = js.native
  /**
    * Schedules a command to execute JavaScript in the context of the currently
    * selected frame or window. The script fragment will be executed as the body
    * of an anonymous function. If the script is provided as a function object,
    * that function will be converted to a string for injection into the target
    * window.
    *
    * Any arguments provided in addition to the script will be included as script
    * arguments and may be referenced using the {@code arguments} object.
    * Arguments may be a boolean, number, string, or {@code WebElement}.
    * Arrays and objects may also be used as script arguments as long as each
    * item adheres to the types previously mentioned.
    *
    * The script may refer to any variables accessible from the current window.
    * Furthermore, the script will execute in the window's context, thus
    * {@code document} may be used to refer to the current document. Any local
    * variables will not be available once the script has finished executing,
    * though global variables will persist.
    *
    * If the script has a return value (i.e. if the script contains a return
    * statement), then the following steps will be taken for resolving this
    * functions return value:
    *
    * - For a HTML element, the value will resolve to a
    *     {@link WebElement}
    * - Null and undefined return values will resolve to null</li>
    * - Booleans, numbers, and strings will resolve as is</li>
    * - Functions will resolve to their string representation</li>
    * - For arrays and objects, each member item will be converted according to
    *     the rules above
    *
    * @param {!(string|Function)} script The script to execute.
    * @param {...*} var_args The arguments to pass to the script.
    * @return {!Promise.<T>} A promise that will resolve to the
    *    scripts return value.
    * @template T
    */
  def executeScript[T](script: String, var_args: js.Any*): js.Promise[T] = js.native
  def executeScript[T](script: js.Function, var_args: js.Any*): js.Promise[T] = js.native
  /**
    * Schedule a command to find an element on the page. If the element cannot be
    * found, a {@link bot.ErrorCode.NO_SUCH_ELEMENT} result will be returned
    * by the driver. Unlike other commands, this error cannot be suppressed. In
    * other words, scheduling a command to find an element doubles as an assert
    * that the element is present on the page. To test whether an element is
    * present on the page, use {@link #findElements}.
    *
    * The search criteria for an element may be defined using one of the
    * factories in the {@link By} namespace, or as a short-hand
    * {@link By.Hash} object. For example, the following two statements
    * are equivalent:
    *
    *     var e1 = driver.findElement(By.id('foo'));
    *     var e2 = driver.findElement({id:'foo'});
    *
    * You may also provide a custom locator function, which takes as input this
    * instance and returns a {@link WebElement}, or a promise that will resolve
    * to a WebElement. If the returned promise resolves to an array of
    * WebElements, WebDriver will use the first element. For example, to find the
    * first visible link on a page, you could write:
    *
    *     var link = driver.findElement(firstVisibleLink);
    *
    *     function firstVisibleLink(driver) {
    *       var links = driver.findElements(By.tagName('a'));
    *       return promise.filter(links, function(link) {
    *         return link.isDisplayed();
    *       });
    *     }
    *
    * @param {!(by.By|Function)} locator The locator to use.
    * @return {!WebElementPromise} A WebElement that can be used to issue
    *     commands against the located element. If the element is not found, the
    *     element will be invalidated and all scheduled commands aborted.
    */
  def findElement(locator: Locator): WebElementPromise = js.native
  /**
    * Schedule a command to search for multiple elements on the page.
    *
    * @param {!(by.By|Function)} locator The locator to use.
    * @return {!Promise.<!Array.<!WebElement>>} A
    *     promise that will resolve to an array of WebElements.
    */
  def findElements(locator: Locator): js.Promise[js.Array[WebElement]] = js.native
  /**
    * Schedules a command to navigate to the given URL.
    * @param {string} url The fully qualified URL to open.
    * @return {!Promise.<void>} A promise that will be resolved
    *     when the document has finished loading.
    */
  def get(url: String): js.Promise[Unit] = js.native
  /**
    * Schedules a command to retrieve the current list of available window
    * handles.
    * @return {!Promise.<!Array.<string>>} A promise that will
    *     be resolved with an array of window handles.
    */
  def getAllWindowHandles(): js.Promise[js.Array[String]] = js.native
  /**
    * @return {!Promise.<!Capabilities>} A promise
    *     that will resolve with the this instance's capabilities.
    */
  def getCapabilities(): js.Promise[typings.seleniumDashWebdriver.libCapabilitiesMod.Capabilities] = js.native
  /**
    * Schedules a command to retrieve the URL of the current page.
    * @return {!Promise.<string>} A promise that will be
    *     resolved with the current URL.
    */
  def getCurrentUrl(): js.Promise[String] = js.native
  def getExecutor(): typings.seleniumDashWebdriver.libCommandMod.Executor = js.native
  /**
    * Schedules a command to retrieve the current page's source. The page source
    * returned is a representation of the underlying DOM: do not expect it to be
    * formatted or escaped in the same way as the response sent from the web
    * server.
    * @return {!Promise.<string>} A promise that will be
    *     resolved with the current page source.
    */
  def getPageSource(): js.Promise[String] = js.native
  /**
    * @return {!Promise.<!Session>} A promise for this
    *     client's session.
    */
  def getSession(): js.Promise[Session] = js.native
  /**
    * Schedules a command to retrieve the current page's title.
    * @return {!Promise.<string>} A promise that will be
    *     resolved with the current page's title.
    */
  def getTitle(): js.Promise[String] = js.native
  /**
    * Schedules a command to retrieve they current window handle.
    * @return {!Promise.<string>} A promise that will be
    *     resolved with the current window handle.
    */
  def getWindowHandle(): js.Promise[String] = js.native
  /**
    * @return {!Options} The options interface for this
    *     instance.
    */
  def manage(): Options = js.native
  /**
    * @return {!Navigation} The navigation interface for this
    *     instance.
    */
  def navigate(): Navigation = js.native
  /**
    * Schedules a command to quit the current session. After calling quit, this
    * instance will be invalidated and may no longer be used to issue commands
    * against the browser.
    * @return {!Promise.<void>} A promise that will be resolved
    *     when the command has completed.
    */
  def quit(): js.Promise[Unit] = js.native
  /**
    * Sets the {@linkplain input.FileDetector file detector} that should be
    * used with this instance.
    * @param {input.FileDetector} detector The detector to use or {@code null}.
    */
  def setFileDetector(detector: FileDetector): Unit = js.native
  /**
    * Schedules a command to make the driver sleep for the given amount of time.
    * @param {number} ms The amount of time, in milliseconds, to sleep.
    * @return {!Promise.<void>} A promise that will be resolved
    *     when the sleep has finished.
    */
  def sleep(ms: Double): js.Promise[Unit] = js.native
  /**
    * @return {!TargetLocator} The target locator interface for
    *     this instance.
    */
  def switchTo(): TargetLocator = js.native
  /**
    * Schedule a command to take a screenshot. The driver makes a best effort to
    * return a screenshot of the following, in order of preference:
    *
    * 1. Entire page
    * 2. Current window
    * 3. Visible portion of the current frame
    * 4. The entire display containing the browser
    *
    * @return {!Promise<string>} A promise that will be
    *     resolved to the screenshot as a base-64 encoded PNG.
    */
  def takeScreenshot(): js.Promise[String] = js.native
  /**
    * Schedules a command to wait for a condition to hold. The condition may be
    * specified by a {@link Condition}, as a custom function, or
    * as a {@link Promise}.
    *
    * For a {@link Condition} or function, the wait will repeatedly
    * evaluate the condition until it returns a truthy value. If any errors occur
    * while evaluating the condition, they will be allowed to propagate. In the
    * event a condition returns a {@link Promise promise}, the
    * polling loop will wait for it to be resolved and use the resolved value for
    * whether the condition has been satisified. Note the resolution time for
    * a promise is factored into whether a wait has timed out.
    *
    * Note, if the provided condition is a {@link WebElementCondition}, then
    * the wait will return a {@link WebElementPromise} that will resolve to the
    * element that satisified the condition.
    *
    * *Example:* waiting up to 10 seconds for an element to be present and
    * visible on the page.
    *
    *     var button = driver.wait(until.elementLocated(By.id('foo'), 10000);
    *     button.click();
    *
    * This function may also be used to block the command flow on the resolution
    * of a {@link Promise promise}. When given a promise, the
    * command will simply wait for its resolution before completing. A timeout
    * may be provided to fail the command if the promise does not resolve before
    * the timeout expires.
    *
    * *Example:* Suppose you have a function, `startTestServer`, that returns a
    * promise for when a server is ready for requests. You can block a
    * `WebDriver` client on this promise with:
    *
    *     var started = startTestServer();
    *     driver.wait(started, 5 * 1000, 'Server should start within 5 seconds');
    *     driver.get(getServerUrl());
    *
    * @param {!WebElementCondition} condition The condition to
    *     wait on, defined as a promise, condition object, or  a function to
    *     evaluate as a condition.
    * @param {number=} opt_timeout How long to wait for the condition to be true.
    * @param {string=} opt_message An optional message to use if the wait times
    *     out.
    * @return {!WebElementPromise} A promise that will be fulfilled
    *     with the first truthy value returned by the condition function, or
    *     rejected if the condition times out.
    * @template T
    */
  def wait(condition: WebElementCondition): WebElementPromise = js.native
  def wait(condition: WebElementCondition, opt_timeout: Double): WebElementPromise = js.native
  def wait(condition: WebElementCondition, opt_timeout: Double, opt_message: String): WebElementPromise = js.native
  def wait[T](condition: js.Function): js.Promise[T] = js.native
  def wait[T](condition: js.Function1[/* driver */ this.type, T | js.Thenable[T]]): js.Promise[T] = js.native
  def wait[T](condition: js.Function1[/* driver */ this.type, T | js.Thenable[T]], opt_timeout: Double): js.Promise[T] = js.native
  def wait[T](
    condition: js.Function1[/* driver */ this.type, T | js.Thenable[T]],
    opt_timeout: Double,
    opt_message: String
  ): js.Promise[T] = js.native
  def wait[T](condition: js.Function, opt_timeout: Double): js.Promise[T] = js.native
  def wait[T](condition: js.Function, opt_timeout: Double, opt_message: String): js.Promise[T] = js.native
  /**
    * Schedules a command to wait for a condition to hold. The condition may be
    * specified by a {@link webdriver.Condition}, as a custom function, or
    * as a {@link Promise}.
    *
    * For a {@link webdriver.Condition} or function, the wait will repeatedly
    * evaluate the condition until it returns a truthy value. If any errors occur
    * while evaluating the condition, they will be allowed to propagate. In the
    * event a condition returns a {@link Promise promise}, the
    * polling loop will wait for it to be resolved and use the resolved value for
    * whether the condition has been satisified. Note the resolution time for
    * a promise is factored into whether a wait has timed out.
    *
    * Note, if the provided condition is a {@link WebElementCondition}, then
    * the wait will return a {@link WebElementPromise} that will resolve to the
    * element that satisified the condition.
    *
    * *Example:* waiting up to 10 seconds for an element to be present and
    * visible on the page.
    *
    *     var button = driver.wait(until.elementLocated(By.id('foo'), 10000);
    *     button.click();
    *
    * This function may also be used to block the command flow on the resolution
    * of a {@link Promise promise}. When given a promise, the
    * command will simply wait for its resolution before completing. A timeout
    * may be provided to fail the command if the promise does not resolve before
    * the timeout expires.
    *
    * *Example:* Suppose you have a function, `startTestServer`, that returns a
    * promise for when a server is ready for requests. You can block a
    * `WebDriver` client on this promise with:
    *
    *     var started = startTestServer();
    *     driver.wait(started, 5 * 1000, 'Server should start within 5 seconds');
    *     driver.get(getServerUrl());
    *
    * @param {!(Promise<T>|
    *           Condition<T>|
    *           function(!WebDriver): T)} condition The condition to
    *     wait on, defined as a promise, condition object, or  a function to
    *     evaluate as a condition.
    * @param {number=} opt_timeout How long to wait for the condition to be true.
    * @param {string=} opt_message An optional message to use if the wait times
    *     out.
    * @return {!Promise<T>} A promise that will be fulfilled
    *     with the first truthy value returned by the condition function, or
    *     rejected if the condition times out.
    * @template T
    */
  def wait[T](condition: js.Thenable[T]): js.Promise[T] = js.native
  def wait[T](condition: js.Thenable[T], opt_timeout: Double): js.Promise[T] = js.native
  def wait[T](condition: js.Thenable[T], opt_timeout: Double, opt_message: String): js.Promise[T] = js.native
  def wait[T](condition: Condition[T]): js.Promise[T] = js.native
  def wait[T](condition: Condition[T], opt_timeout: Double): js.Promise[T] = js.native
  def wait[T](condition: Condition[T], opt_timeout: Double, opt_message: String): js.Promise[T] = js.native
}

/* static members */
@JSImport("selenium-webdriver", "WebDriver")
@js.native
object WebDriver extends js.Object {
  // endregion
  // region StaticMethods
  /**
    * Creates a new WebDriver session.
    *
    * By default, the requested session `capabilities` are merely "desired" and
    * the remote end will still create a new session even if it cannot satisfy
    * all of the requested capabilities. You can query which capabilities a
    * session actually has using the
    * {@linkplain #getCapabilities() getCapabilities()} method on the returned
    * WebDriver instance.
    *
    * To define _required capabilities_, provide the `capabilities` as an object
    * literal with `required` and `desired` keys. The `desired` key may be
    * omitted if all capabilities are required, and vice versa. If the server
    * cannot create a session with all of the required capabilities, it will
    * return an {@linkplain error.SessionNotCreatedError}.
    *
    *     let required = new Capabilities().set('browserName', 'firefox');
    *     let desired = new Capabilities().set('version', '45');
    *     let driver = WebDriver.createSession(executor, {required, desired});
    *
    * This function will always return a WebDriver instance. If there is an error
    * creating the session, such as the aforementioned SessionNotCreatedError,
    * the driver will have a rejected {@linkplain #getSession session} promise.
    * It is recommended that this promise is left _unhandled_ so it will
    * propagate through the {@linkplain promise.ControlFlow control flow} and
    * cause subsequent commands to fail.
    *
    *     let required = Capabilities.firefox();
    *     let driver = WebDriver.createSession(executor, {required});
    *
    *     // If the createSession operation failed, then this command will also
    *     // also fail, propagating the creation failure.
    *     driver.get('http://www.google.com').catch(e => console.log(e));
    *
    * @param {!command.Executor} executor The executor to create the new session
    *     with.
    * @param {(!Capabilities|
    *          {desired: (Capabilities|undefined),
    *           required: (Capabilities|undefined)})} capabilities The desired
    *     capabilities for the new session.
    * @param {promise.ControlFlow=} opt_flow The control flow all driver
    *     commands should execute under, including the initial session creation.
    *     Defaults to the {@link promise.controlFlow() currently active}
    *     control flow.
    * @param {(function(new: WebDriver,
    *                   !IThenable<!Session>,
    *                   !command.Executor,
    *                   promise.ControlFlow=))=} opt_ctor
    *    A reference to the constructor of the specific type of WebDriver client
    *    to instantiate. Will create a vanilla {@linkplain WebDriver} instance
    *    if a constructor is not provided.
    * @param {(function(this: void): ?)=} opt_onQuit A callback to invoke when
    *    the newly created session is terminated. This should be used to clean
    *    up any resources associated with the session.
    * @return {!WebDriver} The driver for the newly created session.
    */
  // This method's arguments are untyped so that its overloads can have correct
  // types. Typescript doesn't allow static methods to be overridden with
  // incompatible signatures.
  def createSession(var_args: js.Any*): WebDriver = js.native
}

