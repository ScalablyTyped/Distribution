package typings.segmentAnalytics.SegmentAnalytics

import typings.segmentAnalytics.anon.Dictintegration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var cookie: js.UndefOr[CookieOptions] = js.undefined
  var group: js.UndefOr[GroupOptions] = js.undefined
  var integrations: js.UndefOr[Dictintegration] = js.undefined
  var localStorage: js.UndefOr[StoreOptions] = js.undefined
  var metrics: js.UndefOr[MetricsOptions] = js.undefined
  var user: js.UndefOr[UserOptions] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    cookie: CookieOptions = null,
    group: GroupOptions = null,
    integrations: Dictintegration = null,
    localStorage: StoreOptions = null,
    metrics: MetricsOptions = null,
    user: UserOptions = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (integrations != null) __obj.updateDynamic("integrations")(integrations.asInstanceOf[js.Any])
    if (localStorage != null) __obj.updateDynamic("localStorage")(localStorage.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}

