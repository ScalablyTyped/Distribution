package typings.reactMdTabs.typesMod

import typings.reactMdTabs.reactMdTabsStrings.horizontal
import typings.reactMdTabs.reactMdTabsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsConfig extends js.Object {
  /**
    * The alignment to use for the tabs.
    */
  var align: js.UndefOr[TabsAlignment] = js.native
  /**
    * Boolean if the tab should automatically become active when the user
    * navigates to the tab with the arrow keys.
    *
    * @see https://www.w3.org/TR/wai-aria-practices/#kbd_selection_follows_focus
    */
  var automatic: js.UndefOr[Boolean] = js.native
  /**
    * The orientation for the tabs. When this is set to vertical, the keyboard
    * movement will be updated to use Up and Down arrow keys instead of Left and
    * Right.
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Boolean if you know that the tabs will be scrollable which will add some
    * additional padding before the first tab to help users know that there's
    * additional tabs.
    */
  var padded: js.UndefOr[Boolean] = js.native
}

object TabsConfig {
  @scala.inline
  def apply(): TabsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsConfig]
  }
  @scala.inline
  implicit class TabsConfigOps[Self <: TabsConfig] (val x: Self) extends AnyVal {
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
    def setAlign(value: TabsAlignment): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAutomatic(value: Boolean): Self = this.set("automatic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomatic: Self = this.set("automatic", js.undefined)
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPadded(value: Boolean): Self = this.set("padded", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadded: Self = this.set("padded", js.undefined)
  }
  
}

