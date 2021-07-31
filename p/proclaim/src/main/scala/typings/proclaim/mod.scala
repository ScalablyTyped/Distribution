package typings.proclaim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def apply(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  @JSImport("proclaim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Assert that Math.abs(actual - expected) < (0.5 * Math.pow(10, -precision)).
    */
  @scala.inline
  def almostEqual(actual: js.Any, expected: js.Any, precision: Double): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("almostEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def almostEqual(actual: js.Any, expected: js.Any, precision: Double, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("almostEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that fn.length === expected.
    */
  @scala.inline
  def arity(fn: js.Function0[Unit], expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arity")(fn.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def arity(fn: js.Function0[Unit], expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arity")(fn.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that actual is deeply equal to expected.
    */
  @scala.inline
  def deepEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def deepEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that actual is deeply equal to expected, as determined by the strict equality operator ===.
    */
  @scala.inline
  def deepStrictEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def deepStrictEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that haystack does not contain needle.
    */
  @scala.inline
  def doesNotInclude(haystack: js.Any, needle: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotInclude")(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def doesNotInclude(haystack: js.Any, needle: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotInclude")(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that fn does not throw an error.
    */
  @scala.inline
  def doesNotThrow(fn: js.Function0[Unit]): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(fn.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def doesNotThrow(fn: js.Function0[Unit], expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(fn.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def doesNotThrow(fn: js.Function0[Unit], expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(fn.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def doesNotThrow(fn: js.Function0[Unit], expected: Unit, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(fn.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that actual == expected.
    */
  @scala.inline
  def equal(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def equal(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Throw an assertion error.
    */
  @scala.inline
  def fail(actual: js.Any, expected: js.Any): AssertionError = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, msg: String): AssertionError = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, msg: String, operator: String): AssertionError = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[AssertionError]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, msg: Unit, operator: String): AssertionError = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[AssertionError]
  
  /**
    * Assert that actual > expected.
    */
  @scala.inline
  def greaterThan(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def greaterThan(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that actual >= expected.
    */
  @scala.inline
  def greaterThanOrEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThanOrEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def greaterThanOrEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThanOrEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that fn.name === expected.
    */
  @scala.inline
  def hasName(fn: js.Function0[Unit], expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hasName")(fn.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def hasName(fn: js.Function0[Unit], expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hasName")(fn.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that haystack contains needle.
    */
  @scala.inline
  def include(haystack: js.Any, needle: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("include")(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def include(haystack: js.Any, needle: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("include")(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is an array.
    */
  @scala.inline
  def isArray(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isArray(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is a boolean.
    */
  @scala.inline
  def isBoolean(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isBoolean(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value !== undefined.
    */
  @scala.inline
  def isDefined(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isDefined(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that obj[property] is enumerable.
    */
  @scala.inline
  def isEnumerable(`object`: js.Object, property: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumerable")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isEnumerable(`object`: js.Object, property: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumerable")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value === false.
    */
  @scala.inline
  def isFalse(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalse")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isFalse(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isFalse")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is a function.
    */
  @scala.inline
  def isFunction(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isFunction(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that actual instanceof expected.
    */
  @scala.inline
  def isInstanceOf(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceOf")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isInstanceOf(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceOf")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is NaN.
    */
  @scala.inline
  def isNaN(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isNaN(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is not an array.
    */
  @scala.inline
  def isNotArray(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotArray")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isNotArray(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotArray")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is not a boolean.
    */
  @scala.inline
  def isNotBoolean(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isNotBoolean(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotBoolean")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that obj[property] is not enumerable.
    */
  @scala.inline
  def isNotEnumerable(`object`: js.Object, property: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotEnumerable")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isNotEnumerable(`object`: js.Object, property: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotEnumerable")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is not a function.
    */
  @scala.inline
  def isNotFunction(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotFunction")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isNotFunction(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotFunction")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that !(actual instanceof expected).
    */
  @scala.inline
  def isNotInstanceOf(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotInstanceOf")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isNotInstanceOf(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotInstanceOf")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is not NaN.
    */
  @scala.inline
  def isNotNaN(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNaN")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isNotNaN(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotNaN")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value !== null.
    */
  @scala.inline
  def isNotNull(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNull")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isNotNull(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotNull")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is not a number.
    */
  @scala.inline
  def isNotNumber(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNumber")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isNotNumber(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotNumber")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is not an object.
    */
  @scala.inline
  def isNotObject(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotObject")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isNotObject(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotObject")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is not a string.
    */
  @scala.inline
  def isNotString(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotString")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isNotString(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotString")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that typeof actual !== expected.
    */
  @scala.inline
  def isNotTypeOf(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotTypeOf")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isNotTypeOf(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotTypeOf")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value === null.
    */
  @scala.inline
  def isNull(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isNull(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is a number.
    */
  @scala.inline
  def isNumber(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isNumber(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is an object.
    */
  @scala.inline
  def isObject(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isObject(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is a string.
    */
  @scala.inline
  def isString(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isString(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value === true.
    */
  @scala.inline
  def isTrue(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isTrue")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isTrue(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isTrue")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that typeof actual === expected.
    */
  @scala.inline
  def isTypeOf(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOf")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isTypeOf(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOf")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value === undefined.
    */
  @scala.inline
  def isUndefined(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def isUndefined(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value.length === expected.
    */
  @scala.inline
  def lengthEquals(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lengthEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def lengthEquals(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lengthEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that actual < expected.
    */
  @scala.inline
  def lessThan(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def lessThan(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that actual <= expected.
    */
  @scala.inline
  def lessThanOrEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThanOrEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def lessThanOrEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThanOrEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that actual matches the RegExp in expected.
    */
  @scala.inline
  def `match`(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def `match`(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that actual is not deeply equal to expected.
    */
  @scala.inline
  def notDeepEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def notDeepEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that actual is not deeply equal to expected, as determined by the strict not equal operator !==.
    */
  @scala.inline
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that actual != expected.
    */
  @scala.inline
  def notEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def notEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that actual does not match the RegExp in expected.
    */
  @scala.inline
  def notMatch(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notMatch")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def notMatch(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notMatch")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is falsy.
    */
  @scala.inline
  def notOk(value: js.Any): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notOk")(value.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def notOk(value: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notOk")(value.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that actual !== expected.
    */
  @scala.inline
  def notStrictEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def notStrictEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that value is truthy.
    */
  @JSImport("proclaim", "ok")
  @js.native
  val ok: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof proclaim */ js.Any = js.native
  
  /**
    * Assert that actual === expected.
    */
  @scala.inline
  def strictEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def strictEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  /**
    * Assert that fn throws an error.
    */
  @scala.inline
  def throws(fn: js.Function0[Unit]): AssertionError | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any]).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def throws(fn: js.Function0[Unit], expected: js.Any): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def throws(fn: js.Function0[Unit], expected: js.Any, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  @scala.inline
  def throws(fn: js.Function0[Unit], expected: Unit, msg: String): AssertionError | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AssertionError | Unit]
  
  trait AssertionError extends StObject {
    
    var actual: js.Any
    
    var expected: js.Any
    
    var msg: String
    
    var operator: String
    
    var stackStartFunction: js.Any
  }
  object AssertionError {
    
    @scala.inline
    def apply(actual: js.Any, expected: js.Any, msg: String, operator: String, stackStartFunction: js.Any): AssertionError = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], stackStartFunction = stackStartFunction.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertionError]
    }
    
    @scala.inline
    implicit class AssertionErrorMutableBuilder[Self <: AssertionError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpected(value: js.Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackStartFunction(value: js.Any): Self = StObject.set(x, "stackStartFunction", value.asInstanceOf[js.Any])
    }
  }
}
