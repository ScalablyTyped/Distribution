package typings.regexpp.astMod

import typings.regexpp.regexppStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordBoundaryAssertion
  extends BoundaryAssertion
     with NodeBase {
  var kind: word
  var negate: Boolean
  @JSName("parent")
  var parent_WordBoundaryAssertion: Alternative | Quantifier
  @JSName("type")
  var type_WordBoundaryAssertion: typings.regexpp.regexppStrings.Assertion
}

object WordBoundaryAssertion {
  @scala.inline
  def apply(
    end: Double,
    kind: word,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Assertion
  ): WordBoundaryAssertion = {
    val __obj = js.Dynamic.literal(end = end, kind = kind, negate = negate, parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WordBoundaryAssertion]
  }
}

