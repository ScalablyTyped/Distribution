package typings.shelljs.anon

import typings.node.NodeJS.ProcessEnv
import typings.node.NodeJS.Signals
import typings.shelljs.shelljsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined shelljs.shelljs.ExecOptions & {  async ? :false} */
trait ExecOptionsasyncfalse extends js.Object {
  /**
    * Asynchronous execution.
    *
    * If a callback is provided, it will be set to `true`, regardless of the passed value.
    *
    * @default false
    */
  var async: js.UndefOr[Boolean with `false`] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * Character encoding to use.
    *
    * Affects the values returned by `stdout` and `stderr`,
    * and what is written to `stdout` and `stderr` when not in silent mode
    *
    * @default "utf8"
    */
  var encoding: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[ProcessEnv] = js.undefined
  /**
    * Exit when command return code is non-zero.
    *
    * @default false
    */
  var fatal: js.UndefOr[Boolean] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var killSignal: js.UndefOr[Signals | Double] = js.undefined
  var maxBuffer: js.UndefOr[Double] = js.undefined
  var shell: js.UndefOr[String] = js.undefined
  /**
    * Do not echo program output to the console.
    *
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * @default 0
    */
  var timeout: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
  /**
    * @default true
    */
  var windowsHide: js.UndefOr[Boolean] = js.undefined
}

object ExecOptionsasyncfalse {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean with `false`] = js.undefined,
    cwd: String = null,
    encoding: String = null,
    env: ProcessEnv = null,
    fatal: js.UndefOr[Boolean] = js.undefined,
    gid: js.UndefOr[Double] = js.undefined,
    killSignal: Signals | Double = null,
    maxBuffer: js.UndefOr[Double] = js.undefined,
    shell: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    uid: js.UndefOr[Double] = js.undefined,
    windowsHide: js.UndefOr[Boolean] = js.undefined
  ): ExecOptionsasyncfalse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(fatal)) __obj.updateDynamic("fatal")(fatal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBuffer)) __obj.updateDynamic("maxBuffer")(maxBuffer.get.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecOptionsasyncfalse]
  }
}

