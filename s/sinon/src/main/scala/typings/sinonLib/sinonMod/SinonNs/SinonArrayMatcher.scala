package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonArrayMatcher extends SinonMatcher {
  /**
    * Requires an Array to contain each one of the values the given array has.
    */
  def contains(expected: js.Array[_]): SinonMatcher
  /**
    * Requires an Array to be deep equal another one.
    */
  def deepEquals(expected: js.Array[_]): SinonMatcher
  /**
    * Requires an Array to end with the same values as another one.
    */
  def endsWith(expected: js.Array[_]): SinonMatcher
  /**
    * Requires an Array to start with the same values as another one.
    */
  def startsWith(expected: js.Array[_]): SinonMatcher
}

object SinonArrayMatcher {
  @scala.inline
  def apply(
    and: js.Function1[SinonMatcher, SinonMatcher],
    contains: js.Function1[js.Array[_], SinonMatcher],
    deepEquals: js.Function1[js.Array[_], SinonMatcher],
    endsWith: js.Function1[js.Array[_], SinonMatcher],
    or: js.Function1[SinonMatcher, SinonMatcher],
    startsWith: js.Function1[js.Array[_], SinonMatcher],
    test: js.Function1[js.Any, scala.Boolean]
  ): SinonArrayMatcher = {
    val __obj = js.Dynamic.literal(and = and, contains = contains, deepEquals = deepEquals, endsWith = endsWith, or = or, startsWith = startsWith, test = test)
  
    __obj.asInstanceOf[SinonArrayMatcher]
  }
}

