package typings.ssh2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoTtyOptions extends js.Object {
  /** The number of columns (default: `80`). */
  var cols: js.UndefOr[Double] = js.undefined
  /** The height in pixels (default: `480`). */
  var height: js.UndefOr[Double] = js.undefined
  /** The number of rows (default: `24`). */
  var rows: js.UndefOr[Double] = js.undefined
  /** The value to use for $TERM (default: `'vt100'`) */
  var term: js.UndefOr[String] = js.undefined
  /** The width in pixels (default: `640`). */
  var width: js.UndefOr[Double] = js.undefined
}

object PseudoTtyOptions {
  @scala.inline
  def apply(
    cols: Int | Double = null,
    height: Int | Double = null,
    rows: Int | Double = null,
    term: String = null,
    width: Int | Double = null
  ): PseudoTtyOptions = {
    val __obj = js.Dynamic.literal()
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoTtyOptions]
  }
}

