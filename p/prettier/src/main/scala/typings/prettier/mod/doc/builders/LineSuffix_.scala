package typings.prettier.mod.doc.builders

import typings.prettier.prettierStrings.`line-suffix`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineSuffix_ extends _Doc {
  var contents: Doc = js.native
  var `type`: `line-suffix` = js.native
}

object LineSuffix_ {
  @scala.inline
  def apply(contents: Doc, `type`: `line-suffix`): LineSuffix_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSuffix_]
  }
  @scala.inline
  implicit class LineSuffix_Ops[Self <: LineSuffix_] (val x: Self) extends AnyVal {
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
    def setContents(value: Doc): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `line-suffix`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

