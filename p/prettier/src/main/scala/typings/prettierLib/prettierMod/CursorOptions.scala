package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorOptions extends Options {
  /**
    * Specify where the cursor is.
    */
  var cursorOffset: scala.Double
  var rangeEnd: js.UndefOr[scala.Nothing] = js.undefined
  var rangeStart: js.UndefOr[scala.Nothing] = js.undefined
}

object CursorOptions {
  @scala.inline
  def apply(
    cursorOffset: scala.Double,
    rangeEnd: js.UndefOr[scala.Nothing] = js.undefined,
    rangeStart: js.UndefOr[scala.Nothing] = js.undefined
  ): CursorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cursorOffset")(cursorOffset)
    if (!js.isUndefined(rangeEnd)) __obj.updateDynamic("rangeEnd")(rangeEnd)
    if (!js.isUndefined(rangeStart)) __obj.updateDynamic("rangeStart")(rangeStart)
    __obj.asInstanceOf[CursorOptions]
  }
}

