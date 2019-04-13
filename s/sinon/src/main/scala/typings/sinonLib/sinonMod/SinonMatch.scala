package typings
package sinonLib.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonMatch extends js.Object {
  /**
    * Matches anything.
    */
  var any: SinonMatcher = js.native
  /**
    * Requires the value to be an Array.
    */
  var array: SinonArrayMatcher = js.native
  /**
    * Requires the value to be a Boolean
    */
  var bool: SinonMatcher = js.native
  /**
    * Requires the value to be a Date object.
    */
  var date: SinonMatcher = js.native
  /**
    * Requires the value to be defined.
    */
  var defined: SinonMatcher = js.native
  /**
    * Requires the value to be falsy.
    */
  var falsy: SinonMatcher = js.native
  /**
    * Requires the value to be a Function.
    */
  var func: SinonMatcher = js.native
  /**
    * Requires the value to be a Map.
    */
  var map: SinonMapMatcher = js.native
  /**
    * Requires the value to be a Number.
    */
  var number: SinonMatcher = js.native
  /**
    * Requires the value to be an Object.
    */
  var `object`: SinonMatcher = js.native
  /**
    * Requires the value to be a regular expression.
    */
  var regexp: SinonMatcher = js.native
  /**
    * Requires the value to be a Set.
    */
  var set: SinonSetMatcher = js.native
  /**
    * Requires the value to be a String.
    */
  var string: SinonMatcher = js.native
  /**
    * Requires the value to be a Symbol.
    */
  var symbol: SinonMatcher = js.native
  /**
    * Requires the value to be truthy.
    */
  var truthy: SinonMatcher = js.native
  /**
    * See custom matchers.
    */
  def apply(callback: js.Function1[/* value */ js.Any, scala.Boolean]): SinonMatcher = js.native
  def apply(callback: js.Function1[/* value */ js.Any, scala.Boolean], message: java.lang.String): SinonMatcher = js.native
  /**
    * Requires the value to be a string and match the given regular expression.
    */
  def apply(expr: stdLib.RegExp): SinonMatcher = js.native
  /**
    * Requires the value to be not null or undefined and have at least the same properties as expectation.
    * This supports nested matchers.
    */
  def apply(obj: js.Object): SinonMatcher = js.native
  /**
    * Requires the value to be a string and have the expectation as a substring.
    */
  def apply(value: java.lang.String): SinonMatcher = js.native
  /**
    * Requires the value to be == to the given number.
    */
  def apply(value: scala.Double): SinonMatcher = js.native
  /**
    * Requires every element of an Array, Set or Map, or alternatively every value of an Object to match the given matcher.
    */
  def every(matcher: SinonMatcher): SinonMatcher = js.native
  /**
    * Requires the value to define the given property.
    * The property might be inherited via the prototype chain.
    * If the optional expectation is given, the value of the property is deeply compared with the expectation.
    * The expectation can be another matcher.
    * @param property
    * @param expect
    */
  def has(property: java.lang.String): SinonMatcher = js.native
  def has(property: java.lang.String, expect: js.Any): SinonMatcher = js.native
  /**
    * Requires the value to define the given propertyPath. Dot (prop.prop) and bracket (prop[0]) notations are supported as in Lodash.get.
    * The propertyPath might be inherited via the prototype chain.
    * If the optional expectation is given, the value at the propertyPath is deeply compared with the expectation.
    * The expectation can be another matcher.
    */
  def hasNested(path: java.lang.String): SinonMatcher = js.native
  def hasNested(path: java.lang.String, expect: js.Any): SinonMatcher = js.native
  /**
    * Same as sinon.match.has but the property must be defined by the value itself. Inherited properties are ignored.
    * @param property
    * @param expect
    */
  def hasOwn(property: java.lang.String): SinonMatcher = js.native
  def hasOwn(property: java.lang.String, expect: js.Any): SinonMatcher = js.native
  /**
    * Requires the value to be in the specified array.
    */
  def in(allowed: js.Array[_]): SinonMatcher = js.native
  /**
    * Requires the value to be an instance of the given type.
    */
  def instanceOf(`type`: js.Any): SinonMatcher = js.native
  /**
    * Requires the value to strictly equal ref.
    */
  def same(obj: js.Any): SinonMatcher = js.native
  /**
    * Requires any element of an Array, Set or Map, or alternatively any value of an Object to match the given matcher.
    */
  def some(matcher: SinonMatcher): SinonMatcher = js.native
  /**
    * Requires the value to be of the given type, where type can be one of "undefined", "null", "boolean", "number", "string", "object", "function", "array", "regexp", "date" or "symbol".
    */
  def typeOf(`type`: java.lang.String): SinonMatcher = js.native
}

