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
    val __obj = js.Dynamic.literal(alternatives = alternatives, end = end, kind = kind, negate = negate, parent = parent, raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LookbehindAssertion]
  }
}

