package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ShellOptions extends js.Object {
  /** Set either to `true` to use defaults, a number to specify a specific screen number, or an object containing x11 settings. */
  var x11: js.UndefOr[scala.Boolean | scala.Double | X11Options] = js.undefined
}

