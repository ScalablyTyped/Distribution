package typings.segmentAnalytics.SegmentAnalytics

import typings.segmentAnalytics.anon.Key
import typings.segmentAnalytics.anon.KeyString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOptions extends js.Object {
  var cookie: js.UndefOr[Key] = js.undefined
  var localStorage: js.UndefOr[KeyString] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
}

object UserOptions {
  @scala.inline
  def apply(cookie: Key = null, localStorage: KeyString = null, persist: js.UndefOr[Boolean] = js.undefined): UserOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (localStorage != null) __obj.updateDynamic("localStorage")(localStorage.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOptions]
  }
}

