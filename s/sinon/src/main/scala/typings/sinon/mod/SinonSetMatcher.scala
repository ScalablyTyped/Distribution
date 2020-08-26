package typings.sinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonSetMatcher extends SinonMatcher {
  /**
    * Requires a Set to contain each one of the items the given set has.
    */
  def contains(expected: SimplifiedSet): SinonMatcher = js.native
  /**
    *  Requires a Set to be deep equal another one.
    */
  def deepEquals(expected: SimplifiedSet): SinonMatcher = js.native
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
  @scala.inline
  implicit class SinonSetMatcherOps[Self <: SinonSetMatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContains(value: SimplifiedSet => SinonMatcher): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setDeepEquals(value: SimplifiedSet => SinonMatcher): Self = this.set("deepEquals", js.Any.fromFunction1(value))
  }
  
}

