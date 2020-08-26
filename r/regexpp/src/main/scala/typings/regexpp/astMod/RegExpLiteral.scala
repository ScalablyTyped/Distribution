package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExpLiteral
  extends BranchNode
     with NodeBase {
  var flags: Flags = js.native
  @JSName("parent")
  var parent_RegExpLiteral: Null = js.native
  var pattern: Pattern = js.native
  @JSName("type")
  var type_RegExpLiteral: typings.regexpp.regexppStrings.RegExpLiteral = js.native
}

object RegExpLiteral {
  @scala.inline
  def apply(
    end: Double,
    flags: Flags,
    parent: Null,
    pattern: Pattern,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.RegExpLiteral
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral]
  }
  @scala.inline
  implicit class RegExpLiteralOps[Self <: RegExpLiteral] (val x: Self) extends AnyVal {
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
    def setFlags(value: Flags): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Null): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: Pattern): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.RegExpLiteral): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

