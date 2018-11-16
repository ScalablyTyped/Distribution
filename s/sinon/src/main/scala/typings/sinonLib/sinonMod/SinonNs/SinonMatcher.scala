package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SinonMatcher extends js.Object {
  /**
           * All matchers implement and and or. This allows to logically combine mutliple matchers.
           * The result is a new matchers that requires both (and) or one of the matchers (or) to return true.
           * @example var stringOrNumber = sinon.match.string.or(sinon.match.number);
           * var bookWithPages = sinon.match.instanceOf(Book).and(sinon.match.has("pages"));
           */
  def and(expr: SinonMatcher): SinonMatcher
  /**
           * All matchers implement and and or. This allows to logically combine mutliple matchers.
           * The result is a new matchers that requires both (and) or one of the matchers (or) to return true.
           * @example var stringOrNumber = sinon.match.string.or(sinon.match.number);
           * var bookWithPages = sinon.match.instanceOf(Book).and(sinon.match.has("pages"));
           */
  def or(expr: SinonMatcher): SinonMatcher
  def test(`val`: js.Any): scala.Boolean
}

