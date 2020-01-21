package typings.rcTable

import typings.rcTable.interfaceMod.CustomizeComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCell extends js.Object {
  var cell: js.UndefOr[CustomizeComponent[HTMLAttributes[HTMLElement]]] = js.undefined
  var row: js.UndefOr[CustomizeComponent[HTMLAttributes[HTMLElement]]] = js.undefined
  var wrapper: js.UndefOr[CustomizeComponent[HTMLAttributes[HTMLElement]]] = js.undefined
}

object AnonCell {
  @scala.inline
  def apply(
    cell: CustomizeComponent[HTMLAttributes[HTMLElement]] = null,
    row: CustomizeComponent[HTMLAttributes[HTMLElement]] = null,
    wrapper: CustomizeComponent[HTMLAttributes[HTMLElement]] = null
  ): AnonCell = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCell]
  }
}

