package typings.regexpp.astMod

import typings.regexpp.regexppStrings.lookbehind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookbehindAssertion
  extends LookaroundAssertion
     with NodeBase {
  var alternatives: js.Array[Alternative]
  var kind: lookbehind
  var negate: Boolean
  @JSName("parent")
  var parent_LookbehindAssertion: Alternative
  @JSName("type")
  var type_LookbehindAssertion: typings.regexpp.regexppStrings.Assertion
}

object LookbehindAssertion {
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    kind: lookbehind,
    negate: Boolean,
    parent: Alternative,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Assertion
  ): LookbehindAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookbehindAssertion]
  }
}

