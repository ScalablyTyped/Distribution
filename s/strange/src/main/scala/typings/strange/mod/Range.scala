package typings.strange.mod

import typings.strange.strangeNumbers.`-1`
import typings.strange.strangeNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range[T /* <: Endpoint */] extends js.Object {
  
  /**
    * Range's beginning, or left endpoint.
    */
  var begin: js.UndefOr[T | Null] = js.native
  
  /**
    * Range's bounds.
    *
    * Bounds signify whether the range includes or excludes that particular
    * endpoint.
    *
    * Pair | Meaning
    * -----|--------
    * `()` | open
    * `[]` | closed
    * `[)` | left-closed, right-open
    * `(]` | left-open, right-closed
    *
    * @example
    * new Range(1, 5).bounds // => "[]"
    * new Range(1, 5, "[)").bounds // => "[)"
    */
  var bounds: Bounds = js.native
  
  /**
    * Compares this range's beginning with the given value.
    * Returns `-1` if this range begins before the given value, `0` if they're
    * equal and `1` if this range begins after the given value.
    *
    * `null` is considered to signify negative infinity for non-numeric range
    * endpoints.
    *
    * @example
    * new Range(0, 10).compareBegin(5) // => -1
    * new Range(0, 10).compareBegin(0) // => 0
    * new Range(5, 10).compareBegin(0) // => 1
    * new Range(5, 10).compareBegin(null) // => 1
    */
  def compareBegin(): `-1` | `0` = js.native
  def compareBegin(begin: T): `-1` | `0` = js.native
  
  /**
    * Compares this range's end with the given value.
    * Returns `-1` if this range ends before the given value, `0` if they're
    * equal and `1` if this range ends after the given value.
    *
    * `null` is considered to signify positive infinity for non-numeric range
    * endpoints.
    *
    * @example
    * new Range(0, 10).compareEnd(5) // => -1
    * new Range(0, 10).compareEnd(10) // => 0
    * new Range(0, 5).compareEnd(10) // => 1
    * new Range(0, 5).compareEnd(null) // => -1
    */
  def compareEnd(): `-1` | `0` = js.native
  def compareEnd(end: T): `-1` | `0` = js.native
  
  /**
    * Check if a given value is contained within this range.
    * Returns `true` or `false`.
    *
    * @example
    * new Range(0, 10).contains(5) // => true
    * new Range(0, 10).contains(10) // => true
    * new Range(0, 10, "[)").contains(10) // => false
    */
  def contains(): Boolean = js.native
  def contains(value: T): Boolean = js.native
  
  /**
    * Range's end, or right endpoint.
    */
  var end: js.UndefOr[T | Null] = js.native
  
  /**
    * @alias toJSON
    */
  def inspect(): String = js.native
  
  /**
    * Check if this range intersects with another.
    * Returns `true` or `false`.
    *
    * Ranges that have common points intersect. Ranges that are consecutive and
    * with *inclusive* endpoints are also intersecting. An empty range will never
    * intersect.
    *
    * @example
    * new Range(0, 10).intersects(new Range(5, 7)) // => true
    * new Range(0, 10).intersects(new Range(10, 20)) // => true
    * new Range(0, 10, "[)").intersects(new Range(10, 20)) // => false
    * new Range(0, 10).intersects(new Range(20, 30)) // => false
    */
  def intersects(value: Range[T]): Boolean = js.native
  
  /**
    * Check whether the range is bounded.
    * A bounded range is one where neither endpoint is `null` or `Infinity`. An
    * empty range is considered bounded.
    *
    * @example
    * new Range().isBounded() // => true
    * new Range(5, 5).isBounded() // => true
    * new Range(null, new Date(2000, 5, 18)).isBounded() // => false
    * new Range(0, Infinity).isBounded() // => false
    * new Range(-Infinity, Infinity).isBounded() // => false
    */
  def isBounded(): Boolean = js.native
  
  /**
    * Check whether the range is empty.
    * An empty range is one where either of the endpoints is `undefined`
    * (like `new Range`) or a range with two equivalent, but exculsive endpoints
    * (`new Range(5, 5, "[)")`).
    *
    * Equivalence is checked by using the `<` operators, so value objects will be
    * coerced into something comparable by JavaScript. That usually means calling
    * the object's `valueOf` function.
    *
    * @example
    * new Range().isEmpty() // => true
    * new Range(5, 5, "[)").isEmpty() // => true
    * new Range(1, 10).isEmpty() // => false
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * @alias isBounded
    */
  def isFinite(): Boolean = js.native
  
  /**
    * @alias isUnbounded
    */
  def isInfinite(): Boolean = js.native
  
  /**
    * Check whether the range is unbounded.
    * An unbounded range is one where either endpoint is `null` or `Infinity`. An
    * empty range is not considered unbounded.
    *
    * @example
    * new Range().isUnbounded() // => false
    * new Range(5, 5).isUnbounded() // => false
    * new Range(null, new Date(2000, 5, 18)).isUnbounded() // => true
    * new Range(0, Infinity).isUnbounded() // => true
    * new Range(-Infinity, Infinity).isUnbounded() // => true
    */
  def isUnbounded(): Boolean = js.native
  
  /**
    * Stringifies the range when passing it to `JSON.stringify`.
    * This way you don't need to manually call `toString` when stringifying.
    *
    * @example
    * JSON.stringify(new Range(1, 10)) // "\"[1,10]\""
    *
    * @alias toString
    */
  def toJSON(): String = js.native
}
