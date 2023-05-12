package typings.qunit.mod.global

import org.scalablytyped.runtime.Shortcut
import typings.qunit.anon.Failed
import typings.qunit.anon.MaxDepth
import typings.qunit.anon.ModuleId
import typings.qunit.mod.global.QUnit.BeginDetails
import typings.qunit.mod.global.QUnit.DoneDetails
import typings.qunit.mod.global.QUnit.LogDetails
import typings.qunit.mod.global.QUnit.ModuleDoneDetails
import typings.qunit.mod.global.QUnit.ModuleStartDetails
import typings.qunit.mod.global.QUnit.TestStartDetails
import typings.qunit.qunitBooleans.`false`
import typings.qunit.qunitBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QUnit extends StObject {
  
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
    * Register a callback to fire whenever the test suite begins.
    *
    * `QUnit.begin()` is called once before running any tests.
    *
    * callback Callback to execute.
    */
  def begin(callback: js.Function1[/* details */ BeginDetails, Unit | js.Promise[Unit]]): Unit = js.native
  
  /**
    * Configuration for QUnit
    *
    * QUnit has a bunch of internal configuration defaults, some of which are
    * useful to override. Check the description for each option for details.
    */
  var config: Config = js.native
  
  /**
    * Register a callback to fire whenever the test suite ends.
    *
    * @param callback Callback to execute
    */
  def done(callback: js.Function1[/* details */ DoneDetails, Unit | js.Promise[Unit]]): Unit = js.native
  
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
  var dump: MaxDepth = js.native
  
  /**
    * Compares two values. Returns true if they are equivalent.
    *
    * @param a The first value
    * @param b The second value
    */
  def equiv[T](a: T, b: T): Boolean = js.native
  
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
  def extend(target: Any, mixin: Any): Unit = js.native
  
  /**
    * Register a global callback to run before or after each test.
    *
    * This is the equivalent of applying a QUnit.module() hook to all modules
    * and all tests, including global tests that are not associated with any module.
    *
    * Similar to module hooks, global hooks support async functions or
    * returning a Promise, which will be waited for before QUnit continues executing tests.
    * Each global hook also has access to the same assert object and
    * test context as the QUnit.test that the hook is running for.
    *
    * For more details about hooks, refer to QUnit.module § Hooks.
    */
  var hooks: GlobalHooks = js.native
  
  /**
    * Are the test running from the server or not.
    */
  var isLocal: Boolean = js.native
  
  /**
    * Register a callback to fire whenever an assertion completes.
    *
    * This is one of several callbacks QUnit provides. Its intended for
    * integration scenarios like PhantomJS or Jenkins. The properties of the
    * details argument are listed below as options.
    *
    * @param callback Callback to execute
    */
  def log(callback: js.Function1[/* details */ LogDetails, Unit]): Unit = js.native
  
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
  def module(name: String): Unit = js.native
  def module(name: String, hooks: Unit, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit = js.native
  def module(name: String, hooks: Hooks): Unit = js.native
  def module(name: String, hooks: Hooks, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit = js.native
  def module(name: String, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit = js.native
  
  /**
    * Register a callback to fire whenever a module ends.
    *
    * @param callback Callback to execute
    */
  def moduleDone(callback: js.Function1[/* details */ ModuleDoneDetails, Unit | js.Promise[Unit]]): Unit = js.native
  
  /**
    * Register a callback to fire whenever a module begins.
    *
    * @param callback Callback to execute
    */
  def moduleStart(callback: js.Function1[/* details */ ModuleStartDetails, Unit | js.Promise[Unit]]): Unit = js.native
  
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
  var module_Original: moduleFunc1 & moduleFunc2 & ModuleOnly & ModuleSkip & ModuleTodo = js.native
  
  /**
    * Handle a global error that should result in a failed test run.
    *
    * @since 2.17.0
    * @param {Error|any} error
    */
  def onUncaughtException(error: Any): Unit = js.native
  
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
  def only(name: String, callback: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit = js.native
  
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
  def push(result: Boolean, actual: Any, expected: Any, message: String): Unit = js.native
  
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
  def skip(name: String): Unit = js.native
  def skip(name: String, callback: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit = js.native
  
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
  def stack(): String = js.native
  def stack(offset: Double): String = js.native
  
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
  def start(): Unit = js.native
  
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
  def test(name: String, callback: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit = js.native
  
  /**
    * Register a callback to fire whenever a test ends.
    *
    * @param callback Callback to execute
    */
  def testDone(callback: js.Function1[/* details */ Failed, Unit | js.Promise[Unit]]): Unit = js.native
  
  /**
    * Register a callback to fire whenever a test begins.
    *
    * @param callback Callback to execute
    */
  def testStart(callback: js.Function1[/* details */ TestStartDetails, Unit | js.Promise[Unit]]): Unit = js.native
  
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
  def todo(name: String): Unit = js.native
  def todo(name: String, callback: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit = js.native
  
  var urlParams: Record[String, Any] = js.native
  
  /**
    * QUnit version
    */
  var version: String = js.native
}
object QUnit extends Shortcut {
  
  @JSGlobal("QUnit")
  @js.native
  val ^ : QUnit = js.native
  
  trait AssertionTest
    extends StObject
       with TestBase
       with Test {
    
    var assert: Assert
  }
  object AssertionTest {
    
    inline def apply(
      assert: Assert,
      finish: () => Any,
      module: Module,
      pushFailure: (String, String, Any) => Unit,
      testId: String,
      testName: String
    ): AssertionTest = {
      val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), module = module.asInstanceOf[js.Any], pushFailure = js.Any.fromFunction3(pushFailure), testId = testId.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any], expected = null)
      __obj.asInstanceOf[AssertionTest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssertionTest] (val x: Self) extends AnyVal {
      
      inline def setAssert(value: Assert): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    }
  }
  
  trait BeginDetails extends StObject {
    
    /** List of registered modules, */
    var modules: js.Array[ModuleId]
    
    /** Number of registered tests */
    var totalTests: Double
  }
  object BeginDetails {
    
    inline def apply(modules: js.Array[ModuleId], totalTests: Double): BeginDetails = {
      val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], totalTests = totalTests.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeginDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeginDetails] (val x: Self) extends AnyVal {
      
      inline def setModules(value: js.Array[ModuleId]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesVarargs(value: ModuleId*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setTotalTests(value: Double): Self = StObject.set(x, "totalTests", value.asInstanceOf[js.Any])
    }
  }
  
  trait DoneDetails extends StObject {
    
    var failed: Double
    
    var passed: Double
    
    var runtime: Double
    
    var total: Double
  }
  object DoneDetails {
    
    inline def apply(failed: Double, passed: Double, runtime: Double, total: Double): DoneDetails = {
      val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[DoneDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DoneDetails] (val x: Self) extends AnyVal {
      
      inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setPassed(value: Double): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogDetails extends StObject {
    
    var actual: Any
    
    var expected: Any
    
    var message: String
    
    var module: String
    
    var name: String
    
    var result: Boolean
    
    var runtime: Double
    
    var source: String
  }
  object LogDetails {
    
    inline def apply(
      actual: Any,
      expected: Any,
      message: String,
      module: String,
      name: String,
      result: Boolean,
      runtime: Double,
      source: String
    ): LogDetails = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogDetails] (val x: Self) extends AnyVal {
      
      inline def setActual(value: Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setExpected(value: Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Module extends StObject {
    
    var name: String
  }
  object Module {
    
    inline def apply(name: String): Module = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleDoneDetails extends StObject {
    
    var failed: Double
    
    var name: String
    
    var passed: Double
    
    var runtime: Double
    
    var total: Double
  }
  object ModuleDoneDetails {
    
    inline def apply(failed: Double, name: String, passed: Double, runtime: Double, total: Double): ModuleDoneDetails = {
      val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleDoneDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleDoneDetails] (val x: Self) extends AnyVal {
      
      inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPassed(value: Double): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleStartDetails extends StObject {
    
    var name: String
  }
  object ModuleStartDetails {
    
    inline def apply(name: String): ModuleStartDetails = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleStartDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleStartDetails] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait SkipTest
    extends StObject
       with TestBase
       with Test {
    
    @JSName("async")
    var async_SkipTest: `false`
    
    @JSName("skip")
    var skip_SkipTest: `true`
  }
  object SkipTest {
    
    inline def apply(
      finish: () => Any,
      module: Module,
      pushFailure: (String, String, Any) => Unit,
      testId: String,
      testName: String
    ): SkipTest = {
      val __obj = js.Dynamic.literal(async = false, finish = js.Any.fromFunction0(finish), module = module.asInstanceOf[js.Any], pushFailure = js.Any.fromFunction3(pushFailure), skip = true, testId = testId.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any], expected = null)
      __obj.asInstanceOf[SkipTest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkipTest] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: `false`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: `true`): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.qunit.mod.global.QUnit.AssertionTest
    - typings.qunit.mod.global.QUnit.SkipTest
    - typings.qunit.mod.global.QUnit.TodoTest
  */
  trait Test extends StObject
  object Test {
    
    inline def AssertionTest(
      assert: Assert,
      finish: () => Any,
      module: Module,
      pushFailure: (String, String, Any) => Unit,
      testId: String,
      testName: String
    ): typings.qunit.mod.global.QUnit.AssertionTest = {
      val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), module = module.asInstanceOf[js.Any], pushFailure = js.Any.fromFunction3(pushFailure), testId = testId.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any], expected = null)
      __obj.asInstanceOf[typings.qunit.mod.global.QUnit.AssertionTest]
    }
    
    inline def SkipTest(
      finish: () => Any,
      module: Module,
      pushFailure: (String, String, Any) => Unit,
      testId: String,
      testName: String
    ): typings.qunit.mod.global.QUnit.SkipTest = {
      val __obj = js.Dynamic.literal(async = false, finish = js.Any.fromFunction0(finish), module = module.asInstanceOf[js.Any], pushFailure = js.Any.fromFunction3(pushFailure), skip = true, testId = testId.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any], expected = null)
      __obj.asInstanceOf[typings.qunit.mod.global.QUnit.SkipTest]
    }
    
    inline def TodoTest(
      assert: Assert,
      finish: () => Any,
      module: Module,
      pushFailure: (String, String, Any) => Unit,
      testId: String,
      testName: String
    ): typings.qunit.mod.global.QUnit.TodoTest = {
      val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), module = module.asInstanceOf[js.Any], pushFailure = js.Any.fromFunction3(pushFailure), testId = testId.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any], todo = true, expected = null)
      __obj.asInstanceOf[typings.qunit.mod.global.QUnit.TodoTest]
    }
  }
  
  trait TestBase extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var expected: Null | Double
    
    // steps: unknown[];
    // timeout: undefined;
    // data: unknown;
    // withData: boolean;
    // pauses: Map<string, unknown>;
    // nextPauseId: 1;
    // stackOffset: 0 | 1 | 2 | 3 | 5;
    // errorForStack: Error;
    // testReport: unknown;
    // stack: string;
    // before: () => unknown;
    // run: () => unknown;
    // after: () => void;
    // queueGlobalHook: (hook: unknown, hookName: unknown) => () => unknown;
    // queueHook: (
    //   hook: unknown,
    //   hookName: unknown,
    //   hookOwner: unknown
    // ) => () => unknown;
    // hooks: (handler: unknown) => unknown;
    def finish(): Any
    
    // assertions: Array<{ result: boolean; message: string }>;
    var module: Module
    
    // preserveTestEnvironment: () => unknown;
    // queue: () => void;
    // pushResult: (resultInfo: unknown) => void;
    def pushFailure(message: String, source: String, actual: Any): Unit
    
    var skip: js.UndefOr[`true`] = js.undefined
    
    var testId: String
    
    var testName: String
    
    // callback: ((assert: Assert) => void) | ((assert: Assert) => Promise<void>);
    var todo: js.UndefOr[Boolean] = js.undefined
  }
  object TestBase {
    
    inline def apply(
      finish: () => Any,
      module: Module,
      pushFailure: (String, String, Any) => Unit,
      testId: String,
      testName: String
    ): TestBase = {
      val __obj = js.Dynamic.literal(finish = js.Any.fromFunction0(finish), module = module.asInstanceOf[js.Any], pushFailure = js.Any.fromFunction3(pushFailure), testId = testId.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any], expected = null)
      __obj.asInstanceOf[TestBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestBase] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setExpected(value: Double): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedNull: Self = StObject.set(x, "expected", null)
      
      inline def setFinish(value: () => Any): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setPushFailure(value: (String, String, Any) => Unit): Self = StObject.set(x, "pushFailure", js.Any.fromFunction3(value))
      
      inline def setSkip(value: `true`): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
      
      inline def setTestName(value: String): Self = StObject.set(x, "testName", value.asInstanceOf[js.Any])
      
      inline def setTodo(value: Boolean): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
      
      inline def setTodoUndefined: Self = StObject.set(x, "todo", js.undefined)
    }
  }
  
  trait TestDoneDetails extends StObject {
    
    var failed: Double
    
    var module: String
    
    var name: String
    
    var passed: Double
    
    var runtime: Double
    
    var total: Double
  }
  object TestDoneDetails {
    
    inline def apply(failed: Double, module: String, name: String, passed: Double, runtime: Double, total: Double): TestDoneDetails = {
      val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestDoneDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestDoneDetails] (val x: Self) extends AnyVal {
      
      inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPassed(value: Double): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestStartDetails extends StObject {
    
    var module: String
    
    var name: String
  }
  object TestStartDetails {
    
    inline def apply(module: String, name: String): TestStartDetails = {
      val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestStartDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestStartDetails] (val x: Self) extends AnyVal {
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TodoTest
    extends StObject
       with TestBase
       with Test {
    
    var assert: Assert
    
    @JSName("todo")
    var todo_TodoTest: `true`
  }
  object TodoTest {
    
    inline def apply(
      assert: Assert,
      finish: () => Any,
      module: Module,
      pushFailure: (String, String, Any) => Unit,
      testId: String,
      testName: String
    ): TodoTest = {
      val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), module = module.asInstanceOf[js.Any], pushFailure = js.Any.fromFunction3(pushFailure), testId = testId.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any], todo = true, expected = null)
      __obj.asInstanceOf[TodoTest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TodoTest] (val x: Self) extends AnyVal {
      
      inline def setAssert(value: Assert): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
      
      inline def setTodo(value: `true`): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = QUnit
  
  /* This means you don't have to write `^`, but can instead just say `QUnit.foo` */
  override def _to: QUnit = ^
}
