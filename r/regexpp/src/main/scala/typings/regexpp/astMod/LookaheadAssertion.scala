package typings.regexpp.astMod

import typings.regexpp.regexppStrings.lookahead
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookaheadAssertion
  extends LookaroundAssertion
     with NodeBase
     with QuantifiableElement {
  var alternatives: js.Array[Alternative]
  var kind: lookahead
  var negate: Boolean
  @JSName("parent")
  var parent_LookaheadAssertion: Alternative | Quantifier
  @JSName("type")
  var type_LookaheadAssertion: typings.regexpp.regexppStrings.Assertion
}

object LookaheadAssertion {
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    kind: lookahead,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Assertion
  ): LookaheadAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives, end = end, kind = kind, negate = negate, parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LookaheadAssertion]
  }
}

