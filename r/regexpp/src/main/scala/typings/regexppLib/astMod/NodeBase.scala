package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeBase extends js.Object {
  var end: scala.Double
  var parent: js.UndefOr[
    scala.Null | RegExpLiteral | Pattern | Group | CapturingGroup | LookaroundAssertion | Alternative | Quantifier | CharacterClass | CharacterClassRange
  ]
  var raw: java.lang.String
  var start: scala.Double
  var `type`: js.UndefOr[
    regexppLib.regexppLibStrings.RegExpLiteral | regexppLib.regexppLibStrings.Pattern | regexppLib.regexppLibStrings.Alternative | regexppLib.regexppLibStrings.Group | regexppLib.regexppLibStrings.CapturingGroup | regexppLib.regexppLibStrings.Quantifier | regexppLib.regexppLibStrings.CharacterClass | regexppLib.regexppLibStrings.Assertion | regexppLib.regexppLibStrings.CharacterClassRange | regexppLib.regexppLibStrings.CharacterSet | regexppLib.regexppLibStrings.Character | regexppLib.regexppLibStrings.Backreference | regexppLib.regexppLibStrings.Flags
  ]
}

object NodeBase {
  @scala.inline
  def apply(
    end: scala.Double,
    raw: java.lang.String,
    start: scala.Double,
    parent: RegExpLiteral | Pattern | Group | CapturingGroup | LookaroundAssertion | Alternative | Quantifier | CharacterClass | CharacterClassRange = null,
    `type`: regexppLib.regexppLibStrings.RegExpLiteral | regexppLib.regexppLibStrings.Pattern | regexppLib.regexppLibStrings.Alternative | regexppLib.regexppLibStrings.Group | regexppLib.regexppLibStrings.CapturingGroup | regexppLib.regexppLibStrings.Quantifier | regexppLib.regexppLibStrings.CharacterClass | regexppLib.regexppLibStrings.Assertion | regexppLib.regexppLibStrings.CharacterClassRange | regexppLib.regexppLibStrings.CharacterSet | regexppLib.regexppLibStrings.Character | regexppLib.regexppLibStrings.Backreference | regexppLib.regexppLibStrings.Flags = null
  ): NodeBase = {
    val __obj = js.Dynamic.literal(end = end, raw = raw, start = start)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeBase]
  }
}

