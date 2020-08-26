package typings.reactToolbox.listCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCheckboxTheme extends js.Object {
  /**
    * Used as a wrapper class for the subheader element.
    */
  var checkbox: js.UndefOr[String] = js.native
  /**
    * Added to the checkbox element.
    */
  var checkboxItem: js.UndefOr[String] = js.native
  /**
    * Added to the inner content if its a disabled item.
    */
  var disabled: js.UndefOr[String] = js.native
  /**
    * Used for the inner content of a list item.
    */
  var item: js.UndefOr[String] = js.native
}

object ListCheckboxTheme {
  @scala.inline
  def apply(): ListCheckboxTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCheckboxTheme]
  }
  @scala.inline
  implicit class ListCheckboxThemeOps[Self <: ListCheckboxTheme] (val x: Self) extends AnyVal {
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
    def setCheckbox(value: String): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckbox: Self = this.set("checkbox", js.undefined)
    @scala.inline
    def setCheckboxItem(value: String): Self = this.set("checkboxItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxItem: Self = this.set("checkboxItem", js.undefined)
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
  }
  
}

