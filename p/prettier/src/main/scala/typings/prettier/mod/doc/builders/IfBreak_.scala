package typings.prettier.mod.doc.builders

import typings.prettier.prettierStrings.`if-break`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfBreak_ extends _Doc {
  var breakContents: Doc = js.native
  var flatContents: Doc = js.native
  var `type`: `if-break` = js.native
}

object IfBreak_ {
  @scala.inline
  def apply(breakContents: Doc, flatContents: Doc, `type`: `if-break`): IfBreak_ = {
    val __obj = js.Dynamic.literal(breakContents = breakContents.asInstanceOf[js.Any], flatContents = flatContents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfBreak_]
  }
  @scala.inline
  implicit class IfBreak_Ops[Self <: IfBreak_] (val x: Self) extends AnyVal {
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
    def setBreakContents(value: Doc): Self = this.set("breakContents", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlatContents(value: Doc): Self = this.set("flatContents", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `if-break`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

