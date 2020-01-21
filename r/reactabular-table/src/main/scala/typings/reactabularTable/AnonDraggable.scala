package typings.reactabularTable

import typings.react.mod._Global_.JSX.Element
import typings.reactabularTable.mod.ColumnFormatter
import typings.reactabularTable.mod.ColumnTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDraggable extends js.Object {
  var draggable: js.UndefOr[Boolean] = js.undefined
  var formatters: js.UndefOr[js.Array[ColumnFormatter]] = js.undefined
  var label: String | Element
  var resizable: js.UndefOr[Boolean] = js.undefined
  var sortable: js.UndefOr[Boolean] = js.undefined
  var transforms: js.UndefOr[js.Array[ColumnTransform]] = js.undefined
}

object AnonDraggable {
  @scala.inline
  def apply(
    label: String | Element,
    draggable: js.UndefOr[Boolean] = js.undefined,
    formatters: js.Array[ColumnFormatter] = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    sortable: js.UndefOr[Boolean] = js.undefined,
    transforms: js.Array[ColumnTransform] = null
  ): AnonDraggable = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (formatters != null) __obj.updateDynamic("formatters")(formatters.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDraggable]
  }
}

