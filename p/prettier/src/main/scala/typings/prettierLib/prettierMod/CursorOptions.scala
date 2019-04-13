package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof prettier.prettier.RequiredOptions ]:? prettier.prettier.RequiredOptions[P]} */ trait CursorOptions extends js.Object {
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
    val __obj = js.Dynamic.literal(cursorOffset = cursorOffset)
    if (!js.isUndefined(rangeEnd)) __obj.updateDynamic("rangeEnd")(rangeEnd)
    if (!js.isUndefined(rangeStart)) __obj.updateDynamic("rangeStart")(rangeStart)
    __obj.asInstanceOf[CursorOptions]
  }
}

