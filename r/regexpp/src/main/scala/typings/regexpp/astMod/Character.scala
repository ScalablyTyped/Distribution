package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Character
  extends LeafNode
     with NodeBase
     with CharacterClassElement
     with QuantifiableElement {
  @JSName("parent")
  var parent_Character: Alternative | Quantifier | CharacterClass | CharacterClassRange
  @JSName("type")
  var type_Character: typings.regexpp.regexppStrings.Character
  var value: Double
}

object Character {
  @scala.inline
  def apply(
    end: Double,
    parent: Alternative | Quantifier | CharacterClass | CharacterClassRange,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Character,
    value: Double
  ): Character = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Character]
  }
}

