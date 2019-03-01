package typings
package pubnubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FreeSocketKeepAliveTimeout extends js.Object {
  var freeSocketKeepAliveTimeout: js.UndefOr[scala.Double] = js.undefined
  var keepAliveMsecs: js.UndefOr[scala.Double] = js.undefined
  var maxFreeSockets: js.UndefOr[scala.Double] = js.undefined
  var maxSockets: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_FreeSocketKeepAliveTimeout {
  @scala.inline
  def apply(
    freeSocketKeepAliveTimeout: scala.Int | scala.Double = null,
    keepAliveMsecs: scala.Int | scala.Double = null,
    maxFreeSockets: scala.Int | scala.Double = null,
    maxSockets: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): Anon_FreeSocketKeepAliveTimeout = {
    val __obj = js.Dynamic.literal()
    if (freeSocketKeepAliveTimeout != null) __obj.updateDynamic("freeSocketKeepAliveTimeout")(freeSocketKeepAliveTimeout.asInstanceOf[js.Any])
    if (keepAliveMsecs != null) __obj.updateDynamic("keepAliveMsecs")(keepAliveMsecs.asInstanceOf[js.Any])
    if (maxFreeSockets != null) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FreeSocketKeepAliveTimeout]
  }
}

