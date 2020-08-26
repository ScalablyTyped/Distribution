package typings.regexpp.astMod

import typings.regexpp.regexppStrings.any
import typings.regexpp.regexppStrings.digit
import typings.regexpp.regexppStrings.end
import typings.regexpp.regexppStrings.lookahead
import typings.regexpp.regexppStrings.lookbehind
import typings.regexpp.regexppStrings.property
import typings.regexpp.regexppStrings.space
import typings.regexpp.regexppStrings.start
import typings.regexpp.regexppStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.regexpp.astMod.BranchNode
  - typings.regexpp.astMod.LeafNode
*/
trait Node extends js.Object

object Node {
  @scala.inline
  def AnyCharacterSet(
    end: Double,
    kind: any,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.CharacterSet
  ): Node = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def WordBoundaryAssertion(
    end: Double,
    kind: word,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Assertion
  ): Node = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def CharacterClassRange(
    end: Double,
    max: Character,
    min: Character,
    parent: CharacterClass,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.CharacterClassRange
  ): Node = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def RegExpLiteral(
    end: Double,
    flags: Flags,
    parent: Null,
    pattern: Pattern,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.RegExpLiteral
  ): Node = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Quantifier(
    element: QuantifiableElement,
    end: Double,
    greedy: Boolean,
    max: Double,
    min: Double,
    parent: Alternative,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Quantifier
  ): Node = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Backreference(
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    ref: Double | String,
    resolved: CapturingGroup,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Backreference
  ): Node = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def LookaheadAssertion(
    alternatives: js.Array[Alternative],
    end: Double,
    kind: lookahead,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Assertion
  ): Node = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def CapturingGroup(
    alternatives: js.Array[Alternative],
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    references: js.Array[Backreference],
    start: Double,
    `type`: typings.regexpp.regexppStrings.CapturingGroup
  ): Node = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Pattern(
    alternatives: js.Array[Alternative],
    end: Double,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Pattern
  ): Node = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def EscapeCharacterSet(
    end: Double,
    kind: digit | space | word,
    negate: Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.CharacterSet
  ): Node = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def UnicodePropertyCharacterSet(
    end: Double,
    key: String,
    kind: property,
    negate: Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.CharacterSet
  ): Node = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def LookbehindAssertion(
    alternatives: js.Array[Alternative],
    end: Double,
    kind: lookbehind,
    negate: Boolean,
    parent: Alternative,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Assertion
  ): Node = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Character(
    end: Double,
    parent: Alternative | Quantifier | CharacterClass | CharacterClassRange,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Character,
    value: Double
  ): Node = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def CharacterClass(
    elements: js.Array[CharacterClassElement],
    end: Double,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.CharacterClass
  ): Node = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Flags(
    dotAll: Boolean,
    end: Double,
    global: Boolean,
    ignoreCase: Boolean,
    multiline: Boolean,
    raw: String,
    start: Double,
    sticky: Boolean,
    `type`: typings.regexpp.regexppStrings.Flags,
    unicode: Boolean
  ): Node = {
    val __obj = js.Dynamic.literal(dotAll = dotAll.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Group(
    alternatives: js.Array[Alternative],
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Group
  ): Node = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Alternative(
    elements: js.Array[Element],
    end: Double,
    parent: Pattern | Group | CapturingGroup | LookaroundAssertion,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Alternative
  ): Node = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def EdgeAssertion(
    end: Double,
    kind: start | end,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Assertion
  ): Node = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

