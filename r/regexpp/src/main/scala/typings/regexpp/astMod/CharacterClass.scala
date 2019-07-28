package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterClass
  extends BranchNode
     with NodeBase
     with QuantifiableElement {
  var elements: js.Array[CharacterClassElement]
  var negate: Boolean
  @JSName("parent")
  var parent_CharacterClass: Alternative | Quantifier
  @JSName("type")
  var type_CharacterClass: typings.regexpp.regexppStrings.CharacterClass
}

object CharacterClass {
  @scala.inline
  def apply(
    elements: js.Array[CharacterClassElement],
    end: Double,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.CharacterClass
  ): CharacterClass = {
    val __obj = js.Dynamic.literal(elements = elements, end = end, negate = negate, parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CharacterClass]
  }
}

