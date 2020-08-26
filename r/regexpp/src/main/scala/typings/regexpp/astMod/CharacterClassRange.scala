package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharacterClassRange
  extends BranchNode
     with NodeBase
     with CharacterClassElement {
  var max: Character = js.native
  var min: Character = js.native
  @JSName("parent")
  var parent_CharacterClassRange: CharacterClass = js.native
  @JSName("type")
  var type_CharacterClassRange: typings.regexpp.regexppStrings.CharacterClassRange = js.native
}

object CharacterClassRange {
  @scala.inline
  def apply(
    end: Double,
    max: Character,
    min: Character,
    parent: CharacterClass,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.CharacterClassRange
  ): CharacterClassRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterClassRange]
  }
  @scala.inline
  implicit class CharacterClassRangeOps[Self <: CharacterClassRange] (val x: Self) extends AnyVal {
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
    def setMax(value: Character): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Character): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: CharacterClass): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.CharacterClassRange): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

