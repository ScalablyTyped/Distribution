package typings.reactMdIcon.iconProviderMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<@react-md/icon.@react-md/icon/types/IconProvider.ConfigurableIcons> */
@js.native
trait ConfiguredIcons extends js.Object {
  var back: ReactNode = js.native
  var checkbox: ReactNode = js.native
  var download: ReactNode = js.native
  var dropdown: ReactNode = js.native
  var expander: ReactNode = js.native
  var forward: ReactNode = js.native
  var menu: ReactNode = js.native
  var notification: ReactNode = js.native
  var password: ReactNode = js.native
  var radio: ReactNode = js.native
  var selected: ReactNode = js.native
  var sort: ReactNode = js.native
}

object ConfiguredIcons {
  @scala.inline
  def apply(): ConfiguredIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfiguredIcons]
  }
  @scala.inline
  implicit class ConfiguredIconsOps[Self <: ConfiguredIcons] (val x: Self) extends AnyVal {
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
    def setBack(value: ReactNode): Self = this.set("back", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBack: Self = this.set("back", js.undefined)
    @scala.inline
    def setCheckbox(value: ReactNode): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckbox: Self = this.set("checkbox", js.undefined)
    @scala.inline
    def setDownload(value: ReactNode): Self = this.set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    @scala.inline
    def setDropdown(value: ReactNode): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdown: Self = this.set("dropdown", js.undefined)
    @scala.inline
    def setExpander(value: ReactNode): Self = this.set("expander", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpander: Self = this.set("expander", js.undefined)
    @scala.inline
    def setForward(value: ReactNode): Self = this.set("forward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForward: Self = this.set("forward", js.undefined)
    @scala.inline
    def setMenu(value: ReactNode): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    @scala.inline
    def setNotification(value: ReactNode): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    @scala.inline
    def setPassword(value: ReactNode): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setRadio(value: ReactNode): Self = this.set("radio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadio: Self = this.set("radio", js.undefined)
    @scala.inline
    def setSelected(value: ReactNode): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSort(value: ReactNode): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

