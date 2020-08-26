package typings.ravenJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoBreadcrumbOptions extends js.Object {
  var console: js.UndefOr[Boolean] = js.native
  var dom: js.UndefOr[Boolean] = js.native
  var location: js.UndefOr[Boolean] = js.native
  var sentry: js.UndefOr[Boolean] = js.native
  var xhr: js.UndefOr[Boolean] = js.native
}

object AutoBreadcrumbOptions {
  @scala.inline
  def apply(): AutoBreadcrumbOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoBreadcrumbOptions]
  }
  @scala.inline
  implicit class AutoBreadcrumbOptionsOps[Self <: AutoBreadcrumbOptions] (val x: Self) extends AnyVal {
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
    def setConsole(value: Boolean): Self = this.set("console", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsole: Self = this.set("console", js.undefined)
    @scala.inline
    def setDom(value: Boolean): Self = this.set("dom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDom: Self = this.set("dom", js.undefined)
    @scala.inline
    def setLocation(value: Boolean): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setSentry(value: Boolean): Self = this.set("sentry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentry: Self = this.set("sentry", js.undefined)
    @scala.inline
    def setXhr(value: Boolean): Self = this.set("xhr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
  
}

