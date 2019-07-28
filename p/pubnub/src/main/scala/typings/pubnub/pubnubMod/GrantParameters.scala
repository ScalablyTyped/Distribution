package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// grant
trait GrantParameters extends js.Object {
  var authKeys: js.UndefOr[js.Array[String]] = js.undefined
  var channelGroups: js.UndefOr[js.Array[String]] = js.undefined
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  var manage: js.UndefOr[Boolean] = js.undefined
  var read: js.UndefOr[Boolean] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
  var write: js.UndefOr[Boolean] = js.undefined
}

object GrantParameters {
  @scala.inline
  def apply(
    authKeys: js.Array[String] = null,
    channelGroups: js.Array[String] = null,
    channels: js.Array[String] = null,
    manage: js.UndefOr[Boolean] = js.undefined,
    read: js.UndefOr[Boolean] = js.undefined,
    ttl: Int | Double = null,
    write: js.UndefOr[Boolean] = js.undefined
  ): GrantParameters = {
    val __obj = js.Dynamic.literal()
    if (authKeys != null) __obj.updateDynamic("authKeys")(authKeys)
    if (channelGroups != null) __obj.updateDynamic("channelGroups")(channelGroups)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (!js.isUndefined(manage)) __obj.updateDynamic("manage")(manage)
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (!js.isUndefined(write)) __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[GrantParameters]
  }
}

