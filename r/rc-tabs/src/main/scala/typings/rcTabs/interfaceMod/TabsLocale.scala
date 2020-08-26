package typings.rcTabs.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsLocale extends js.Object {
  var addAriaLabel: js.UndefOr[String] = js.native
  var dropdownAriaLabel: js.UndefOr[String] = js.native
  var removeAriaLabel: js.UndefOr[String] = js.native
}

object TabsLocale {
  @scala.inline
  def apply(): TabsLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsLocale]
  }
  @scala.inline
  implicit class TabsLocaleOps[Self <: TabsLocale] (val x: Self) extends AnyVal {
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
    def setAddAriaLabel(value: String): Self = this.set("addAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddAriaLabel: Self = this.set("addAriaLabel", js.undefined)
    @scala.inline
    def setDropdownAriaLabel(value: String): Self = this.set("dropdownAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownAriaLabel: Self = this.set("dropdownAriaLabel", js.undefined)
    @scala.inline
    def setRemoveAriaLabel(value: String): Self = this.set("removeAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveAriaLabel: Self = this.set("removeAriaLabel", js.undefined)
  }
  
}

