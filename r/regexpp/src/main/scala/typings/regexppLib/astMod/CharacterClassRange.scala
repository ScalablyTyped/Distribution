package typings
package regexppLib.astMod

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
  var type_CharacterClassRange: regexppLib.regexppLibStrings.CharacterClassRange
}

object CharacterClassRange {
  @scala.inline
  def apply(
    end: scala.Double,
    max: Character,
    min: Character,
    parent: CharacterClass,
    raw: java.lang.String,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.CharacterClassRange
  ): CharacterClassRange = {
    val __obj = js.Dynamic.literal(end = end, max = max, min = min, parent = parent, raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CharacterClassRange]
  }
}

