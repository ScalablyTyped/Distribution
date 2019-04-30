package typings
package qunitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QUnit extends js.Object {
  /**
    * Namespace for QUnit assertions
    *
    * QUnit's built-in assertions are defined on the `QUnit.assert` object. An
    * instance of this object is passed as the only argument to the `QUnit.test`
    * function callback.
    *
    * This object has properties for each of QUnit's built-in assertion methods.
    */
  var assert: Assert = js.native
  /**
    * Configuration for QUnit
    *
    * QUnit has a bunch of internal configuration defaults, some of which are
    * useful to override. Check the description for each option for details.
    */
  var config: Config = js.native
  /**
    * Advanced and extensible data dumping for JavaScript.
    *
    * This method does string serialization by parsing data structures and
    * objects. It parses DOM elements to a string representation of their outer
    * HTML. By default, nested structures will be displayed up to five levels
    * deep. Anything beyond that is replaced by `[object Object]` and
    * `[object Array]` placeholders.
    *
    * If you need more or less output, change the value of `QUnit.dump.maxDepth`,
    * representing how deep the elements should be parsed.
    *
    * Note: This method used to be in QUnit.jsDump, which was changed to
    * QUnit.dump. The old property will be removed in QUnit 3.0.
    */
  var dump: Anon_Data = js.native
  /**
    * Are the test running from the server or not.
    */
  var isLocal: scala.Boolean = js.native
  /**
    * Group related tests under a single label.
    *
    * You can use the module name to organize, select, and filter tests to run.
    *
    * All tests inside a module callback function will be grouped into that
    * module. The test names will all be preceded by the module name in the
    * test results. Other modules can be nested inside this callback function,
    * where their tests' names will be labeled by their names recursively
    * prefixed by their parent modules.
    *
    * If `QUnit.module` is defined without a `nested` callback argument, all
    * subsequently defined tests will be grouped into the module until another
    * module is defined.
    *
    * Modules with test group functions allow you to define nested modules, and
    * QUnit will run tests on the parent module before going deep on the nested
    * ones, even if they're declared first. Additionally, any hook callbacks on
    * a parent module will wrap the hooks on a nested module. In other words,
    * `before` and `beforeEach` callbacks will form a queue while the
    * `afterEach` and `after` callbacks will form a stack.
    *
    * You can specify code to run before and after tests using the hooks
    * argument, and also to create properties that will be shared on the
    * testing context. Any additional properties on the `hooks` object will be
    * added to that context. The `hooks` argument is still optional if you call
    * `QUnit.module` with a callback argument.
    *
    * The module's callback is invoked with the test environment as its `this`
    * context, with the environment's properties copied to the module's tests,
    * hooks, and nested modules. Note that changes on tests' `this` are not
    * preserved between sibling tests, where `this` will be reset to the initial
    * value for each test.
    *
    * @param {string} name Label for this group of tests
    * @param hookds Callbacks to run during test execution
    * @param nested A callback with grouped tests and nested modules to run under the current module label
    */
  @JSName("module")
  var module_Original: moduleFunc1 with moduleFunc2 with ModuleOnly = js.native
  /**
    * QUnit version
    */
  var version: java.lang.String = js.native
  /**
    * Register a callback to fire whenever the test suite begins.
    *
    * `QUnit.begin()` is called once before running any tests.
    *
    * @callback callback Callback to execute.
    */
  def begin(callback: js.Function1[/* details */ qunitLib.QUnitNs.BeginDetails, scala.Unit]): scala.Unit = js.native
  /**
    * Register a callback to fire whenever the test suite ends.
    *
    * @param callback Callback to execute
    */
  def done(callback: js.Function1[/* details */ qunitLib.QUnitNs.DoneDetails, scala.Unit]): scala.Unit = js.native
  /**
    * Compares two values. Returns true if they are equivalent.
    *
    * @param a The first value
    * @param b The second value
    */
  def equiv[T](a: T, b: T): scala.Boolean = js.native
  /**
    * Copy the properties defined by the `mixin` object into the `target` object.
    *
    * This method will modify the `target` object to contain the "own" properties
    * defined by the `mixin`. If the `mixin` object specifies the value of any
    * attribute as undefined, this property will instead be removed from the
    * `target` object.
    *
    * @param target An object whose properties are to be modified
    * @param mixin An object describing which properties should be modified
    */
  def extend(target: js.Any, mixin: js.Any): scala.Unit = js.native
  /**
    * Register a callback to fire whenever an assertion completes.
    *
    * This is one of several callbacks QUnit provides. Its intended for
    * integration scenarios like PhantomJS or Jenkins. The properties of the
    * details argument are listed below as options.
    *
    * @param callback Callback to execute
    */
  def log(callback: js.Function1[/* details */ qunitLib.QUnitNs.LogDetails, scala.Unit]): scala.Unit = js.native
  /**
    * Group related tests under a single label.
    *
    * You can use the module name to organize, select, and filter tests to run.
    *
    * All tests inside a module callback function will be grouped into that
    * module. The test names will all be preceded by the module name in the
    * test results. Other modules can be nested inside this callback function,
    * where their tests' names will be labeled by their names recursively
    * prefixed by their parent modules.
    *
    * If `QUnit.module` is defined without a `nested` callback argument, all
    * subsequently defined tests will be grouped into the module until another
    * module is defined.
    *
    * Modules with test group functions allow you to define nested modules, and
    * QUnit will run tests on the parent module before going deep on the nested
    * ones, even if they're declared first. Additionally, any hook callbacks on
    * a parent module will wrap the hooks on a nested module. In other words,
    * `before` and `beforeEach` callbacks will form a queue while the
    * `afterEach` and `after` callbacks will form a stack.
    *
    * You can specify code to run before and after tests using the hooks
    * argument, and also to create properties that will be shared on the
    * testing context. Any additional properties on the `hooks` object will be
    * added to that context. The `hooks` argument is still optional if you call
    * `QUnit.module` with a callback argument.
    *
    * The module's callback is invoked with the test environment as its `this`
    * context, with the environment's properties copied to the module's tests,
    * hooks, and nested modules. Note that changes on tests' `this` are not
    * preserved between sibling tests, where `this` will be reset to the initial
    * value for each test.
    *
    * @param {string} name Label for this group of tests
    * @param hookds Callbacks to run during test execution
    * @param nested A callback with grouped tests and nested modules to run under the current module label
    */
  def module(name: java.lang.String): scala.Unit = js.native
  def module(name: java.lang.String, hooks: Hooks): scala.Unit = js.native
  def module(name: java.lang.String, hooks: Hooks, nested: js.Function1[/* hooks */ NestedHooks, scala.Unit]): scala.Unit = js.native
  def module(name: java.lang.String, nested: js.Function1[/* hooks */ NestedHooks, scala.Unit]): scala.Unit = js.native
  /**
    * Register a callback to fire whenever a module ends.
    *
    * @param callback Callback to execute
    */
  def moduleDone(callback: js.Function1[/* details */ qunitLib.QUnitNs.ModuleDoneDetails, scala.Unit]): scala.Unit = js.native
  /**
    * Register a callback to fire whenever a module begins.
    *
    * @param callback Callback to execute
    */
  def moduleStart(callback: js.Function1[/* details */ qunitLib.QUnitNs.ModuleStartDetails, scala.Unit]): scala.Unit = js.native
  /**
    * Adds a test to exclusively run, preventing all other tests from running.
    *
    * Use this method to focus your test suite on a specific test. QUnit.only
    * will cause any other tests in your suite to be ignored.
    *
    * Note, that if more than one QUnit.only is present only the first instance
    * will run.
    *
    * This is an alternative to filtering tests to run in the HTML reporter. It
    * is especially useful when you use a console reporter or in a codebase
    * with a large set of long running tests.
    *
    * @param {string} name Title of unit being tested
    * @param callback Function to close over assertions
    */
  def only(name: java.lang.String, callback: js.Function1[/* assert */ Assert, scala.Unit]): scala.Unit = js.native
  /**
    * DEPRECATED: Report the result of a custom assertion.
    *
    * This method is deprecated and it's recommended to use pushResult on its
    * direct reference in the assertion context.
    *
    * QUnit.push reflects to the current running test, and it may leak
    * assertions in asynchronous mode. Checkout assert.pushResult() to set a
    * proper custom assertion.
    *
    * Invoking QUnit.push allows to create a readable expectation that is not
    * defined by any of QUnit's built-in assertions.
    *
    * @deprecated
    */
  def push(result: scala.Boolean, actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
    * Adds a test like object to be skipped.
    *
    * Use this method to replace QUnit.test() instead of commenting out entire
    * tests.
    *
    * This test's prototype will be listed on the suite as a skipped test,
    * ignoring the callback argument and the respective global and module's
    * hooks.
    *
    * @param {string} Title of unit being tested
    */
  def skip(name: java.lang.String): scala.Unit = js.native
  def skip(name: java.lang.String, callback: js.Function1[/* assert */ Assert, scala.Unit]): scala.Unit = js.native
  /**
    * Returns a single line string representing the stacktrace (call stack).
    *
    * This method returns a single line string representing the stacktrace from
    * where it was called. According to its offset argument, `QUnit.stack()` will
    * return the correspondent line from the call stack.
    *
    * The default `offset` is `0` and will return the current location where it
    * was called.
    *
    * Not all browsers support retrieving stracktraces. In those, `QUnit.stack()`
    * will return undefined.
    *
    * @param {number} offset Set the stacktrace line offset.
    */
  def stack(): java.lang.String = js.native
  def stack(offset: scala.Double): java.lang.String = js.native
  /**
    * `QUnit.start()` must be used to start a test run that has
    * `QUnit.config.autostart` set to `false`.
    *
    * This method was previously used to control async tests on text contexts
    * along with QUnit.stop. For asynchronous tests, use assert.async instead.
    *
    * When your async test has multiple exit points, call `QUnit.start()` for the
    * corresponding number of `QUnit.stop()` increments.
    */
  def start(): scala.Unit = js.native
  /**
    * Add a test to run.
    *
    * Add a test to run using `QUnit.test()`.
    *
    * The `assert` argument to the callback contains all of QUnit's assertion
    * methods. Use this argument to call your test assertions.
    *
    * `QUnit.test()` can automatically handle the asynchronous resolution of a
    * Promise on your behalf if you return a thenable Promise as the result of
    * your callback function.
    *
    * @param {string} Title of unit being tested
    * @param callback Function to close over assertions
    */
  def test(name: java.lang.String, callback: js.Function1[/* assert */ Assert, scala.Unit]): scala.Unit = js.native
  /**
    * Register a callback to fire whenever a test ends.
    *
    * @param callback Callback to execute
    */
  def testDone(callback: js.Function1[/* details */ Anon_Failed, scala.Unit]): scala.Unit = js.native
  /**
    * Register a callback to fire whenever a test begins.
    *
    * @param callback Callback to execute
    */
  def testStart(callback: js.Function1[/* details */ qunitLib.QUnitNs.TestStartDetails, scala.Unit]): scala.Unit = js.native
  /**
    * Adds a test which expects at least one failing assertion during its run.
    *
    * Use this method to test a unit of code which is still under development
    * (in a “todo” state). The test will pass as long as one failing assertion
    * is present.
    *
    * If all assertions pass, then the test will fail signaling that QUnit.todo
    * should be replaced by QUnit.test.
    *
    * @param {string} Title of unit being tested
    * @param callback Function to close over assertions
    */
  def todo(name: java.lang.String): scala.Unit = js.native
  def todo(name: java.lang.String, callback: js.Function1[/* assert */ Assert, scala.Unit]): scala.Unit = js.native
}

