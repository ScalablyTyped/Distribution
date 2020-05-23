package typings.rcTable.anon

import typings.rcTable.interfaceMod.CustomizeComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell extends js.Object {
  var cell: js.UndefOr[CustomizeComponent] = js.undefined
  var row: js.UndefOr[CustomizeComponent] = js.undefined
  var wrapper: js.UndefOr[CustomizeComponent] = js.undefined
}

object Cell {
  @scala.inline
  def apply(
    cell: CustomizeComponent = null,
    row: CustomizeComponent = null,
    wrapper: CustomizeComponent = null
  ): Cell = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
}

