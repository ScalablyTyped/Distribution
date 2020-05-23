package typings.qunit

import typings.qunit.anon.Actual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assert extends js.Object {
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
  def rejects(promise: js.Promise[_]): js.Promise[Unit] = js.native
  def rejects(promise: js.Promise[_], expectedMatcher: js.Any): js.Promise[Unit] = js.native
  def rejects(promise: js.Promise[_], expectedMatcher: js.Any, message: String): js.Promise[Unit] = js.native
  def rejects(promise: js.Promise[_], message: String): js.Promise[Unit] = js.native
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

