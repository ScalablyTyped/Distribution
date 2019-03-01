package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoTtyOptions extends js.Object {
  /** The number of columns (default: `80`). */
  var cols: js.UndefOr[scala.Double] = js.undefined
  /** The height in pixels (default: `480`). */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The number of rows (default: `24`). */
  var rows: js.UndefOr[scala.Double] = js.undefined
  /** The value to use for $TERM (default: `'vt100'`) */
  var term: js.UndefOr[java.lang.String] = js.undefined
  /** The width in pixels (default: `640`). */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PseudoTtyOptions {
  @scala.inline
  def apply(
    cols: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    rows: scala.Int | scala.Double = null,
    term: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): PseudoTtyOptions = {
    val __obj = js.Dynamic.literal()
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoTtyOptions]
  }
}

