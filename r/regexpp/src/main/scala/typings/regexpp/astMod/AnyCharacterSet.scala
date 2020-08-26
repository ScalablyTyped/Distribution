package typings.regexpp.astMod

import typings.regexpp.regexppStrings.any
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnyCharacterSet
  extends CharacterSet
     with NodeBase {
  var kind: any = js.native
  @JSName("parent")
  var parent_AnyCharacterSet: Alternative | Quantifier = js.native
  @JSName("type")
  var type_AnyCharacterSet: typings.regexpp.regexppStrings.CharacterSet = js.native
}

object AnyCharacterSet {
  @scala.inline
  def apply(
    end: Double,
    kind: any,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.CharacterSet
  ): AnyCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyCharacterSet]
  }
  @scala.inline
  implicit class AnyCharacterSetOps[Self <: AnyCharacterSet] (val x: Self) extends AnyVal {
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
    def setKind(value: any): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Alternative | Quantifier): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.CharacterSet): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

