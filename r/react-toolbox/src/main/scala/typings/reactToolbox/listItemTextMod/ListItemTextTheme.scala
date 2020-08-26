package typings.reactToolbox.listItemTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemTextTheme extends js.Object {
  /**
    * Added to the text inside of the list item.
    */
  var itemText: js.UndefOr[String] = js.native
  /**
    * Added to the text inside of the list item if its primary.
    */
  var primary: js.UndefOr[String] = js.native
}

object ListItemTextTheme {
  @scala.inline
  def apply(): ListItemTextTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemTextTheme]
  }
  @scala.inline
  implicit class ListItemTextThemeOps[Self <: ListItemTextTheme] (val x: Self) extends AnyVal {
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
    def setItemText(value: String): Self = this.set("itemText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemText: Self = this.set("itemText", js.undefined)
    @scala.inline
    def setPrimary(value: String): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
  }
  
}

