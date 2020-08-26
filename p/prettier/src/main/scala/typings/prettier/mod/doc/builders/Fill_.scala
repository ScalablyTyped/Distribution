package typings.prettier.mod.doc.builders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fill_ extends _Doc {
  var parts: js.Array[Doc] = js.native
  var `type`: typings.prettier.prettierStrings.fill = js.native
}

object Fill_ {
  @scala.inline
  def apply(parts: js.Array[Doc], `type`: typings.prettier.prettierStrings.fill): Fill_ = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill_]
  }
  @scala.inline
  implicit class Fill_Ops[Self <: Fill_] (val x: Self) extends AnyVal {
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
    def setPartsVarargs(value: Doc*): Self = this.set("parts", js.Array(value :_*))
    @scala.inline
    def setParts(value: js.Array[Doc]): Self = this.set("parts", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.prettier.prettierStrings.fill): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

