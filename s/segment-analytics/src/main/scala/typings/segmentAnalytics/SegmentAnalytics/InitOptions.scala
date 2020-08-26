package typings.segmentAnalytics.SegmentAnalytics

import typings.segmentAnalytics.anon.Dictintegration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitOptions extends js.Object {
  var cookie: js.UndefOr[CookieOptions] = js.native
  var group: js.UndefOr[GroupOptions] = js.native
  var integrations: js.UndefOr[Dictintegration] = js.native
  var localStorage: js.UndefOr[StoreOptions] = js.native
  var metrics: js.UndefOr[MetricsOptions] = js.native
  var user: js.UndefOr[UserOptions] = js.native
}

object InitOptions {
  @scala.inline
  def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
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
    def setCookie(value: CookieOptions): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    @scala.inline
    def setGroup(value: GroupOptions): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setIntegrations(value: Dictintegration): Self = this.set("integrations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrations: Self = this.set("integrations", js.undefined)
    @scala.inline
    def setLocalStorage(value: StoreOptions): Self = this.set("localStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalStorage: Self = this.set("localStorage", js.undefined)
    @scala.inline
    def setMetrics(value: MetricsOptions): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setUser(value: UserOptions): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

