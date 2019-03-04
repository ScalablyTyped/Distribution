package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonSetMatcher extends SinonMatcher {
  /**
    * Requires a Set to contain each one of the items the given set has.
    */
  def contains(expected: SimplifiedSet): SinonMatcher
  /**
    *  Requires a Set to be deep equal another one.
    */
  def deepEquals(expected: SimplifiedSet): SinonMatcher
}

object SinonSetMatcher {
  @scala.inline
  def apply(
    and: js.Function1[SinonMatcher, SinonMatcher],
    contains: js.Function1[SimplifiedSet, SinonMatcher],
    deepEquals: js.Function1[SimplifiedSet, SinonMatcher],
    or: js.Function1[SinonMatcher, SinonMatcher],
    test: js.Function1[js.Any, scala.Boolean]
  ): SinonSetMatcher = {
    val __obj = js.Dynamic.literal(and = and, contains = contains, deepEquals = deepEquals, or = or, test = test)
  
    __obj.asInstanceOf[SinonSetMatcher]
  }
}

