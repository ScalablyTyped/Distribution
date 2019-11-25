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
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookaheadAssertion]
  }
}

