package typings.ssh2.mod

import typings.node.NodeJS.ProcessEnv
import typings.ssh2.ssh2Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecOptions extends js.Object {
  /** An environment to use for the execution of the command. */
  var env: js.UndefOr[ProcessEnv] = js.undefined
  /** Set to `true` to allocate a pseudo-tty with defaults, or an object containing specific pseudo-tty settings. */
  var pty: js.UndefOr[`true` | PseudoTtyOptions] = js.undefined
  /** Set either to `true` to use defaults, a number to specify a specific screen number, or an object containing x11 settings. */
  var x11: js.UndefOr[Boolean | Double | X11Options] = js.undefined
}

object ExecOptions {
  @scala.inline
  def apply(
    env: ProcessEnv = null,
    pty: `true` | PseudoTtyOptions = null,
    x11: Boolean | Double | X11Options = null
  ): ExecOptions = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (pty != null) __obj.updateDynamic("pty")(pty.asInstanceOf[js.Any])
    if (x11 != null) __obj.updateDynamic("x11")(x11.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecOptions]
  }
}

