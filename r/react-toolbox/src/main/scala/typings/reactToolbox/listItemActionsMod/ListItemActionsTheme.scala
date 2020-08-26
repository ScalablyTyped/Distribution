package typings.reactToolbox.listItemActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemActionsTheme extends js.Object {
  /**
    * Added for the element that wraps left actions.
    */
  var left: js.UndefOr[String] = js.native
  /**
    * Added for the element that wraps right actions.
    */
  var right: js.UndefOr[String] = js.native
}

object ListItemActionsTheme {
  @scala.inline
  def apply(): ListItemActionsTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemActionsTheme]
  }
  @scala.inline
  implicit class ListItemActionsThemeOps[Self <: ListItemActionsTheme] (val x: Self) extends AnyVal {
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
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
  }
  
}

