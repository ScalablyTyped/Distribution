package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowChangeInfo extends js.Object {
  /** The number of columns for the pseudo-TTY. */
  var cols: scala.Double
  /** The height of the pseudo-TTY in pixels. */
  var height: scala.Double
  /** The number of rows for the pseudo-TTY. */
  var rows: scala.Double
  /** The width of the pseudo-TTY in pixels. */
  var width: scala.Double
}

object WindowChangeInfo {
  @scala.inline
  def apply(cols: scala.Double, height: scala.Double, rows: scala.Double, width: scala.Double): WindowChangeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cols")(cols)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("rows")(rows)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[WindowChangeInfo]
  }
}

