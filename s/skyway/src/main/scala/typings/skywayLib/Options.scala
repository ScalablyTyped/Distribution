package typings
package skywayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var config: js.UndefOr[stdLib.RTCConfiguration] = js.undefined
  var credential: js.UndefOr[Credential] = js.undefined
  var debug: js.UndefOr[scala.Double] = js.undefined
  var key: java.lang.String
  var turn: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    key: java.lang.String,
    config: stdLib.RTCConfiguration = null,
    credential: Credential = null,
    debug: scala.Int | scala.Double = null,
    turn: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    if (config != null) __obj.updateDynamic("config")(config)
    if (credential != null) __obj.updateDynamic("credential")(credential)
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(turn)) __obj.updateDynamic("turn")(turn)
    __obj.asInstanceOf[Options]
  }
}

