package typings.qunit

import org.scalablytyped.runtime.Shortcut
import typings.qunit.anon.Actual
import typings.qunit.anon.Failed
import typings.qunit.anon.Id
import typings.qunit.anon.MaxDepth
import typings.qunit.mod.global.QUnit
import typings.qunit.mod.global.QUnit.BeginDetails
import typings.qunit.mod.global.QUnit.DoneDetails
import typings.qunit.mod.global.QUnit.LogDetails
import typings.qunit.mod.global.QUnit.ModuleDoneDetails
import typings.qunit.mod.global.QUnit.ModuleStartDetails
import typings.qunit.mod.global.QUnit.TestStartDetails
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("qunit", JSImport.Namespace)
  @js.native
  val ^ : QUnit = js.native
  
  object global {
    
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
        * @callback callback Callback to execute.
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
      def extend(target: js.Any, mixin: js.Any): Unit = js.native
      
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
      var module_Original: moduleFunc1 & moduleFunc2 & ModuleOnly = js.native
      
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
      def push(result: Boolean, actual: js.Any, expected: js.Any, message: String): Unit = js.native
      
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
      
      /**
        * QUnit version
        */
      var version: String = js.native
    }
    object QUnit extends Shortcut {
      
      @JSGlobal("QUnit")
      @js.native
      val ^ : QUnit = js.native
      
      trait BeginDetails extends StObject {
        
        var totalTests: Double
      }
      object BeginDetails {
        
        @scala.inline
        def apply(totalTests: Double): BeginDetails = {
          val __obj = js.Dynamic.literal(totalTests = totalTests.asInstanceOf[js.Any])
          __obj.asInstanceOf[BeginDetails]
        }
        
        @scala.inline
        implicit class BeginDetailsMutableBuilder[Self <: BeginDetails] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setTotalTests(value: Double): Self = StObject.set(x, "totalTests", value.asInstanceOf[js.Any])
        }
      }
      
      trait DoneDetails extends StObject {
        
        var failed: Double
        
        var passed: Double
        
        var runtime: Double
        
        var total: Double
      }
      object DoneDetails {
        
        @scala.inline
        def apply(failed: Double, passed: Double, runtime: Double, total: Double): DoneDetails = {
          val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
          __obj.asInstanceOf[DoneDetails]
        }
        
        @scala.inline
        implicit class DoneDetailsMutableBuilder[Self <: DoneDetails] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPassed(value: Double): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
        }
      }
      
      trait LogDetails extends StObject {
        
        var actual: js.Any
        
        var expected: js.Any
        
        var message: String
        
        var module: String
        
        var name: String
        
        var result: Boolean
        
        var runtime: Double
        
        var source: String
      }
      object LogDetails {
        
        @scala.inline
        def apply(
          actual: js.Any,
          expected: js.Any,
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
        implicit class LogDetailsMutableBuilder[Self <: LogDetails] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExpected(value: js.Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
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
        
        @scala.inline
        def apply(failed: Double, name: String, passed: Double, runtime: Double, total: Double): ModuleDoneDetails = {
          val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
          __obj.asInstanceOf[ModuleDoneDetails]
        }
        
        @scala.inline
        implicit class ModuleDoneDetailsMutableBuilder[Self <: ModuleDoneDetails] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPassed(value: Double): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
        }
      }
      
      trait ModuleStartDetails extends StObject {
        
        var name: String
      }
      object ModuleStartDetails {
        
        @scala.inline
        def apply(name: String): ModuleStartDetails = {
          val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
          __obj.asInstanceOf[ModuleStartDetails]
        }
        
        @scala.inline
        implicit class ModuleStartDetailsMutableBuilder[Self <: ModuleStartDetails] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
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
        
        @scala.inline
        def apply(failed: Double, module: String, name: String, passed: Double, runtime: Double, total: Double): TestDoneDetails = {
          val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
          __obj.asInstanceOf[TestDoneDetails]
        }
        
        @scala.inline
        implicit class TestDoneDetailsMutableBuilder[Self <: TestDoneDetails] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPassed(value: Double): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
        }
      }
      
      trait TestStartDetails extends StObject {
        
        var module: String
        
        var name: String
      }
      object TestStartDetails {
        
        @scala.inline
        def apply(module: String, name: String): TestStartDetails = {
          val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
          __obj.asInstanceOf[TestStartDetails]
        }
        
        @scala.inline
        implicit class TestStartDetailsMutableBuilder[Self <: TestStartDetails] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        }
      }
      
      type _To = QUnit
      
      /* This means you don't have to write `^`, but can instead just say `QUnit.foo` */
      override def _to: QUnit = ^
    }
    
    @js.native
    trait Assert extends StObject {
      
      /**
        * Instruct QUnit to wait for an asynchronous operation.
        *
        * The callback returned from `assert.async()` will throw an Error if it is
        * invoked more than once (or more often than the accepted call count, if
        * provided).
        *
        * This replaces functionality previously provided by `QUnit.stop()` and
        * `QUnit.start()`.
        *
        * @param {number} [acceptCallCount=1] Number of expected callbacks before the test is done.
        */
      def async(): js.Function0[Unit] = js.native
      def async(acceptCallCount: Double): js.Function0[Unit] = js.native
      
      /**
        * A deep recursive comparison, working on primitive types, arrays, objects,
        * regular expressions, dates and functions.
        *
        * The `deepEqual()` assertion can be used just like `equal()` when comparing
        * the value of objects, such that `{ key: value }` is equal to
        * `{ key: value }`. For non-scalar values, identity will be disregarded by
        * deepEqual.
        *
        * `notDeepEqual()` can be used to explicitly test deep, strict inequality.
        *
        * @param actual Object or Expression being tested
        * @param expected Known comparision value
        * @param {string} [message] A short description of the assertion
        */
      def deepEqual[T](actual: T, expected: T): Unit = js.native
      def deepEqual[T](actual: T, expected: T, message: String): Unit = js.native
      
      /**
        * A non-strict comparison, roughly equivalent to JUnit's assertEquals.
        *
        * The `equal` assertion uses the simple comparison operator (`==`) to
        * compare the actual and expected arguments. When they are equal, the
        * assertion passes; otherwise, it fails. When it fails, both actual and
        * expected values are displayed in the test result, in addition to a given
        * message.
        *
        *  `notEqual()` can be used to explicitly test inequality.
        *
        * `strictEqual()` can be used to test strict equality.
        *
        * @param actual Expression being tested
        * @param expected Known comparison value
        * @param {string} [message] A short description of the assertion
        */
      def equal(actual: js.Any, expected: js.Any): Unit = js.native
      def equal(actual: js.Any, expected: js.Any, message: String): Unit = js.native
      
      /**
        * Specify how many assertions are expected to run within a test.
        *
        * To ensure that an explicit number of assertions are run within any test,
        * use `assert.expect( number )` to register an expected count. If the
        * number of assertions run does not match the expected count, the test will
        * fail.
        *
        * @param {number} amount Number of assertions in this test.
        */
      def expect(amount: Double): Unit = js.native
      
      /**
        * An inverted deep recursive comparison, working on primitive types,
        * arrays, objects, regular expressions, dates and functions.
        *
        * @param actual Object or Expression being tested
        * @param expected Known comparison value
        * @param {string} [message] A short description of the assertion
        */
      def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
      def notDeepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
      
      /**
        * A non-strict comparison, checking for inequality.
        *
        * The `notEqual` assertion uses the simple inverted comparison operator
        * (`!=`) to compare the actual and expected arguments. When they aren't
        * equal, the assertion passes; otherwise, it fails. When it fails, both
        * actual and expected values are displayed in the test result, in addition
        * to a given message.
        *
        * `equal()` can be used to test equality.
        *
        * `notStrictEqual()` can be used to test strict inequality.
        *
        * @param actual Object or Expression being tested
        * @param expected Known comparison value
        * @param {string} [message] A short description of the assertion
        */
      def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
      def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
      
      /**
        * A boolean check, inverse of `ok()` and CommonJS's `assert.ok()`, and
        * equivalent to JUnit's `assertFalse()`. Passes if the first argument is
        * falsy.
        *
        * `notOk()` requires just one argument. If the argument evaluates to false,
        * the assertion passes; otherwise, it fails. If a second message argument
        * is provided, it will be displayed in place of the result.
        *
        * @param state Expression being tested
        * @param {string} [message] A short description of the assertion
        */
      def notOk(state: js.Any): Unit = js.native
      def notOk(state: js.Any, message: String): Unit = js.native
      
      /**
        * A strict comparison of an object's own properties, checking for inequality.
        *
        * The `notPropEqual` assertion uses the strict inverted comparison operator
        * (`!==`) to compare the actual and expected arguments as Objects regarding
        * only their properties but not their constructors.
        *
        * When they aren't equal, the assertion passes; otherwise, it fails. When
        * it fails, both actual and expected values are displayed in the test
        * result, in addition to a given message.
        *
        * `equal()` can be used to test equality.
        *
        * `propEqual()` can be used to test strict equality of an Object properties.
        *
        * @param actual Object or Expression being tested
        * @param expected Known comparison value
        * @param {string} [message] A short description of the assertion
        */
      def notPropEqual(actual: js.Any, expected: js.Any): Unit = js.native
      def notPropEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
      
      /**
        * A strict comparison, checking for inequality.
        *
        * The `notStrictEqual` assertion uses the strict inverted comparison
        * operator (`!==`) to compare the actual and expected arguments. When they
        * aren't equal, the assertion passes; otherwise, it fails. When it fails,
        * both actual and expected values are displayed in the test result, in
        * addition to a given message.
        *
        * `equal()` can be used to test equality.
        *
        * `strictEqual()` can be used to test strict equality.
        *
        * @param actual Object or Expression being tested
        * @param expected Known comparison value
        * @param {string} [message] A short description of the assertion
        */
      def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
      def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
      
      /**
        * A boolean check, equivalent to CommonJS's assert.ok() and JUnit's
        * assertTrue(). Passes if the first argument is truthy.
        *
        * The most basic assertion in QUnit, ok() requires just one argument. If
        * the argument evaluates to true, the assertion passes; otherwise, it
        * fails. If a second message argument is provided, it will be displayed in
        * place of the result.
        *
        * @param state Expression being tested
        * @param {string} message A short description of the assertion
        */
      def ok(state: js.Any): Unit = js.native
      def ok(state: js.Any, message: String): Unit = js.native
      
      /**
        * A strict type and value comparison of an object's own properties.
        *
        * The `propEqual()` assertion provides strictly (`===`) comparison of
        * Object properties. Unlike `deepEqual()`, this assertion can be used to
        * compare two objects made with different constructors and prototype.
        *
        * `strictEqual()` can be used to test strict equality.
        *
        * `notPropEqual()` can be used to explicitly test strict inequality of
        * Object properties.
        *
        * @param actual Object or Expression being tested
        * @param expected Known comparison value
        * @param {string} [message] A short description of the assertion
        */
      def propEqual(actual: js.Any, expected: js.Any): Unit = js.native
      def propEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
      
      /**
        * Report the result of a custom assertion
        *
        * Some test suites may need to express an expectation that is not defined
        * by any of QUnit's built-in assertions. This need may be met by
        * encapsulating the expectation in a JavaScript function which returns a
        * `Boolean` value representing the result; this value can then be passed
        * into QUnit's `ok` assertion.
        *
        * A more readable solution would involve defining a custom assertion. If
        * the expectation function invokes `pushResult`, QUnit will be notified of
        * the result and report it accordingly.
        *
        * @param assertionResult The assertion result
        */
      def pushResult(assertResult: Actual): Unit = js.native
      
      def raises(block: js.Function0[Unit]): Unit = js.native
      def raises(block: js.Function0[Unit], expected: js.Any): Unit = js.native
      def raises(block: js.Function0[Unit], expected: js.Any, message: js.Any): Unit = js.native
      def raises(block: js.Function0[Unit], expected: Unit, message: js.Any): Unit = js.native
      
      /**
        * Test if the provided promise rejects, and optionally compare the
        * rejection value.
        *
        * When testing code that is expected to return a rejected promise based on
        * a specific set of circumstances, use assert.rejects() for testing and
        * comparison.
        *
        * The expectedMatcher argument can be:
        *      A function that returns true when the assertion should be considered passing.
        *      An Error object
        *      A base constructor to use ala rejectionValue instanceof expectedMatcher
        *      A RegExp that matches (or partially matches) rejectionValue.toString()
        *
        * Note: in order to avoid confusion between the message and the expectedMatcher,
        * the expectedMatcher can not be a string.
        *
        * @param promise promise to test for rejection
        * @param expectedMatcher Rejection value matcher
        * @param message A short description of the assertion
        */
      def rejects(promise: js.Promise[js.Any]): js.Promise[Unit] = js.native
      def rejects(promise: js.Promise[js.Any], expectedMatcher: js.Any): js.Promise[Unit] = js.native
      def rejects(promise: js.Promise[js.Any], expectedMatcher: js.Any, message: String): js.Promise[Unit] = js.native
      def rejects(promise: js.Promise[js.Any], expectedMatcher: Unit, message: String): js.Promise[Unit] = js.native
      def rejects(promise: js.Promise[js.Any], message: String): js.Promise[Unit] = js.native
      
      /**
        * A marker for progress in a given test.
        *
        * The `step()` assertion registers a passing assertion with a provided message. This makes
        * it easy to check that specific portions of code are being executed, especially in
        * asynchronous test cases and when used with `verifySteps()`.
        *
        * Together with the `verifySteps()` method, `step()` assertions give you an easy way
        * to verify both the count and order of code execution.
        *
        * @param message Message to display for the step
        */
      def step(message: String): Unit = js.native
      
      /**
        * A strict type and value comparison.
        *
        * The `strictEqual()` assertion provides the most rigid comparison of type
        * and value with the strict equality operator (`===`).
        *
        * `equal()` can be used to test non-strict equality.
        *
        * `notStrictEqual()` can be used to explicitly test strict inequality.
        *
        * @param actual Object or Expression being tested
        * @param expected Known comparison value
        * @param {string} [message] A short description of the assertion
        */
      def strictEqual[T](actual: T, expected: T): Unit = js.native
      def strictEqual[T](actual: T, expected: T, message: String): Unit = js.native
      
      /**
        * Test if a callback throws an exception, and optionally compare the thrown
        * error.
        *
        * When testing code that is expected to throw an exception based on a
        * specific set of circumstances, use assert.throws() to catch the error
        * object for testing and comparison.
        *
        * In very few environments, like Closure Compiler, throws is considered a
        * reserved word and will cause an error. For that case, an alias is bundled
        * called `raises`. It has the same signature and behaviour, just a
        * different name.
        */
      def throws(block: js.Function0[Unit]): Unit = js.native
      def throws(block: js.Function0[Unit], expected: js.Any): Unit = js.native
      def throws(block: js.Function0[Unit], expected: js.Any, message: js.Any): Unit = js.native
      def throws(block: js.Function0[Unit], expected: Unit, message: js.Any): Unit = js.native
      
      /**
        * A helper assertion to verify the order and number of steps in a test.
        *
        * The assert.verifySteps() assertion compares a given array of string values (representing steps)
        * with the order and values of previous step() calls. This assertion is helpful for verifying
        * the order and count of portions of code paths, especially asynchronous ones.
        *
        * @param steps Array of strings representing steps to verify
        * @param message A short description of the assertion
        */
      def verifySteps(steps: js.Array[String]): Unit = js.native
      def verifySteps(steps: js.Array[String], message: String): Unit = js.native
    }
    
    trait Config extends StObject {
      
      var altertitle: Boolean
      
      var autostart: Boolean
      
      var collapse: Boolean
      
      var current: js.Any
      
      var filter: String | RegExp
      
      var fixture: String
      
      var hidepassed: Boolean
      
      var maxDepth: Double
      
      var module: String
      
      var moduleId: js.Array[String]
      
      var noglobals: Boolean
      
      var notrycatch: Boolean
      
      var reorder: Boolean
      
      var requireExpects: Boolean
      
      var scrolltop: Boolean
      
      var seed: String
      
      var testId: js.Array[String]
      
      var testTimeout: Double
      
      var urlConfig: js.Array[Id]
    }
    object Config {
      
      @scala.inline
      def apply(
        altertitle: Boolean,
        autostart: Boolean,
        collapse: Boolean,
        current: js.Any,
        filter: String | RegExp,
        fixture: String,
        hidepassed: Boolean,
        maxDepth: Double,
        module: String,
        moduleId: js.Array[String],
        noglobals: Boolean,
        notrycatch: Boolean,
        reorder: Boolean,
        requireExpects: Boolean,
        scrolltop: Boolean,
        seed: String,
        testId: js.Array[String],
        testTimeout: Double,
        urlConfig: js.Array[Id]
      ): Config = {
        val __obj = js.Dynamic.literal(altertitle = altertitle.asInstanceOf[js.Any], autostart = autostart.asInstanceOf[js.Any], collapse = collapse.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], fixture = fixture.asInstanceOf[js.Any], hidepassed = hidepassed.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], noglobals = noglobals.asInstanceOf[js.Any], notrycatch = notrycatch.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any], requireExpects = requireExpects.asInstanceOf[js.Any], scrolltop = scrolltop.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], urlConfig = urlConfig.asInstanceOf[js.Any])
        __obj.asInstanceOf[Config]
      }
      
      @scala.inline
      implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAltertitle(value: Boolean): Self = StObject.set(x, "altertitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrent(value: js.Any): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilter(value: String | RegExp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFixture(value: String): Self = StObject.set(x, "fixture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHidepassed(value: Boolean): Self = StObject.set(x, "hidepassed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModuleId(value: js.Array[String]): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModuleIdVarargs(value: String*): Self = StObject.set(x, "moduleId", js.Array(value :_*))
        
        @scala.inline
        def setNoglobals(value: Boolean): Self = StObject.set(x, "noglobals", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotrycatch(value: Boolean): Self = StObject.set(x, "notrycatch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReorder(value: Boolean): Self = StObject.set(x, "reorder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequireExpects(value: Boolean): Self = StObject.set(x, "requireExpects", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrolltop(value: Boolean): Self = StObject.set(x, "scrolltop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTestId(value: js.Array[String]): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTestIdVarargs(value: String*): Self = StObject.set(x, "testId", js.Array(value :_*))
        
        @scala.inline
        def setTestTimeout(value: Double): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlConfig(value: js.Array[Id]): Self = StObject.set(x, "urlConfig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlConfigVarargs(value: Id*): Self = StObject.set(x, "urlConfig", js.Array(value :_*))
      }
    }
    
    trait Hooks extends StObject {
      
      /**
        * Runs after the last test. If additional tests are defined after the
        * module's queue has emptied, it will not run this hook again.
        */
      var after: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.undefined
      
      /**
        * Runs after each test.
        */
      var afterEach: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.undefined
      
      /**
        * Runs before the first test.
        */
      var before: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.undefined
      
      /**
        * Runs before each test.
        */
      var beforeEach: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.undefined
    }
    object Hooks {
      
      @scala.inline
      def apply(): Hooks = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Hooks]
      }
      
      @scala.inline
      implicit class HooksMutableBuilder[Self <: Hooks] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAfter(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAfterEach(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = StObject.set(x, "afterEach", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAfterEachUndefined: Self = StObject.set(x, "afterEach", js.undefined)
        
        @scala.inline
        def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
        
        @scala.inline
        def setBefore(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
        
        @scala.inline
        def setBeforeEach(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1(value))
        
        @scala.inline
        def setBeforeEachUndefined: Self = StObject.set(x, "beforeEach", js.undefined)
        
        @scala.inline
        def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      }
    }
    
    trait ModuleOnly extends StObject {
      
      def only(name: String): Unit
      def only(name: String, hooks: Unit, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit
      def only(name: String, hooks: Hooks): Unit
      def only(name: String, hooks: Hooks, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit
      def only(name: String, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit
      @JSName("only")
      var only_Original: moduleFunc1 & moduleFunc2
    }
    object ModuleOnly {
      
      @scala.inline
      def apply(only: moduleFunc1 & moduleFunc2): ModuleOnly = {
        val __obj = js.Dynamic.literal(only = only.asInstanceOf[js.Any])
        __obj.asInstanceOf[ModuleOnly]
      }
      
      @scala.inline
      implicit class ModuleOnlyMutableBuilder[Self <: ModuleOnly] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnly(value: moduleFunc1 & moduleFunc2): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      }
    }
    
    trait NestedHooks extends StObject {
      
      /**
        * Runs after the last test. If additional tests are defined after the
        * module's queue has emptied, it will not run this hook again.
        */
      def after(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
      
      /**
        * Runs after each test.
        */
      def afterEach(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
      
      /**
        * Runs before the first test.
        */
      def before(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
      
      /**
        * Runs before each test.
        */
      def beforeEach(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
    }
    object NestedHooks {
      
      @scala.inline
      def apply(
        after: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit,
        afterEach: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit,
        before: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit,
        beforeEach: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit
      ): NestedHooks = {
        val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), afterEach = js.Any.fromFunction1(afterEach), before = js.Any.fromFunction1(before), beforeEach = js.Any.fromFunction1(beforeEach))
        __obj.asInstanceOf[NestedHooks]
      }
      
      @scala.inline
      implicit class NestedHooksMutableBuilder[Self <: NestedHooks] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAfter(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAfterEach(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit): Self = StObject.set(x, "afterEach", js.Any.fromFunction1(value))
        
        @scala.inline
        def setBefore(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
        
        @scala.inline
        def setBeforeEach(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1(value))
      }
    }
    
    type moduleFunc1 = js.Function3[
        /* name */ String, 
        /* hooks */ js.UndefOr[Hooks], 
        /* nested */ js.UndefOr[js.Function1[/* hooks */ NestedHooks, Unit]], 
        Unit
      ]
    
    type moduleFunc2 = js.Function2[
        /* name */ String, 
        /* nested */ js.UndefOr[js.Function1[/* hooks */ NestedHooks, Unit]], 
        Unit
      ]
  }
  
  type _To = QUnit
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: QUnit = ^
}
