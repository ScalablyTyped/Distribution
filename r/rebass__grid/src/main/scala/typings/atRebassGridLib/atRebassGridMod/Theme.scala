package typings
package atRebassGridLib.atRebassGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var breakpoints: js.Array[java.lang.String]
  var fontSizes: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var space: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Theme {
  @scala.inline
  def apply(
    breakpoints: js.Array[java.lang.String],
    fontSizes: js.Array[scala.Double] = null,
    space: js.Array[scala.Double] = null
  ): Theme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("breakpoints")(breakpoints)
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes)
    if (space != null) __obj.updateDynamic("space")(space)
    __obj.asInstanceOf[Theme]
  }
}

