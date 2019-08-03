package typings.segmentDashAnalytics.SegmentAnalyticsNs

import typings.segmentDashAnalytics.Anon_Key
import typings.segmentDashAnalytics.Anon_KeyString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOptions extends js.Object {
  var cookie: js.UndefOr[Anon_Key] = js.undefined
  var localStorage: js.UndefOr[Anon_KeyString] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
}

object UserOptions {
  @scala.inline
  def apply(
    cookie: Anon_Key = null,
    localStorage: Anon_KeyString = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): UserOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (localStorage != null) __obj.updateDynamic("localStorage")(localStorage)
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist)
    __obj.asInstanceOf[UserOptions]
  }
}

