package typings.regexpp.astMod

import typings.regexpp.regexppStrings.digit
import typings.regexpp.regexppStrings.space
import typings.regexpp.regexppStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EscapeCharacterSet
  extends CharacterSet
     with NodeBase
     with CharacterClassElement {
  var kind: digit | space | word
  var negate: Boolean
  @JSName("parent")
  var parent_EscapeCharacterSet: Alternative | Quantifier | CharacterClass
  @JSName("type")
  var type_EscapeCharacterSet: typings.regexpp.regexppStrings.CharacterSet
}

object EscapeCharacterSet {
  @scala.inline
  def apply(
    end: Double,
    kind: digit | space | word,
    negate: Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.CharacterSet
  ): EscapeCharacterSet = {
    val __obj = js.Dynamic.literal(end = end, kind = kind.asInstanceOf[js.Any], negate = negate, parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EscapeCharacterSet]
  }
}

