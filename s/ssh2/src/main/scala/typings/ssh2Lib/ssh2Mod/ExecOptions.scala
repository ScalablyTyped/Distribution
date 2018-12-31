package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecOptions extends js.Object {
  /** An environment to use for the execution of the command. */
  var env: js.UndefOr[js.Any] = js.undefined
  /** Set to `true` to allocate a pseudo-tty with defaults, or an object containing specific pseudo-tty settings. */
  var pty: js.UndefOr[ssh2Lib.ssh2LibNumbers.`true` | PseudoTtyOptions] = js.undefined
  /** Set either to `true` to use defaults, a number to specify a specific screen number, or an object containing x11 settings. */
  var x11: js.UndefOr[scala.Boolean | scala.Double | X11Options] = js.undefined
}

