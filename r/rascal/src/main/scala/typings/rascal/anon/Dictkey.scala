package typings.rascal.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var channelMax: js.UndefOr[Double] = js.undefined
  var connection_timeout: js.UndefOr[Double] = js.undefined
  var heartbeat: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    channelMax: js.UndefOr[Double] = js.undefined,
    connection_timeout: js.UndefOr[Double] = js.undefined,
    heartbeat: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(channelMax)) __obj.updateDynamic("channelMax")(channelMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connection_timeout)) __obj.updateDynamic("connection_timeout")(connection_timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeat)) __obj.updateDynamic("heartbeat")(heartbeat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

