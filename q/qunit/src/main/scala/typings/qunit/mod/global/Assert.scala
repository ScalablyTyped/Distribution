package typings.qunit.mod.global

import typings.qunit.anon.Actual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assert extends StObject {
  
  /**
    * Instruct QUnit to wait for an asynchronous operation.
    *
    * `assert.async()` returns a callback function and pauses test processing until the
    * callback function is called. The callback will throw an `Error` if it is invoked more
    * often than the required call count.
    *
    * @param {number} [count=1] Number of expected calls
    */
  def async(): js.Function0[Unit] = js.native
  def async(count: Double): js.Function0[Unit] = js.native
  
  /**
    * A recursive and strict comparison, considering all own and inherited properties.
    *
    * For primitive values, a strict comparison is used. For objects, the object identity is
    * disregarded and instead a recursive comparison of all own and inherited properties is
    * performed. This means arrays, plain objects, and arbitrary class instance objects can
    * all be compared in this way.
    *
    * The deep comparison includes built-in support for Date objects, regular expressions,
    * NaN, as well as ES6 features such as Symbol, Set, and Map objects.
    *
    * To assert strict equality on own properties only, refer to `assert.propEqual()`.
    *
    * @param actual Expression being tested
    * @param expected Known comparision value
    * @param {string} [message] Short description of the actual expression
    */
  def deepEqual[T](actual: T, expected: T): Unit = js.native
  def deepEqual[T](actual: T, expected: T, message: String): Unit = js.native
  
  /**
    * A non-strict comparison of two values.
    *
    * The `equal` assertion uses the simple comparison operator (`==`) to compare the actual
    * and expected arguments. When they are equal, the assertion passes; otherwise, it fails.
    *
    * When it fails, both actual and expected values are displayed in the test result, in
    * addition to a given message.
    *
    * To test for strict equality, use `assert.strictEqual()`.
    *
    * @param actual Expression being tested
    * @param expected Known comparison value
    * @param {string} [message] Short description of the actual expression
    */
  def equal(actual: Any, expected: Any): Unit = js.native
  def equal(actual: Any, expected: Any, message: String): Unit = js.native
  
  /**
    * Specify how many assertions are expected in a test.
    *
    * This is most commonly used as `assert.expect(0)`, which indicates that a test may pass
    * without making any assertions. This means the test is only used to verify that the code
    * runs to completion, without any uncaught errors. This is is essentially the inverse of
    * `assert.throws()`.
    *
    * This can also be used to explicitly require a certain number of assertions to be
    * recorded in a given test. If afterwards the number of assertions does not match the
    * expected count, the test will fail.
    *
    * It is recommended to test asynchronous code with `assert.step()` or `assert.async()`
    * instead.
    *
    * @param {number} amount Number of expected assertions in this test
    */
  def expect(amount: Double): Unit = js.native
  
  /**
    * A strict comparison that passes if the first argument is boolean `false`.
    *
    * If the argument evaluates to false, the assertion passes; otherwise, it fails.
    *
    * @param state Expression being tested
    * @param {string} [message] Short description
    */
  def `false`(state: Any): Unit = js.native
  def `false`(state: Any, message: String): Unit = js.native
  
  /**
    * An inverted deep equal comparison.
    *
    * This assertion fails if the actual and expected values are recursively equal by strict
    * comparison, considering both own and inherited properties.
    *
    * The assertion passes if there are structural differences, type differences, or even a
    * subtle difference in a particular property value.
    *
    * This is the inverse of `assert.deepEqual()`.
    *
    * @param actual Expression being tested
    * @param expected Known comparison value
    * @param {string} [message] Short description
    */
  def notDeepEqual(actual: Any, expected: Any): Unit = js.native
  def notDeepEqual(actual: Any, expected: Any, message: String): Unit = js.native
  
  /**
    * A loose inequality comparison, checking for non-strict differences between two values.
    *
    * The `notEqual` assertion uses the simple inverted comparison operator (`!=`) to compare
    * the actual and expected values. When they aren't equal, the assertion passes;
    * otherwise, it fails. When it fails, both actual and expected values are displayed in
    * the test result, in addition to a given message.
    *
    * @param actual Expression being tested
    * @param expected Known comparison value
    * @param {string} [message] Short description
    */
  def notEqual(actual: Any, expected: Any): Unit = js.native
  def notEqual(actual: Any, expected: Any, message: String): Unit = js.native
  
  /**
    * A boolean check that passes when the first argument is falsy.
    *
    * If the argument evaluates to false, the assertion passes; otherwise, it fails.
    *
    * To strictly compare against boolean false, use `assert.false()`.
    *
    * @param state Expression being tested
    * @param {string} [message] Short description
    */
  def notOk(state: Any): Unit = js.native
  def notOk(state: Any, message: String): Unit = js.native
  
  /**
    * Check that an object does not contain certain properties.
    *
    * The `notPropContains` assertion compares the subset of properties
    * in the expected object, and tests that these keys are either absent
    * or hold a value that is different according to a strict equality comparison.
    *
    * This method is recursive and allows partial comparison of nested objects as well.
    *
    * @param actual Expression being tested
    * @param expected Known comparison value
    * @param {string} [message] Short description
    */
  def notPropContains(actual: Any, expected: Any): Unit = js.native
  def notPropContains(actual: Any, expected: Any, message: String): Unit = js.native
  
  /**
    * Compare an object's own properties using a strict inequality comparison.
    *
    * The `notPropEqual` assertion compares only an object's own properties,
    * using the strict inquality operator (`!==`).
    *
    * The test passes if there are properties with different values, or extra properties
    * or missing properties.
    *
    * @param actual Expression being tested
    * @param expected Known comparison value
    * @param {string} [message] Short description
    */
  def notPropEqual(actual: Any, expected: Any): Unit = js.native
  def notPropEqual(actual: Any, expected: Any, message: String): Unit = js.native
  
  /**
    * A strict comparison, checking for inequality.
    *
    * The `notStrictEqual` assertion uses the strict inverted comparison
    * operator (`!==`) to compare the actual and expected arguments. When they
    * aren't equal, the assertion passes; otherwise, it fails. When it fails,
    * both actual and expected values are displayed in the test result, in
    * addition to a given message.
    *
    * `assert.equal()` can be used to test equality.
    *
    * `assert.strictEqual()` can be used to test strict equality.
    *
    * @param actual Expression being tested
    * @param expected Known comparison value
    * @param {string} [message] Short description
    */
  def notStrictEqual(actual: Any, expected: Any): Unit = js.native
  def notStrictEqual(actual: Any, expected: Any, message: String): Unit = js.native
  
  /**
    * A boolean check that passes when the first argument is truthy.
    *
    * If the argument evaluates to true, the assertion passes; otherwise, it fails.
    *
    * To strictly compare against boolean true, use `assert.true()`.
    *
    * @param state Expression being tested
    * @param {string} [message] Short description
    */
  def ok(state: Any): Unit = js.native
  def ok(state: Any, message: String): Unit = js.native
  
  /**
    * Check that an object contains certain properties.
    *
    * The `propContains` assertion compares only the subset of properties
    * in the expected object, and tests that these keys exist as own properties
    * with strictly equal values.
    *
    * This method is recursive and allows partial comparison of nested objects as well.
    *
    * Use `assert.propEqual()` to compare all properties.
    * Use `assert.notPropContains()` to test for the absence or inequality of properties.
    *
    * @param actual Expression being tested
    * @param expected Known comparison value
    * @param {string} [message] Short description of the actual expression
    */
  def propContains(actual: Any, expected: Any): Unit = js.native
  def propContains(actual: Any, expected: Any, message: String): Unit = js.native
  
  /**
    * Compare an object's own properties using a strict comparison.
    *
    * The `propEqual` assertion only compares an object's own properties. This means the
    * expected value does not need to be an instance of the same class or otherwise inherit
    * the same prototype. This is in contrast with `assert.deepEqual()`.
    *
    * This assertion fails if the values differ, or if there are extra properties, or if
    * some properties are missing.
    *
    * This method is recursive and can compare any nested or complex object via a plain object.
    *
    * Use `assert.propContains()` to only check a subset of properties.
    *
    * @param actual Expression being tested
    * @param expected Known comparison value
    * @param {string} [message] Short description of the actual expression
    */
  def propEqual(actual: Any, expected: Any): Unit = js.native
  def propEqual(actual: Any, expected: Any, message: String): Unit = js.native
  
  /**
    * Report the result of a custom assertion.
    *
    * If you need to express an expectation that is not abstracted by a built-in assertion,
    * you can perform your own logic ad-hoc in an expression, and then pass two directly
    * comparable values top `assert.strictEqual()` or `assert.true()`.
    *
    * If you opt to create your own assertion method instead, use `pushResult` to
    * save the result.
    *
    * Example:
    *
    * ```
    * QUnit.assert.between = function (actual, from, to, message) {
    *   const isBetween = (actual >= from && actual <= to);
    *
    *   this.pushResult({
    *     result: isBetween,
    *     actual: actual,
    *     expected: `between ${from} and ${to} inclusive`,
    *     message: message
    *   });
    * };
    * ```
    *
    * @param assertionResult The assertion result
    */
  def pushResult(assertResult: Actual): Unit = js.native
  
  def raises(block: js.Function0[Unit]): Unit = js.native
  def raises(block: js.Function0[Unit], expected: Any): Unit = js.native
  def raises(block: js.Function0[Unit], expected: Any, message: Any): Unit = js.native
  def raises(block: js.Function0[Unit], expected: Unit, message: Any): Unit = js.native
  
  /**
    * Test if the provided promise rejects, and optionally compare the rejection value.
    *
    * When testing code that is expected to return a rejected promise based on a
    * specific set of circumstances, use `assert.rejects()` for testing and comparison.
    *
    * The expectedMatcher argument can be:
    *      A function that returns true when the assertion should be considered passing.
    *      An Error object.
    *      A base constructor to use ala rejectionValue instanceof expectedMatcher.
    *      A RegExp that matches (or partially matches) rejectionValue.toString().
    *
    * Note: in order to avoid confusion between the message and the expectedMatcher,
    * the expectedMatcher can not be a string.
    *
    * @param promise Promise to test for rejection
    * @param expectedMatcher Rejection value matcher
    * @param message Short description of the assertion
    */
  def rejects(promise: js.Promise[Any]): js.Promise[Unit] = js.native
  def rejects(promise: js.Promise[Any], expectedMatcher: Any): js.Promise[Unit] = js.native
  def rejects(promise: js.Promise[Any], expectedMatcher: Any, message: String): js.Promise[Unit] = js.native
  def rejects(promise: js.Promise[Any], expectedMatcher: Unit, message: String): js.Promise[Unit] = js.native
  def rejects(promise: js.Promise[Any], message: String): js.Promise[Unit] = js.native
  
  /**
    * Record a step for later verification.
    *
    * This assertion registers a passing assertion with the provided string. This and any
    * other steps should be verified later in the test via `assert.verifySteps()`.
    *
    * @param value Relevant string value, or short description, to mark this step.
    */
  def step(value: String): Unit = js.native
  
  /**
    * A strict type and value comparison.
    *
    * The `strictEqual()` assertion provides the most rigid comparison of type
    * and value with the strict equality operator (`===`).
    *
    * `assert.equal()` can be used to test non-strict equality.
    *
    * @param actual Expression being tested
    * @param expected Known comparison value
    * @param {string} [message] Short description of the assertion
    */
  def strictEqual[T](actual: T, expected: T): Unit = js.native
  def strictEqual[T](actual: T, expected: T, message: String): Unit = js.native
  
  /**
    * Test if a callback throws an exception, and optionally compare the thrown error.
    *
    * When testing code that is expected to throw an exception based on a
    * specific set of circumstances, use `assert.throws()` to catch the error
    * object for testing and comparison.
    *
    * The expectedMatcher argument can be:
    *      An Error object.
    *      An Error constructor to use ala `errorValue instanceof expectedMatcher`.
    *      A RegExp that matches (or partially matches) the string representation.
    *      A callback Function that must return `true` to pass the assertion check.
    */
  def throws(block: js.Function0[Unit]): Unit = js.native
  def throws(block: js.Function0[Unit], expected: Any): Unit = js.native
  def throws(block: js.Function0[Unit], expected: Any, message: Any): Unit = js.native
  def throws(block: js.Function0[Unit], expected: Unit, message: Any): Unit = js.native
  
  /**
    * Set how long to wait for async operations to finish.
    *
    * This assertion defines how long to wait (at most) in the current test. It overrides QUnit.config.testTimeout on a per-test basis.
    *
    * The timeout length only applies when a test actually involves asynchronous functions or promises. If 0 is passed, then awaiting or returning any Promise may fail the test.
    *
    * If assert.timeout() is called after a different timeout is already set, the old timeout will be cleared and the new duration will be used to start a new timer.
    *
    * @param duration The length of time to wait, in milleseconds.
    */
  def timeout(duration: Double): Unit = js.native
  
  /**
    * A strict comparison that passes if the first argument is boolean `true`.
    *
    * If the argument evaluates to true, the assertion passes; otherwise, it fails.
    *
    * @param state Expression being tested
    * @param {string} [message] Short description of the actual expression
    */
  def `true`(state: Any): Unit = js.native
  def `true`(state: Any, message: String): Unit = js.native
  
  /**
    * Verify the presence and exact order of previously marked steps in a test.
    *
    * The Step API provides an easy way to verify execution logic to a high degree of
    * accuracy and precision, whether for asynchronous code, event-driven code, or
    * callback-driven code.
    *
    * For example, you can mark steps to observe and validate whether parts of your code are
    * reached correctly, or to check the frequency (how often) an asynchronous code path is
    * executed. You can also capture any unexpected steps, which are automatically detected
    * and shown as part of the test failure.
    *
    * This assertion compares a given array of string values to a list of previously recorded
    * steps, as marked via previous calls to `assert.step()`.
    *
    * @param steps List of strings
    * @param message Short description of the assertion
    */
  def verifySteps(steps: js.Array[String]): Unit = js.native
  def verifySteps(steps: js.Array[String], message: String): Unit = js.native
}
