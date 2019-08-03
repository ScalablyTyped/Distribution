package typings.segmentDashAnalytics.SegmentAnalyticsNs

import typings.segmentDashAnalytics.Anon_All
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var cookie: js.UndefOr[CookieOptions] = js.undefined
  var group: js.UndefOr[GroupOptions] = js.undefined
  var integrations: js.UndefOr[Anon_All] = js.undefined
  var localStorage: js.UndefOr[StoreOptions] = js.undefined
  var metrics: js.UndefOr[MetricsOptions] = js.undefined
  var user: js.UndefOr[UserOptions] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    cookie: CookieOptions = null,
    group: GroupOptions = null,
    integrations: Anon_All = null,
    localStorage: StoreOptions = null,
    metrics: MetricsOptions = null,
    user: UserOptions = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (group != null) __obj.updateDynamic("group")(group)
    if (integrations != null) __obj.updateDynamic("integrations")(integrations)
    if (localStorage != null) __obj.updateDynamic("localStorage")(localStorage)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[InitOptions]
  }
}

