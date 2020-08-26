package typings.reactToolbox.listItemLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemLayoutTheme extends js.Object {
  /**
    * Added to the inner content if its a disabled item.
    */
  var disabled: js.UndefOr[String] = js.native
  /**
    * Used for the inner content of a list item.
    */
  var item: js.UndefOr[String] = js.native
  /**
    * Added when layout is selectable.
    */
  var selectable: js.UndefOr[String] = js.native
}

object ListItemLayoutTheme {
  @scala.inline
  def apply(): ListItemLayoutTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemLayoutTheme]
  }
  @scala.inline
  implicit class ListItemLayoutThemeOps[Self <: ListItemLayoutTheme] (val x: Self) extends AnyVal {
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
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setSelectable(value: String): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
  }
  
}

