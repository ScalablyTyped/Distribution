package typings.reactabularDashTable.reactabularDashTableMod

import typings.reactabularDashTable.Anon_Draggable
import typings.reactabularDashTable.Anon_Formatters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var cell: js.UndefOr[Anon_Formatters] = js.undefined
  var children: js.UndefOr[js.Array[Column]] = js.undefined
  var header: js.UndefOr[Anon_Draggable] = js.undefined
  var property: js.UndefOr[String] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    cell: Anon_Formatters = null,
    children: js.Array[Column] = null,
    header: Anon_Draggable = null,
    property: String = null
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (children != null) __obj.updateDynamic("children")(children)
    if (header != null) __obj.updateDynamic("header")(header)
    if (property != null) __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[Column]
  }
}

