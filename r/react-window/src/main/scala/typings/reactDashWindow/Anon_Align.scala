package typings.reactDashWindow

import typings.reactDashWindow.reactDashWindowMod.Align
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: js.UndefOr[Align] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object Anon_Align {
  @scala.inline
  def apply(align: Align = null, columnIndex: Int | Double = null, rowIndex: Int | Double = null): Anon_Align = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Align]
  }
}

