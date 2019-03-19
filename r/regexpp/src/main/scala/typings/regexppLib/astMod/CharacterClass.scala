package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterClass
  extends BranchNode
     with NodeBase
     with QuantifiableElement {
  var elements: js.Array[CharacterClassElement]
  var negate: scala.Boolean
  @JSName("parent")
  var parent_CharacterClass: Alternative | Quantifier
  @JSName("type")
  var type_CharacterClass: regexppLib.regexppLibStrings.CharacterClass
}

object CharacterClass {
  @scala.inline
  def apply(
    elements: js.Array[CharacterClassElement],
    end: scala.Double,
    negate: scala.Boolean,
    parent: Alternative | Quantifier,
    raw: java.lang.String,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.CharacterClass
  ): CharacterClass = {
    val __obj = js.Dynamic.literal(elements = elements, end = end, negate = negate, parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CharacterClass]
  }
}

