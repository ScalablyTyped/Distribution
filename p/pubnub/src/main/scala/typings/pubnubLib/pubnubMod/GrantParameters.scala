package typings
package pubnubLib.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// grant
trait GrantParameters extends js.Object {
  var authKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var channelGroups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var channels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var manage: js.UndefOr[scala.Boolean] = js.undefined
  var read: js.UndefOr[scala.Boolean] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
  var write: js.UndefOr[scala.Boolean] = js.undefined
}

object GrantParameters {
  @scala.inline
  def apply(
    authKeys: js.Array[java.lang.String] = null,
    channelGroups: js.Array[java.lang.String] = null,
    channels: js.Array[java.lang.String] = null,
    manage: js.UndefOr[scala.Boolean] = js.undefined,
    read: js.UndefOr[scala.Boolean] = js.undefined,
    ttl: scala.Int | scala.Double = null,
    write: js.UndefOr[scala.Boolean] = js.undefined
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

