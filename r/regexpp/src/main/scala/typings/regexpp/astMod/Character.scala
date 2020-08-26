package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Character
  extends LeafNode
     with NodeBase
     with CharacterClassElement
     with QuantifiableElement {
  @JSName("parent")
  var parent_Character: Alternative | Quantifier | CharacterClass | CharacterClassRange = js.native
  @JSName("type")
  var type_Character: typings.regexpp.regexppStrings.Character = js.native
  var value: Double = js.native
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
  @scala.inline
  implicit class CharacterOps[Self <: Character] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParent(value: Alternative | Quantifier | CharacterClass | CharacterClassRange): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.Character): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

