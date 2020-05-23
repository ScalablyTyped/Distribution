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
    cols: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined,
    term: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): PseudoTtyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoTtyOptions]
  }
}

