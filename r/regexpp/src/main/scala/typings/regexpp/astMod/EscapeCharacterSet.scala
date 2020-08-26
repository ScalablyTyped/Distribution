package typings.regexpp.astMod

import typings.regexpp.regexppStrings.digit
import typings.regexpp.regexppStrings.space
import typings.regexpp.regexppStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EscapeCharacterSet
  extends CharacterSet
     with NodeBase
     with CharacterClassElement {
  var kind: digit | space | word = js.native
  var negate: Boolean = js.native
  @JSName("parent")
  var parent_EscapeCharacterSet: Alternative | Quantifier | CharacterClass = js.native
  @JSName("type")
  var type_EscapeCharacterSet: typings.regexpp.regexppStrings.CharacterSet = js.native
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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EscapeCharacterSet]
  }
  @scala.inline
  implicit class EscapeCharacterSetOps[Self <: EscapeCharacterSet] (val x: Self) extends AnyVal {
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
    def setKind(value: digit | space | word): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegate(value: Boolean): Self = this.set("negate", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Alternative | Quantifier | CharacterClass): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.CharacterSet): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

