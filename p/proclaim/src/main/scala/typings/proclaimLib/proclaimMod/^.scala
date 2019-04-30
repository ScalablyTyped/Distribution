package typings
package proclaimLib.proclaimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proclaim", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def almostEqual(actual: js.Any, expected: js.Any, precision: scala.Double, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def arity(fn: js.Function0[scala.Unit], expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def doesNotInclude(haystack: js.Any, needle: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def doesNotThrow(fn: js.Function0[scala.Unit], expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def equal(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def fail(actual: js.Any, expected: js.Any, msg: java.lang.String, operator: java.lang.String): AssertionError = js.native
  def greaterThan(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def greaterThanOrEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def hasName(fn: js.Function0[scala.Unit], expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def include(haystack: js.Any, needle: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isArray(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isBoolean(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isDefined(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isEnumerable(`object`: js.Object, property: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isFalse(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isFunction(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isInstanceOf(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isNaN(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isNotArray(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isNotBoolean(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isNotEnumerable(`object`: js.Object, property: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isNotFunction(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isNotInstanceOf(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isNotNaN(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isNotNull(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isNotNumber(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isNotObject(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isNotString(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isNotTypeOf(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isNull(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isNumber(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isObject(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isString(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isTrue(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isTypeOf(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def isUndefined(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def lengthEquals(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def lessThan(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def lessThanOrEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def `match`(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def notMatch(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def notOk(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def ok(value: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
  def throws(fn: js.Function0[scala.Unit], expected: js.Any, msg: java.lang.String): AssertionError | scala.Unit = js.native
}

