package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flags
  extends LeafNode
     with NodeBase {
  var dotAll: Boolean = js.native
  var global: Boolean = js.native
  var ignoreCase: Boolean = js.native
  var multiline: Boolean = js.native
  @JSName("parent")
  var parent_Flags: RegExpLiteral | Null = js.native
  var sticky: Boolean = js.native
  @JSName("type")
  var type_Flags: typings.regexpp.regexppStrings.Flags = js.native
  var unicode: Boolean = js.native
}

object Flags {
  @scala.inline
  def apply(
    dotAll: Boolean,
    end: Double,
    global: Boolean,
    ignoreCase: Boolean,
    multiline: Boolean,
    raw: String,
    start: Double,
    sticky: Boolean,
    `type`: typings.regexpp.regexppStrings.Flags,
    unicode: Boolean
  ): Flags = {
    val __obj = js.Dynamic.literal(dotAll = dotAll.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
  @scala.inline
  implicit class FlagsOps[Self <: Flags] (val x: Self) extends AnyVal {
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
    def setDotAll(value: Boolean): Self = this.set("dotAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def setSticky(value: Boolean): Self = this.set("sticky", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.Flags): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnicode(value: Boolean): Self = this.set("unicode", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: RegExpLiteral): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
  
}

