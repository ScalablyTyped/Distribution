package typings.semanticUiDropdown.SemanticUI.Dropdown

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-dropdown.SemanticUI.Dropdown.RegExpSettings.Param */
@js.native
trait RegExpSettings_ extends js.Object {
  var escape: RegExp with js.UndefOr[RegExp] = js.native
}

object RegExpSettings_ {
  @scala.inline
  def apply(escape: RegExp with js.UndefOr[RegExp]): RegExpSettings_ = {
    val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpSettings_]
  }
  @scala.inline
  implicit class RegExpSettings_Ops[Self <: RegExpSettings_] (val x: Self) extends AnyVal {
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
    def setEscape(value: RegExp with js.UndefOr[RegExp]): Self = this.set("escape", value.asInstanceOf[js.Any])
  }
  
}

