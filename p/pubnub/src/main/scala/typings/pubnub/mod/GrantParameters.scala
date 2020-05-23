package typings.pubnub.mod

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
    ttl: js.UndefOr[Double] = js.undefined,
    write: js.UndefOr[Boolean] = js.undefined
  ): GrantParameters = {
    val __obj = js.Dynamic.literal()
    if (authKeys != null) __obj.updateDynamic("authKeys")(authKeys.asInstanceOf[js.Any])
    if (channelGroups != null) __obj.updateDynamic("channelGroups")(channelGroups.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (!js.isUndefined(manage)) __obj.updateDynamic("manage")(manage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(write)) __obj.updateDynamic("write")(write.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantParameters]
  }
}

