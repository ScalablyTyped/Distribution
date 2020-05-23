package typings.spotifyWebApiJs.SpotifyApi

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
  def apply(
    after: js.UndefOr[Double] = js.undefined,
    before: js.UndefOr[Double] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined
  ): RecentlyPlayedParameterObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(after)) __obj.updateDynamic("after")(after.get.asInstanceOf[js.Any])
    if (!js.isUndefined(before)) __obj.updateDynamic("before")(before.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecentlyPlayedParameterObject]
  }
}

