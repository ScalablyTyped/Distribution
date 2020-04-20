package typings.reactDataGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelColumn extends js.Object {
  var editable: Boolean
  var filterable: Boolean
  var key: String
  var name: js.Any
  var resizeable: Boolean
  var width: Double
}

object ExcelColumn {
  @scala.inline
  def apply(
    editable: Boolean,
    filterable: Boolean,
    key: String,
    name: js.Any,
    resizeable: Boolean,
    width: Double
  ): ExcelColumn = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], filterable = filterable.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resizeable = resizeable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelColumn]
  }
}

