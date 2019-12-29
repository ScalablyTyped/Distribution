package typings.regexpp.astMod

import typings.regexpp.regexppStrings.any
import typings.regexpp.regexppStrings.digit
import typings.regexpp.regexppStrings.end
import typings.regexpp.regexppStrings.property
import typings.regexpp.regexppStrings.space
import typings.regexpp.regexppStrings.start
import typings.regexpp.regexppStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.regexpp.astMod.BoundaryAssertion
  - typings.regexpp.astMod.CharacterSet
  - typings.regexpp.astMod.Character
  - typings.regexpp.astMod.Backreference
  - typings.regexpp.astMod.Flags
*/
trait LeafNode extends Node

object LeafNode {
  @scala.inline
  def EscapeCharacterSet(
    end: Double,
    kind: digit | space | word,
    negate: Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.CharacterSet
  ): LeafNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafNode]
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
    unicode: Boolean,
    parent: RegExpLiteral = null
  ): LeafNode = {
    val __obj = js.Dynamic.literal(dotAll = dotAll.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafNode]
  }
  @scala.inline
  def AnyCharacterSet(
    end: Double,
    kind: any,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.CharacterSet
  ): LeafNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafNode]
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
  ): LeafNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafNode]
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
    `type`: typings.regexpp.regexppStrings.CharacterSet,
    value: String = null
  ): LeafNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafNode]
  }
  @scala.inline
  def EdgeAssertion(
    end: Double,
    kind: start | end,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Assertion
  ): LeafNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafNode]
  }
  @scala.inline
  def Character(
    end: Double,
    parent: Alternative | Quantifier | CharacterClass | CharacterClassRange,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Character,
    value: Double
  ): LeafNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafNode]
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
  ): LeafNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafNode]
  }
}

