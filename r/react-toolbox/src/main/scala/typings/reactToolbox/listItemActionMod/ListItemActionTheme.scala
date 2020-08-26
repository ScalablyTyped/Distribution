package typings.reactToolbox.listItemActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemActionTheme extends js.Object {
  /**
    * Used for each action element (left/right).
    */
  var itemAction: js.UndefOr[String] = js.native
}

object ListItemActionTheme {
  @scala.inline
  def apply(): ListItemActionTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemActionTheme]
  }
  @scala.inline
  implicit class ListItemActionThemeOps[Self <: ListItemActionTheme] (val x: Self) extends AnyVal {
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
    def setItemAction(value: String): Self = this.set("itemAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemAction: Self = this.set("itemAction", js.undefined)
  }
  
}

