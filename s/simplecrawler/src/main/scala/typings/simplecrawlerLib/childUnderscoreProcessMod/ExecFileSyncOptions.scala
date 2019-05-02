package typings
package simplecrawlerLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecFileSyncOptions extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var gid: js.UndefOr[scala.Double] = js.undefined
  var input: js.UndefOr[java.lang.String | simplecrawlerLib.Buffer] = js.undefined
  var killSignal: js.UndefOr[java.lang.String] = js.undefined
  var maxBuffer: js.UndefOr[scala.Double] = js.undefined
  var stdio: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var uid: js.UndefOr[scala.Double] = js.undefined
}

object ExecFileSyncOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    encoding: java.lang.String = null,
    env: js.Any = null,
    gid: scala.Int | scala.Double = null,
    input: java.lang.String | simplecrawlerLib.Buffer = null,
    killSignal: java.lang.String = null,
    maxBuffer: scala.Int | scala.Double = null,
    stdio: js.Any = null,
    timeout: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null
  ): ExecFileSyncOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal)
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileSyncOptions]
  }
}

