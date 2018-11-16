package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PseudoTtyInfo extends js.Object {
  /** The number of columns for the pseudo-TTY. */
  var cols: scala.Double
  /** The height of the pseudo-TTY in pixels. */
  var height: scala.Double
  /** Contains the requested terminal modes of the pseudo-TTY. */
  var modes: TerminalModes
  /** The number of rows for the pseudo-TTY. */
  var rows: scala.Double
  /** The width of the pseudo-TTY in pixels. */
  var width: scala.Double
}

