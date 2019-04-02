package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecOptions
  extends nodeLib.childUnderscoreProcessMod.ExecOptions {
  /**
  	 * Asynchronous execution.
  	 *
  	 * If a callback is provided, it will be set to `true`, regardless of the passed value.
  	 *
  	 * @default false
  	 */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Character encoding to use.
  	 *
  	 * Affects the values returned by `stdout` and `stderr`,
  	 * and what is written to `stdout` and `stderr` when not in silent mode
  	 *
  	 * @default "utf8"
  	 */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Do not echo program output to the console.
  	 *
  	 * @default false
  	 */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object ExecOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    encoding: java.lang.String = null,
    env: nodeLib.NodeJSNs.ProcessEnv = null,
    gid: scala.Int | scala.Double = null,
    killSignal: java.lang.String = null,
    maxBuffer: scala.Int | scala.Double = null,
    shell: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null,
    windowsHide: js.UndefOr[scala.Boolean] = js.undefined
  ): ExecOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal)
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide)
    __obj.asInstanceOf[ExecOptions]
  }
}

