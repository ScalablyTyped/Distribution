package typings.skyway

import typings.std.RTCConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var config: js.UndefOr[RTCConfiguration] = js.undefined
  var credential: js.UndefOr[Credential] = js.undefined
  var debug: js.UndefOr[Double] = js.undefined
  var key: String
  var turn: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    key: String,
    config: RTCConfiguration = null,
    credential: Credential = null,
    debug: Int | Double = null,
    turn: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (credential != null) __obj.updateDynamic("credential")(credential.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(turn)) __obj.updateDynamic("turn")(turn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

