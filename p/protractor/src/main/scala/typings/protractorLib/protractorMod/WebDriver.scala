package typings
package protractorLib.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "WebDriver")
@js.native
class WebDriver protected ()
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver {
  // region Constructors
  /**
    * @param {!(Session|promise.Promise<!Session>)} session Either a
    *     known session or a promise that will be resolved to a session.
    * @param {!command.Executor} executor The executor to use when sending
    *     commands to the browser.
    * @param {promise.ControlFlow=} opt_flow The flow to
    *     schedule commands through. Defaults to the active flow object.
    */
  def this(session: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Session, executor: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Executor) = this()
  def this(session: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[seleniumDashWebdriverLib.seleniumDashWebdriverMod.Session], executor: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Executor) = this()
  def this(session: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Session, executor: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Executor, opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow) = this()
  def this(session: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[seleniumDashWebdriverLib.seleniumDashWebdriverMod.Session], executor: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Executor, opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow) = this()
}

/* static members */
@JSImport("protractor", "WebDriver")
@js.native
object WebDriver extends js.Object {
  // endregion
  // region StaticMethods
  /**
    * Creates a new WebDriver client for an existing session.
    * @param {!command.Executor} executor Command executor to use when querying
    *     for session details.
    * @param {string} sessionId ID of the session to attach to.
    * @param {promise.ControlFlow=} opt_flow The control flow all
    *     driver commands should execute under. Defaults to the
    *     {@link promise.controlFlow() currently active}  control flow.
    * @return {!WebDriver} A new client for the specified session.
    */
  def attachToSession(executor: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Executor, sessionId: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver = js.native
  def attachToSession(
    executor: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Executor,
    sessionId: java.lang.String,
    opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver = js.native
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
  // This method's arguments are untyped so that its overloads can have correct types.
  // Typescript doesn't allow static methods to be overridden with incompatible signatures.
  def createSession(var_args: js.Any*): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver = js.native
}

