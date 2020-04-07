package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeBase extends js.Object {
  var end: Double
  var parent: Null | RegExpLiteral | Pattern | Group | CapturingGroup | LookaroundAssertion | Alternative | Quantifier | CharacterClass | CharacterClassRange
  var raw: String
  var start: Double
  var `type`: typings.regexpp.regexppStrings.RegExpLiteral | typings.regexpp.regexppStrings.Pattern | typings.regexpp.regexppStrings.Alternative | typings.regexpp.regexppStrings.Group | typings.regexpp.regexppStrings.CapturingGroup | typings.regexpp.regexppStrings.Quantifier | typings.regexpp.regexppStrings.CharacterClass | typings.regexpp.regexppStrings.Assertion | typings.regexpp.regexppStrings.CharacterClassRange | typings.regexpp.regexppStrings.CharacterSet | typings.regexpp.regexppStrings.Character | typings.regexpp.regexppStrings.Backreference | typings.regexpp.regexppStrings.Flags
}

object NodeBase {
  @scala.inline
  def apply(
    end: Double,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.RegExpLiteral | typings.regexpp.regexppStrings.Pattern | typings.regexpp.regexppStrings.Alternative | typings.regexpp.regexppStrings.Group | typings.regexpp.regexppStrings.CapturingGroup | typings.regexpp.regexppStrings.Quantifier | typings.regexpp.regexppStrings.CharacterClass | typings.regexpp.regexppStrings.Assertion | typings.regexpp.regexppStrings.CharacterClassRange | typings.regexpp.regexppStrings.CharacterSet | typings.regexpp.regexppStrings.Character | typings.regexpp.regexppStrings.Backreference | typings.regexpp.regexppStrings.Flags,
    parent: RegExpLiteral | Pattern | Group | CapturingGroup | LookaroundAssertion | Alternative | Quantifier | CharacterClass | CharacterClassRange = null
  ): NodeBase = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeBase]
  }
}

