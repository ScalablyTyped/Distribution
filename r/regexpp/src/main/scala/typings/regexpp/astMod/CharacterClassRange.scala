package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterClassRange
  extends BranchNode
     with NodeBase
     with CharacterClassElement {
  var max: Character
  var min: Character
  @JSName("parent")
  var parent_CharacterClassRange: CharacterClass
  @JSName("type")
  var type_CharacterClassRange: typings.regexpp.regexppStrings.CharacterClassRange
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
    val __obj = js.Dynamic.literal(end = end, max = max, min = min, parent = parent, raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CharacterClassRange]
  }
}

