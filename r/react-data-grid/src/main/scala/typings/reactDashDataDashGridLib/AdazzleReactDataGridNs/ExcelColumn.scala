package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelColumn extends js.Object {
  var editable: scala.Boolean
  var filterable: scala.Boolean
  var key: java.lang.String
  var name: js.Any
  var resizeable: scala.Boolean
  var width: scala.Double
}

object ExcelColumn {
  @scala.inline
  def apply(
    editable: scala.Boolean,
    filterable: scala.Boolean,
    key: java.lang.String,
    name: js.Any,
    resizeable: scala.Boolean,
    width: scala.Double
  ): ExcelColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("editable")(editable)
    __obj.updateDynamic("filterable")(filterable)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("resizeable")(resizeable)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ExcelColumn]
  }
}

