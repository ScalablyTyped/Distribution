package typings.sinon.mod

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
    and: SinonMatcher => SinonMatcher,
    contains: SimplifiedSet => SinonMatcher,
    deepEquals: SimplifiedSet => SinonMatcher,
    or: SinonMatcher => SinonMatcher,
    test: js.Any => Boolean
  ): SinonSetMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), contains = js.Any.fromFunction1(contains), deepEquals = js.Any.fromFunction1(deepEquals), or = js.Any.fromFunction1(or), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[SinonSetMatcher]
  }
}

