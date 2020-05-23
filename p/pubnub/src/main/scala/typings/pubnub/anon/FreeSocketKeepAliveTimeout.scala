package typings.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeSocketKeepAliveTimeout extends js.Object {
  var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined
  var keepAliveMsecs: js.UndefOr[Double] = js.undefined
  var maxFreeSockets: js.UndefOr[Double] = js.undefined
  var maxSockets: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object FreeSocketKeepAliveTimeout {
  @scala.inline
  def apply(
    freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined,
    keepAliveMsecs: js.UndefOr[Double] = js.undefined,
    maxFreeSockets: js.UndefOr[Double] = js.undefined,
    maxSockets: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): FreeSocketKeepAliveTimeout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(freeSocketKeepAliveTimeout)) __obj.updateDynamic("freeSocketKeepAliveTimeout")(freeSocketKeepAliveTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveMsecs)) __obj.updateDynamic("keepAliveMsecs")(keepAliveMsecs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFreeSockets)) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSockets)) __obj.updateDynamic("maxSockets")(maxSockets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeSocketKeepAliveTimeout]
  }
}

