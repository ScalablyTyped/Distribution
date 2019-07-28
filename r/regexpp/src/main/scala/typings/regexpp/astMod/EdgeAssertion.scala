package typings.regexpp.astMod

import typings.regexpp.regexppStrings.end
import typings.regexpp.regexppStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeAssertion
  extends BoundaryAssertion
     with NodeBase {
  var kind: start | end
  @JSName("parent")
  var parent_EdgeAssertion: Alternative | Quantifier
  @JSName("type")
  var type_EdgeAssertion: typings.regexpp.regexppStrings.Assertion
}

object EdgeAssertion {
  @scala.inline
  def apply(
    end: Double,
    kind: start | end,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Assertion
  ): EdgeAssertion = {
    val __obj = js.Dynamic.literal(end = end, kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EdgeAssertion]
  }
}

