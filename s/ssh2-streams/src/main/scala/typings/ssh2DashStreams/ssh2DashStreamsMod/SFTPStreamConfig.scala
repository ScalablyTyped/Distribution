package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SFTPStreamConfig extends js.Object {
  /**
    * Set this to a function that receives a single string argument to get detailed (local) debug information.
    */
  var debug: js.UndefOr[js.Function1[/* information */ String, _]] = js.undefined
  /**
    * This is the highWaterMark to use for the stream.
    */
  var highWaterMark: js.UndefOr[Double] = js.undefined
  /**
    * Set to true to create an instance in server mode.
    */
  var server: js.UndefOr[Boolean] = js.undefined
}

object SFTPStreamConfig {
  @scala.inline
  def apply(
    debug: /* information */ String => _ = null,
    highWaterMark: Int | Double = null,
    server: js.UndefOr[Boolean] = js.undefined
  ): SFTPStreamConfig = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1(debug))
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(server)) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFTPStreamConfig]
  }
}

