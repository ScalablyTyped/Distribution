package typings
package regexppLib.astMod

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
  var type_Character: regexppLib.regexppLibStrings.Character
  var value: scala.Double
}

object Character {
  @scala.inline
  def apply(
    end: scala.Double,
    parent: Alternative | Quantifier | CharacterClass | CharacterClassRange,
    raw: java.lang.String,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.Character,
    value: scala.Double
  ): Character = {
    val __obj = js.Dynamic.literal(end = end, parent = parent.asInstanceOf[js.Any], raw = raw, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Character]
  }
}

