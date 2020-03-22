package typings.rascal

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var channelMax: js.UndefOr[Double] = js.undefined
  var connection_timeout: js.UndefOr[Double] = js.undefined
  var heartbeat: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object AnonDictkey {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    channelMax: Int | Double = null,
    connection_timeout: Int | Double = null,
    heartbeat: Int | Double = null,
    timeout: Int | Double = null
  ): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (channelMax != null) __obj.updateDynamic("channelMax")(channelMax.asInstanceOf[js.Any])
    if (connection_timeout != null) __obj.updateDynamic("connection_timeout")(connection_timeout.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
}

