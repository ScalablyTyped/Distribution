package typings.reactToolbox.tabContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabContentTheme extends js.Object {
  /**
    * Added when tab is active.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * Used for the tab content element.
    */
  var tab: js.UndefOr[String] = js.native
}

object TabContentTheme {
  @scala.inline
  def apply(): TabContentTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabContentTheme]
  }
  @scala.inline
  implicit class TabContentThemeOps[Self <: TabContentTheme] (val x: Self) extends AnyVal {
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setTab(value: String): Self = this.set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
  }
  
}

