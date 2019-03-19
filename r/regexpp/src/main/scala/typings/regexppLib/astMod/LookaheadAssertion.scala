package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookaheadAssertion
  extends LookaroundAssertion
     with NodeBase
     with QuantifiableElement {
  var alternatives: js.Array[Alternative]
  var kind: regexppLib.regexppLibStrings.lookahead
  var negate: scala.Boolean
  @JSName("parent")
  var parent_LookaheadAssertion: Alternative | Quantifier
  @JSName("type")
  var type_LookaheadAssertion: regexppLib.regexppLibStrings.Assertion
}

object LookaheadAssertion {
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: scala.Double,
    kind: regexppLib.regexppLibStrings.lookahead,
    negate: scala.Boolean,
    parent: Alternative | Quantifier,
    raw: java.lang.String,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.Assertion
  ): LookaheadAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives, end = end, kind = kind, negate = negate, parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LookaheadAssertion]
  }
}

