package typings.sinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonMatcher extends js.Object {
  /**
    * All matchers implement and and or. This allows to logically combine mutliple matchers.
    * The result is a new matchers that requires both (and) or one of the matchers (or) to return true.
    * @example var stringOrNumber = sinon.match.string.or(sinon.match.number);
    * var bookWithPages = sinon.match.instanceOf(Book).and(sinon.match.has("pages"));
    */
  def and(expr: SinonMatcher): SinonMatcher = js.native
  /**
    * All matchers implement and and or. This allows to logically combine mutliple matchers.
    * The result is a new matchers that requires both (and) or one of the matchers (or) to return true.
    * @example var stringOrNumber = sinon.match.string.or(sinon.match.number);
    * var bookWithPages = sinon.match.instanceOf(Book).and(sinon.match.has("pages"));
    */
  def or(expr: SinonMatcher): SinonMatcher = js.native
  def test(`val`: js.Any): Boolean = js.native
}

object SinonMatcher {
  @scala.inline
  def apply(and: SinonMatcher => SinonMatcher, or: SinonMatcher => SinonMatcher, test: js.Any => Boolean): SinonMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), or = js.Any.fromFunction1(or), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[SinonMatcher]
  }
  @scala.inline
  implicit class SinonMatcherOps[Self <: SinonMatcher] (val x: Self) extends AnyVal {
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
    def setAnd(value: SinonMatcher => SinonMatcher): Self = this.set("and", js.Any.fromFunction1(value))
    @scala.inline
    def setOr(value: SinonMatcher => SinonMatcher): Self = this.set("or", js.Any.fromFunction1(value))
    @scala.inline
    def setTest(value: js.Any => Boolean): Self = this.set("test", js.Any.fromFunction1(value))
  }
  
}

