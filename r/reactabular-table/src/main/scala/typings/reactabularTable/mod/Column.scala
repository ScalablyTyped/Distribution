package typings.reactabularTable.mod

import typings.reactabularTable.AnonDraggable
import typings.reactabularTable.AnonFormatters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var cell: js.UndefOr[AnonFormatters] = js.undefined
  var children: js.UndefOr[js.Array[Column]] = js.undefined
  var header: js.UndefOr[AnonDraggable] = js.undefined
  var property: js.UndefOr[String] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    cell: AnonFormatters = null,
    children: js.Array[Column] = null,
    header: AnonDraggable = null,
    property: String = null
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

