package typings.spotifyDashWebDashApiDashJs.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecentlyPlayedParameterObject extends js.Object {
  var after: js.UndefOr[Double] = js.undefined
  var before: js.UndefOr[Double] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
}

object RecentlyPlayedParameterObject {
  @scala.inline
  def apply(after: Int | Double = null, before: Int | Double = null, limit: Int | Double = null): RecentlyPlayedParameterObject = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecentlyPlayedParameterObject]
  }
}

