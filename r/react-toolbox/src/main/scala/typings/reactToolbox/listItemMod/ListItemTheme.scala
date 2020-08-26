package typings.reactToolbox.listItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemTheme extends js.Object {
  /**
    * Used for the root element of the list.
    */
  var listItem: js.UndefOr[String] = js.native
}

object ListItemTheme {
  @scala.inline
  def apply(): ListItemTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemTheme]
  }
  @scala.inline
  implicit class ListItemThemeOps[Self <: ListItemTheme] (val x: Self) extends AnyVal {
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
    def setListItem(value: String): Self = this.set("listItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListItem: Self = this.set("listItem", js.undefined)
  }
  
}

