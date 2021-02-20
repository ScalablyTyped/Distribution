package typings.proclaim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("proclaim", JSImport.Namespace)
  @js.native
  def apply(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", JSImport.Namespace)
  @js.native
  def apply(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that Math.abs(actual - expected) < (0.5 * Math.pow(10, -precision)).
    */
  @JSImport("proclaim", "almostEqual")
  @js.native
  def almostEqual(actual: js.Any, expected: js.Any, precision: Double): AssertionError | Unit = js.native
  @JSImport("proclaim", "almostEqual")
  @js.native
  def almostEqual(actual: js.Any, expected: js.Any, precision: Double, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that fn.length === expected.
    */
  @JSImport("proclaim", "arity")
  @js.native
  def arity(fn: js.Function0[Unit], expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "arity")
  @js.native
  def arity(fn: js.Function0[Unit], expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that actual is deeply equal to expected.
    */
  @JSImport("proclaim", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that actual is deeply equal to expected, as determined by the strict equality operator ===.
    */
  @JSImport("proclaim", "deepStrictEqual")
  @js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "deepStrictEqual")
  @js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that haystack does not contain needle.
    */
  @JSImport("proclaim", "doesNotInclude")
  @js.native
  def doesNotInclude(haystack: js.Any, needle: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "doesNotInclude")
  @js.native
  def doesNotInclude(haystack: js.Any, needle: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that fn does not throw an error.
    */
  @JSImport("proclaim", "doesNotThrow")
  @js.native
  def doesNotThrow(fn: js.Function0[Unit]): AssertionError | Unit = js.native
  @JSImport("proclaim", "doesNotThrow")
  @js.native
  def doesNotThrow(fn: js.Function0[Unit], expected: js.UndefOr[scala.Nothing], msg: String): AssertionError | Unit = js.native
  @JSImport("proclaim", "doesNotThrow")
  @js.native
  def doesNotThrow(fn: js.Function0[Unit], expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "doesNotThrow")
  @js.native
  def doesNotThrow(fn: js.Function0[Unit], expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that actual == expected.
    */
  @JSImport("proclaim", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Throw an assertion error.
    */
  @JSImport("proclaim", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any): AssertionError = js.native
  @JSImport("proclaim", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, msg: js.UndefOr[scala.Nothing], operator: String): AssertionError = js.native
  @JSImport("proclaim", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, msg: String): AssertionError = js.native
  @JSImport("proclaim", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, msg: String, operator: String): AssertionError = js.native
  
  /**
    * Assert that actual > expected.
    */
  @JSImport("proclaim", "greaterThan")
  @js.native
  def greaterThan(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "greaterThan")
  @js.native
  def greaterThan(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that actual >= expected.
    */
  @JSImport("proclaim", "greaterThanOrEqual")
  @js.native
  def greaterThanOrEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "greaterThanOrEqual")
  @js.native
  def greaterThanOrEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that fn.name === expected.
    */
  @JSImport("proclaim", "hasName")
  @js.native
  def hasName(fn: js.Function0[Unit], expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "hasName")
  @js.native
  def hasName(fn: js.Function0[Unit], expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that haystack contains needle.
    */
  @JSImport("proclaim", "include")
  @js.native
  def include(haystack: js.Any, needle: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "include")
  @js.native
  def include(haystack: js.Any, needle: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is an array.
    */
  @JSImport("proclaim", "isArray")
  @js.native
  def isArray(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isArray")
  @js.native
  def isArray(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is a boolean.
    */
  @JSImport("proclaim", "isBoolean")
  @js.native
  def isBoolean(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isBoolean")
  @js.native
  def isBoolean(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value !== undefined.
    */
  @JSImport("proclaim", "isDefined")
  @js.native
  def isDefined(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isDefined")
  @js.native
  def isDefined(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that obj[property] is enumerable.
    */
  @JSImport("proclaim", "isEnumerable")
  @js.native
  def isEnumerable(`object`: js.Object, property: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isEnumerable")
  @js.native
  def isEnumerable(`object`: js.Object, property: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value === false.
    */
  @JSImport("proclaim", "isFalse")
  @js.native
  def isFalse(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isFalse")
  @js.native
  def isFalse(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is a function.
    */
  @JSImport("proclaim", "isFunction")
  @js.native
  def isFunction(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isFunction")
  @js.native
  def isFunction(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that actual instanceof expected.
    */
  @JSImport("proclaim", "isInstanceOf")
  @js.native
  def isInstanceOf(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isInstanceOf")
  @js.native
  def isInstanceOf(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is NaN.
    */
  @JSImport("proclaim", "isNaN")
  @js.native
  def isNaN(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isNaN")
  @js.native
  def isNaN(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is not an array.
    */
  @JSImport("proclaim", "isNotArray")
  @js.native
  def isNotArray(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isNotArray")
  @js.native
  def isNotArray(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is not a boolean.
    */
  @JSImport("proclaim", "isNotBoolean")
  @js.native
  def isNotBoolean(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isNotBoolean")
  @js.native
  def isNotBoolean(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that obj[property] is not enumerable.
    */
  @JSImport("proclaim", "isNotEnumerable")
  @js.native
  def isNotEnumerable(`object`: js.Object, property: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isNotEnumerable")
  @js.native
  def isNotEnumerable(`object`: js.Object, property: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is not a function.
    */
  @JSImport("proclaim", "isNotFunction")
  @js.native
  def isNotFunction(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isNotFunction")
  @js.native
  def isNotFunction(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that !(actual instanceof expected).
    */
  @JSImport("proclaim", "isNotInstanceOf")
  @js.native
  def isNotInstanceOf(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isNotInstanceOf")
  @js.native
  def isNotInstanceOf(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is not NaN.
    */
  @JSImport("proclaim", "isNotNaN")
  @js.native
  def isNotNaN(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isNotNaN")
  @js.native
  def isNotNaN(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value !== null.
    */
  @JSImport("proclaim", "isNotNull")
  @js.native
  def isNotNull(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isNotNull")
  @js.native
  def isNotNull(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is not a number.
    */
  @JSImport("proclaim", "isNotNumber")
  @js.native
  def isNotNumber(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isNotNumber")
  @js.native
  def isNotNumber(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is not an object.
    */
  @JSImport("proclaim", "isNotObject")
  @js.native
  def isNotObject(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isNotObject")
  @js.native
  def isNotObject(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is not a string.
    */
  @JSImport("proclaim", "isNotString")
  @js.native
  def isNotString(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isNotString")
  @js.native
  def isNotString(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that typeof actual !== expected.
    */
  @JSImport("proclaim", "isNotTypeOf")
  @js.native
  def isNotTypeOf(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isNotTypeOf")
  @js.native
  def isNotTypeOf(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value === null.
    */
  @JSImport("proclaim", "isNull")
  @js.native
  def isNull(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isNull")
  @js.native
  def isNull(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is a number.
    */
  @JSImport("proclaim", "isNumber")
  @js.native
  def isNumber(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isNumber")
  @js.native
  def isNumber(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is an object.
    */
  @JSImport("proclaim", "isObject")
  @js.native
  def isObject(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isObject")
  @js.native
  def isObject(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is a string.
    */
  @JSImport("proclaim", "isString")
  @js.native
  def isString(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isString")
  @js.native
  def isString(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value === true.
    */
  @JSImport("proclaim", "isTrue")
  @js.native
  def isTrue(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isTrue")
  @js.native
  def isTrue(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that typeof actual === expected.
    */
  @JSImport("proclaim", "isTypeOf")
  @js.native
  def isTypeOf(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isTypeOf")
  @js.native
  def isTypeOf(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value === undefined.
    */
  @JSImport("proclaim", "isUndefined")
  @js.native
  def isUndefined(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "isUndefined")
  @js.native
  def isUndefined(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value.length === expected.
    */
  @JSImport("proclaim", "lengthEquals")
  @js.native
  def lengthEquals(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "lengthEquals")
  @js.native
  def lengthEquals(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that actual < expected.
    */
  @JSImport("proclaim", "lessThan")
  @js.native
  def lessThan(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "lessThan")
  @js.native
  def lessThan(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that actual <= expected.
    */
  @JSImport("proclaim", "lessThanOrEqual")
  @js.native
  def lessThanOrEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "lessThanOrEqual")
  @js.native
  def lessThanOrEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that actual is not deeply equal to expected.
    */
  @JSImport("proclaim", "notDeepEqual")
  @js.native
  def notDeepEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "notDeepEqual")
  @js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that actual is not deeply equal to expected, as determined by the strict not equal operator !==.
    */
  @JSImport("proclaim", "notDeepStrictEqual")
  @js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "notDeepStrictEqual")
  @js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that actual != expected.
    */
  @JSImport("proclaim", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that actual does not match the RegExp in expected.
    */
  @JSImport("proclaim", "notMatch")
  @js.native
  def notMatch(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "notMatch")
  @js.native
  def notMatch(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is falsy.
    */
  @JSImport("proclaim", "notOk")
  @js.native
  def notOk(value: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "notOk")
  @js.native
  def notOk(value: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that actual !== expected.
    */
  @JSImport("proclaim", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that value is truthy.
    */
  @JSImport("proclaim", "ok")
  @js.native
  val ok: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof proclaim */ js.Any = js.native
  
  /**
    * Assert that actual === expected.
    */
  @JSImport("proclaim", "strictEqual")
  @js.native
  def strictEqual(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "strictEqual")
  @js.native
  def strictEqual(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  /**
    * Assert that fn throws an error.
    */
  @JSImport("proclaim", "throws")
  @js.native
  def throws(fn: js.Function0[Unit]): AssertionError | Unit = js.native
  @JSImport("proclaim", "throws")
  @js.native
  def throws(fn: js.Function0[Unit], expected: js.UndefOr[scala.Nothing], msg: String): AssertionError | Unit = js.native
  @JSImport("proclaim", "throws")
  @js.native
  def throws(fn: js.Function0[Unit], expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "throws")
  @js.native
  def throws(fn: js.Function0[Unit], expected: js.Any, msg: String): AssertionError | Unit = js.native
  
  @js.native
  trait AssertionError extends StObject {
    
    var actual: js.Any = js.native
    
    var expected: js.Any = js.native
    
    var msg: String = js.native
    
    var operator: String = js.native
    
    var stackStartFunction: js.Any = js.native
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
  
  /**
    * Assert that actual matches the RegExp in expected.
    */
  @JSImport("proclaim", "match")
  @js.native
  def `match`(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  @JSImport("proclaim", "match")
  @js.native
  def `match`(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
}
