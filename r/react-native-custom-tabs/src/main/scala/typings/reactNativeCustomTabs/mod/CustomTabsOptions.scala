package typings.reactNativeCustomTabs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomTabsOptions extends js.Object {
  var animations: js.UndefOr[Animations] = js.native
  var enableDefaultShare: js.UndefOr[Boolean] = js.native
  var enableUrlBarHiding: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var showPageTitle: js.UndefOr[Boolean] = js.native
  var toolbarColor: js.UndefOr[String] = js.native
}

object CustomTabsOptions {
  @scala.inline
  def apply(): CustomTabsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTabsOptions]
  }
  @scala.inline
  implicit class CustomTabsOptionsOps[Self <: CustomTabsOptions] (val x: Self) extends AnyVal {
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
    def setAnimations(value: Animations): Self = this.set("animations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimations: Self = this.set("animations", js.undefined)
    @scala.inline
    def setEnableDefaultShare(value: Boolean): Self = this.set("enableDefaultShare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDefaultShare: Self = this.set("enableDefaultShare", js.undefined)
    @scala.inline
    def setEnableUrlBarHiding(value: Boolean): Self = this.set("enableUrlBarHiding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableUrlBarHiding: Self = this.set("enableUrlBarHiding", js.undefined)
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setShowPageTitle(value: Boolean): Self = this.set("showPageTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPageTitle: Self = this.set("showPageTitle", js.undefined)
    @scala.inline
    def setToolbarColor(value: String): Self = this.set("toolbarColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarColor: Self = this.set("toolbarColor", js.undefined)
  }
  
}

