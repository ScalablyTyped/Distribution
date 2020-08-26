package typings.reactToolbox.tabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabTheme extends js.Object {
  /**
    * Added to the navigation tab element in case it's active.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * Added to the navigation tab element in case it's disabled.
    */
  var disabled: js.UndefOr[String] = js.native
  /**
    * Added to the navigation tab element in case it's hidden.
    */
  var hidden: js.UndefOr[String] = js.native
  /**
    * Added to the navigation tab element in case it's active.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Class added when icon is set.
    */
  var withIcon: js.UndefOr[String] = js.native
  /**
    * Class added when label is set.
    */
  var withText: js.UndefOr[String] = js.native
}

object TabTheme {
  @scala.inline
  def apply(): TabTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabTheme]
  }
  @scala.inline
  implicit class TabThemeOps[Self <: TabTheme] (val x: Self) extends AnyVal {
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
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setWithIcon(value: String): Self = this.set("withIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithIcon: Self = this.set("withIcon", js.undefined)
    @scala.inline
    def setWithText(value: String): Self = this.set("withText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithText: Self = this.set("withText", js.undefined)
  }
  
}

