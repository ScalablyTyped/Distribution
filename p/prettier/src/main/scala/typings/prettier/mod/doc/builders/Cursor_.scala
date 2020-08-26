package typings.prettier.mod.doc.builders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cursor_ extends _Doc {
  var placeholder: js.Symbol = js.native
  var `type`: typings.prettier.prettierStrings.cursor = js.native
}

object Cursor_ {
  @scala.inline
  def apply(placeholder: js.Symbol, `type`: typings.prettier.prettierStrings.cursor): Cursor_ = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursor_]
  }
  @scala.inline
  implicit class Cursor_Ops[Self <: Cursor_] (val x: Self) extends AnyVal {
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
    def setPlaceholder(value: js.Symbol): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.prettier.prettierStrings.cursor): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

