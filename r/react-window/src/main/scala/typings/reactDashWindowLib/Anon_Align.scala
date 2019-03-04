package typings
package reactDashWindowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: js.UndefOr[reactDashWindowLib.reactDashWindowMod.Align] = js.undefined
  var columnIndex: scala.Double
  var rowIndex: scala.Double
}

object Anon_Align {
  @scala.inline
  def apply(
    columnIndex: scala.Double,
    rowIndex: scala.Double,
    align: reactDashWindowLib.reactDashWindowMod.Align = null
  ): Anon_Align = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex, rowIndex = rowIndex)
    if (align != null) __obj.updateDynamic("align")(align)
    __obj.asInstanceOf[Anon_Align]
  }
}

