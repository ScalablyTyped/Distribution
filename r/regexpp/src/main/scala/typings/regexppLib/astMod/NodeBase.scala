package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeBase extends js.Object {
  var end: scala.Double
  var parent: js.UndefOr[scala.Null] with (js.UndefOr[RegExpLiteral | scala.Null]) with (js.UndefOr[Pattern | Group | CapturingGroup | LookaroundAssertion]) with (js.UndefOr[Alternative | Quantifier]) with js.UndefOr[Alternative] with js.UndefOr[CharacterClass] with (js.UndefOr[Alternative | Quantifier | CharacterClass]) with (js.UndefOr[Alternative | Quantifier | CharacterClass | CharacterClassRange])
  var raw: java.lang.String
  var start: scala.Double
  var `type`: js.UndefOr[regexppLib.regexppLibStrings.RegExpLiteral] with js.UndefOr[regexppLib.regexppLibStrings.Pattern] with js.UndefOr[regexppLib.regexppLibStrings.Alternative] with js.UndefOr[regexppLib.regexppLibStrings.Group] with js.UndefOr[regexppLib.regexppLibStrings.CapturingGroup] with js.UndefOr[regexppLib.regexppLibStrings.Quantifier] with js.UndefOr[regexppLib.regexppLibStrings.CharacterClass] with js.UndefOr[regexppLib.regexppLibStrings.Assertion] with js.UndefOr[regexppLib.regexppLibStrings.CharacterClassRange] with js.UndefOr[regexppLib.regexppLibStrings.CharacterSet] with js.UndefOr[regexppLib.regexppLibStrings.Character] with js.UndefOr[regexppLib.regexppLibStrings.Backreference] with js.UndefOr[regexppLib.regexppLibStrings.Flags]
}

object NodeBase {
  @scala.inline
  def apply(
    end: scala.Double,
    parent: js.UndefOr[scala.Null] with (js.UndefOr[RegExpLiteral | scala.Null]) with (js.UndefOr[Pattern | Group | CapturingGroup | LookaroundAssertion]) with (js.UndefOr[Alternative | Quantifier]) with js.UndefOr[Alternative] with js.UndefOr[CharacterClass] with (js.UndefOr[Alternative | Quantifier | CharacterClass]) with (js.UndefOr[Alternative | Quantifier | CharacterClass | CharacterClassRange]),
    raw: java.lang.String,
    start: scala.Double,
    `type`: js.UndefOr[regexppLib.regexppLibStrings.RegExpLiteral] with js.UndefOr[regexppLib.regexppLibStrings.Pattern] with js.UndefOr[regexppLib.regexppLibStrings.Alternative] with js.UndefOr[regexppLib.regexppLibStrings.Group] with js.UndefOr[regexppLib.regexppLibStrings.CapturingGroup] with js.UndefOr[regexppLib.regexppLibStrings.Quantifier] with js.UndefOr[regexppLib.regexppLibStrings.CharacterClass] with js.UndefOr[regexppLib.regexppLibStrings.Assertion] with js.UndefOr[regexppLib.regexppLibStrings.CharacterClassRange] with js.UndefOr[regexppLib.regexppLibStrings.CharacterSet] with js.UndefOr[regexppLib.regexppLibStrings.Character] with js.UndefOr[regexppLib.regexppLibStrings.Backreference] with js.UndefOr[regexppLib.regexppLibStrings.Flags]
  ): NodeBase = {
    val __obj = js.Dynamic.literal(end = end, parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeBase]
  }
}

